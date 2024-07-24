package com.wayhome.srpingbootmybatis.mbs.tblyrule.dao;

import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgCostNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgDaysNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgCostNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgDaysNewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbdyRuleDao {

//    int addDipSetlAvgCostNew();


    /**
     * 批量新增dip次均费用
     *
      * @param list 要保存的数据
     * @return 返回成功条数
     */
    int batchInsertDipSetlAvgCostNew(List<DipSetlAvgCostNewDTO> list);

    /**
     * 批量新增dip平均住院天数
     *
     * @param list 要保存的数据
     * @return 返回成功条数
     */
    int batchInsertDipSetlAvgDaysNew(List<DipSetlAvgDaysNewDTO> list);

    /**
     * 批量新增drg次均费用
     *
     * @param list 要保存的数据
     * @return 返回成功条数
     */
    int batchInsertDrgSetlAvgCostNew(List<DrgSetlAvgCostNewDTO> list);

    /**
     * 批量新增drg平均住院天数
     *
     * @param list 要保存的数据
     * @return 返回成功条数
     */
    int batchInsertDrgSetlAvgDaysNew(List<DrgSetlAvgDaysNewDTO> list);

}
