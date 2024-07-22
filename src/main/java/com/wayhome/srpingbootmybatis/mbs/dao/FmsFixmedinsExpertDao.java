package com.wayhome.srpingbootmybatis.mbs.dao;

import com.wayhome.srpingbootmybatis.mbs.dto.FmsFixmedinsExpert;
import com.wayhome.srpingbootmybatis.mbs.dto.QFmsFixmedinsExpertDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FmsFixmedinsExpertDao  {

    /**
     * 查询定点专家详情
     *
     * @param request 请求参数
     * @return 返回专家详情
     */
    FmsFixmedinsExpert queryFixmedisExpertDetailByUk(QFmsFixmedinsExpertDTO request);

    /**
     * 保存顶点专家信息
     *
     * @param list 请求参数
     * @return 是否新增成功
     */
    boolean batchSaveFmsFixmedinsExpert(@Param("list") List<FmsFixmedinsExpert> list);

    /**
     * 查询定点专家详情-根据主键查询
     *
     * @param request 请求参数
     * @return 返回专家详情
     */
    FmsFixmedinsExpert queryFixmedisExpertDetailByPk(QFmsFixmedinsExpertDTO request);

    /**
     * 查询定点专家库列表
     *
     * @param request 请求参数
     * @return 返回结果
     */
    List<FmsFixmedinsExpert> queryPage(QFmsFixmedinsExpertDTO request);

    /**
     * 删除专家
     * @param request 请求参数
     * @return 是否成功
     */
    boolean deleteExpertInfoByPk(QFmsFixmedinsExpertDTO request);

    /**
     * 更新专家信息
     *
     * @param request 请求参数
     * @return 是否更新成功
     */
    boolean updateExpertPhone(FmsFixmedinsExpert request);
    List<FmsFixmedinsExpert> queryTldyExpertIdByMaJob(FmsFixmedinsExpert request);
}
