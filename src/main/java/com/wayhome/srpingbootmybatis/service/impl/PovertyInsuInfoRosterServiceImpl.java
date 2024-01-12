package com.wayhome.srpingbootmybatis.service.impl;

import com.wayhome.srpingbootmybatis.dto.PovertyInsuInfoRosterDTO;
import com.wayhome.srpingbootmybatis.exception.CustomerException;
import com.wayhome.srpingbootmybatis.mapper.PovertyInsuInfoRosterMapper;
import com.wayhome.srpingbootmybatis.service.PovertyInsuInfoRosterService;
import com.wayhome.srpingbootmybatis.utils.CSVWriteUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
//@Service
public class PovertyInsuInfoRosterServiceImpl implements PovertyInsuInfoRosterService {

    //脱贫人口的codes
    private final static List<String> offPovertyCodes = Arrays.asList("236027", "236021", "236022", "236026", "236024");
    private final static int OFF_POVERTY_TYPE = 1;

    private final static Map<Integer, List<String>> typeMap = new HashMap<Integer, List<String>>() {{
        put(OFF_POVERTY_TYPE, offPovertyCodes);
    }};

    private final static Long DEFAULT_LIMIT_SIZE = 10000L;

    @Resource
    private PovertyInsuInfoRosterMapper povertyInsuInfoRosterMapper;

    /**
     * <p>
     * 因为不确定要导出数据的大小，所以使用csv
     * Excel 07-2003 支持的最大行数是65536行
     * Excel2013版 支持的最大行数是1048576行
     * <p>
     * 数据量大的话可能会导致内存溢出，要防止这种情况出现，需要分成好多次生成文本，然后将查询出来的数据clear，释放内存
     * </p>
     */
    @Override
    public void export(Integer exportType, String areaCode, String countyCode, String townCode, HttpServletResponse response) throws IllegalAccessException {

        if (!typeMap.containsKey(exportType)) {
            log.info("导出的类型不正确");
            throw new CustomerException("导出的类型不正确");
        }
        long count = povertyInsuInfoRosterMapper.getCountPoverInsuInfo(typeMap.get(exportType), areaCode, countyCode, townCode);
        if (count <= 0) {
            return;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("----导出开始----------------------------->" + LocalDateTime.now().format(dateTimeFormatter));
        //设置表头
        AtomicInteger columnSize = new AtomicInteger(0);
        String title = CSVWriteUtils.getTitle(PovertyInsuInfoRosterDTO.class, new ArrayList<>(), columnSize);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(title);
        if (count > DEFAULT_LIMIT_SIZE) {
            int threadNum = (int) (count / DEFAULT_LIMIT_SIZE);
            if (count % DEFAULT_LIMIT_SIZE > 0) threadNum += 1;
            CountDownLatch countDownLatch = new CountDownLatch(threadNum);
            ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
            for (int i = 0; i < threadNum; i++) {
                final int pageSize = i;
                executorService.submit(() -> {
                    try {
                        String row = queryPovertyPsnRosterTask(typeMap.get(exportType), areaCode, countyCode, townCode, pageSize, columnSize.get());
                        stringBuffer.append(row);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        } else {
            List<PovertyInsuInfoRosterDTO> list = povertyInsuInfoRosterMapper.getListByMatIdetCode(offPovertyCodes, areaCode, countyCode, townCode);
            String row = setCsvRow(list, columnSize.get());
            stringBuffer.append(row);
        }
        System.out.println("----查询数据结束，开始写csv----------------------------->" + LocalDateTime.now().format(dateTimeFormatter));
        writerCsv(response, stringBuffer.toString());
    }

    private void writerCsv(HttpServletResponse response, String content) {
        PrintWriter writer = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-disposition", "attachment; filename=" + URLEncoder.encode("export.csv", "UTF-8"));
            writer = response.getWriter();
            writer.write(content);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        System.out.println("----查询数据结束，写csv结束----------------------------->" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


    //分批次查询数据，将数据生成字符串后清楚list，大list可能直接进入老年代，手动clear来释放内存
    private String queryPovertyPsnRosterTask(List<String> codes, String areaCode, String countyCode, String townCode, int pageSize, int columnSize) throws IllegalAccessException {
        long limit = pageSize * DEFAULT_LIMIT_SIZE;
        List<PovertyInsuInfoRosterDTO> list = povertyInsuInfoRosterMapper
                .getPageByMatIdetCode(codes, areaCode, countyCode, townCode, limit, DEFAULT_LIMIT_SIZE);
        return setCsvRow(list, columnSize);
    }

    private String setCsvRow(List<PovertyInsuInfoRosterDTO> list, int columnSize) throws IllegalAccessException {
        //将相同的psnNo合并，并将特殊身份字符串进行拼接 类似：{psnNo='rng1001', matIdetName='脱贫不稳定人口,脱贫人口低保对象'}
        list = new ArrayList<>(list.stream().collect(Collectors.toMap(PovertyInsuInfoRosterDTO::getPsnNo, a -> a, (o1, o2) -> {
            if (o1.getMatIdetName() != null && !o1.getMatIdetName().equals(o2.getMatIdetName())) {
                o1.setMatIdetName(o1.getMatIdetName() + "," + o2.getMatIdetName());
            }
            return o1;
        })).values());
        String row = "";
        try {
            row = CSVWriteUtils.setRow(PovertyInsuInfoRosterDTO.class, list, new ArrayList<>(), columnSize);
        } finally {
            //help GC
            list.clear();
        }
        return row;
    }
}


