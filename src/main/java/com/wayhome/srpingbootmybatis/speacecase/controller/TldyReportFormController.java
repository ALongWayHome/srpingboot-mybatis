package com.wayhome.srpingbootmybatis.speacecase.controller;

import com.github.pagehelper.PageInfo;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.speacecase.dto.AdmdvsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinExpertFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.QueryTldyReportFormDTO;
import com.wayhome.srpingbootmybatis.speacecase.service.TldyReportFormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "经办端特病单议报表")
@RequestMapping("/web/tldy/reportForm")
public class TldyReportFormController {

    @Resource
    private TldyReportFormService tldyReportFormService;

    @ApiOperation(value = "经办端统计1-以区划、定点机构的纬度来统计的")
    @PostMapping(value = "/queryFixmedinsTldyFormData")
    public ApiResult<PageInfo<FixmedinsFormData>> queryFixmedinsTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        return tldyReportFormService.queryFixmedinsTldyFormData(request);
    }

    @ApiOperation(value = "经办端统计2-以区划、定点机构的纬度来统计的")
    @PostMapping(value = "/queryFixmedinsExpertTldyFormData")
    public ApiResult<PageInfo<FixmedinExpertFormData>> queryFixmedinsExpertTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        return tldyReportFormService.queryFixmedinsExpertTldyFormData(request);
    }

    @ApiOperation(value = "经办端统计3-以区划的纬度来统计的")
    @PostMapping(value = "/queryAdmdvsTldyFormData")
    public ApiResult<PageInfo<AdmdvsFormData>> queryAdmdvsTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        return tldyReportFormService.queryAdmdvsTldyFormData(request);
    }

    @ApiOperation(value = "经办端统计1-报表导出")
    @PostMapping(value = "/exportFixmedinsTldyFormData")
    public void exportFixmedinsTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        tldyReportFormService.exportFixmedinsTldyFormData(request);
    }

    @ApiOperation(value = "经办端统计2-报表导出")
    @PostMapping(value = "/exportFixmedinsExpertTldyFormData")
    public void exportFixmedinsExpertTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        tldyReportFormService.exportFixmedinsExpertTldyFormData(request);
    }

    @ApiOperation(value = "经办端统计3-报表导出")
    @PostMapping(value = "/exportAdmdvsTldyFormData")
    public void exportAdmdvsTldyFormData(@RequestBody QueryTldyReportFormDTO request) throws Exception {

        tldyReportFormService.exportAdmdvsTldyFormData(request);
    }

}
