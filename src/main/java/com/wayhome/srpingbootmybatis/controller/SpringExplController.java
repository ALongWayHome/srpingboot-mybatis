package com.wayhome.srpingbootmybatis.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.dto.Staf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/spring/expl")
public class SpringExplController {

    @Value("#{'${conInsAdmdvsList}'.split(',')}")
    private List<String> conInsAdmdvs;


    @PostMapping(value = "/getAdmdvsList")
    public ApiResult<List<String>> getAdmdvsList() {
//        List<String> admdvsList = Arrays.asList(conInsAdmdvs.split(","));
        System.out.println(CollectionUtils.isEmpty(conInsAdmdvs));
        System.out.println(conInsAdmdvs.size());
        return ApiResult.success(conInsAdmdvs);

    }

    public static void main(String[] args) {

        /**
         * 此示例为2021年-2030 中间2027年出现断缴的情况
         */
        int 居民参保年数 = 0; int 政策开始年 = 2025;
        int 待遇享受年= 2030;
        int 居民激励年数输出 = 0;
        //居民参保年份
        List<Integer> rsdtList = Arrays.asList(2021,2022,2023,2024,2025,2026,2028,2029,2030);
        Staf staf = new Staf();
        staf.setStartYearMonth("202701");
        staf.setEndYearMonth("202701");
        //职工参保年月
        List<Staf> stafList = Arrays.asList(staf);

        //从政策年开始， 到就诊时间结束，看这期间有无连续缴费
        for(int i= 政策开始年; i<= 待遇享受年 ; i++){
            // 如果缴费年限中包含所循环的年份，则参保年数+1
            if(rsdtList.contains(i)) {
                居民参保年数++;
                System.out.println("-----" + i + "-------" + "居民参保年数" + 居民参保年数);

            }
            //中间有居民断缴
            else{
                //如果中间已经连续交够4年
                if(居民参保年数>=4){
                    for (int j = 0; j <=12 ; j++) {
                        String yearmonth = "";
                        if (j>9) {
                            yearmonth = ""+i+j;
                        }else {
                            yearmonth = i+"0"+j;
                        }
                        //循环12个月份，看看每个月份职工的有没有断缴，如没有。不进入这次
                        for(int k=0;k<stafList.size();k++){
                            if (Integer.valueOf(stafList.get(k).getStartYearMonth())<=Integer.valueOf(yearmonth)&&
                                    Integer.valueOf(stafList.get(k).getEndYearMonth())>=Integer.valueOf(yearmonth)) {
                                continue;

                            }
                            //职工出现断缴， 确定连续缴费年数，将居民连续参保年数清零重新开始记
                            else {
                                居民激励年数输出 = 居民激励年数输出+(居民参保年数-4);
                                居民参保年数=0;
                            }
                        }
                    }
                }
                //不满四年出现断缴，连续参保年数清零
                else{
                    居民参保年数=0;
                }
            }
        }
        //如果出现居民断缴的情况，有可能断缴前已满四年，需加上之前的激励年数
        //如无断缴，则居民激励年数是0
        if (居民参保年数 > 4) {
            居民激励年数输出 = 居民激励年数输出 + (居民参保年数 - 4);
        }
        System.out.println(居民激励年数输出);
    }

}
