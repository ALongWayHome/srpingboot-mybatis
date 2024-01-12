package com.wayhome.srpingbootmybatis.mapper;


import com.wayhome.srpingbootmybatis.dto.PovertyInsuInfoRosterDTO;
import com.wayhome.srpingbootmybatis.entity.PovertyInsuInfoRoster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PovertyInsuInfoRosterMapper {

    List<PovertyInsuInfoRosterDTO> getPageByMatIdetCode(@Param("list") List<String> matIdetCodes,
                                                        @Param("areaCode") String areaCode,
                                                        @Param("countyCode") String countyCode,
                                                        @Param("townCode") String townCode,
                                                        @Param("limit") Long limit,
                                                        @Param("offset") Long offset);

    List<PovertyInsuInfoRosterDTO> getListByMatIdetCode(@Param("list") List<String> matIdetCodes,
                                                        @Param("areaCode") String areaCode,
                                                        @Param("countyCode") String countyCode,
                                                        @Param("townCode") String townCode);


    long getCountPoverInsuInfo(@Param("list") List<String> matideCodes,
                               @Param("areaCode") String areaCode,
                               @Param("countyCode") String countyCode,
                               @Param("townCode") String townCode);
}
