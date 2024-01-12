package com.wayhome.srpingbootmybatis.controller;

import com.wayhome.srpingbootmybatis.service.PovertyInsuInfoRosterService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Slf4j
@RestController
@RequestMapping(value = "/povertyInsuInfo")
@Api(tags = "扶贫参保人员信息")
public class PovertyInsuInfoController {

    private final PovertyInsuInfoRosterService povertyInsuInfoRosterService;

    public PovertyInsuInfoController(PovertyInsuInfoRosterService povertyInsuInfoRosterService) {
        this.povertyInsuInfoRosterService = povertyInsuInfoRosterService;

    }

    @GetMapping("/export")
    public void exportOffPovertyPsnInfo(@RequestParam(value = "exportType") Integer exportType,
                                        @RequestParam(value = "areaCode", required = false) String areaCode,
                                        @RequestParam(value = "countyCode", required = false) String countyCode,
                                        @RequestParam(value = "townCode", required = false) String townCode,
                                        HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, UnsupportedEncodingException {
        String requestURI = request.getRequestURI();
        log.info("requestURI:{}", requestURI);
        povertyInsuInfoRosterService.export(exportType, areaCode,countyCode,townCode,response);
    }

}
