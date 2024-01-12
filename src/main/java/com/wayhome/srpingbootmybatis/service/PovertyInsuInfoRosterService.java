package com.wayhome.srpingbootmybatis.service;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public interface PovertyInsuInfoRosterService {

    /**
     *  导出
     * @param httpResponse
     */
    void export(Integer exportType, String areaCode, String countyCode, String townCode, HttpServletResponse httpResponse) throws IllegalAccessException, UnsupportedEncodingException;
}
