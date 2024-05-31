package com.wayhome.srpingbootmybatis.utils;


import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;

/**
 * http https单向认证请求
 * Created by Administrator on 2017-11-30.
 */
@Slf4j
public class HttpUtil {

    private static final int TIMEOUT = 60000;
    private static final int MAX_TOTAL = 400;
    private static final int MAX_PER_ROUTE = 200;
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String XML = "application/xml";
    private static final String JSON = "application/json";
    private static final String FORM = "application/x-www-form-urlencoded";
    private static final String HTML = "text/html";
    private static  CloseableHttpClient httpClient = null;
    private static final Object syncLock = new Object();

    public HttpUtil() {
    }

    public static CloseableHttpClient getHttpClient() throws Exception {
        if (httpClient == null) {
//            synchronized(syncLock) {
//                if (httpClient == null) {
                    httpClient = createHttpClient();
 //               }
 //           }
        }

        return httpClient;
    }

    public static CloseableHttpClient createHttpClient() throws Exception {
        //PoolingHttpClientConnectionManager cm = null;


            RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.create();
            ConnectionSocketFactory plainSf = PlainConnectionSocketFactory.getSocketFactory();
            registryBuilder.register("http", plainSf);
            SSLContext sslContext = SSLContexts.custom().useTLS().loadTrustMaterial((KeyStore)null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    return true;
                }
            }).build();
            LayeredConnectionSocketFactory sslSF = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            registryBuilder.register("https", sslSF);
            Registry<ConnectionSocketFactory> registry = registryBuilder.build();
            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);

            cm.setMaxTotal(400);
            cm.setDefaultMaxPerRoute(200);
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(60000).setSocketTimeout(60000).setConnectTimeout(60000).build();

        HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {
            public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
                if (executionCount >= 3) {
                    return false;
                } else if (exception instanceof NoHttpResponseException) {
                    return true;
                } else if (exception instanceof SSLHandshakeException) {
                    return false;
                } else if (exception instanceof InterruptedIOException) {
                    return false;
                } else if (exception instanceof UnknownHostException) {
                    return false;
                } else if (exception instanceof ConnectTimeoutException) {
                    return false;
                } else if (exception instanceof SSLException) {
                    return false;
                } else {
                    HttpClientContext clientContext = HttpClientContext.adapt(context);
                    HttpRequest request = clientContext.getRequest();
                    return !(request instanceof HttpEntityEnclosingRequest);
                }
            }
        };
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(requestConfig).setRetryHandler(httpRequestRetryHandler).build();
        return httpClient;
    }


    public static String doPostJson(String url, String json) throws Exception {
        return doPostJson(url, json, new HashMap(), "UTF-8");
    }

    public static String doPostJson(String url, Map<String, String> header, String json) throws Exception {
        return doPostJson(url, json, header, "UTF-8");
    }

    public static String doPostText(String url, String json) throws Exception {
        return doPostText(url, json, new HashMap(), "UTF-8");
    }

    public static String doPostUrl(String url, Map<String, Object> param) throws Exception {
        String result = null;
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 参数
        StringBuilder uri = new StringBuilder(url);
        if (param != null){
            StringBuffer params = new StringBuffer();
            // 字符数据最好encoding以下;这样一来，某些特殊字符才能传过去(如:某人的名字就是“&”,不encoding的话,传不过去)
            param.forEach((k, v) -> {
                params.append(k + "=" + v);
                params.append("&");
            });
            String paramStr = params.toString().substring(0, params.toString().length() - 1);
            uri.append("?" + paramStr);
        }

        // 创建Post请求
        HttpPost httpPost = new HttpPost(uri.toString());


        // 2.1 设置http请求头 User-Agent
        httpPost.setHeader("User-Agent", "Mozilla/5.0(Windows NT 6.1;Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf8");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            int code = response.getStatusLine().getStatusCode();
            //请求成功
            if (code == 200) {
                result = EntityUtils.toString(responseEntity);
            } else {
                throw new RuntimeException("请求失败，返回代码：" + code);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                log.error(e.getMessage());
            }
        }
        return result;
    }

    public static String doPostText(String url, String json, Map<String, String> header, String charset) throws Exception {
        CloseableHttpResponse response = null;
        String returnData = null;

        try {
            HttpPost method = new HttpPost(url);
            if (header != null && header.size() > 0) {
                Iterator var7 = header.entrySet().iterator();

                while(var7.hasNext()) {
                    Map.Entry<String, String> entry = (Map.Entry)var7.next();
                    method.setHeader((String)entry.getKey(), (String)entry.getValue());
                }
            }

            StringEntity entity = new StringEntity(json, charset);
            entity.setContentEncoding(charset);
            entity.setContentType("text/plain;charset=" + charset);
            method.setEntity(entity);
            method.setHeader("Connection", "close");
            response = getHttpClient().execute(method, HttpClientContext.create());
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                HttpEntity resData = response.getEntity();
                returnData = EntityUtils.toString(resData, charset);
            } else {
                log.error("请求失败,错误码为:" + statusCode);
            }
        } catch (ClientProtocolException var18) {
            var18.printStackTrace();
        } finally {
            try {
                if (null != response) {
                    response.close();
                }
            } catch (IOException var17) {
                var17.printStackTrace();
            }

        }

        return returnData;
    }

    public static String doPostUrl(String url, Map<String, Object> param, Map<String, String> header) throws Exception {
        String result = null;
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 参数
        StringBuilder uri = new StringBuilder(url);
        if (param != null){
            StringBuffer params = new StringBuffer();
            // 字符数据最好encoding以下;这样一来，某些特殊字符才能传过去(如:某人的名字就是“&”,不encoding的话,传不过去)
            param.forEach((k, v) -> {
                params.append(k + "=" + v);
                params.append("&");
            });
            String paramStr = params.toString().substring(0, params.toString().length() - 1);
            uri.append("?" + paramStr);
        }

        // 创建Post请求
        HttpPost httpPost = new HttpPost(uri.toString());

        if (header != null && header.size() > 0) {
            Iterator var7 = header.entrySet().iterator();

            while(var7.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry)var7.next();
                httpPost.setHeader((String)entry.getKey(), (String)entry.getValue());
            }
        }

        // 2.1 设置http请求头 User-Agent
        httpPost.setHeader("User-Agent", "Mozilla/5.0(Windows NT 6.1;Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf8");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            int code = response.getStatusLine().getStatusCode();
            //请求成功
            if (code == 200) {
                result = EntityUtils.toString(responseEntity);
            } else {
                throw new RuntimeException("请求失败，返回代码：" + code);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                log.error(e.getMessage());
            }
        }
        return result;
    }

    public static String doPostJson(String url, String json, Map<String, String> header, String charset) throws Exception {
        CloseableHttpResponse response = null;
        String returnData = null;

        try {
            HttpPost method = new HttpPost(url);
            if (header != null && header.size() > 0) {
                Iterator var7 = header.entrySet().iterator();

                while(var7.hasNext()) {
                    Map.Entry<String, String> entry = (Map.Entry)var7.next();
                    method.setHeader((String)entry.getKey(), (String)entry.getValue());
                }
            }

            StringEntity entity = new StringEntity(json, charset);
            entity.setContentEncoding(charset);
            entity.setContentType("application/json;charset=" + charset);
            method.setEntity(entity);
            method.setHeader("Connection", "close");
            response = getHttpClient().execute(method, HttpClientContext.create());
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 200) {
                HttpEntity resData = response.getEntity();
                returnData = EntityUtils.toString(resData, charset);
            } else {
                HttpEntity resData = response.getEntity();
                returnData = EntityUtils.toString(resData, charset);
                log.error("请求失败,错误码为:" + statusCode);
            }
        } catch (ClientProtocolException var18) {
            var18.printStackTrace();
        } finally {
            try {
                if (null != response) {
                    response.close();
                }
            } catch (IOException var17) {
                var17.printStackTrace();
            }

        }

        return returnData;
    }

    //发送http请求，响应文件流
    public static void doPostJsonResponseFileStream(String url, String json, Map<String, String> header, String charset, HttpServletResponse httpServletResponse) throws Exception {
        CloseableHttpResponse response = null;
        ServletOutputStream outputStream = null;
        try {
            HttpPost method = new HttpPost(url);
            if (header != null && header.size() > 0) {
                Iterator var7 = header.entrySet().iterator();

                while(var7.hasNext()) {
                    Map.Entry<String, String> entry = (Map.Entry)var7.next();
                    method.setHeader((String)entry.getKey(), (String)entry.getValue());
                }
            }

            StringEntity entity = new StringEntity(json, charset);
            entity.setContentEncoding(charset);
            entity.setContentType("application/json;charset=" + charset);
            method.setEntity(entity);
            method.setHeader("Connection", "close");
            response = getHttpClient().execute(method, HttpClientContext.create());
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 200) {
                HttpEntity resData = response.getEntity();
                InputStream inputStream = resData.getContent();
                String fileName = "对账文件.zip";
                httpServletResponse.setContentType("application/octet-stream");
                httpServletResponse.setHeader("Content-Disposition", "attachment;filename=" + java.net.URLEncoder
                        .encode(fileName, "UTF-8"));

                outputStream = httpServletResponse.getOutputStream();
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }
                outputStream.flush();

            } else {
                log.error("请求失败,错误码为:" + statusCode);
            }
        } catch (ClientProtocolException var18) {
            var18.printStackTrace();
        } finally {
            try {
                if (null != outputStream) {
                    outputStream.close();
                }
                if (null != response) {
                    response.close();
                }

            } catch (IOException var17) {
                var17.printStackTrace();
            }

        }
    }

    public static String doPostXml(String url,String xml) throws IOException{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost method = new HttpPost(url);
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("xmlStr", xml));
        method.addHeader("Content-type","application/xml; charset=utf-8");
        method.setHeader("Connection", "Keep-Alive");
        method.setHeader("Content-Type", "application/x-www-form-urlencoded");
        method.setHeader("Accept", "application/xml");
        method.setHeader("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        method.setEntity(new UrlEncodedFormEntity(urlParameters, Charset.forName("UTF-8")));

        HttpResponse response = httpClient.execute(method);

        int statusCode = response.getStatusLine().getStatusCode();

        return EntityUtils.toString(response.getEntity());
    }

    /**
     * 获取网络文件的输入流
     * @param fileUrl 网络文件的路径
     * @throws IOException
     */
    public static InputStream  getNetworkFileInputStream(String fileUrl) throws IOException {
        HttpServletResponse response = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getResponse();
        URL url = new URL(fileUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        return conn.getInputStream();
    }



}
