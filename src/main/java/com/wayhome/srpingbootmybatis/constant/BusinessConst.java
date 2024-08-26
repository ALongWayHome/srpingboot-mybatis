package com.wayhome.srpingbootmybatis.constant;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 交易常量文件
 *
 * @Author zhangJ
 * @Date 2019/9/4 14:36
 * @Version 1.0
 */
public class BusinessConst {
    public static final String FIN_APPRO_TYPE = "FIN_APPRO_TYPE";//财务核拨类型
    public static String RETURN_CODE_SUCCESS = "success";
    public static String RETURN_CODE_ERROR = "error";
    public static String TYPE_SUCCESS = "success";
    public static String TYPE_ERROR = "error";
    /********************************** 个人待遇结算*********************************/
    public static final String RULE_GRXYPJ = "M01302";//信用评价
    public static final String RULE_QUERYCUMPRD = "M00504";//查询累计周期
    public static final String RULE_QUERYMEDLIST = "M01005";//目录查询方式
    public static final String RULE_QUERYCUM_TYPE_CODE = "M00505";//查询累计类别代码
    public static final String RULE_BIZ_TYPE_M00503 = "M00503";//待遇计算入参机构附加属性处理
    public static final String RULE_QUERY_SP_PSN_TYPE = "M00109";//查询特殊人员类别
    public static final String RULE_QUERY_CHECK_LEVEL = "M00110";//查询零星报销审核层级
    public static final String QUERY_FEEPARAM = "M001K4";//查询大类参数
    public static final String DETAIL_CUT = "M001K6";//明细分割F
    public static final String ACCT_USED_FLAG = "M00403";//个人账户使用标志
    public static final String OPT_IPT_FLAG = "M006";//就诊参数管理
    public static final String ADMDVS_RULE = "M007";//行政区划区分
    public static final String CLC_RESULTS = "M00501";//待遇计算结果处理
    public static final String CLR_WAY_RULE = "M00302";//获取清算方式
    public static final String CLR_OPTINS_RULE = "M00303";//获取清算经办机构
    public static final String CLR_TYPE_LV2_RULE = "M00304";//获取二级清算类别
    public static final String SELFPAY_PROP_PSN_TYPE_RULE = "M00104";//获取自付比例人员类别
    public static final String DATE_RULE = "M00305";//规则获取日期
    public static final String MED_TRT_TYPE_RULE = "M00105";//医疗待遇类别
    public static final String FIN_OPTINS_RULE = "M00103";//获取财务分中心
    public static final String RULE_BIZ_TYPE_M00101 = "M00101";//统筹区基金支付类别
    public static final String RULE_BIZ_TYPE_M001 = "M001";//结算参数
    public static final String RULE_MAXDATE = "M008";//最大申报时限配置
    public static final String RULE_MEDTYPE_DISE = "M01001";//医疗类别专有疾病信息
    public static final String RULE_DATE_JC = "M01002";//报销时间是否可以重叠
    public static final String RULE_BIZ_TYPE_M005 = "M005";//结算结果管理
    public static final String RULE_BIZ_TYPE_M0 = "M0";//待遇参数
    public static final String CAL_IPT_CNT_RULE = "M01003";//计算住院次数
    public static final String IPT_DAY_RULE = "M01004";//计算住院天数
    public static final String RULE_BIZ_TYPE_M00306 = "M00306";//清算参数
    public static final String MEDINS_LIST_MAP_RULE = "M01301";//机构目录匹配标志
    public static final String HILIST_LMTPRC_TYPE_RULE = "M00106";//医保目录限价类型
    public static final String MEDINS_SERV_MGT_RULE = "M00108";//是否查询医疗机构服务
    public static final String RULE_BIZ_TYPE_M01201 = "M01201";//门慢门特开展信息行政区划获取
    public static final String RULE_BIZ_TYPE_M01202 = "M01202";//门慢门特开展信停用时结束日期是否能选择当前日期之前的日期
    public static final String RULE_BIZ_TYPE_M003 = "M003";//清算参数
    public static final String RULE_BIZ_TYPE_M00112 = "M00112"; // 计算服务限额类
    public static final String RULE_BIZ_TYPE_M00113 = "M00113"; //连续缴费月数计算
    public static final String RULE_BIZ_TYPE_HB0101 = "HB0101"; //查询连续住院
    public static final String RULE_BIZ_TYPE_HB0102 = "HB0102"; //河北本地化通用参数
    public static final String RULE_BIZ_TYPE_HB0104 = "HB0104"; //定点服务判断规则
    public static final String RULE_BIZ_TYPE_HB0105 = "HB0105"; //业财一体化财务不统计支出数据
    public static final String RULE_BIZ_TYPE_HB0106 = "HB0106"; //中心报销生育验证时间重叠
    public static final String RULE_BIZ_TYPE_HB0107 = "HB0107"; //职工居民慢特病审批信息互认
    public static final String RULE_BIZ_TYPE_HB0109 = "HB0109"; //机构大病(大额)拨付规则
    public static final String RULE_BIZ_TYPE_HB0115 = "HB0115"; //征缴是否校验参保日期
    public static final String RULE_BIZ_TYPE_HB0110 = "HB0110"; //业财一体化-累计类别与基金分项关系规则
    public static final String RULE_BIZ_TYPE_HB0112 = "HB0112"; //职工新增人员基数月份配置
    public static final String RULE_BIZ_TYPE_HB0120 = "HB0120"; //跨省慢特病本地国家慢病编码映射
    public static final String RULE_BIZ_TYPE_HB0122 = "HB0122"; //查询结算发票信息
    public static final String RULE_BIZ_TYPE_HB0123 = "HB0123"; //查询个人账户清退是否包括居民
    public static final String RULE_BIZ_TYPE_HB0125 = "HB0125"; //查询生成推送业财数据时批次号是否按照基金支付类型拆分
    public static final String RULE_BIZ_TYPE_HB0128 = "HB0128"; //统筹基金支付类型与业财基金编码的关系
    public static final String RULE_BIZ_TYPE_HB0130 = "HB0130"; //生成业财记账数据-业财扣款基金选择
    public static final String RULE_BIZ_TYPE_HB0137 = "HB0137"; //明细扣款批量审核基金扣款顺序
    public static final String RULE_BIZ_TYPE_M00114 = "M00114"; //结算参保险种选择规则
    public static final String RULE_BIZ_TYPE_M00115 = "M00115"; //结算参数池管理
    public static final String RULE_BIZ_TYPE_M00116 = "M00116"; //结算完成消息通知开关
    public static final String RULE_BIZ_TYPE_M00117 = "M00117"; //本地自增参数启用标志
    public static final String RULE_BIZ_TYPE_HB0118 = "HB0136"; //基数核定规则排序
    public static final String BSTYPE_HBJXLV = "HB0121";//规则关联业务类型 HB0121 : 河北利率
    public static final String RULE_DATE_JCYD = "HB0126";//药店报销时间是否可以重叠
    public static final String RULE_DATE_HB0129 = "HB0129";//获取定点端显示医疗类别列表
    public static final String RULE_BIZ_TYPE_HB0131 = "HB0131";// 月结资金申请单拨付规则
    public static final String RULE_BIZ_TYPE_HB0133 = "HB0133"; //根据医疗机构类别判断定点是否村卫

    public static final String RULE_BIZ_TYPE_HB0138 = "HB0138"; //判断结算是否可以使用患者自己的个人账户
    public static final String RULE_BIZ_TYPE_HB0142 = "HB0142"; //月结拨基金出资方汇总
    public static final String RULE_BIZ_TYPE_HB0143 = "HB0143"; //稽核审查扣费基金支付类型
    public static final String RULE_BIZ_TYPE_HB0144 = "HB0144"; //单独支付累计值
    /********************************** 决策树输入参数-开始*********************************/
    public static final String RULE_IN_MED_TYPE_CHO_POOL_1 = "1";//使用场景-受理
    public static final String RULE_IN_MED_TYPE_CHO_POOL_2 = "2";//使用场景-受理保存
    public static final String RULE_IN_MED_TYPE_CHO_POOL_3 = "3";//使用场景-综合查询
    public static final String RULE_IN_MED_TYPE_CHO_POOL_4 = "4";//使用场景-住院次数
    public static final String RULE_IN_MED_TYPE_CHO_POOL_5 = "5";//使用场景-报销时间交叉
    public static final String RULE_IN_MED_TYPE_CHO_POOL_6 = "6";//使用场景-审核通过撤销查询医疗类别
    public static final String AUDT_MON_SETL_LOCAL_KEY = "AUDT_MON_SETL_LOCAL_KEY";//审核结算本地
    public static final String AUDT_MON_SETL_OUTPROV_KEY = "AUDT_MON_SETL_OUTPROV_KEY";//审核结算跨省异地
    /********************************** 决策树输入参数-结束*********************************/
    public static final String AUDT_MON_SETL_INPROV_KEY = "AUDT_MON_SETL_INPROV_KEY";//审核结算省内异地
    public static final String MED_TYPE_CHO_POOL_2 = "2";//就诊参数使用场景：受理保存
    /********************************** 决策树返回参数-开始*********************************/
    public static final String RULE_OUT_MZ = "0000";//门诊类
    public static final String RULE_OUT_ZY = "1111";//住院类
    public static final String RULE_OUT_YDGY = "2222";//药店购药
    public static final String ACP_MON_SETL_LOCAL_KEY = "ACP_MON_SETL_LOCAL_KEY";
    /********************************** 决策树返回参数-结束*********************************/
    public static final String ACP_MON_SETL_INOUTPROV_KEY = "ACP_MON_SETL_INOUTPROV_KEY";
    public static final String ACP_MON_SETL_OUTOUTPROV_KEY = "ACP_MON_SETL_OUTOUTPROV_KEY";
    public static final String COM_INPUT_DATE_RULE_1 = "1";//规则获取日期：就诊表年度
    public static final String COM_INPUT_DATE_RULE_2 = "2";//规则获取日期：查询定点医疗机构服务范围管理
    public static final String COM_INPUT_DATE_RULE_3 = "3";//规则获取日期：查询机构业务历史信息
    public static final String COM_INPUT_DATE_RULE_4 = "4";//规则获取日期：最大时限对比日期
    public static final String COM_INPUT_DATE_RULE_5 = "5";//规则获取日期：累计信息年、年月
    public static final String COM_INPUT_DATE_RULE_6 = "6";//规则获取日期：查询机构附加属性
    public static final String COM_INPUT_DATE_RULE_7 = "7";//规则获取日期：查询人员特殊身份
    public static final String COM_INPUT_DATE_RULE_8 = "8";//规则获取日期：查询待遇累计
    public static final String COM_INPUT_DATE_RULE_10 = "10";//规则获取日期：明细分割
    public static final String COM_INPUT_DATE_RULE_9 = "9";//规则获取日期：查询年度二次报销人员特殊身份

    /********************************** 待遇规则过滤常量配置 开始（规则-规则分类-规则名称）*********************************/
    public static final String RULE_MDTRT_INFO_K1001 = "K1001";//规则-就诊参数管理-区分住院门诊类别
    public static final String RULE_MDTRT_INFO_K1002 = "K1002";//规则-就诊参数管理-已清算的结算信息回退管理
    public static final String RULE_MDTRT_INFO_K1003 = "K1003";//规则-就诊参数管理-跨笔结算撤销参数管理
    public static final String RULE_MDTRT_INFO_K1004 = "K1004";//规则-就诊参数管理-跨结算撤销范围参数配置管理
    public static final String RULE_MDTRT_INFO_K1005 = "K1005";//规则-就诊参数管理-就诊时间配置
    public static final String RULE_MDTRT_INFO_K1006 = "K1006";//规则-就诊参数管理-业务开始时间配置
    public static final String RULE_SETL_INFO_S1001 = "S1001";//规则-结算参数管理-起付标准配置
    public static final String RULE_SETL_INFO_S1002 = "S1002";//规则-结算参数管理-计算个人负担总金额
    public static final String RULE_SETL_INFO_S1003 = "S1003";//规则-结算参数管理-计算个人负担报销金额
    public static final String RULE_SETL_INFO_S1004 = "S1004";//规则-结算参数管理-处理累计信息写入
    public static final String RULE_SETL_INFO_S1005 = "S1005";//规则-结算参数管理-特殊人群奖励金初始拨付标准金额
    public static final String RULE_SETL_INFO_S1006 = "S1006";//规则-结算参数管理-特殊人群身份定义
    public static final String RULE_SETL_INFO_S1007 = "S1007";//规则-结算参数管理-查询特殊人员奖励金的已支付基金的范围
    public static final String RULE_SETL_INFO_S1008 = "S1008";//规则-结算参数管理-查询本次奖励金额是否需要减去已支付基金
    public static final String RULE_SETL_INFO_S1009 = "S1009";//规则-结算参数管理-年度二次报销符合人群校验
    public static final String RULE_SETL_INFO_S1010 = "S1010";//规则-结算参数管理-零星二次报销是否支持处理个人账户基金
    public static final String RULE_SETL_INFO_S1011 = "S1011";//规则-结算参数管理-查询参保险种所对应的基金列表
    public static final String RULE_SETL_INFO_S1012 = "S1012";//规则-结算参数管理-年度二次补报销结算信息时间段取值配置
    public static final String RULE_SETL_INFO_S1013 = "S1013";//规则-结算参数管理-是否进行待遇检查
    public static final String RULE_SETL_INFO_S1014 = "S1014";//规则-结算参数管理-获取基金的报销封顶线
    public static final String RULE_SETL_INFO_Q1001 = "Q1001";//规则-清算参数-根据二级清算类别获取险种
    /********************************** 待遇规则过滤常量配置 结束*********************************/
    /***************************医保区划范围规则过滤********************************/
    public static final String RULE_SETL_INFO_YEARCROV = "ACCT_YEAR_CROV";//年终结转
    public static final String RULE_SETL_INFO_MUTUAL = "MUTUAL";//账户共济
    /*************************************个人支出管理业务规则*******************************/
    public static final String BSTYPE_GZZCSXGL = "M00401";//个账支出顺序管理
    public static final String BSTYPE_ZHZCJXGL = "M00402";//账户支出计息管理
    public static final String BSTYPE_YXZHCZGL = "M00404";//允许账户超支管理
    public static final String BSTYPE_ZHYBQHFW = "M00405";//账户医保区划范围
    public static final String BSTYPE_ZHFHBLFW = "M00406";//账户返还办理范围
    public static final String BSTYPE_GNZJGZPZ = "P00105";//功能征缴规则配置
    public static final String BSTYPE_TYDYCS = "G001";//通用打印
    public static final String BSTYPE_TYSHPZ = "G004";//通用审核配置

    public static final String PSN_SETLWAY_01 = "01";//按项目结算
    public static final String PSN_SETLWAY_02 = "02";//按定额结算
    public static final String PSN_SETLWAY_A2 = "A2";//张家口北医三院使用
    public static final String PSN_SETLWAY_0201 = "0201";//按单病种结算
    public static final String PSN_SETLWAY_0202 = "0202";//按日间手术结算
    public static final String DISE_TYPE_CODE_MMMM = "10";//门诊慢特病
    public static final String DISE_TYPE_CODE_MM = "11";//门诊慢特病
    public static final String DISE_TYPE_CODE_MT = "12";//门诊特性兵
    public static final String DISE_TYPE_CODE_ABZ = "20";//按病种结算病种
    public static final String DISE_TYPE_CODE_RJSS = "30";//日间手术
    public static final String DISE_TYPE_CODE_JBZD = "40";//疾病诊断病种
    public static final String DISE_TYPE_CODE_QT = "99";//其他


    public static final String CUMULATE_YEAR = "1";//待遇累计周期：年度
    public static final String CUMULATE_MONTH = "2";//待遇累计周期：月度
    public static final String CUMULATE_QUARTER = "3";//待遇累计周期：季度

    public static final Integer PAGE_NUM_FIRST = 1;//分页查询条件页数为1
    public static final Integer PAGE_SIZE_MED_SP = 20;//分页查询条件条数：医疗目录特殊属性
    public static final Integer PAGE_SIZE_FIXMED_EXRO = 20;//分页查询条件条数：机构特殊属性
    public static final Integer PAGE_SIZE_TEMP_MA_CRTF = 10;//分页查询条件条数：临时医疗救助人员
    public static final Integer PAGE_SIZE_MED_LIST = 30;//分页查询条件条数：医疗目录信息
    public static final Integer PAGE_SIZE_DIAG_LIST = 20;//分页查询条件条数：查询疾病信息
    public static final Integer PAGE_SIZE_FIXMED_LIST_HIS = 10;//分页查询条件条数：机构业务历史
    public static final Integer PAGE_SIZE_LMTPRC_DEFN = 10;//分页查询条件条数：查询限价
    public static final Integer PAGE_SIZE_SELFPAY_PROP = 10;//分页查询条件条数：查询自付比例
    public static final Integer PAGE_SIZE_FIX_BLNG_ADMDVS = 10;//分页查询条件条数：查询定点归属机构
    public static final Integer PAGE_SIZE_FIX_MATERIAL_INFO = 50;//分页查询条件条数：查询材料信息

    public static final String CRED_OBJ_TYPE_YS = "7";//信用评价主体类型：医师
    public static final String CRED_OBJ_TYPE_CBR = "13";//信用评价主体类型：参保人
    public static final String MED_TYPE_MMMT = "14";//医疗类别：门慢门特


    public static final String TREAT_PSN_FLAG_S = "1";//优抚对象标志：1
    public static final String TREAT_PSN_FLAG_F = "0";//优抚对象标志：0


    public static final String IPT_PSN_SP_FLAG_TYPE_LXZY = "01";//机构特殊属性：连续住院标志


    public static final String TCMPAT_FLAG_S = "1";//中成药标志：是
    public static final String TCMPAT_FLAG_F = "0";//中成药标志：否
    public static final String NAT_DRUGLIST_TYPE_ZYYP = "C";//药品目录类别：中草药
    public static final String NAT_DRUGLIST_TYPE_XY = "X";//药品目录类别 西药
    public static final String NAT_DRUGLIST_TYPE_XYTP = "TX";//药品目录类别 西药谈判药
    public static final String NAT_DRUGLIST_TYPE_ZCY = "Z";//药品目录类别 中成药
    public static final String NAT_DRUGLIST_TYPE_ZCYT = "TZ";//药品目录类别 中成药谈判药


    public static final String LIST_TYPE_XYZY = "101";//目录类别：西药中成药
    //    public static final String LIST_TYPE_0101 = "0101";//目录类别：西药
//    public static final String LIST_TYPE_0102 = "0102";//目录类别：中成药
    public static final String LIST_TYPE_ZYYP = "102";//目录类别：中药饮片
    public static final String LIST_TYPE_ZZJ = "103";//目录类别：自制剂
    public static final String LIST_TYPE_MZY = "104";//目录类别：民族药
    public static final String LIST_TYPE_QT = "105";//目录类别：其他
    public static final String LIST_TYPE_ZYKL = "106";//目录类别：中药颗粒
    public static final String LIST_TYPE_FW = "201";//目录类别：医疗服务
    public static final String LIST_TYPE_CL = "301";//目录类别：医用材料
    public static final String LIST_TYPE_CHFWXM = "501";//目录类别：长护服务项目
    public static final String PRODPLAC_TYPE_1 = "1";//生产地类别：国内
    public static final String PRODPLAC_TYPE_2 = "2";//生产地类别：进口

    public static final String TRT_CHK_TYPE_01 = "01";//待遇检查类型：基金
    public static final String TRT_CHK_TYPE_99 = "99";//待遇检查类型：其他

    public static final String PRE_PAY_FLAG_0 = "0";//先行支付标志：否
    public static final String PRE_PAY_FLAG_1 = "1";//先行支付标志：是
    public static final String PAY_FLAG_0 = "0";//支付标志：计算结果
    public static final String PAY_FLAG_1 = "1";//支付标志：参考标准
    public static final String ACCT_USED_FLAG_1 = "1";//个人账户使用标志：使用
    public static final String ACCT_USED_FLAG_0 = "0";//个人账户使用标志：不使用
    public static final String FUND_PAY_TYPE_1 = "310200";/*基金支付类型：城镇职工基本医疗保险个人账户基金*/
    public static final String FLXEMPE_FLAG_1 = "1";/*灵活就业标志：是*/
    public static final String FLXEMPE_FLAG_0 = "0";/*灵活就业标志：否*/

    public static final String SELFPAY_PROP_TYPE_10 = "10";//目录先自付比例
    public static final String SELFPAY_PROP_TYPE_20 = "20";//目录直接报销比例
    public static final String SELFPAY_PROP_TYPE_30 = "30";//按费用单价范围配置自付比例
    public static final String DRT_REIM_FLAG_1 = "1";//直报标志：是
    public static final String DRT_REIM_FLAG_0 = "0";//直报标志：否

    public static final String FUND_EJY_MRK_XS = "1";//待遇享受标志：是
    public static final String FUND_EJY_MRK_BXS = "0";//待遇享受标志：否

    public static final String ISBIGMEDICAL_0 = "0";//划账时是否划大额：否
    public static final String ISBIGMEDICAL_1 = "1";//划账时是否划大额：是

    public static final String MED_TYPE_MENZHEN = "11,12,13,14,15,51,53";
    public static final String MED_TYPE_ZHUYAUN = "21,22,23,52";
    public static final String MED_TYPE_GONGFU = "51,52,53";
    public static final String MED_TYPE_GOUYAO = "41";
    public static final String PSN_SETL_NAME = "零星报销";//个人零星报销工作流
    public static final String HILIST_LV_1 = "01";    /*医保目录等级:甲*/
    public static final String HILIST_LV_2 = "02";    /*医保目录等级:乙*/
    public static final String HILIST_LV_3 = "03";    /*医保目录等级:丙*/
    public static final String CHRGITM_LV_01 = "01";    /*收费项目等级:甲*/
    public static final String CHRGITM_LV_02 = "02";    /*收费项目等级:乙*/
    public static final String CHRGITM_LV_03 = "03";    /*收费项目等级:丙*/
    public static final String PSN_IDET_11 = "11";/*国家公务员*/
    public static final String PSN_IDET_TYPE_1 = "01";/*优抚对象标志*/
    public static final String PSN_IDET_TYPE_2 = "02";/*困难人员类别*/
    public static final String PSN_IDET_TYPE_3 = "03";/*精准扶贫对象类别*/
    public static final String PSN_IDET_TYPE_5 = "05";/*公务员*/
    public static final String CVLSERV_FLAG_S = "1";/*公务员标志：是*/
    public static final String CVLSERV_FLAG_F = "0";/*公务员标志：否*/
    public static final String PSN_IDET_TYPE_6 = "23";/*医疗救助人员*/
    public static final String PSN_IDET_TYPE_7 = "07";/*医疗照顾人员*/
    public static final String LIST_ATTR_VAL_1 = "1";/*目录属性值：是*/
    public static final String LIST_ATTR_VAL_0 = "0";/*目录属性值：否*/
    public static final String HI_NEGO_DRUG_FLAG_1 = "1";/*谈判药品标志：是*/
    public static final String HI_NEGO_DRUG_FLAG_0 = "0";/*谈判药品标志：否*/
    public static final String BAS_MEDN_FLAG_1 = "1";/*基本药物标志：是*/
    public static final String BAS_MEDN_FLAG_2 = "0";/*基本药物标志：否*/
    public static final String HILIST_USE_TYPE_1 = "1";/*目录使用类别：中心使用*/
    public static final String HILIST_USE_TYPE_0 = "0";/*目录使用类别：机构使用*/

    public static final String BIZ_RULE_EXE_FLAG_1 = "1";/*业务规则执行标志：执行成功*/
    public static final String BIZ_RULE_EXE_FLAG_0 = "0";/*业务规则执行标志：执行失败*/
    /********************************** 两定*********************************/
    public static final String INOUT_DISE_TYPE_1 = "1";/*入院诊断*/
    public static final String INOUT_DISE_TYPE_2 = "2";/*出院诊断*/
    public static final String SETL_CAL_TYPE_00 = "00";/*预结算*/
    public static final String SETL_CAL_TYPE_11 = "11";/*正式结算*/


    /********************************** 拨付相关*********************************/
    public static final String DFR_NOTC_TYPE_1 = "1";    /*拨付通知类型:直接拨付到人*/
    public static final String DFR_NOTC_TYPE_2 = "2";    /*拨付通知类型:通过组织拨付到人*/
    public static final String DFR_NOTC_TYPE_3 = "3";    /*拨付通知类型:直接拨付到组织*/
    public static final String DFR_OBJ_11 = "11";    /*拨付对象:个人*/
    public static final String DFR_OBJ_21 = "21";    /*拨付对象:单位*/
    public static final String DFR_OBJ_31 = "31";    /*拨付对象:机构*/
    public static final String DFR_SOUC_101 = "101";    /*拨付来源:个人零星报销*/
    public static final String DFR_SOUC_102 = "102";    /*拨付来源:生育现金报销支付*/
    public static final String DFR_SOUC_103 = "103";    /*拨付来源:生育津贴支付*/
    public static final String DFR_SOUC_104 = "104";    /*拨付来源:医疗救助报销支付*/
    public static final String DFR_SOUC_105 = "105";    /*拨付来源:灵活报销支付*/
    public static final String DFR_SOUC_106 = "106";    /*拨付来源:零星补差报销支付*/
    public static final String DFR_SOUC_107 = "107";    /*拨付来源:年度内二次报销支付*/
    public static final String DFR_SOUC_201 = "201";    /*拨付来源:清算支付*/
    public static final String DFR_SOUC_202 = "202";    /*拨付来源:年中调整拨付*/
    public static final String DFR_SOUC_203 = "203";    /*拨付来源:预留保证金发放*/
    public static final String DFR_SOUC_204 = "204";    /*拨付来源:年终清算拨付*/
    public static final String DFR_SOUC_205 = "205";    /*拨付来源:超定额拨付*/
    public static final String DFR_SOUC_206 = "206";    /*拨付来源:门诊统筹包干拨付*/
    public static final String DFR_SOUC_207 = "207";    /*拨付来源:预付金拨付*/
    public static final String DFR_SOUC_301 = "301";    /*拨付来源:异地个人账户返还*/
    public static final String DFR_SOUC_302 = "302";    /*拨付来源:离休周转金拨付*/
    public static final String DFR_SOUC_303 = "303";    /*拨付来源:个人账户清退*/
    public static final String DFR_SOUC_304 = "304";    /*拨付来源：个人账户做实*/
    public static final String DFR_SOUC_999 = "999";    /*拨付来源：其它来源*/
    public static final String DFR_SOUC_99901 = "99901"; /*拨付来源：省内异地清算支付*/
    public static final String DFR_SOUC_99902 = "99902"; /*拨付来源：跨省异地清算支付*/
    public static final String DFR_SOUC_99903 = "99903"; /*拨付来源：经办机构支付*/
    public static final String DFR_SOUC_99904 = "99904"; /*拨付来源：居民退费拨付*/
    public static final String DFR_SOUC_99905 = "99905"; /*拨付来源：职工退费拨付*/
    public static final String DFR_SOUC_99906 = "99906";    /*拨付来源：生育津贴二次补偿*/
    public static final String DFR_SOUC_99907 = "99907"; /*拨付来源：生育津贴核销*/
    public static final String DFR_SOUC_99908 = "99908";    // 拨付来源：关系转移接续基金划转
    //public static final String DFR_SOUC_99909 = "99909";    // 拨付来源：低收入人口医疗救助二次报销
    public static final String DFR_TYPE_1 = "1";    /*拨付分类:零星报销拨付*/
    public static final String DFR_TYPE_2 = "2";    /*拨付分类:账户返还拨付*/
    public static final String DFR_TYPE_3 = "3";    /*拨付分类:账户做实拨付*/
    public static final String DFR_TYPE_4 = "4";    /*拨付分类:账户清退拨付*/
    public static final String DFR_TYPE_5 = "5";    /*拨付分类:月结拨付*/
    public static final String DFR_TYPE_6 = "6";    /*拨付分类:年结拨付*/
    public static final String DFR_WAY_1 = "1";    /*拨付方式:统一计划拨付*/
    public static final String DFR_WAY_2 = "2";    /*拨付方式:即时计划拨付*/
    public static final String TRT_ISSU_WAY_11 = "11";    /*待遇发放方式：委托银行发放*/
    public static final String TRT_ISSU_WAY_12 = "12";    /*待遇发放方式：委托邮寄发放*/
    public static final String TRT_ISSU_WAY_13 = "13";    /*待遇发放方式：委托街道社区代发*/
    public static final String TRT_ISSU_WAY_14 = "14";    /*待遇发放方式：网银*/
    public static final String TRT_ISSU_WAY_21 = "21";    /*待遇发放方式：柜台*/
    public static final String TRT_ISSU_WAY_22 = "22";    /*待遇发放方式：指定他人直接到经办机构领取*/
    public static final String TRT_ISSU_WAY_31 = "31";    /*待遇发放方式：单位代发（含个人委托单位领取）*/
    public static final String TRT_ISSU_WAY_41 = "41";    /*待遇发放方式：直接对机构拨付*/
    public static final String TRT_ISSU_WAY_87 = "87";    /*待遇发放方式：调账*/
    public static final String TRT_ISSU_WAY_99 = "99";    /*待遇发放方式：电汇*/
    public static final String FIN_DSPO_FLAG_1 = "1";    /*财务处理标志：未处理*/
    public static final String FIN_DSPO_FLAG_2 = "2";    /*财务处理标志：在途*/
    public static final String FIN_DSPO_FLAG_CHK_211 = "211";    /*财务处理标志：财务审核通过*/
    public static final String FIN_DSPO_FLAG_CHK_212 = "212";    /*财务处理标志：财务审核不通过*/
    public static final String FIN_DSPO_FLAG_RCHK_221 = "221";    /*财务处理标志：财务复核通过*/
    public static final String FIN_DSPO_FLAG_RCHK_222 = "222";    /*财务处理标志：财务复核不通过*/
    public static final String FIN_DSPO_FLAG_3 = "3";    /*财务处理标志：未收妥/实付*/
    public static final String FIN_DSPO_FLAG_4 = "4";    /*财务处理标志： 已实收/付*/
    public static final String FIN_DSPO_FLAG_9 = "9";    /*财务处理标志：财务支付失败*/

    /********************************** 业务来源表名**********************************/
    public static String TABNAME_FLX_REIM_REG_INFO_D = "FLX_REIM_REG_INFO_D";
    public static String TABNAME_YEAR_IN_SDRY_REIM_D = "YEAR_IN_SDRY_REIM_D";
    public static String TABNAME_SETL_D = "SETL_D";
    /********************************** 基本医疗保险**********************************/
    public static String STAFF_BASIC_MED_INS_CODE = "310";
    public static String URBAN_BASIC_MED_INS_CODE = "390";
    public static String TOWN_BASIC_MED_INS_CODE = "340";
/********************************** :WrapperResponse返回参数 **********************************/

    /********************************** :缴费记录表表名 start **********************************/
    public static String RECORD_TABLE_CLCT = "UEBMI_CLCT_RCD_C";//职工基本医疗保险缴纳记录表
    public static String RECORD_TABLE_CRTF = "UEBMI_CRTF_RCD_C";//职工基本医疗保险核定记录表
    public static String RECORD_TABLE_CANC = "UEBMI_CANC_RCD_C";//职工基本医疗保险核销记录表

/********************************** :缴费记录表表名 end **********************************/
    /********************************** :定时任务标志 start **********************************/
    public static final String TASK_FLAG_0 = "0";//先定时任务标志：否
    public static final String TASK_FLAG_1 = "1";//定时任务标志：是
    /********************************** :定时任务标志 end **********************************/
    /**
     * 返回code   成功
     */
    public static final int CODE_SUCCESS = 0;
    /**
     * 返回code   失败
     */
    public static final int CODE_ERROR = -1;
    /**
     * 返回code   警告
     */
    public static final int CODE_WARN = 9;
    /********************************** :当事人类别 **********************************/
    /**
     * 当事人类别(PTCP_TYPE):组织
     */
    public static final String PTCP_TYPE_1_ZZ = "1";
    /**
     * 当事人类别(PTCP_TYPE):人员
     */
    public static final String PTCP_TYPE_2_RY = "2";
    /**
     * 当事人类别(PTCP_TYPE):家庭
     */
    public static final String PTCP_TYPE_3_JT = "3";

    /**
     * 当事人类别(PTCP_TYPE):单位
     */
    public static final String PTCP_TYPE_4_DW = "4";

    /**
     * 当事人类别(PTCP_TYPE):定点医药机构（表示所办理的是定点医院或药店业务）
     */
    public static final String PTCP_TYPE_5_DDYYJG = "5";

    /**
     * 当事人类别(PTCP_TYPE):经办机构（表示经办机构发起的批量业务）
     */
    public static final String PTCP_TYPE_6_JBJG = "6";

    /**
     * 当事人类别(PTCP_TYPE):其他
     */
    public static final String PTCP_TYPE_9_QT = "9";

    /********************************* 险种离退休标志 *********************************/
    /**
     * 险种离退休标志(INSUTYPE_RETR_FLAG):在职
     */
    public static final String INSUTYPE_RETR_FLAG_0_ZZ = "0";
    /**
     * 险种离退休标志(INSUTYPE_RETR_FLAG):退休
     */
    public static final String INSUTYPE_RETR_FLAG_1_TX = "1";
    /**
     * 险种离退休标志(INSUTYPE_RETR_FLAG):离退休
     */
    public static final String INSUTYPE_RETR_FLAG_2_LTX = "2";

    /********************************** 退休待遇享受标志 **********************************/
    //未享受
    public static final String RETR_TRT_ENJYMNT_FLAG_01 = "01";
    //正常享受
    public static final String RETR_TRT_ENJYMNT_FLAG_02 = "02";
    //统筹划账户暂停
    public static final String RETR_TRT_ENJYMNT_FLAG_03 = "03";
    //统筹待遇暂停
    public static final String RETR_TRT_ENJYMNT_FLAG_04 = "04";
    //退休待遇暂停
    public static final String RETR_TRT_ENJYMNT_FLAG_05 = "05";
    /********************************** 退休待遇享受标志 **********************************/

    /********************************** 离退休类型 **********************************/
    //离休
    public static final String RETR_TYPE_1 = "1";
    //正常退休退休
    public static final String RETR_TYPE_2 = "2";
    /********************************** 离退休类型 **********************************/

    /********************************** 第三方赔付标志 **********************************/

    public static final String TTPPAYFLAG_0 = "0"; //否


    public static final String TTPPAYFLAG_1 = "1"; //是


    /********************************** 工资启用类型 **********************************/
    /**
     * 工资启用类型(SOCA_AVESAL_ENAB_MODE):按申报年度社平立即启用（申报年度已有社平）
     */
    public static final String SOCA_AVESAL_ENAB_MODE_1_ZJQY = "1";
    /**
     * 工资启用类型(SOCA_AVESAL_ENAB_MODE):按上年社平立即启用（申报年度未有社平）
     */
    public static final String SOCA_AVESAL_ENAB_MODE_2_ASNQY = "2";
    /**
     * 工资启用类型(SOCA_AVESAL_ENAB_MODE):延时启用（申报年度未有社平，等待社平发布后启用）
     */
    public static final String SOCA_AVESAL_ENAB_MODE_3_YSQY = "3";

    /******************************* SPLT_MERG_TYPE:单位分并类型 *******************************/
    /**
     * 单位分并类型:合并
     */
    public static final String SPLT_MERG_TYPE_2_HB = "2";
    /**
     * 单位分并类型:分立
     */
    public static final String SPLT_MERG_TYPE_1_FL = "1";

    /******************************* PTCP_BANKACCT_USED_TYPE:当事人银行账号用途类别 *******************************/
    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):基础账号
     */
    public static final String PTCP_BANKACCT_USED_TYPE_0_JCZH = "0";
    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):征缴账号
     */
    public static final String PTCP_BANKACCT_USED_TYPE_1_ZJZH = "1";

    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):待遇拨付/发放账号
     */
    public static final String PTCP_BANKACCT_USED_TYPE_2_DYBFFFZH = "2";

    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):异地转入收款账号
     */
    public static final String PTCP_BANKACCT_USED_TYPE_3_YDZRSKZH = "3";
    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):转出
     */
    public static final String PTCP_BANKACCT_USED_TYPE_207_ZC = "207";
    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):转入
     */
    public static final String PTCP_BANKACCT_USED_TYPE_107_ZR = "107";
    /**
     * 当事人银行账号用途类别(PTCP_BANKACCT_USED_TYPE):多发退回
     */
    public static final String PTCP_BANKACCT_USED_TYPE_203_DFTH = "203";

    /*************************************** BANKACCT_USED_CHG_TYPE:银行帐号用途变更类型 *******************************/
    /**
     * 银行用途变更类型:注销
     */
    public static final String BANKACCT_USED_CHG_TYPE_0_ZX = "0";
    /**
     * 银行用途变更类型:新增
     */
    public static final String BANKACCT_USED_CHG_TYPE_1_XZ = "1";
    /*************************************** PSN_CHG_TYPE:人员变更类型 *******************************/
    /**
     * 人员变更类型:新参保
     */
    public static final String PSN_CHG_TYPE_XCB = "11";
    /**
     * 人员变更类型:恢复缴费
     */
    public static final String PSN_CHG_TYPE_HFCB = "12";
    /**
     * 人员变更类型:统筹范围外转入
     */
    public static final String PSN_CHG_TYPE_TCFWWZR = "13";
    /**
     * 人员变更类型:统筹范围内转入
     */
    public static final String PSN_CHG_TYPE_TCFWNZR = "14";
    /**
     * 人员变更类型:终止医疗保险关系
     */
    public static final String PSN_CHG_TYPE_ZZYLBXGX = "21";
    /**
     * 人员变更类型:中断缴费
     */
    public static final String PSN_CHG_TYPE_ZDJF = "22";
    /**
     * 人员变更类型:转出统筹范围外
     */
    public static final String PSN_CHG_TYPE_ZCTCFWW = "23";
    /**
     * 人员变更类型:统筹范围内转出
     */
    public static final String PSN_CHG_TYPE_TCFWWZC = "24";
    /**
     * 人员变更类型:在职转退休
     */
    public static final String PSN_CHG_TYPE_ZZZTX = "25";
    /**
     * 人员变更类型:人员身份类型变更
     */
    public static final String PSN_CHG_TYPE_RYSFLXBG = "27";
    /**
     * 人员变更类型:冻结
     */
    public static final String PSN_CHG_TYPE_DJ = "31";
    /**
     * 人员变更类型:解冻
     */
    public static final String PSN_CHG_TYPE_JD = "32";
    /**
     * 人员变更类型:银行账户信息维护
     */
    public static final String PSN_CHG_TYPE_YHZHXXWH = "34";
    /**
     * 人员变更类型:基本信息维护
     */
    public static final String PSN_CHG_TYPE_JBXXWH = "35";
    /**
     * 人员变更类型:参保信息维护
     */
    public static final String PSN_CHG_TYPE_CBXXWH = "36";
    /**
     * 人员变更类型:单位合并分立
     */
    public static final String PSN_CHG_TYPE_DWHBFL = "37";

    /**
     * 人员变更类型:视同缴费年限认定
     */
    public static final String PSN_CHG_TYPE_STJFRD = "38";

    /************************ 工资批量经办状态 ****************************/

    /**
     * 未处理
     */
    public static final String STATUS_WAG_UNDO = "0";
    /**
     * 处理中
     */
    public static final String STATUS_WAG_DOING = "1";
    /**
     * 成功
     */
    public static final String STATUS_WAG_SUCCESS = "3";
    /**
     * 失败
     */
    public static final String STATUS_WAG_FAIL = "4";
    /**
     * 历史数据
     */
    public static final String STATUS_WAG_DONE = "5";


    /*************************************** CLCT_FLAG:缴费标志 *******************************/

    /**
     * 缴费标志:已缴
     */
    public static final String CLCT_FLAG_1_YJ = "1";

    /**
     * 缴费标志:未缴
     */
    public static final String CLCT_FLAG_0_WJ = "0";

    /*************************************** EMP_CHG_TYPE:单位变更类型 *******************************/
    /**
     * 单位变更类型:单位登记
     */
    public static final String EMP_CHG_TYPE_01_DJ = "01";

    /**
     * 单位变更类型:单位中断缴费
     */
    public static final String EMP_CHG_TYPE_02_ZDJF = "02";
    /**
     * 单位变更类型:单位恢复缴费
     */
    public static final String EMP_CHG_TYPE_03_HFJF = "03";
    /**
     * 单位变更类型:单位分立
     */
    public static final String EMP_CHG_TYPE_05_FL = "05";
    /**
     * 单位变更类型:单位破产
     */
    public static final String EMP_CHG_TYPE_06_PC = "06";
    /**
     * 单位变更类型:单位成建制转出
     */
    public static final String EMP_CHG_TYPE_07_ZC = "07";
    /**
     * 单位变更类型:单位成建制转入
     */
    public static final String EMP_CHG_TYPE_08_ZR = "08";
    /**
     * 单位变更类型:单位注销（含撤消、吊销）
     */
    public static final String EMP_CHG_TYPE_09_ZX = "09";
    /**
     * 单位变更类型:单位转制
     */
    public static final String EMP_CHG_TYPE_10_ZZ = "10";

    /**
     * 单位变更类型:单位冻结
     */
    public static final String EMP_CHG_TYPE_11_DJ = "11";

    /**
     * 单位变更类型:单位解冻
     */
    public static final String EMP_CHG_TYPE_12_JD = "12";

    /**
     * 单位变更类型:单位信息维护
     */
    public static final String EMP_CHG_TYPE_13_XXWH = "13";

    /**
     * 单位变更类型:单位险种减少
     */
    public static final String EMP_CHG_TYPE_14_XZJS = "14";
    /**
     * 单位变更类型:单位合并
     */
    public static final String EMP_CHG_TYPE_15_HB = "15";
    /**
     * 单位变更类型:其他
     */
    public static final String EMP_CHG_TYPE_99_QT = "99";

    /*************************************** 业务事件类型 *******************************/

    /**
     * 单位参保登记
     */
    public static final String BIZ_EVT_TYPE_EMP_INSU = "mbs-emp-insu-01";

    /**
     * 城乡居民参保登记
     */
    public static final String BIZ_EVT_TYPE_PSNINSUREG_3 = "MBS-PSN-INSU-03";

    /**
     * 城乡居民参保登记（公共服务）
     */
    public static final String BIZ_EVT_TYPE_PSNINSUREG_3_GGFW = "MBS-PSN-INSU-03_GGFW";

    /**
     * 城乡居民信息维护
     */
    public static final String BIZ_EVT_TYPE_PSNINFOUPDA = "MBS-PSN-INFOUPDA-01";

    /**
     * 医疗视同缴费年限认定
     */
    public static final String BIZ_EVT_TYPE_TRATCRTF = "MBS-PSN-TRATCRTF-01";

    /**
     * 特殊身份认定
     * 20211207修改，原值 MBS-PSN-SPIDET-01，与字典值不符
     */
    public static final String BIZ_EVT_TYPE_SPIDET = "mbs-psn-spidet-01";

    /**
     * 在职转退休
     */
    public static final String BIZ_EVT_TYPE_RETR = "MBS-PSN-RETR-01";

    /**
     * 人员终止参保
     * 20211202修改，原值 MBS-PSN-EXPIINSU-01，与字典值不符
     */
    public static final String BIZ_EVT_TYPE_EXPIINSU = "mbs-psn-exins-01";

    /**
     * 职工参保登记
     */
    public static final String BIZ_EVT_TYPE_INSU = "mbs-psn-insu-01";

    /**
     * 重复参保人员处理
     */
    public static final String BIZ_EVT_TYPE_REPTREDS = "MBS-PSN-REPTREDS-01";

    /**
     * 人员多号合并
     */
    public static final String BIZ_EVT_TYPE_PSNMERG = "MBS-PSN-MERG-01";

    /**
     * 参保人员暂停缴费
     */
    public static final String BIZ_EVT_TYPE_PSNPAUSCLCT = "MBS-PSN-PAUSCLCT-01";

    /**
     * 灵活就业人员中断缴费
     */
    public static final String BIZ_EVT_TYPE_FLXPSNPAUSCLCT = "MBS-PSN-PAUSCLCT-02";

    /**
     * 参保人员信息维护
     * 20211206修改，原值 MBS-PSN-MNT-01，与字典值不符
     */
    public static final String BIZ_EVT_TYPE_PSNMNT = "mbs-psn-mnt-01";

    /**
     * 缴费通知单
     */
    public static final String BIZ_EVT_TYPE_CLCT_BILL = "MCB";


    /**
     * 预留金管理
     */
    public static final String BIZ_EVT_TYPE_RESERVERD_FUND = "mbs-n070301";


    /**
     * 预留金环节编号
     */
    public static final String RESERVERD_FUND_NODE_NO_01 = "mbs-n07030102";

    /**
     * 预留金环节编号
     */
    public static final String RESERVERD_FUND_NODE_NO_02 = "mbs-n07030103";

    /**
     * 预留金环节编号
     */
    public static final String RESERVERD_FUND_NODE_NO_03 = "mbs-n07030104";

    /**
     * 稽核审查扣款
     */
    public static final String BIZ_EVT_TYPE_AUDIT = "MBS-EMP-AUDIT-01";
    /**
     * 明细审查扣款
     */
    public static final String BIZ_EVT_TYPE_SETLCHK = "MBS-EMP-SETLCHK-01";

    /**
     * 预付金核定
     */
    public static final String BIZ_YFJHD = "MBS-YFJHD";
    /**
     * 预付金收回
     */
    public static final String BIZ_YFJSH = "MBS-YFJSH";

    /**
     * 新增
     */
    public static final String BIZ_EVT_TYPE_XZ = "01";

    /**
     * 变更
     */
    public static final String BIZ_EVT_TYPE_XG = "02";

    /**
     * 停用
     */
    public static final String BIZ_EVT_TYPE_SC = "03";

    /**
     * 冲正
     */
    public static final String BIZ_EVT_TYPE_CZ = "04";

    /**
     * 撤销
     */
    public static final String BIZ_EVT_TYPE_CX = "05";

    /**
     * 冲撤销
     */
    public static final String BIZ_EVT_TYPE_CCX = "06";

    /**
     * 有效标志 2 冲正挂起
     */
    public static final String VALI_FLAG_1_GQ = "2";

    /**
     * 业务事件类型 - 单位补收核定
     */
    public static final String BIZ_EVT_TYPE_CRTEMPFMSPAY = "MBS-CRT-EMPFMSPAY-01";
    /**
     * 业务事件类型 - 单位差额补退
     */
    public static final String BIZ_EVT_TYPE_CRTEMPRVIS = "MBS-CRT-EMPRVIS-01";
    /**
     * 业务事件类型 - 人员差额补退
     */
    public static final String BIZ_EVT_TYPE_CRTPSNRVIS = "MBS-CRT-PSNRVIS-01";
    /**
     * 业务事件类型 - 单位预缴核定
     */
    public static final String BIZ_EVT_TYPE_ADVPAYCRT = "MBS-ADV-PAYCRT-01";
    /**
     * 业务事件类型 - 单位预缴返还
     */
    public static final String BIZ_EVT_TYPE_ADVPAYBAK = "MBS-ADV-PAYBAK-01";
    /**
     * 业务事件类型 - 待转金按单分配
     */
    public static final String BIZ_EVT_TYPE_ADVPAYDOCASS = "MBS-ADV-PAYDOCASS-01";
    /**
     * 业务事件类型 - 基本医疗保险转入申请（关系转移接续联系函）
     */
    public static final String BIZ_EVT_TYPE_ACCPSNPER = "MBS-RLT-PSNPER-01";

    /**

     /*************************************** BIZ_AREA_TYPE:业务域类型 *******************************/

    /**
     * 人员参保信息
     */
    public static final String BIZ_AREA_TYPE_PSN_INS = "PSN-INSU-INFO-01";
    /**
     * 人员参保信息维护
     */
    public static final String BIZ_AREA_TYPE_PSN_INSMNT = "PSN-INSU-MNT-01";

    /**
     * 人员基础信息
     */
    public static final String BIZ_AREA_TYPE_PSN_BASE = "PSN-BAS-INFO-01";
    /**
     * 新增工资申报信息
     */
    public static final String BIZ_AREA_TYPE_2_ADD_PSN_WAG_DCLA = "2";
    /**
     * 人员银行信息
     */
    public static final String BIZ_AREA_TYPE_PSN_BANK = "PSN-BANK-INFO-01";
    /**
     * 人员险种扩展信息
     */
    public static final String BIZ_AREA_TYPE_PSN_EXT = "PSN-EXT-INFO-01";
    /**
     * 人员特殊身份认定信息
     */
    public static final String BIZ_AREA_TYPE_PSN_SPIDET = "PSN_SPIDET-INFO-01";
    /**
     * 单位基本信息
     */
    public static final String BIZ_AREA_TYPE_EMP_BASE = "EMP-BAS-INFO-01";
    /**
     * 单位参保信息
     */
    public static final String BIZ_AREA_TYPE_EMP_INS = "EMP-INSU-INFO-01";
    /**
     * 单位银行信息
     */
    public static final String BIZ_AREA_TYPE_EMP_BANK = "EMP-BANK-INFO-01";

    /**
     * 单位信息维护
     */
    public static final String BIZ_EVT_TYPE_EMPINFOMNT = "MBS-EMP-MNT-01";

    /**
     * 单位分立合并
     */
    public static final String BIZ_AREA_TYPE_EMP_SPL_MERGE = "EMP_SPL_MERGE";

    /**
     * 单位预缴管理
     */
    public static final String BIZ_AREA_TYPE_EMP_CLCT_DETL = "EMP_CLCT_DETL";

    /**
     * 人员合并
     */
    public static final String BIZ_AREA_TYPE_PSN_INFO_MERGE = "PSN_INFO_MERGE";

    /**
     * 医疗视同缴费年限认定
     */
    public static final String BIZ_AREA_TYPE_PSN_TRATCRTF_INFO = "PSN-TRATCRTF-INFO-01";

    /**
     * 人员退休信息
     */
    public static final String BIZ_AREA_TYPE_PSN_RETR_INFO = "PSN-RETR-INFO-01";

    /**
     * 人员基本信息
     */
    public static final String BIZ_AREA_TYPE_PSN_BAS_INFO = "PSN-BAS-INFO-01";

    /**
     * 人员参保信息
     */
    public static final String BIZ_AREA_TYPE_PSN_INSU_INFO = "PSN-INSU-INFO-01";

    /**
     * 基本医疗保险转入申请（关系转移接续联系函）
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_CONLET = "RLTS_TRAF_CONLET-01";

    /**
     * 基本医疗保险转入申请（关系转移申请通知单）
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_APPY = "RLTS_TRAF_APPY-01";

    /**
     * 基本医疗保险转出
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_OUT = "RLTS_TRAF_OUT-01";

    /**
     * 基本医疗保险转入
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_IN = "RLTS_TRAF_IN-01";

    /**
     * 基本医疗保险转入(关系转移基金匹配)
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_FUND_MAP = "RLTS_TRAF_FUND_MAP-01";
    /**
     * 基本医疗保险转移(关系转移经办机构)
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_OPT = "RLTS_TRAF_OPT-01";
    /**
     * 个人账户注入
     */
    public static final String BIZ_AREA_TACC_PREPL = "ACC-PREPL-01";

//    /**
//     * 人员终止参保
//     */
//    public static final String BIZ_AREA_TYPE_PSN_EXPIINSU_INFO = "PSN-EXPIINSU-INFO-01";

    // *************************************** 审核标志 *******************************/
    /**
     * 审核标志 0 未复核
     */
    public static final String CHK_FLAG_0_WFH = "0";

    /**
     * 审核标志 0 的值
     */
    public static final String CHK_FLAG_0_WFH_VALUE = "未审核";
    /**
     * 审核标志 1 复核通过
     */
    public static final String CHK_FLAG_1_FHTG = "1";
    /**
     * 审核标志 1 的值
     */
    public static final String CHK_FLAG_1_FHTG_VALUE = "审核通过";
    /**
     * 审核标志 2 复核不通过
     */
    public static final String CHK_FLAG_2_FHBTG = "2";
    /**
     * 审核标志 2 的值
     */
    public static final String CHK_FLAG_2_FHBTG_VALUE = "审核不通过";
    // *************************************** 网上报销业务来源 *******************************/
    /**
     * 业务来源 1 门诊来源
     */
    public static final String BIZSOUC_FLAG_1 = "1";
    /**
     * 业务来源 2 住院来源
     */
    public static final String BIZSOUC_FLAG_2 = "2";
    /**
     * 业务来源 3 生育医疗
     */
    public static final String BIZSOUC_FLAG_3 = "3";
    /**
     * 业务来源 4 生育津贴
     */
    public static final String BIZSOUC_FLAG_4 = "4";
    /**
     * 业务来源 5 个人账户清退
     */
    public static final String BIZSOUC_FLAG_5 = "5";

    public static final String PSN_SETLD_FLAG_1 = "1";

    public static final String PSN_SETLD_FLAG_2 = "2";

    public static final String PSN_SETLD_FLAG_3 = "3";
    // *************************************** 网上报销审核标志 *******************************/
    /**
     * 审核标志 0 草稿状态
     */
    public static final String CG_FLAG_0 = "0";
    /**
     * 审核标志 4 经办中心审核通过
     */
    public static final String JBZX_FLAG_4_TG = "4";
    /**
     * 审核标志 5 经办中心审核不通过
     */
    public static final String JBZX_FLAG_5_BTG = "5";
    /**
     * 审核标志 6 报销审核通过
     */
    public static final String BX_FLAG_6_TG = "6";
    /**
     * 审核标志 7 报销审核不通过
     */
    public static final String BX_FLAG_7_BTG = "7";
    /**
     * 审核标志 8 报销支付成功
     */
    public static final String BX_FLAG_8_CG = "8";
    /**
     * 审核标志 9 报销支付撤销
     */
    public static final String BX_FLAG_9_CX = "9";
    /**
     * 审核标志 11 待邮寄
     */
    public static final String BX_FLAG_11_CX = "11";

    // *************************************** 复核标志 *******************************/
    /**
     * 复核标志 0 未复核
     */
    public static final String RCHK_FLAG_0_WFH = "0";

    /**
     * 复核标志 0 的值
     */
    public static final String RCHK_FLAG_0_WFH_VALUE = "未复核";
    /**
     * 复核标志 1 复核通过
     */
    public static final String RCHK_FLAG_1_FHTG = "1";
    /**
     * 复核标志 1 的值
     */
    public static final String RCHK_FLAG_1_FHTG_VALUE = "复核通过";
    /**
     * 复核标志 2 复核不通过
     */
    public static final String RCHK_FLAG_2_FHBTG = "2";
    /**
     * 复核标志 2 的值
     */
    public static final String RCHK_FLAG_2_FHBTG_VALUE = "复核不通过";
    /**
     * 复核标志 3 已撤销
     */
    public static final String RCHK_FLAG_3_FHYCX = "3";
    /**
     * 复核标志 4 已回退
     */
    public static final String RCHK_FLAG_4_YHT = "4";
    /**
     * 复核标志 9 已经申请，待核定
     */
    public static final String RCHK_FLAG_9_DHD = "9";
    /**
     * 复核标志 7 审批通过
     */
    public static final String RCHK_FLAG_7_YSP = "7";
    /**
     * 复核标志 8 审批不通过
     */
    public static final String RCHK_FLAG_8_SPBTG = "8";

    /**
     * 有效标志 0 无效
     */
    public static final String VALI_FLAG_0_WX = "0";
    /**
     * 有效标志 1 有效
     */
    public static final String VALI_FLAG_1_YX = "1";

    /*********************************** PATC_DETD_FLAG:已参与实扣标志 *******************************/

    /**
     * 已实扣
     */
    public static final String PATC_DETD_FLAG_1 = "1";

    /**
     * 未实扣
     */
    public static final String PATC_DETD_FLAG_0 = "0";

    /*********************************** STATIC_FLAG:静态要素标志 *******************************/

    /**
     * 是
     */
    public static final String STATIC_FLAG_1 = "1";

    /**
     * 否
     */
    public static final String STATIC_FLAG_0 = "0";

    /**
     * 非医疗救助人员/非医疗照顾人员
     */
    public static final String STATIC_FLAG_99 = "99";

    /*********************************** MED_OPT_TYPE:医疗经办类型 *******************************/

    /**
     * 零星报销
     */
    public static final String MED_OPT_TYPE_1 = "1";

    /**
     * 实时报销
     */
    public static final String MED_OPT_TYPE_0 = "0";

    /*********************************** FIELD_NAME:字段名 *******************************/

    /**
     * 零星报销
     */
    public static final String FIELD_NAME_OPTTIME = "optTime";

    /*********************************** LIST_ATTR_CODE:特殊属性代码 *******************************/

    /**
     * 基本药物标志属性
     */
    public static final String LIST_ATTR_CODE_1 = "1";

    /**
     * 谈判药物标志属性
     */
    public static final String LIST_ATTR_CODE_2 = "2";

    /*********************************** PAGE:分页参数 *******************************/

    /**
     * 页数
     */
    public static final int PAGE_NUM_1 = 1;

    /**
     * 零
     */
    public static final int PAGE_SIZE_ZERO = 0;

    /**
     * 小
     */
    public static final int PAGE_SIZE_SMALL = 5;

    /**
     * 中等
     */
    public static final int PAGE_SIZE_MEDIUM = 100;

    /**
     * 大
     */
    public static final int PAGE_SIZE_LARGE = 500;
    /**
     * 超大
     */
    public static final int PAGE_SIZE_HUGE = 1000;

    /*********************************** SETL_TYPE:结算类别 *******************************/

    /**
     * 中心报销
     */
    public static final String SETL_TYPE_1 = "1";

    /**
     * 联网结算
     */
    public static final String SETL_TYPE_2 = "2";

    /**
     * 补充报销
     */
    public static final String SETL_TYPE_4 = "3";

    /*********************************** CLR_WAY:清算方式 *******************************/

    /**
     * 按项目
     */
    public static final String CLR_WAY_10 = "10";


    /**
     * 按项目
     */
    public static final String CLR_WAY_1 = "1";
    /**
     * 单病种
     */
    public static final String CLR_WAY_20 = "20";

    /**
     * 按病种分值
     */
    public static final String CLR_WAY_30 = "30";

    /**
     * 疾病诊断相关分组（DRG）
     */
    public static final String CLR_WAY_40 = "40";

    /**
     * 按床日
     */
    public static final String CLR_WAY_50 = "50";

    /**
     * 按人头
     */
    public static final String CLR_WAY_60 = "60";

    /**
     * 其他
     */
    public static final String CLR_WAY_99 = "99";

    /**
     * 次均定额结算
     */
    public static final String CLR_WAY_915 = "915";

    /*********************************** 医保目录业务 *******************************/
    /**
     * 查询本身,不做处理
     */
    public static final List<String> N_INSU_ADMDVS= Arrays.asList(new String[]{"139900", "139904", "139903", "139905", "130181", "130682"});

    public static final String N_INSU_ADMDVS_END= "00";

    /*********************************** CLR_STAS:清算状态 *******************************/
    public static final String CLR_CRTF_STAS_0 = "0";

    /**
     * 核定已完成
     */
    public static final String CLR_CRTF_STAS_1 = "1";
    /**
     * 已拨付
     */
    public static final String CLR_CRTF_STAS_2 = "2";

    /**
     * 10 已申请
     */
    public static final String CLR_STAS_10 = "10";

    /**
     * 20 申请已受理
     */
    public static final String CLR_STAS_20 = "20";

    /**
     * 30 正在审核
     */
    public static final String CLR_STAS_30 = "30";

    /**
     * 40 审核完成
     */
    public static final String CLR_STAS_40 = "40";

    /**
     * 50 已清算
     */
    public static final String CLR_STAS_50 = "50";

    /**
     * 60 已拨付
     */
    public static final String CLR_STAS_60 = "60";

    /**
     * 70 已驳回
     */
    public static final String CLR_STAS_70 = "70";

    /*********************************** DETD_STAS:实扣状态 *******************************/
    public static final String DETD_STAS_0 = "0";
    /**
     * 10 未实扣
     */
    public static final String DETD_STAS_10 = "10";

    /**
     * 20 部分实扣
     */
    public static final String DETD_STAS_20 = "20";

    /**
     * 30 全额实扣
     */
    public static final String DETD_STAS_30 = "30";

    /*********************************** EVT_TYPE:事件类型 *******************************/

    /**
     * 1 新增
     */
    public static final String EVT_TYPE_XZ = "01";

    /**
     * 2 修改
     */
    public static final String EVT_TYPE_XG = "02";

    /**
     * 3删除
     */
    public static final String EVT_TYPE_XD = "03";
    /**
     * 5撤销
     */
    public static final String EVT_TYPE_CX = "05";
    /*********************************** MANL_REIM_REA:手工报销原因 *******************************/
    /**
     * 一般报销
     */
    public static final String MANL_REIM_REA_01 = "01";


    /**
     * 定点无卡就医
     */
    public static final String MANL_REIM_REA_02 = "02";

    /**
     * 异地就诊
     */
    public static final String MANL_REIM_REA_03 = "03";

    /**
     * 急救抢救
     */
    public static final String MANL_REIM_REA_04 = "04";

    /**
     * 异地转诊转院
     */
    public static final String MANL_REIM_REA_05 = "05";

    /**
     * 跨省双通道药品报销
     */
    public static final String MANL_REIM_REA_9957 = "9957";

    /**
     * 其他
     */
    public static final String MANL_REIM_REA_99 = "99";
    /**
     * 统筹区外手工报销已备案
     */
    public static final String MANL_REIM_REA_9923 = "9923";
    /**
     * 统筹区外手工报销未备案
     */
    public static final String MANL_REIM_REA_9924 = "9924";
    /**
     * 统筹区外手工报销未备案营利性医院
     */
    public static final String MANL_REIM_REA_9925 = "9925";
    /**
     * 大学生统筹区内政策
     */
    public static final String MANL_REIM_REA_9926 = "9926";
    /**
     * 非认定定点
     */
    public static final String MANL_REIM_REA_9940 = "9940";

    /**
     * 院前检查报销
     */
    public static final String MANL_REIM_REA_07 = "07";

    /**
     * 医疗救助补报销
     */
    public static final String MANL_REIM_REA_06 = "06";

    /**
     * 年度二次补报销
     */
    public static final String MANL_REIM_REA_08 = "08";

    /**
     * 零星二次补报销
     */
    public static final String MANL_REIM_REA_09 = "09";

    /**
     * 零星二次批量补报销
     */
    public static final String MANL_REIM_REA_10 = "10";

    /**
     * 灵活报销
     */
    public static final String MANL_REIM_REA_LHBX = "lhbx";

    /*********************************** REIM_STAS:报销状态 *******************************/

    /**
     * 已登记
     */
    public static final String REIM_STAS_0 = "10";

    /**
     * 已明细录入
     */
    public static final String REIM_STAS_11 = "11";

    /**
     * 已结算
     */
    public static final String REIM_STAS_1 = "12";

    /**
     * 已结算审核
     */
    public static final String REIM_STAS_2 = "13";

    /*********************************** DET_TYPE:扣款类型 *******************************/
    /**
     * 审核扣款
     */
    public static final String DET_TYPE_10 = "10";

    /**
     * 稽核扣款
     */
    public static final String DET_TYPE_20 = "20";

    /**
     * 预付金抵扣
     */
    public static final String DET_TYPE_30 = "30";

    /**
     * 预留金暂扣
     */
    public static final String DET_TYPE_40 = "40";

    /**
     * 其他扣款
     */
    public static final String DET_TYPE_99 = "99";

    /*********************************** CLR_STAS:清算类别 *******************************/
    public static final String CLR_TYPE_MZ = "11";
    public static final String CLR_TYPE_ZY = "21";
    public static final String CLR_TYPE_YD = "41";
    public static final String CLR_TYPE_QT = "99";

    /** 省内异地 9902*/
    public static final String CLR_TYPE_SNYD_9902 = "9902";
    /** 省内异地 9903*/
    public static final String CLR_TYPE_SNYD_9903 = "9903";
    /** 省内异地 9907*/
    public static final String CLR_TYPE_SNYD_9907 = "9907";
    /** 省内异地 9908*/
    public static final String CLR_TYPE_SNYD_9908 = "9908";
    /** 跨省异地  9909 */
    public static final String CLR_TYPE_KSYD_9909 = "9909";
    /** 跨省异地  9910 */
    public static final String CLR_TYPE_KSYD_9910 = "9910";
    /** 跨省异地  9921 */
    public static final String CLR_TYPE_KSYD_9921 = "9921";
    /** 跨省异地  9936 */
    public static final String CLR_TYPE_KSYD_9936 = "9936";

    /**
     * 职工住院
     */
    public static final String CLR_TYPE_10 = "10";

    /**
     * 职工门诊
     */
    public static final String CLR_TYPE_11 = "11";

    /**
     * 职工门慢
     */
    public static final String CLR_TYPE_12 = "12";

    /**
     * 职工药店
     */
    public static final String CLR_TYPE_13 = "13";

    /**
     * 居民住院
     */
    public static final String CLR_TYPE_20 = "20";

    /**
     * 居民门诊
     */
    public static final String CLR_TYPE_21 = "21";

    /**
     * 居民门慢
     */
    public static final String CLR_TYPE_22 = "22";

    /**
     * 离休住院
     */
    public static final String CLR_TYPE_30 = "30";

    /**
     * 离休门诊
     */
    public static final String CLR_TYPE_31 = "31";

    /**
     * 离休药店
     */
    public static final String CLR_TYPE_33 = "33";


    /**
     * 均值清算
     */
    public static final String CLR_TYPE_LV2_999930 = "999930";

    /*********************************** FUND_MNY_CODE:清算基金款项代码 *******************************/

    /**
     * 职工基本医疗保险统筹基金
     */
    public static final String FUND_MNY_CODE_310100 = "310100";

    /**
     * 城乡居民基本医疗保险基金
     */
    public static final String FUND_MNY_CODE_390400 = "390400";

    /**
     * 大额医疗费用补助基金
     */
    public static final String FUND_MNY_CODE_330100 = "330100";

    /**
     * 职工基本医疗保险个人账户基金
     */
    public static final String FUND_MNY_CODE_310200 = "310200";

    /**
     * 城乡居民大病医疗保险基金
     */
    public static final String FUND_MNY_CODE_390500 = "390500";


    /**
     * 离休人员医疗保障基金
     */
    public static final String FUND_MNY_CODE_340100 = "340100";

    /**
     * 其他基金
     */
    public static final String FUND_MNY_CODE_999997 = "999997";

    /**
     * 其他支付(异地就医平台返回)
     */
    public static final String FUND_MNY_CODE_910100 = "910100";

    /*********************************** EMP_MGT_TYPE:单位管理类型 *******************************/

    /********************************** PSN_CLCT_STAS:个人缴费状态 **********************************/
    /**
     * 个人缴费状态(PSN_CLCT_STAS):参保缴费
     */
    public static final String PSN_CLCT_STAS_1_CBJF = "1";

    /**
     * 个人缴费状态(PSN_CLCT_STAS):暂停缴费
     */
    public static final String PSN_CLCT_STAS_2_ZTJF = "2";

    /**
     * 个人缴费状态(PSN_CLCT_STAS):终止缴费
     */
    public static final String PSN_CLCT_STAS_3_ZZJF = "3";

    /********************************** PSN_INSU_STAS:人员参保状态 **********************************/
    /**
     * 人员参保状态(PSN_INSU_STAS):未参保
     */
    public static final String PSN_INSU_STAS_0_WCB = "0";

    /**
     * 人员参保状态(PSN_INSU_STAS):正常参保
     */
    public static final String PSN_INSU_STAS_1_ZCCB = "1";

    /**
     * 人员参保状态(PSN_INSU_STAS):暂停参保
     */
    public static final String PSN_INSU_STAS_2_ZTCB = "2";

    /**
     * 人员参保状态(PSN_INSU_STAS):无效参保
     */
    public static final String PSN_INSU_STAS_3_WXCB = "3";

    /**
     * 人员参保状态(PSN_INSU_STAS):终止参保
     */
    public static final String PSN_INSU_STAS_4_ZZCB = "4";
    /*********************************** EMP_MGT_TYPE:单位管理类型 *******************************/
    /**
     * 普通单位
     */
    public static final String EMP_MGT_TYPE_01_PTDW = "01";
    /**
     * 灵活就业虚拟单位
     */
    public static final String EMP_MGT_TYPE_02_LHJYXNDW = "02";
    /**
     * 灵活就业托管虚拟单位
     */
    public static final String EMP_MGT_TYPE_03_LHJYXNDW = "03";
    /**
     * 被征地人员虚拟单位
     */
    public static final String EMP_MGT_TYPE_04_LHJYXNDW = "04";
    /**
     * 失业代缴医疗虚拟单位
     */
    public static final String EMP_MGT_TYPE_05_LHJYXNDW = "05";
    /**
     * 企业破产下岗职工虚拟单位
     */
    public static final String EMP_MGT_TYPE_06_LHJYXNDW = "06";
    /**
     * 离休人员虚拟单位
     */
    public static final String EMP_MGT_TYPE_07_LHJYXNDW = "07";
    /**
     * 居民虚拟单位
     */
    public static final String EMP_MGT_TYPE_08_LHJYXNDW = "08";
    /**
     * 普通单位-分支机构
     */
    public static final String EMP_MGT_TYPE_09_LHJYXNDW = "09";
    /**
     * 特困企业单位
     */
    public static final String EMP_MGT_TYPE_11_LHJYXNDW = "11";
    /********************************** EMP_INSU_STAS:单位参保状态 **********************************/
    /**
     * 未参保
     */
    public static final String EMP_INSU_STAS_1_WCB = "1";

    /**
     * 参保缴费
     */
    public static final String EMP_INSU_STAS_2_CBJF = "2";

    /**
     * 暂停缴费（中断）
     */
    public static final String EMP_INSU_STAS_3_ZTJF = "3";

    /**
     * 终止参保
     */
    public static final String EMP_INSU_STAS_4_ZZCB = "4";

    /********************************** EMP_INSU_STAS:征收方式 **********************************/
    /**
     * 银行托收
     */
    public static final String CLCT_WAY_01_YHTS = "01";

    /**
     * 税务征收
     */
    public static final String CLCT_WAY_02_SWZS = "02";
    /**
     * 经办机构自收
     */
    public static final String CLCT_WAY_03_JBJGZS = "03";

    /**
     * 账户代扣-大额
     */
    public static final String CLCT_WAY_31_ZHDK = "31";


    /**
     * 方法类型 新增insert
     */
    public static String METHOD_TYPE_INSERT = "INSERT";
    /**
     * 方法类型 修改update
     */
    public static String METHOD_TYPE_UPDATE = "UPDATE";
    /**
     * 方法类型 删除delete
     */
    public static String METHOD_TYPE_DELETE = "DELETE";

    /*********************************** QUTS_TYPE:编制类型 ***********************************/
    /**
     * 编制类型(QUTS_TYPE):全额拨款
     */
    public static final String QUTS_TYPE_1_QEBK = "1";

    /**
     * 编制类型(QUTS_TYPE):非全额拨款
     */
    public static final String QUTS_TYPE_2_FQEBK = "2";

    /*********************************** HI_TYPE:医疗人员类别 ***********************************/

    /**
     * 医疗人员类别,统账结合
     */
    public static String HI_TYPE_1_TZJH = "1";
    /**
     * 医疗人员类别,单建统筹
     */
    public static String HI_TYPE_2_DJTC = "2";
    /**
     * 医疗人员类别,住院统筹
     */
    public static String HI_TYPE_2_ZYTC = "3";

    /*********************************** CLCT_WAY:征收方式 ***********************************/

    /**
     * 征收方式(CLCT_WAY):银行托收
     */
    public static final String CLCT_WAY_1_YXTS = "01";

    /**
     * 征收方式(CLCT_WAY):个帐代扣
     */
    public static final String CLCT_WAY_31_GZDK = "31";

    /**
     * 征收方式(CLCT_WAY):税务征收
     */
    public static final String CLCT_WAY_2_SWZS = "02";

    /**
     * 征收方式(CLCT_WAY):经办机构自收
     */
    public static final String CLCT_WAY_3_JBJGZS = "03";

    /**
     * 征收方式(CLCT_WAY):学校代收
     */
    public static final String CLCT_WAY_4_XDS = "04";

    /**
     * 征收方式(CLCT_WAY):社区代收
     */
    public static final String CLCT_WAY_5_SQDS = "05";

    /**
     * 征收方式(CLCT_WAY):财政征收
     */
    public static final String CLCT_WAY_6_CZZS = "06";

    /**
     * 征收方式(CLCT_WAY):FES
     */
    public static final String CLCT_WAY_7_FES = "07";

    /**
     * 征收方式(CLCT_WAY):银行代收
     */
    public static final String CLCT_WAY_8_YHDS = "08";

    /**
     * 征收方式(CLCT_WAY):退款进待转
     */
    public static final String CLCT_WAY_9_TKJDZ = "09";

    /**
     * 征收方式(CLCT_WAY):柜台支付
     */
    public static final String CLCT_WAY_11_GTZF = "11";

    /**
     * 征收方式(CLCT_WAY):个人缴费部分退现(单位缴费部分退统筹)
     */
    public static final String CLCT_WAY_10_TKJTC = "10";

    /**
     * 征收方式(CLCT_WAY):个人部分退待转，单位部分退待转
     */
    public static final String CLCT_WAY_12_GRJDJDWJDZ = "12";

    /**
     * 征收方式(CLCT_WAY):个人部分退现金，单位部分退待转
     */
    public static final String CLCT_WAY_14_GRTXJDWJDZ = "14";
    /**
     * 征收方式(CLCT_WAY):职业年金归集
     */
    public static final String CLCT_WAY_16_ZYNJGJ = "16";

    /************************************HIF_ACCT_TYPE 医保基金账户类别**********************************************/

    /**
     * 医保基金账户类别(HIF_ACCT_TYPE):收入户
     */
    public static final String HIF_ACCT_TYPE_SRH = "1";

    /**
     * 医保基金账户类别(HIF_ACCT_TYPE):支出户
     */
    public static final String HIF_ACCT_TYPE_ZCH = "2";

    /**
     * 医保基金账户类别(HIF_ACCT_TYPE):收入支出户
     */
    public static final String HIF_ACCT_TYPE_SRZHH = "3";


    /*********************************** PSN_CERT_TYPE:证件类型 ***********************************/
    /**
     * 证件类别(PSN_CERT_TYPE):居民身份证（户口簿）
     */
    public static final String PSN_CERT_TYPE_01_JMSFZHKB = "01";

    /**
     * 证件类别(PSN_CERT_TYPE):中国人民解放军军官证
     */
    public static final String PSN_CERT_TYPE_02_ZGRMJFJJGZ = "02";

    /**
     * 证件类别(PSN_CERT_TYPE):中国人民武装警察警官证
     */
    public static final String PSN_CERT_TYPE_03_ZGRMWZJCJG = "03";

    /**
     * 证件类别(PSN_CERT_TYPE):香港特区护照/港澳居民来往内地通行证
     */
    public static final String PSN_CERT_TYPE_04_XGTQHZGAJM = "04";

    /**
     * 证件类别(PSN_CERT_TYPE):澳门特区护照/港澳居民来往内地通行证
     */
    public static final String PSN_CERT_TYPE_05_AMTQHZGAJM = "05";

    /**
     * 证件类别(PSN_CERT_TYPE):台湾居民来往大陆通行证
     */
    public static final String PSN_CERT_TYPE_06_TWJMLWDLTX = "06";

    /**
     * 证件类别(PSN_CERT_TYPE):外国人永久居留证
     */
    public static final String PSN_CERT_TYPE_07_WGRYJJLZ = "07";

    /**
     * 证件类别(PSN_CERT_TYPE):外国人护照
     */
    public static final String PSN_CERT_TYPE_08_WGRHZ = "08";

    /**
     * 证件类别(PSN_CERT_TYPE):残疾人证
     */
    public static final String PSN_CERT_TYPE_09_CJRZ = "09";

    /**
     * 证件类别(PSN_CERT_TYPE):军烈属证明
     */
    public static final String PSN_CERT_TYPE_10_JLSZM = "10";

    /**
     * 证件类别(PSN_CERT_TYPE):外国人就业证
     */
    public static final String PSN_CERT_TYPE_11_WGRJYZ = "11";

    /**
     * 证件类别(PSN_CERT_TYPE):外国专家证
     */
    public static final String PSN_CERT_TYPE_12_WGZJZ = "12";

    /**
     * 证件类别(PSN_CERT_TYPE):外国人常驻记者证
     */
    public static final String PSN_CERT_TYPE_13_WGRCZJZZ = "13";

    /**
     * 证件类别(PSN_CERT_TYPE):台港澳人员就业证
     */
    public static final String PSN_CERT_TYPE_14_TGARYJYZ = "14";

    /**
     * 证件类别(PSN_CERT_TYPE):回国（来华）定居专家证
     */
    public static final String PSN_CERT_TYPE_15_HGLHDJZJZ = "15";

    /**
     * 证件类别(PSN_CERT_TYPE):中国护照
     */
    public static final String PSN_CERT_TYPE_16_HGLHDJZJZ = "16";

    /**
     * 证件类别(PSN_CERT_TYPE):港澳台居民居住证
     */
    public static final String PSN_CERT_TYPE_17_HGLHDJZJZ = "17";

    /**
     * 证件类别(PSN_CERT_TYPE):社会保障卡
     */
    public static final String PSN_CERT_TYPE_90_SHBZK = "90";

    /**
     * 证件类别(PSN_CERT_TYPE):其他身份证件
     */
    public static final String PSN_CERT_TYPE_99_QTSFZJ = "99";


    /**
     * 证件类型(PSN_CERT_TYPE):保密人员证件
     */
    public static final String PSN_CERT_TYPE_91_BMRYZJ = "91";

    //*************************证照类型*************************//
    /**
     * 证照类别(CERT_TYPE):统一社会信用代码
     */
    public static final String CERT_TYPE_01_TYSHXYDM = "01";

    /**
     * 证照类别(CERT_TYPE):普通营业执照
     */
    public static final String CERT_TYPE_02_PTYYZZ = "02";

    /**
     * 证照类别(CERT_TYPE):组织机构代码证
     */
    public static final String CERT_TYPE_03_ZZJGDMZ = "03";
    //*************************保险类型*************************//
    /**
     * 险种类型(INSUTYPE):基本医疗保险
     */
    public static final String INSUTYPE_JBYLBX = "310";

    /**
     * 险种类型(INSUTYPE):公务员医疗补助
     */
    public static final String INSUTYPE_GWYYLBZ = "320";

    /**
     * 险种类型(INSUTYPE):大额补充医疗保险
     */
    public static final String INSUTYPE_GEBCYLBX = "330";

    /**
     * 险种类型(INSUTYPE):离休医疗保险
     */
    public static final String INSUTYPE_LXYLBX = "340";

    /**
     * 险种类型(INSUTYPE):老红军医疗保障
     */
    public static final String INSUTYPE_LHJYLBX = "360";

    /**
     * 险种类型(INSUTYPE):一到六级伤残军人
     */
    public static final String INSUTYPE_YDLJSCJR = "350";

    /**
     * 险种类型(INSUTYPE):城乡居民医疗保险
     */
    public static final String INSUTYPE_JMYLBX = "390";
    /**
     * 险种类型(INSUTYPE):城乡居民大病医疗保险
     */
    public static final String INSUTYPE_JMDBYLBX = "392";


    /**
     * 险种类型(INSUTYPE):新型农村合作医疗
     */
    public static final String INSUTYPE_XXNCHZYL = "380";

    /**
     * 险种类型(INSUTYPE):城镇居民医疗保险
     */
    public static final String INSUTYPE_CZJMYLBX = "391";


    /**
     * 险种类型(INSUTYPE):生育保险
     */
    public static final String INSUTYPE_SYBX = "510";

    /**
     * 险种类型(INSUTYPE):企业补充医疗保险
     */
    public static final String INSUTYPE_QYBC = "610";
    /**
     * 险种类型(INSUTYPE):企业补充医疗保险2021-07-05
     */
    public static final String INSUTYPE_QYBCYLBX_4 = "370";
    /**
     * 险种类型(INSUTYPE):补充百分之10医疗2021-07-05
     */
    public static final String INSUTYPE_QYBCYLBX_10 = "39902";
    /**
     * 险种类型(INSUTYPE):职工补充医疗保险
     */
    public static final String INSUTYPE_ZGBCYLBX_39916 = "39916";

    /**
     * 险种类型(INSUTYPE):长期照护保险
     */
    public static final String INSUTYPE_CQZHBX = "410";
    /*********************************** ENAB_FLAG:启用标志 ***********************************/
    /**
     * 启用标志:是
     */
    public static final int ENAB_FLAG_1 = 1;

    /**
     * 启用标志:否
     */
    public static final int ENAB_FLAG_0 = 0;

    /*********************************** SURV_STAS:生存状态 ***********************************/
    /**
     * 生存状态(SURV_STAS):正常
     */
    public static final String SURV_STAS_1_ZC = "1";

    /**
     * 生存状态(SURV_STAS):死亡
     */
    public static final String SURV_STAS_2_SW = "2";

    /**
     * 生存状态(SURV_STAS):被判刑收监或劳动教养
     */
    public static final String SURV_STAS_3_BPXSJHLDJY = "3";

    /**
     * 生存状态(SURV_STAS):失踪
     */
    public static final String SURV_STAS_4_SZ = "4";

    /**
     * 生存状态(SURV_STAS):状态不明
     */
    public static final String SURV_STAS_9_ZTBM = "9";
    /*********************************** AAC033:健康状况 ***********************************/
    /**
     * 健康状况(AAC033):健康或良好
     */
    public static final String AAC033_1_JKHLH = "1";

    /**
     * 健康状况(AAC033):一般或较弱
     */
    public static final String AAC033_2_YBHJR = "2";

    /**
     * 健康状况(AAC033):有慢性病
     */
    public static final String AAC033_3_YMXB = "3";

    /**
     * 健康状况(AAC033):残疾
     */
    public static final String AAC033_6_CJ = "6";
    /*********************************** MRG_STAS:婚姻状况 ***********************************/
    /**
     * 婚姻状况(MRG_STAS):未婚
     */
    public static final String MRG_STAS_1_WH = "10";

    /**
     * 婚姻状况(MRG_STAS):已婚
     */
    public static final String MRG_STAS_2_YH = "20";

    /**
     * 婚姻状况(MRG_STAS):丧偶
     */
    public static final String MRG_STAS_3_SO = "30";

    /**
     * 婚姻状况(MRG_STAS):离婚
     */
    public static final String MRG_STAS_4_LH = "40";

    /**
     * 婚姻状况(MRG_STAS):未说明的婚姻状况
     */
    public static final String MRG_STAS_9_WSMDHYZK = "90";
    /************************************ NAT_REGN_CODE:国籍 ************************************/
    /**
     * 国籍(NAT_REGN_CODE):阿鲁巴
     */
    public static final String NAT_REGN_CODE_ABW_ALB = "ABW";

    /**
     * 国籍(NAT_REGN_CODE):阿富汗
     */
    public static final String NAT_REGN_CODE_AFG_AFH = "AFG";

    /**
     * 国籍(NAT_REGN_CODE):安哥拉
     */
    public static final String NAT_REGN_CODE_AGO_AGL = "AGO";

    /**
     * 国籍(NAT_REGN_CODE):安圭拉
     */
    public static final String NAT_REGN_CODE_AIA_AGL = "AIA";

    /**
     * 国籍(NAT_REGN_CODE):阿尔巴尼亚
     */
    public static final String NAT_REGN_CODE_ALB_AEBNY = "ALB";

    /**
     * 国籍(NAT_REGN_CODE):安道尔
     */
    public static final String NAT_REGN_CODE_AND_ADE = "AND";

    /**
     * 国籍(NAT_REGN_CODE):荷属安的列斯
     */
    public static final String NAT_REGN_CODE_ANT_HSADLS = "ANT";

    /**
     * 国籍(NAT_REGN_CODE):阿联酋
     */
    public static final String NAT_REGN_CODE_ARE_ALQ = "ARE";

    /**
     * 国籍(NAT_REGN_CODE):阿根廷
     */
    public static final String NAT_REGN_CODE_ARG_AGT = "ARG";

    /**
     * 国籍(NAT_REGN_CODE):亚美尼亚
     */
    public static final String NAT_REGN_CODE_ARM_YMNY = "ARM";

    /**
     * 国籍(NAT_REGN_CODE):美属萨摩亚
     */
    public static final String NAT_REGN_CODE_ASM_MSSMY = "ASM";

    /**
     * 国籍(NAT_REGN_CODE):南极洲
     */
    public static final String NAT_REGN_CODE_ATA_NJZ = "ATA";

    /**
     * 国籍(NAT_REGN_CODE):法属南部领土
     */
    public static final String NAT_REGN_CODE_ATF_FSNBLT = "ATF";

    /**
     * 国籍(NAT_REGN_CODE):安提瓜和巴布达
     */
    public static final String NAT_REGN_CODE_ATG_ATGHBBD = "ATG";

    /**
     * 国籍(NAT_REGN_CODE):澳大利亚
     */
    public static final String NAT_REGN_CODE_AUS_ADLY = "AUS";

    /**
     * 国籍(NAT_REGN_CODE):奥地利
     */
    public static final String NAT_REGN_CODE_AUT_ADL = "AUT";

    /**
     * 国籍(NAT_REGN_CODE):阿塞拜疆
     */
    public static final String NAT_REGN_CODE_AZE_ASBJ = "AZE";

    /**
     * 国籍(NAT_REGN_CODE):布隆迪
     */
    public static final String NAT_REGN_CODE_BDI_BLD = "BDI";

    /**
     * 国籍(NAT_REGN_CODE):比利时
     */
    public static final String NAT_REGN_CODE_BEL_BLS = "BEL";

    /**
     * 国籍(NAT_REGN_CODE):贝宁
     */
    public static final String NAT_REGN_CODE_BEN_BN = "BEN";

    /**
     * 国籍(NAT_REGN_CODE):布基纳法索
     */
    public static final String NAT_REGN_CODE_BFA_BJNFS = "BFA";

    /**
     * 国籍(NAT_REGN_CODE):孟加拉国
     */
    public static final String NAT_REGN_CODE_BGD_MJLG = "BGD";

    /**
     * 国籍(NAT_REGN_CODE):保加利亚
     */
    public static final String NAT_REGN_CODE_BGR_BJLY = "BGR";

    /**
     * 国籍(NAT_REGN_CODE):巴林
     */
    public static final String NAT_REGN_CODE_BHR_BL = "BHR";

    /**
     * 国籍(NAT_REGN_CODE):巴哈马
     */
    public static final String NAT_REGN_CODE_BHS_BHM = "BHS";

    /**
     * 国籍(NAT_REGN_CODE):波斯尼亚和黑塞哥维那
     */
    public static final String NAT_REGN_CODE_BIH_BSNYHHSGWN = "BIH";

    /**
     * 国籍(NAT_REGN_CODE):白俄罗斯
     */
    public static final String NAT_REGN_CODE_BLR_BELS = "BLR";

    /**
     * 国籍(NAT_REGN_CODE):伯利兹
     */
    public static final String NAT_REGN_CODE_BLZ_BLZ = "BLZ";

    /**
     * 国籍(NAT_REGN_CODE):百幕大
     */
    public static final String NAT_REGN_CODE_BMU_BMD = "BMU";

    /**
     * 国籍(NAT_REGN_CODE):玻利维亚
     */
    public static final String NAT_REGN_CODE_BOL_BLWY = "BOL";

    /**
     * 国籍(NAT_REGN_CODE):巴西
     */
    public static final String NAT_REGN_CODE_BRA_BX = "BRA";

    /**
     * 国籍(NAT_REGN_CODE):巴巴多斯
     */
    public static final String NAT_REGN_CODE_BRB_BBDS = "BRB";

    /**
     * 国籍(NAT_REGN_CODE):文莱/no visa
     */
    public static final String NAT_REGN_CODE_BRN_WL = "BRN";

    /**
     * 国籍(NAT_REGN_CODE):不丹
     */
    public static final String NAT_REGN_CODE_BTN_BD = "BTN";

    /**
     * 国籍(NAT_REGN_CODE):布维岛
     */
    public static final String NAT_REGN_CODE_BVT_BWD = "BVT";

    /**
     * 国籍(NAT_REGN_CODE):博茨瓦纳
     */
    public static final String NAT_REGN_CODE_BWA_BCWN = "BWA";

    /**
     * 国籍(NAT_REGN_CODE):中非
     */
    public static final String NAT_REGN_CODE_CAF_ZF = "CAF";

    /**
     * 国籍(NAT_REGN_CODE):加拿大
     */
    public static final String NAT_REGN_CODE_CAN_JND = "CAN";

    /**
     * 国籍(NAT_REGN_CODE):科科斯群岛
     */
    public static final String NAT_REGN_CODE_CCK_KKSQD = "CCK";

    /**
     * 国籍(NAT_REGN_CODE):瑞士
     */
    public static final String NAT_REGN_CODE_CHE_RS = "CHE";

    /**
     * 国籍(NAT_REGN_CODE):智利
     */
    public static final String NAT_REGN_CODE_CHL_ZL = "CHL";

    /**
     * 国籍(NAT_REGN_CODE):中国
     */
    public static final String NAT_REGN_CODE_CHN_ZG = "CHN";

    /**
     * 国籍(NAT_REGN_CODE):科特迪瓦
     */
    public static final String NAT_REGN_CODE_CIV_KTDW = "CIV";

    /**
     * 国籍(NAT_REGN_CODE):喀麦隆
     */
    public static final String NAT_REGN_CODE_CMR_KML = "CMR";

    /**
     * 国籍(NAT_REGN_CODE):刚果民主共和国
     */
    public static final String NAT_REGN_CODE_COD_GGMZGHG = "COD";

    /**
     * 国籍(NAT_REGN_CODE):刚果
     */
    public static final String NAT_REGN_CODE_COG_GG = "COG";

    /**
     * 国籍(NAT_REGN_CODE):库克群岛
     */
    public static final String NAT_REGN_CODE_COK_KKQD = "COK";

    /**
     * 国籍(NAT_REGN_CODE):哥伦比亚
     */
    public static final String NAT_REGN_CODE_COL_GLBY = "COL";

    /**
     * 国籍(NAT_REGN_CODE):科摩罗
     */
    public static final String NAT_REGN_CODE_COM_KML = "COM";

    /**
     * 国籍(NAT_REGN_CODE):佛得角
     */
    public static final String NAT_REGN_CODE_CPV_FDJ = "CPV";

    /**
     * 国籍(NAT_REGN_CODE):哥斯达黎加
     */
    public static final String NAT_REGN_CODE_CRI_GSDLJ = "CRI";

    /**
     * 国籍(NAT_REGN_CODE):古巴
     */
    public static final String NAT_REGN_CODE_CUB_GB = "CUB";

    /**
     * 国籍(NAT_REGN_CODE):圣诞岛
     */
    public static final String NAT_REGN_CODE_CXR_SDD = "CXR";

    /**
     * 国籍(NAT_REGN_CODE):开曼群岛
     */
    public static final String NAT_REGN_CODE_CYM_KMQD = "CYM";

    /**
     * 国籍(NAT_REGN_CODE):塞浦路斯
     */
    public static final String NAT_REGN_CODE_CYP_SPLS = "CYP";

    /**
     * 国籍(NAT_REGN_CODE):捷克
     */
    public static final String NAT_REGN_CODE_CZE_JK = "CZE";

    /**
     * 国籍(NAT_REGN_CODE):德国
     */
    public static final String NAT_REGN_CODE_DEU_DG = "DEU";

    /**
     * 国籍(NAT_REGN_CODE):吉布提
     */
    public static final String NAT_REGN_CODE_DJI_JBT = "DJI";

    /**
     * 国籍(NAT_REGN_CODE):多米尼加
     */
    public static final String NAT_REGN_CODE_DMA_DMNJ = "DMA";

    /**
     * 国籍(NAT_REGN_CODE):丹麦
     */
    public static final String NAT_REGN_CODE_DNK_DM = "DNK";

    /**
     * 国籍(NAT_REGN_CODE):多米尼家共和国
     */
    public static final String NAT_REGN_CODE_DOM_DMNJGHG = "DOM";

    /**
     * 国籍(NAT_REGN_CODE):阿尔及利亚
     */
    public static final String NAT_REGN_CODE_DZA_AEJLY = "DZA";

    /**
     * 国籍(NAT_REGN_CODE):厄瓜多尔
     */
    public static final String NAT_REGN_CODE_ECU_EGDE = "ECU";

    /**
     * 国籍(NAT_REGN_CODE):埃及
     */
    public static final String NAT_REGN_CODE_EGY_AJ = "EGY";

    /**
     * 国籍(NAT_REGN_CODE):厄立特里亚
     */
    public static final String NAT_REGN_CODE_ERI_ELTLY = "ERI";

    /**
     * 国籍(NAT_REGN_CODE):西撒哈拉
     */
    public static final String NAT_REGN_CODE_ESH_XSHL = "ESH";

    /**
     * 国籍(NAT_REGN_CODE):西班牙
     */
    public static final String NAT_REGN_CODE_ESP_XBY = "ESP";

    /**
     * 国籍(NAT_REGN_CODE):爱沙尼亚
     */
    public static final String NAT_REGN_CODE_EST_ASNY = "EST";

    /**
     * 国籍(NAT_REGN_CODE):埃塞俄比亚
     */
    public static final String NAT_REGN_CODE_ETH_ASEBY = "ETH";

    /**
     * 国籍(NAT_REGN_CODE):芬兰
     */
    public static final String NAT_REGN_CODE_FIN_FL = "FIN";

    /**
     * 国籍(NAT_REGN_CODE):斐济
     */
    public static final String NAT_REGN_CODE_FJI_FJ = "FJI";

    /**
     * 国籍(NAT_REGN_CODE):马尔维纳斯群岛
     */
    public static final String NAT_REGN_CODE_FLK_MEWNSQD = "FLK";

    /**
     * 国籍(NAT_REGN_CODE):法国
     */
    public static final String NAT_REGN_CODE_FRA_FG = "FRA";

    /**
     * 国籍(NAT_REGN_CODE):法罗群岛
     */
    public static final String NAT_REGN_CODE_FRO_FLQD = "FRO";

    /**
     * 国籍(NAT_REGN_CODE):密克罗尼西亚
     */
    public static final String NAT_REGN_CODE_FSM_MKLNXY = "FSM";

    /**
     * 国籍(NAT_REGN_CODE):加蓬
     */
    public static final String NAT_REGN_CODE_GAB_JP = "GAB";

    /**
     * 国籍(NAT_REGN_CODE):英国（独立领土公民、出国不用）
     */
    public static final String NAT_REGN_CODE_GBD_YGDLLTGMCG = "GBD";

    /**
     * 国籍(NAT_REGN_CODE):英国（海外国民，出国不用）
     */
    public static final String NAT_REGN_CODE_GBN_YGHWGMCGBY = "GBN";

    /**
     * 国籍(NAT_REGN_CODE):英国（海外公民，出国不用）
     */
    public static final String NAT_REGN_CODE_GBO_YGHWGMCGBY = "GBO";

    /**
     * 国籍(NAT_REGN_CODE):英国（保护公民，出国不用）
     */
    public static final String NAT_REGN_CODE_GBP_YGBHGMCGBY = "GBP";

    /**
     * 国籍(NAT_REGN_CODE):英国
     */
    public static final String NAT_REGN_CODE_GBR_YG = "GBR";

    /**
     * 国籍(NAT_REGN_CODE):英国（隶属，出国不用）
     */
    public static final String NAT_REGN_CODE_GBS_YGLSCGBY = "GBS";

    /**
     * 国籍(NAT_REGN_CODE):格鲁吉亚
     */
    public static final String NAT_REGN_CODE_GEO_GLJY = "GEO";

    /**
     * 国籍(NAT_REGN_CODE):加纳
     */
    public static final String NAT_REGN_CODE_GHA_JN = "GHA";

    /**
     * 国籍(NAT_REGN_CODE):直布罗陀
     */
    public static final String NAT_REGN_CODE_GIB_ZBLT = "GIB";

    /**
     * 国籍(NAT_REGN_CODE):几内亚
     */
    public static final String NAT_REGN_CODE_GIN_JNY = "GIN";

    /**
     * 国籍(NAT_REGN_CODE):瓜德罗普
     */
    public static final String NAT_REGN_CODE_GLP_GDLP = "GLP";

    /**
     * 国籍(NAT_REGN_CODE):冈比亚
     */
    public static final String NAT_REGN_CODE_GMB_GBY = "GMB";

    /**
     * 国籍(NAT_REGN_CODE):几内亚比绍
     */
    public static final String NAT_REGN_CODE_GNB_JNYBS = "GNB";

    /**
     * 国籍(NAT_REGN_CODE):赤道几内亚
     */
    public static final String NAT_REGN_CODE_GNQ_CDJNY = "GNQ";

    /**
     * 国籍(NAT_REGN_CODE):希腊
     */
    public static final String NAT_REGN_CODE_GRC_XL = "GRC";

    /**
     * 国籍(NAT_REGN_CODE):格林纳达
     */
    public static final String NAT_REGN_CODE_GRD_GLND = "GRD";

    /**
     * 国籍(NAT_REGN_CODE):格陵兰
     */
    public static final String NAT_REGN_CODE_GRL_GLL = "GRL";

    /**
     * 国籍(NAT_REGN_CODE):危地马拉
     */
    public static final String NAT_REGN_CODE_GTM_WDML = "GTM";

    /**
     * 国籍(NAT_REGN_CODE):法属圭亚那
     */
    public static final String NAT_REGN_CODE_GUF_FSGYN = "GUF";

    /**
     * 国籍(NAT_REGN_CODE):关岛
     */
    public static final String NAT_REGN_CODE_GUM_GD = "GUM";

    /**
     * 国籍(NAT_REGN_CODE):圭亚那
     */
    public static final String NAT_REGN_CODE_GUY_GYN = "GUY";

    /**
     * 国籍(NAT_REGN_CODE):香港
     */
    public static final String NAT_REGN_CODE_HKG_XG = "HKG";

    /**
     * 国籍(NAT_REGN_CODE):赫德岛和麦克唐纳岛
     */
    public static final String NAT_REGN_CODE_HMD_HDDHMKTND = "HMD";

    /**
     * 国籍(NAT_REGN_CODE):洪都拉斯
     */
    public static final String NAT_REGN_CODE_HND_HDLS = "HND";

    /**
     * 国籍(NAT_REGN_CODE):克罗地亚
     */
    public static final String NAT_REGN_CODE_HRV_KLDY = "HRV";

    /**
     * 国籍(NAT_REGN_CODE):海地
     */
    public static final String NAT_REGN_CODE_HTI_HD = "HTI";

    /**
     * 国籍(NAT_REGN_CODE):匈牙利
     */
    public static final String NAT_REGN_CODE_HUN_XYL = "HUN";

    /**
     * 国籍(NAT_REGN_CODE):印度尼西亚
     */
    public static final String NAT_REGN_CODE_IDN_YDNXY = "IDN";

    /**
     * 国籍(NAT_REGN_CODE):印度
     */
    public static final String NAT_REGN_CODE_IND_YD = "IND";

    /**
     * 国籍(NAT_REGN_CODE):英属印度洋领土
     */
    public static final String NAT_REGN_CODE_IOT_YSYDYLT = "IOT";

    /**
     * 国籍(NAT_REGN_CODE):爱尔兰
     */
    public static final String NAT_REGN_CODE_IRL_AEL = "IRL";

    /**
     * 国籍(NAT_REGN_CODE):伊朗
     */
    public static final String NAT_REGN_CODE_IRN_YL = "IRN";

    /**
     * 国籍(NAT_REGN_CODE):伊拉克
     */
    public static final String NAT_REGN_CODE_IRQ_YLK = "IRQ";

    /**
     * 国籍(NAT_REGN_CODE):冰岛
     */
    public static final String NAT_REGN_CODE_ISL_BD = "ISL";

    /**
     * 国籍(NAT_REGN_CODE):以色列
     */
    public static final String NAT_REGN_CODE_ISR_YSL = "ISR";

    /**
     * 国籍(NAT_REGN_CODE):意大利
     */
    public static final String NAT_REGN_CODE_ITA_YDL = "ITA";

    /**
     * 国籍(NAT_REGN_CODE):牙买加
     */
    public static final String NAT_REGN_CODE_JAM_YMJ = "JAM";

    /**
     * 国籍(NAT_REGN_CODE):约旦
     */
    public static final String NAT_REGN_CODE_JOR_YD = "JOR";

    /**
     * 国籍(NAT_REGN_CODE):日本/no visa
     */
    public static final String NAT_REGN_CODE_JPN_RB = "JPN";

    /**
     * 国籍(NAT_REGN_CODE):约翰斯顿岛
     */
    public static final String NAT_REGN_CODE_JTN_YHSDD = "JTN";

    /**
     * 国籍(NAT_REGN_CODE):哈萨克斯坦
     */
    public static final String NAT_REGN_CODE_KAZ_HSKST = "KAZ";

    /**
     * 国籍(NAT_REGN_CODE):肯尼亚
     */
    public static final String NAT_REGN_CODE_KEN_KNY = "KEN";

    /**
     * 国籍(NAT_REGN_CODE):吉尔吉斯斯坦
     */
    public static final String NAT_REGN_CODE_KGZ_JEJSST = "KGZ";

    /**
     * 国籍(NAT_REGN_CODE):柬埔寨
     */
    public static final String NAT_REGN_CODE_KHM_JPZ = "KHM";

    /**
     * 国籍(NAT_REGN_CODE):基里巴斯
     */
    public static final String NAT_REGN_CODE_KIR_JLBS = "KIR";

    /**
     * 国籍(NAT_REGN_CODE):圣基茨和尼维斯
     */
    public static final String NAT_REGN_CODE_KNA_SJCHNWS = "KNA";

    /**
     * 国籍(NAT_REGN_CODE):韩国（南朝鲜）
     */
    public static final String NAT_REGN_CODE_KOR_HGNCX = "KOR";

    /**
     * 国籍(NAT_REGN_CODE):科威特
     */
    public static final String NAT_REGN_CODE_KWT_KWT = "KWT";

    /**
     * 国籍(NAT_REGN_CODE):老挝
     */
    public static final String NAT_REGN_CODE_LAO_LW = "LAO";

    /**
     * 国籍(NAT_REGN_CODE):黎巴嫩
     */
    public static final String NAT_REGN_CODE_LBN_LBN = "LBN";

    /**
     * 国籍(NAT_REGN_CODE):利比里亚
     */
    public static final String NAT_REGN_CODE_LBR_LBLY = "LBR";

    /**
     * 国籍(NAT_REGN_CODE):利比亚
     */
    public static final String NAT_REGN_CODE_LBY_LBY = "LBY";

    /**
     * 国籍(NAT_REGN_CODE):圣卢西亚
     */
    public static final String NAT_REGN_CODE_LCA_SLXY = "LCA";

    /**
     * 国籍(NAT_REGN_CODE):列支敦土登
     */
    public static final String NAT_REGN_CODE_LIE_LZDTD = "LIE";

    /**
     * 国籍(NAT_REGN_CODE):斯里兰卡
     */
    public static final String NAT_REGN_CODE_LKA_SLLK = "LKA";

    /**
     * 国籍(NAT_REGN_CODE):莱索托
     */
    public static final String NAT_REGN_CODE_LSO_LST = "LSO";

    /**
     * 国籍(NAT_REGN_CODE):立陶宛
     */
    public static final String NAT_REGN_CODE_LTU_LTW = "LTU";

    /**
     * 国籍(NAT_REGN_CODE):卢森堡
     */
    public static final String NAT_REGN_CODE_LUX_LSB = "LUX";

    /**
     * 国籍(NAT_REGN_CODE):拉脱维亚
     */
    public static final String NAT_REGN_CODE_LVA_LTWY = "LVA";

    /**
     * 国籍(NAT_REGN_CODE):澳门
     */
    public static final String NAT_REGN_CODE_MAC_AM = "MAC";

    /**
     * 国籍(NAT_REGN_CODE):摩洛哥
     */
    public static final String NAT_REGN_CODE_MAR_MLG = "MAR";

    /**
     * 国籍(NAT_REGN_CODE):摩纳哥
     */
    public static final String NAT_REGN_CODE_MCO_MNG = "MCO";

    /**
     * 国籍(NAT_REGN_CODE):摩尔多瓦
     */
    public static final String NAT_REGN_CODE_MDA_MEDW = "MDA";

    /**
     * 国籍(NAT_REGN_CODE):马达加斯加
     */
    public static final String NAT_REGN_CODE_MDG_MDJSJ = "MDG";

    /**
     * 国籍(NAT_REGN_CODE):马尔代夫
     */
    public static final String NAT_REGN_CODE_MDV_MEDF = "MDV";

    /**
     * 国籍(NAT_REGN_CODE):墨西哥
     */
    public static final String NAT_REGN_CODE_MEX_MXG = "MEX";

    /**
     * 国籍(NAT_REGN_CODE):马绍尔群岛
     */
    public static final String NAT_REGN_CODE_MHL_MSEQD = "MHL";

    /**
     * 国籍(NAT_REGN_CODE):中途岛
     */
    public static final String NAT_REGN_CODE_MID_ZTD = "MID";

    /**
     * 国籍(NAT_REGN_CODE):马其顿
     */
    public static final String NAT_REGN_CODE_MKD_MQD = "MKD";

    /**
     * 国籍(NAT_REGN_CODE):马里
     */
    public static final String NAT_REGN_CODE_MLI_ML = "MLI";

    /**
     * 国籍(NAT_REGN_CODE):马耳他
     */
    public static final String NAT_REGN_CODE_MLT_MET = "MLT";

    /**
     * 国籍(NAT_REGN_CODE):缅甸
     */
    public static final String NAT_REGN_CODE_MMR_MD = "MMR";

    /**
     * 国籍(NAT_REGN_CODE):蒙古
     */
    public static final String NAT_REGN_CODE_MNG_MG = "MNG";

    /**
     * 国籍(NAT_REGN_CODE):北马里亚纳
     */
    public static final String NAT_REGN_CODE_MNP_BMLYN = "MNP";

    /**
     * 国籍(NAT_REGN_CODE):莫桑比克
     */
    public static final String NAT_REGN_CODE_MOZ_MSBK = "MOZ";

    /**
     * 国籍(NAT_REGN_CODE):毛里塔尼亚
     */
    public static final String NAT_REGN_CODE_MRT_MLTNY = "MRT";

    /**
     * 国籍(NAT_REGN_CODE):蒙特塞拉特
     */
    public static final String NAT_REGN_CODE_MSR_MTSLT = "MSR";

    /**
     * 国籍(NAT_REGN_CODE):马提尼克
     */
    public static final String NAT_REGN_CODE_MTQ_MTNK = "MTQ";

    /**
     * 国籍(NAT_REGN_CODE):毛里求斯
     */
    public static final String NAT_REGN_CODE_MUS_MLQS = "MUS";

    /**
     * 国籍(NAT_REGN_CODE):马拉维
     */
    public static final String NAT_REGN_CODE_MWI_MLW = "MWI";

    /**
     * 国籍(NAT_REGN_CODE):马来西亚
     */
    public static final String NAT_REGN_CODE_MYS_MLXY = "MYS";

    /**
     * 国籍(NAT_REGN_CODE):马约特
     */
    public static final String NAT_REGN_CODE_MYT_MYT = "MYT";

    /**
     * 国籍(NAT_REGN_CODE):纳米比亚
     */
    public static final String NAT_REGN_CODE_NAM_NMBY = "NAM";

    /**
     * 国籍(NAT_REGN_CODE):新喀里多尼亚
     */
    public static final String NAT_REGN_CODE_NCL_XKLDNY = "NCL";

    /**
     * 国籍(NAT_REGN_CODE):尼日尔
     */
    public static final String NAT_REGN_CODE_NER_NRE = "NER";

    /**
     * 国籍(NAT_REGN_CODE):诺福克岛
     */
    public static final String NAT_REGN_CODE_NFK_NFKD = "NFK";

    /**
     * 国籍(NAT_REGN_CODE):尼日利亚
     */
    public static final String NAT_REGN_CODE_NGA_NRLY = "NGA";

    /**
     * 国籍(NAT_REGN_CODE):尼加拉瓜
     */
    public static final String NAT_REGN_CODE_NIC_NJLG = "NIC";

    /**
     * 国籍(NAT_REGN_CODE):纽埃
     */
    public static final String NAT_REGN_CODE_NIU_NA = "NIU";

    /**
     * 国籍(NAT_REGN_CODE):荷兰
     */
    public static final String NAT_REGN_CODE_NLD_HL = "NLD";

    /**
     * 国籍(NAT_REGN_CODE):挪威
     */
    public static final String NAT_REGN_CODE_NOR_NW = "NOR";

    /**
     * 国籍(NAT_REGN_CODE):尼波尔
     */
    public static final String NAT_REGN_CODE_NPL_NBE = "NPL";

    /**
     * 国籍(NAT_REGN_CODE):瑙鲁
     */
    public static final String NAT_REGN_CODE_NRU_NL = "NRU";

    /**
     * 国籍(NAT_REGN_CODE):中间地带
     */
    public static final String NAT_REGN_CODE_NTZ_ZJDD = "NTZ";

    /**
     * 国籍(NAT_REGN_CODE):新西兰
     */
    public static final String NAT_REGN_CODE_NZL_XXL = "NZL";

    /**
     * 国籍(NAT_REGN_CODE):阿曼
     */
    public static final String NAT_REGN_CODE_OMN_AM = "OMN";

    /**
     * 国籍(NAT_REGN_CODE):巴基斯坦
     */
    public static final String NAT_REGN_CODE_PAK_BJST = "PAK";

    /**
     * 国籍(NAT_REGN_CODE):巴拿马
     */
    public static final String NAT_REGN_CODE_PAN_BNM = "PAN";

    /**
     * 国籍(NAT_REGN_CODE):皮特凯恩群岛
     */
    public static final String NAT_REGN_CODE_PCN_PTKEQD = "PCN";

    /**
     * 国籍(NAT_REGN_CODE):秘鲁
     */
    public static final String NAT_REGN_CODE_PER_ML = "PER";

    /**
     * 国籍(NAT_REGN_CODE):菲律宾
     */
    public static final String NAT_REGN_CODE_PHL_FLB = "PHL";

    /**
     * 国籍(NAT_REGN_CODE):贝劳
     */
    public static final String NAT_REGN_CODE_PLW_BL = "PLW";

    /**
     * 国籍(NAT_REGN_CODE):巴布亚新几内亚
     */
    public static final String NAT_REGN_CODE_PNG_BBYXJNY = "PNG";

    /**
     * 国籍(NAT_REGN_CODE):波兰
     */
    public static final String NAT_REGN_CODE_POL_BL = "POL";

    /**
     * 国籍(NAT_REGN_CODE):波多黎各
     */
    public static final String NAT_REGN_CODE_PRI_BDLG = "PRI";

    /**
     * 国籍(NAT_REGN_CODE):朝鲜
     */
    public static final String NAT_REGN_CODE_PRK_CX = "PRK";

    /**
     * 国籍(NAT_REGN_CODE):葡萄牙
     */
    public static final String NAT_REGN_CODE_PRT_PTY = "PRT";

    /**
     * 国籍(NAT_REGN_CODE):巴拉圭
     */
    public static final String NAT_REGN_CODE_PRY_BLG = "PRY";

    /**
     * 国籍(NAT_REGN_CODE):巴勒斯坦
     */
    public static final String NAT_REGN_CODE_PST_BLST = "PST";

    /**
     * 国籍(NAT_REGN_CODE):法属菠利尼西亚
     */
    public static final String NAT_REGN_CODE_PYF_FSBLNXY = "PYF";

    /**
     * 国籍(NAT_REGN_CODE):卡塔尔
     */
    public static final String NAT_REGN_CODE_QAT_KTE = "QAT";

    /**
     * 国籍(NAT_REGN_CODE):留尼汪
     */
    public static final String NAT_REGN_CODE_REU_LNW = "REU";

    /**
     * 国籍(NAT_REGN_CODE):罗马尼亚
     */
    public static final String NAT_REGN_CODE_ROM_LMNY = "ROM";

    /**
     * 国籍(NAT_REGN_CODE):俄罗斯
     */
    public static final String NAT_REGN_CODE_RUS_ELS = "RUS";

    /**
     * 国籍(NAT_REGN_CODE):卢旺达
     */
    public static final String NAT_REGN_CODE_RWA_LWD = "RWA";

    /**
     * 国籍(NAT_REGN_CODE):沙特阿拉伯
     */
    public static final String NAT_REGN_CODE_SAU_STALB = "SAU";

    /**
     * 国籍(NAT_REGN_CODE):苏丹
     */
    public static final String NAT_REGN_CODE_SDN_SD = "SDN";

    /**
     * 国籍(NAT_REGN_CODE):塞内加尔
     */
    public static final String NAT_REGN_CODE_SEN_SNJE = "SEN";

    /**
     * 国籍(NAT_REGN_CODE):塞尔维亚
     */
    public static final String NAT_REGN_CODE_SF_SEWY = "SF";

    /**
     * 国籍(NAT_REGN_CODE):新加坡/no visa
     */
    public static final String NAT_REGN_CODE_SGP_XJP = "SGP";

    /**
     * 国籍(NAT_REGN_CODE):南乔治亚岛和南桑德韦奇岛
     */
    public static final String NAT_REGN_CODE_SGS_NQZYDHNSDW = "SGS";

    /**
     * 国籍(NAT_REGN_CODE):圣赫勒拿
     */
    public static final String NAT_REGN_CODE_SHN_SHLN = "SHN";

    /**
     * 国籍(NAT_REGN_CODE):斯瓦尔巴群岛
     */
    public static final String NAT_REGN_CODE_SJM_SWEBQD = "SJM";

    /**
     * 国籍(NAT_REGN_CODE):所罗门群岛
     */
    public static final String NAT_REGN_CODE_SLB_SLMQD = "SLB";

    /**
     * 国籍(NAT_REGN_CODE):塞拉利昂
     */
    public static final String NAT_REGN_CODE_SLE_SLLA = "SLE";

    /**
     * 国籍(NAT_REGN_CODE):萨尔瓦多
     */
    public static final String NAT_REGN_CODE_SLV_SEWD = "SLV";

    /**
     * 国籍(NAT_REGN_CODE):圣马力诺
     */
    public static final String NAT_REGN_CODE_SMR_SMLN = "SMR";

    /**
     * 国籍(NAT_REGN_CODE):索马里
     */
    public static final String NAT_REGN_CODE_SOM_SML = "SOM";

    /**
     * 国籍(NAT_REGN_CODE):圣皮埃尔和密克隆
     */
    public static final String NAT_REGN_CODE_SPM_SPAEHMKL = "SPM";

    /**
     * 国籍(NAT_REGN_CODE):塞班
     */
    public static final String NAT_REGN_CODE_SS_SB = "SS";

    /**
     * 国籍(NAT_REGN_CODE):圣多美和普林西比
     */
    public static final String NAT_REGN_CODE_STP_SDMHPLXB = "STP";

    /**
     * 国籍(NAT_REGN_CODE):苏里南
     */
    public static final String NAT_REGN_CODE_SUR_SLN = "SUR";

    /**
     * 国籍(NAT_REGN_CODE):斯洛伐克
     */
    public static final String NAT_REGN_CODE_SVK_SLFK = "SVK";

    /**
     * 国籍(NAT_REGN_CODE):斯洛文尼亚
     */
    public static final String NAT_REGN_CODE_SVN_SLWNY = "SVN";

    /**
     * 国籍(NAT_REGN_CODE):瑞典
     */
    public static final String NAT_REGN_CODE_SWE_RD = "SWE";

    /**
     * 国籍(NAT_REGN_CODE):斯威士兰
     */
    public static final String NAT_REGN_CODE_SWZ_SWSL = "SWZ";

    /**
     * 国籍(NAT_REGN_CODE):锡金
     */
    public static final String NAT_REGN_CODE_SX_XJ = "SX";

    /**
     * 国籍(NAT_REGN_CODE):塞舌尔
     */
    public static final String NAT_REGN_CODE_SYC_SSE = "SYC";

    /**
     * 国籍(NAT_REGN_CODE):叙利亚
     */
    public static final String NAT_REGN_CODE_SYR_XLY = "SYR";

    /**
     * 国籍(NAT_REGN_CODE):特克斯和凯科斯群岛
     */
    public static final String NAT_REGN_CODE_TCA_TKSHKKSQD = "TCA";

    /**
     * 国籍(NAT_REGN_CODE):乍得
     */
    public static final String NAT_REGN_CODE_TCD_ZD = "TCD";

    /**
     * 国籍(NAT_REGN_CODE):多哥
     */
    public static final String NAT_REGN_CODE_TGO_DG = "TGO";

    /**
     * 国籍(NAT_REGN_CODE):泰国
     */
    public static final String NAT_REGN_CODE_THA_TG = "THA";

    /**
     * 国籍(NAT_REGN_CODE):塔吉克斯坦
     */
    public static final String NAT_REGN_CODE_TJK_TJKST = "TJK";

    /**
     * 国籍(NAT_REGN_CODE):托克劳
     */
    public static final String NAT_REGN_CODE_TKL_TKL = "TKL";

    /**
     * 国籍(NAT_REGN_CODE):土库曼斯坦
     */
    public static final String NAT_REGN_CODE_TKM_TKMST = "TKM";

    /**
     * 国籍(NAT_REGN_CODE):东帝汶
     */
    public static final String NAT_REGN_CODE_TMP_DD = "TMP";

    /**
     * 国籍(NAT_REGN_CODE):汤加
     */
    public static final String NAT_REGN_CODE_TON_TJ = "TON";

    /**
     * 国籍(NAT_REGN_CODE):特立尼达和多巴哥
     */
    public static final String NAT_REGN_CODE_TTO_TLNDHDBG = "TTO";

    /**
     * 国籍(NAT_REGN_CODE):突尼斯
     */
    public static final String NAT_REGN_CODE_TUN_TNS = "TUN";

    /**
     * 国籍(NAT_REGN_CODE):土耳其
     */
    public static final String NAT_REGN_CODE_TUR_TEQ = "TUR";

    /**
     * 国籍(NAT_REGN_CODE):图瓦卢
     */
    public static final String NAT_REGN_CODE_TUV_TWL = "TUV";

    /**
     * 国籍(NAT_REGN_CODE):台湾
     */
    public static final String NAT_REGN_CODE_TWN_TW = "TWN";

    /**
     * 国籍(NAT_REGN_CODE):坦桑尼亚
     */
    public static final String NAT_REGN_CODE_TZA_TSNY = "TZA";

    /**
     * 国籍(NAT_REGN_CODE):乌干达
     */
    public static final String NAT_REGN_CODE_UGA_WGD = "UGA";

    /**
     * 国籍(NAT_REGN_CODE):乌克兰
     */
    public static final String NAT_REGN_CODE_UKR_WKL = "UKR";

    /**
     * 国籍(NAT_REGN_CODE):美属太平洋各群岛
     */
    public static final String NAT_REGN_CODE_UMI_MSTPYGQD = "UMI";

    /**
     * 国籍(NAT_REGN_CODE):联合国
     */
    public static final String NAT_REGN_CODE_UN_LHG = "UN";

    /**
     * 国籍(NAT_REGN_CODE):联合国
     */
    public static final String NAT_REGN_CODE_UNA_LHG = "UNA";

    /**
     * 国籍(NAT_REGN_CODE):联合国
     */
    public static final String NAT_REGN_CODE_UNO_LHG = "UNO";

    /**
     * 国籍(NAT_REGN_CODE):乌拉圭
     */
    public static final String NAT_REGN_CODE_URY_WLG = "URY";

    /**
     * 国籍(NAT_REGN_CODE):美国
     */
    public static final String NAT_REGN_CODE_USA_MG = "USA";

    /**
     * 国籍(NAT_REGN_CODE):乌兹别克斯坦
     */
    public static final String NAT_REGN_CODE_UZB_WZBKST = "UZB";

    /**
     * 国籍(NAT_REGN_CODE):梵蒂冈
     */
    public static final String NAT_REGN_CODE_VAT_FDG = "VAT";

    /**
     * 国籍(NAT_REGN_CODE):圣文森特和格林纳丁斯
     */
    public static final String NAT_REGN_CODE_VCT_SWSTHGLNDS = "VCT";

    /**
     * 国籍(NAT_REGN_CODE):委内瑞拉
     */
    public static final String NAT_REGN_CODE_VEN_WNRL = "VEN";

    /**
     * 国籍(NAT_REGN_CODE):英属维尔京群岛
     */
    public static final String NAT_REGN_CODE_VGB_YSWEJQD = "VGB";

    /**
     * 国籍(NAT_REGN_CODE):美属维尔京群岛
     */
    public static final String NAT_REGN_CODE_VIR_MSWEJQD = "VIR";

    /**
     * 国籍(NAT_REGN_CODE):越南
     */
    public static final String NAT_REGN_CODE_VNM_YN = "VNM";

    /**
     * 国籍(NAT_REGN_CODE):瓦努阿图
     */
    public static final String NAT_REGN_CODE_VUT_WNAT = "VUT";

    /**
     * 国籍(NAT_REGN_CODE):威克岛
     */
    public static final String NAT_REGN_CODE_WAK_WKD = "WAK";

    /**
     * 国籍(NAT_REGN_CODE):瓦利斯和富图纳群岛
     */
    public static final String NAT_REGN_CODE_WLF_WLSHFTNQD = "WLF";

    /**
     * 国籍(NAT_REGN_CODE):西萨摩亚
     */
    public static final String NAT_REGN_CODE_WSM_XSMY = "WSM";

    /**
     * 国籍(NAT_REGN_CODE):无国籍（无国籍人）
     */
    public static final String NAT_REGN_CODE_XXA_WGJWGJR = "XXA";

    /**
     * 国籍(NAT_REGN_CODE):无国籍（难民）
     */
    public static final String NAT_REGN_CODE_XXB_WGJNM = "XXB";

    /**
     * 国籍(NAT_REGN_CODE):无国籍（未声明国籍）
     */
    public static final String NAT_REGN_CODE_XXX_WGJWSMGJ = "XXX";

    /**
     * 国籍(NAT_REGN_CODE):也门
     */
    public static final String NAT_REGN_CODE_YEM_YM = "YEM";

    /**
     * 国籍(NAT_REGN_CODE):南斯拉夫
     */
    public static final String NAT_REGN_CODE_YUG_NSLF = "YUG";

    /**
     * 国籍(NAT_REGN_CODE):南非
     */
    public static final String NAT_REGN_CODE_ZAF_NF = "ZAF";

    /**
     * 国籍(NAT_REGN_CODE):扎伊尔
     */
    public static final String NAT_REGN_CODE_ZAR_ZYE = "ZAR";

    /**
     * 国籍(NAT_REGN_CODE):赞比亚
     */
    public static final String NAT_REGN_CODE_ZMB_ZBY = "ZMB";

    /**
     * 国籍(NAT_REGN_CODE):津巴布韦
     */
    public static final String NAT_REGN_CODE_ZWE_JBBW = "ZWE";

    /**
     * 国籍(NAT_REGN_CODE):国籍不详
     */
    public static final String NAT_REGN_CODE_ZZZ_GJBX = "ZZZ";

    /*********************************** EMP_STAS:就业状态 ***********************************/
    /**
     * 就业状态(EMP_STAS):无业
     */
    public static final String EMP_STAS_1_WY = "1";

    /**
     * 就业状态(EMP_STAS):在业
     */
    public static final String EMP_STAS_2_ZY = "2";

    /**
     * 就业状态(EMP_STAS):失业
     */
    public static final String EMP_STAS_3_SY = "3";

    /**
     * 就业状态(EMP_STAS):自谋职业
     */
    public static final String EMP_STAS_4_ZMZY = "4";

    /**
     * 就业状态(EMP_STAS):退休（离岗）
     */
    public static final String EMP_STAS_5_TXLG = "5";

    /********************************* DATA_CHG_TYPE:数据变更类型 *********************************/
    /**
     * 变更类型(DATA_CHG_TYPE):无变更
     */
    public static final String DATA_CHG_TYPE_0_WBG = "0";
    /**
     * 变更类型(DATA_CHG_TYPE):增加
     */
    public static final String DATA_CHG_TYPE_1_ZJ = "1";

    /**
     * 变更类型(DATA_CHG_TYPE):减少
     */
    public static final String DATA_CHG_TYPE_2_JS = "2";
    /**
     * 变更类型(DATA_CHG_TYPE):更新
     */
    public static final String DATA_CHG_TYPE_3_GX = "3";
    /**
     * 变更类型(DATA_CHG_TYPE):查询
     */
    public static final String DATA_CHG_TYPE_4_CX = "4";

    /**
     * 规则关联业务类型 bstype : 征缴规则类
     */
    public static final String BSTYPE_ZJGZ = "P00101";

    /**
     * 规则关联业务类型 bstype : 利率滞纳金征收参数
     */
    public static final String BSTYPE_LLZLJZSCS = "P00109";

    /**
     * 规则关联业务类型 bstype : 基数核定规则
     */
    public static final String BSTYPE_JSHDGZ = "P00102";
    /**
     * 规则关联业务类型 bstype : 险种定义配置
     */
    public static final String BSTYPE_XZDYPZ = "P002";
    /**
     * 规则关联业务类型 bstype : 工资参数
     */
    public static final String BSTYPE_GZCS = "P003";
    /**
     * 规则关联业务类型 bstype : 金额核定计算
     */
    public static final String BSTYPE_JEHDJS = "P00103";
    /**
     * 规则关联业务类型 bstype : 基数核定计算
     */
    public static final String BSTYPE_JSHDJS = "P00104";
    /**
     * 规则关联业务类型 bstype : 居民预缴期设置
     */
    public static final String BSTYPE_JMYJQ = "P00106";
    /**
     * 规则关联业务类型 bstype : 居民预缴费时间段配置
     */
    public static final String BSTYPE_JMJFSJ = "P00107";
    /**
     * 规则关联业务类型 bstype : 明细分割
     */
    public static final String BSTYPE_MXFG = "M002";

    /**
     * 规则关联业务类型 bstype : 系统参数
     */
    public static final String BSTYPE_XTCS = "A0";

    /**
     * 规则关联业务类型 bstype : 系统参数 公服参保登记审核
     */
    public static final String BSTYPE_XTCS_CBDJ = "A001";
    /**
     * 规则关联业务类型 bstype : 系统参数 公服暂停参保审核
     */
    public static final String BSTYPE_XTCS_ZTCB = "A002";
    /**
     * 规则关联业务类型 bstype : 通用参数：通用转移平台参数
     */
    public static final String BSTYPE_TYZYPTCS = "G003";

    /**
     * 规则关联业务类型 bstype : 系统参数
     */
    public static final String BSTYPE_YLZZ = "M011";
    public static final String BSTYPE_YLZZ_GSJS = "M01101";
    public static final String BSTYPE_YLZZ_GSQSH = "M01102";

    /********************************* INT_FLAG:计息标志 *********************************/
    /**
     * 计息标志(INT_FLAG):否
     */
    public static final String INT_FLAG_0_F = "0";
    /**
     * 计息标志(INT_FLAG):是
     */
    public static final String INT_FLAG_1_S = "1";

    /********************************* queryPsnBasInfoFlag:是否查询人员基础信息标志 *********************************/
    /**
     * 不查询：否
     */
    public static final String QUERY_PSN_BAS_INFO_FLAG_0 = "0";
    /**
     * 查询：是
     */
    public static final String QUERY_PSN_BAS_INFO_FLAG_1 = "1";

    /***********************************ACCT_INCEXPD：账户清退标志********************************/
    /**
     * 账户清退标志(ACCT_INCEXPD):否
     */
    public static final String ACCT_INCEXPD_0_F = "0";
    /**
     * 账户清退标志(ACCT_INCEXPD):是
     */
    public static final String ACCT_INCEXPD_1_S = "1";

    /********************************** ACCT_INCEXPD_TYPE:账户收支类型 **********************************/
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户划账
     */
    public static final String ACCT_INCEXPD_TYPE_101_GRZHHZ = "101";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):帐户转入
     */
    public static final String ACCT_INCEXPD_TYPE_107_ZHZR = "107";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户年度结息
     */
    public static final String ACCT_INCEXPD_TYPE_102_GRZHNDJX = "102";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):预划收入
     */
    public static final String ACCT_INCEXPD_TYPE_108_YHSR = "108";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):继承他人账户
     */
    public static final String ACCT_INCEXPD_TYPE_106_JCTRZH = "106";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):账户特殊调整
     */
    public static final String ACCT_INCEXPD_TYPE_110_ZHTSTZ = "110";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):医保退费
     */
    public static final String ACCT_INCEXPD_TYPE_109_YBTF = "109";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户日常结息
     */
    public static final String ACCT_INCEXPD_TYPE_103_GRZHRCJX = "103";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):退收
     */
    public static final String ACCT_INCEXPD_TYPE_104_TS = "104";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):补录个人账户
     */
    public static final String ACCT_INCEXPD_TYPE_111_BLGRZH = "111";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):账户一次性注入
     */
    public static final String ACCT_INCEXPD_TYPE_112_ZHYCXZR = "112";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):上年结转收入
     */
    public static final String ACCT_INCEXPD_TYPE_113_SNJZSR = "113";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):医保消费
     */
    public static final String ACCT_INCEXPD_TYPE_201_YBXF = "201";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户返还
     */
    public static final String ACCT_INCEXPD_TYPE_202_GRZHFH = "202";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户清退
     */
    public static final String ACCT_INCEXPD_TYPE_203_GRZHQT = "203";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):个人账户做实
     */
    public static final String ACCT_INCEXPD_TYPE_204_GRZHZS = "204";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):医保个人账户代缴费
     */
    public static final String ACCT_INCEXPD_TYPE_205_YBGRZHDJF = "205";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):年度结转支出
     */
    public static final String ACCT_INCEXPD_TYPE_206_NDJZZC = "206";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):账户转出
     */
    public static final String ACCT_INCEXPD_TYPE_207_ZHZC = "207";
    /**
     * 账户收支类型(ACCT_INCEXPD_TYPE):划拨继承人
     */
    public static final String ACCT_INCEXPD_TYPE_208_HBJCR = "208";
    /**
     * 计息类别 个人
     */
    public static final String ACCT_INT_TYPE_GR = "1";
    /**
     * 计息类别 单位
     */
    public static final String ACCT_INT_TYPE_DW = "2";
    /**
     * 计息类别 所有单位
     */
    public static final String ACCT_INT_TYPE_ALL = "3";
    /**
     * 计息标志     不计息
     */
    public static final String NO_CALCULATE_INTEREST = "0";

    /**
     * 计息标志     计息
     */
    public static final String CALCULATE_INTEREST = "1";

    /*----------下账账户类型--------------*/
    /**
     * 基本医疗本年账户
     */
    public static final String ACCT_TYPE_UEBMI_BN = "acctTypeUebmiBn";//"1";
    /**
     * 基本医疗上年账户
     */
    public static final String ACCT_TYPE_UEBMI_SN = "acctTypeUebmiSn";//"2";
    /**
     * 基本医疗历年账户
     */
    public static final String ACCT_TYPE_UEBMI_LN = "acctTypeUebmiLn";//"3";
    /**
     * 公务员本年账户
     */
    public static final String ACCT_TYPE_CIVIL_BN = "acctTypeCivilBn";
    /**
     * 公务员上年账户
     */
    public static final String ACCT_TYPE_CIVIL_SN = "acctTypeCivilSn";
    /**
     * 公务员历年账户
     */
    public static final String ACCT_TYPE_CIVIL_LN = "acctTypeCivilLn";
    /**
     * 其他本年账户
     */
    public static final String ACCT_TYPE_OTHER_BN = "acctTypeOtherBn";
    /**
     * 其他上年账户
     */
    public static final String ACCT_TYPE_OTHER_SN = "acctTypeOtherSn";
    /**
     * 其他历年账户
     */
    public static final String ACCT_TYPE_OTHER_LN = "acctTypeOtherLn";
    /**
     * 健康账户
     */
    public static final String ACCT_TYPE_HEALTH = "acctTypeHealth";

    /*-------------------审核标志------------------*/

    /**
     * 审核状态 未审核
     */
    public static final String CHK_STAS_WSH = "0";
    /**
     * 审核状态 审核通过
     */
    public static final String CHK_STAS_TG = "1";
    /**
     * 审核状态 审核不通过
     */
    public static final String CHK_STAS_BTG = "2";

    /*-------------------举报结果标志------------------*/
    /**
     * 举报结果标志 举报属实
     */
    public static final String ACSN_RSLT_FLAG_YX = "01";
    /**
     * 举报结果标志 举报不属实
     */
    public static final String ACSN_RSLT_FLAG_WX = "02";

    /******************************* REFD_SETL_FLAG:退费结算标志 *******************************/
    /**
     * 退费结算标志：否
     */
    public static final String REFD_SETL_FLAG_0_N = "0";
    /**
     * 退费结算标志：是
     */
    public static final String REFD_SETL_FLAG_1_Y = "1";
    /*************************************任务类型 **************************************/
    /**
     * 统筹区差额补退
     */
    public static final String MBS_JOB_TYPE_POOLAREADIFFJOB = "MBSJOB_POOLAREADIFF";
    /**
     * 单位退休人员划账户
     */
    public static final String MBS_JOB_TYPE_EMPRETRACCTJOB = "MBSJOB_EMPRETRACCTJOB";
    /**
     * 灵活就业退休人员划账户
     */
    public static final String MBS_JOB_TYPE_FLEXRETRACCTJOB = "MBSJOB_FLEXRETRACCTJOB";
    /**
     * 账户预划
     */
    public static final String MBS_JOB_TYPE_ADVANCECREDITFORLOADJOB = "MBSJOB_ADVANCECREDITFORLOADJOB";
    /**
     * 年终结转
     */
    public static final String MBS_JOB_TYPE_ACCTYEARCORV = "MBSJOB_ACCTYEARCORV";

    /**
     * 灵活就业退休人员划账户-按单位
     */
    public static final String MBS_JOB_TYPE_FLEXRETRSINGLEACCTJOB = "MBSJOB_FLEXRETRSINGLEACCTJOB";
    /**
     * 灵活就业退休人员登账-按单位
     */
    public static final String MBS_JOB_TYPE_FLEXRETRSINGLEACCTARVLJOB = "MBSJOB_FLEXRETRSINGLEACCTARVLJOB";

    /**
     * 0缴费票据划账户-按单位
     */
    public static final String MBS_JOB_TYPE_ZEROACCTJOB = "MBS_JOB_TYPE_ZEROACCTJOB";

    /*************************************定时任务参数固定KEY **************************************/
    /**
     * 定时任务参数固定KEY：执行标志
     */
    public static final String MBS_JOB_KEY_JOBSATUS = "jobstatus";

    /**
     * 定时任务参数固定KEY：任务明细总数
     */
    public static final String MBS_JOB_KEY_JOBNUM = "jobnum";


    /**
     * 定时任务参数固定KEY：任务唯一标识号
     */
    public static final String MBS_JOB_KEY_IDENNUM = "idennum";

    /**
     * 定时任务参数固定KEY：错误信息
     */
    public static final String MBS_JOB_KEY_ERRMSG = "errmsg";

    /**
     * redis锁控制参数key
     */
    public static final String MON_SETL_BATCH_LOCAL_KEY = "MON_SETL_BATCH_LOCAL_KEY";
    public static final String MON_SETL_BATCH_LOCAL_DRG_KEY = "MON_SETL_BATCH_LOCAL_DRG_KEY";
    public static final String MON_SETL_LOCAL_DRG_KEY = "MON_SETL_LOCAL_DRG_KEY";
    public static final String MON_SETL_BATCH_INPROVOUT_KEY = "MON_SETL_BATCH_INPROVOUT_KEY";
    public static final String MON_SETL_BATCH_OUTPROVOUT_KEY = "MON_SETL_BATCH_OUTPROVOUT_KEY";

    /*************************************定时任务：执行标志 **************************************/
    /**
     * 定时任务：执行标志：数据未抓取
     */
    public static final String MBS_JOB_JOBSATUS_DATANOCATCH = "0";

    /**
     * 定时任务：执行标志：数据抓取中
     */
    public static final String MBS_JOB_JOBSATUS_DATAONCATCH = "1";

    /**
     * 定时任务：执行标志：执行中
     */
    public static final String MBS_JOB_JOBSATUS_EXCUTE = "2";

    /**
     * 定时任务：执行标志：执行完毕
     */
    public static final String MBS_JOB_JOBSATUS_EXCUTEOVER = "4";

    /**
     * 定时任务：执行标志：任务异常
     */
    public static final String MBS_JOB_JOBSATUS_JOBFAIL = "-1";

    /**
     * 定时任务：执行标志：任务删除
     */
    public static final String MBS_JOB_JOBSATUS_JOBDEL = "-2";


    /**********  数据权限管理类型     ******************/
    /**
     * 省、直辖市通办
     */
    public static final String DATA_PERMISSION_TYPE_PROV_1 = "1";

    /**
     * 地市通办
     */
    public static final String DATA_PERMISSION_TYPE_CITY_2 = "2";

    /**
     * 区县、地州通办
     */
    public static final String DATA_PERMISSION_TYPE_COUNTY_3 = "3";

    /**
     * 基层组织通办
     */
    public static final String DATA_PERMISSION_TYPE_BASE_4 = "4";
    /**********  数据权限管理类型     ******************/


    /********************************* BIZ_PRCS_CODG:业务流程编码*********************************/
    /**
     * 业务流程编码 BIZ_PRCS_CODG : 转入地发起基本医疗保险关系转移
     */
    public static final String BIZ_PRCS_CODG_ZRDFQJBYLBXGXZY = "T21";
    /**
     * 业务流程编码 BIZ_PRCS_CODG : 转出地发起基本医疗保险关系转移
     */
    public static final String BIZ_PRCS_CODG_ZCDFQJBYLBXGXZY = "T22";

    /********************************* BIZ_PRCS_STAS:业务流程状态*********************************/

    /**
     * 业务流程状态 BIZ_PRCS_STAS : 未处理
     */
    public static final String BIZ_PRCS_STAS_WCL = "0";
    /**
     * 业务流程状态 BIZ_PRCS_STAS : 处理中
     */
    public static final String BIZ_PRCS_STAS_CLZ = "1";
    /**
     * 业务流程状态 BIZ_PRCS_STAS : 已办结
     */
    public static final String BIZ_PRCS_STAS_YBJ = "2";
    /**
     * 业务流程状态 BIZ_PRCS_STAS : 已撤销
     */
    public static final String BIZ_PRCS_STAS_YCX = "3";
    /**
     * 业务流程状态 BIZ_PRCS_STAS : 申请撤销
     */
    public static final String BIZ_PRCS_STAS_SQCX = "4";

    /********************************* BIZ_NODE_CODG:业务环节编码*********************************/
    /**
     * 业务环节编码 BIZ_NODE_CODG : 基本医疗保险转移申请通知单
     */
    public static final String BIZ_NODE_CODG_JBYLBXZYSQTZD = "T2101";
    /**
     * 业务环节编码 BIZ_NODE_CODG : 基本医疗保险缴费年限和缴费时段
     */
    public static final String BIZ_NODE_CODG_JBYLBXJFNXHJFSD = "T2102";
    /**
     * 业务环节编码 BIZ_NODE_CODG : 基本医疗保险转移接续办结反馈
     */
    public static final String BIZ_NODE_CODG_JBYLBXZYJXBJFK = "T2103";


    /********************************* BIZ_NODE_STAS:业务环节状态*********************************/
    /**
     * 业务环节状态 BIZ_NODE_STAS : 已上传
     */
    public static final String BIZ_NODE_STAS_YSC = "0";
    /**
     * 业务环节状态 BIZ_NODE_STAS : 已下载
     */
    public static final String BIZ_NODE_STAS_YXZ = "1";
    /**
     * 业务环节状态 BIZ_NODE_STAS : 申请撤销
     */
    public static final String BIZ_NODE_STAS_SQCX = "2";
    /**
     * 业务环节状态 BIZ_NODE_STAS : 已撤销
     */
    public static final String BIZ_NODE_STAS_YCX = "3";


    /********************************* TRAF_NODE_EFFT_FLAG:转移环节生效标志*********************************/
    /**
     * 转移环节生效标志 TRAF_NODE_EFFT_FLAG : 已撤销
     */
    public static final String TRAF_NODE_EFFT_FLAG_YCX = "0";
    /**
     * 转移环节生效标志 TRAF_NODE_EFFT_FLAG : 已生效
     */
    public static final String TRAF_NODE_EFFT_FLAG_YSX = "1";


    /********************************* CLCT_TYPE:缴费类型*********************************/
    //TODO 暂时使用，后期根据具体情况修改
    /**
     * 缴费类型 CLCT_TYPE  10: 正常缴费
     */
    public static final String CLCT_TYPE_ZCJF = "10";
    /**
     * 缴费类型 CLCT_TYPE  11: 正常缴费-个人缴费部分（承德使用）
     */
    public static final String CLCT_TYPE_ZCJF_GR = "11";
    /**
     * 缴费类型 CLCT_TYPE  20: 退收
     */
    public static final String CLCT_TYPE_TS = "20";

    /**
     * 缴费类型 CLCT_TYPE  32: 一次性补收
     */
    public static final String CLCT_TYPE_YCXBS = "32";
    /**
     * 缴费类型 CLCT_TYPE  34 : 基数补差
     */
    public static final String CLCT_TYPE_JSBC = "34";
    /**
     * 缴费类型 CLCT_TYPE  35 : 比例补差
     */
    public static final String CLCT_TYPE_BLBC = "35";
    /**
     * 缴费类型 CLCT_TYPE  30 : 补收
     */
    public static final String CLCT_TYPE_BS = "30";
    /**
     * 缴费类型 CLCT_TYPE  31 : 新增人员超30岁补收
     */
    public static final String CLCT_TYPE_XZRYCSSBS = "31";
    /**
     * 缴费类型 CLCT_TYPE  33 : 退休补收
     */
    public static final String CLCT_TYPE_TXBS = "33";
    /**
     * 缴费类型 CLCT_TYPE  40: 账户注入
     */
    public static final String CLCT_TYPE_ZHZR = "40";
    /**
     * 缴费类型 CLCT_TYPE  41: 账户预划
     */
    public static final String CLCT_TYPE_ZHYH = "41";
    /**
     * 缴费类型 CLCT_TYPE  36: 退休人员统筹划账户
     */
    public static final String CLCT_TYPE_TCHZH = "36";

    /**
     * 缴费类型 CLCT_TYPE  60: 单位预交
     */
    public static final String CLCT_TYPE_DWYJ = "60";

    /**
     * 缴费类型 CLCT_TYPE  99: 其他
     */
    public static final String CLCT_TYPE_QT = "99";

    /**
     * 缴费类型 CLCT_TYPE  991: 居民退费
     */
    public static final String CLCT_TYPE_JMTF = "991";

    /**
     * 缴费类型 CLCT_TYPE 992: 单位缓缴
     */
    public static final String CLCT_TYPE_DWHJ = "992";
    /********************************** 缴费核定时：获取基数的方式 **********************************/
    public static String CLCTSTD_MODE_BDFD = "1";//前台录入工资，保底封顶
    public static String CLCTSTD_MODE_STD = "2";//查询人员基数信息
    public static String CLCTSTD_MODE_QTJS = "3";//前台录入基数

    /********************************* INSU_IDEN:人员参保身份*********************************/
    /**
     * 职工参保身份
     */
    public static final String INSU_IDEN_ZG = "1";
    /**
     * 居民参保身份
     */
    public static final String INSU_IDEN_JM = "2";
    /********************************* DCLASOUC：申报来源*********************************/

    public static final String DCLASOUC_04 = "04";//小程序申报
    public static final String DCLASOUC_9901 = "9901";//自动申报
    public static final String DCLASOUC_9902 = "9902";//生育医疗费核定审核通过后，津贴自动申报

    public static final String DCLASOUC_DF = "1";
    /********************************** :征集标志 start **********************************/
    public static final String BILL_FLAG_0 = "0";//否
    public static final String BILL_FLAG_1 = "1";//是
    /********************************** :征集标志标志 end **********************************/
    /********************************* REVS_FLAG:缴费单据是否核销*********************************/
    /**
     * 正常
     */
    public static final String REVS_FLAG_IS = "Z";
    /**
     * 未核销:TODO 没有该常量，后面删除
     */
    public static final String REVS_FLAG_NO = "0";

    /**
     * +账：被核销
     */
    public static final String REVS_FLAG_01 = "+";

    /**
     * -账：核销
     */
    public static final String REVS_FLAG_02 = "-";

    /********************************* TEMP_MA_CRTF_STAS:临时救助认定状态*********************************/
    /**
     * 已登记
     */
    public static final String TEMP_MA_CRTF_STAS_01 = "01";
    /**
     * 公示中
     */
    public static final String TEMP_MA_CRTF_STAS_02 = "02";
    /**
     * 一级公示通过
     */
    public static final String TEMP_MA_CRTF_STAS_03 = "03";
    /**
     * 一级公示未通过
     */
    public static final String TEMP_MA_CRTF_STAS_04 = "04";
    /**
     * 资格认定通过
     */
    public static final String TEMP_MA_CRTF_STAS_05 = "05";
    /**
     * 资格认定未通过
     */
    public static final String TEMP_MA_CRTF_STAS_06 = "06";


    /********************************* pubType:公示类型*********************************/
    /**
     * 一级公示
     */
    public static final String PUB_TYPE_01 = "1";
    /**
     * 二级公示
     */
    public static final String PUB_TYPE_02 = "2";

    /********************************* sendFlag:发送标志*********************************/
    /**
     * 否
     */
    public static final String SEND_FLAG_0 = "0";
    /**
     * 是
     */
    public static final String SEND_FLAG_1 = "1";


    /*********************************** 公示结果状态 ***********************************/

    /**
     * 公式中
     */
    public static final String PUB_RSLT_STAS_GSZ = "01";

    /**
     * 公示未通过
     */
    public static final String PUB_RSLT_STAS_GSWTG = "02";

    /**
     * 公示通过
     */
    public static final String PUB_RSLT_STAS_GSTG = "03";

    /********************************* PAY_LOC:支付地点*********************************/
    /**
     * 中心
     */
    public static final String PAY_LOC_ZX = "1";
    /**
     * 医药机构
     */
    public static final String PAY_LOC_YYJG = "2";
    /**
     * 省内异地
     */
    public static final String PAY_LOC_YD = "3";
    /**
     * 跨省异地
     */
    public static final String PAY_LOC_KSYD = "4";

    /********************************* CURRENT_TAB:费用录入类型*********************************/
    /**
     * 录入大类
     */
    public static final String CURRENT_TAB_MAJOR = "1";
    /**
     * 录入明细
     */
    public static final String CURRENT_TAB_DETAIL = "2";

    /********************************* INHOSP_STAS:在院状态*********************************/
    /**
     * 出院
     */
    public static final String INHOSP_STAS_OUT = "0";
    /**
     * 在院
     */
    public static final String INHOSP_STAS_IN = "1";

    /********************************* HILIST_TYPE:在院状态*********************************/
    /**
     * 药品
     */
    public static final String HILIST_TYPE_DRUG = "1";
    /**
     * 诊疗项目
     */
    public static final String HILIST_TYPE_TRTITEM = "2";
    /**
     * 服务设施
     */
    public static final String HILIST_TYPE_SERV = "3";
    /**
     * 医用材料
     */
    public static final String HILIST_TYPE_MATL = "4";
    /********************************* REVS_FLAG:医疗保险费收入-支出 标识*********************************/
    /**
     * 是
     */
    public static final String TRAF_FLAG_IS = "1";
    /**
     * 否
     */
    public static final String TRAF_FLAG_NO = "0";

    /********************************* CHG_REA:变更原因 START*********************************/
    public static final String CHG_REA_EMPINFOMNT = "6902";
    /**
     * 人员失踪
     */
    public static final String CHG_REA_RYSZ = "6306";
    /**
     * 转出统筹范围外
     */
    public static final String CHG_REA_TRANSFEROUT = "6404";
    /**
     * 人员死亡
     */
    public static final String CHG_REA_RYSW = "6401";
    /**
     * 人员达到享受退休待遇条件
     */
    public static final String CHG_REA_XSTXDY = "6308";
    /**
     * 人员信息维护
     */
    public static final String CHG_REA_RYXXWH = "6900";

    /********************************* CHG_REA:变更原因 END *********************************/

    /********************************* RWAMT_PAY_TYPE:奖励拨付类型 标识*********************************/

    /**
     * 划拨个人账户
     */
    public static final String RWAMT_PAY_TYPE_01 = "01";
    /**
     * 划拨银行账户
     */
    public static final String RWAMT_PAY_TYPE_02 = "02";

    /********************************* RWAMT_PAY_TYPE:奖励拨付类型 标识*********************************/

    /********************************* FIXMEDINS_FLAG 两定标识*********************************/
    /**
     * 定点医疗机构
     */
    public static final String FIXMEDINS_FLAG_MEDINS = "1";

    /**
     * 定点药店
     */
    public static final String FIXMEDINS_FLAG_RTALPHAC = "2";

    /**
     * 药店+医院
     */
    public static final String FIXMEDINS_FLAG_ALL = "3";
    /********************************* FIXMEDINS_FLAG 两定标识*********************************/

    /****************************** 行政区划 后缀标识 start ***********************************/

    /**
     * 国家局医保区划
     */
    public static final String ADMDVS_NATION = "100000";
    /**
     * 省级
     */
    public static final String ADMDVS_SUFFIX_PROV = "0000";

    /**
     * 市级
     */
    public static final String ADMDVS_SUFFIX_CITY = "00";
    /****************************** 行政区划 后缀标识 end ***********************************/

    /**********  行政区划查询级别     ******************/
    /**
     * 国家
     */
    public static final String ADMDVS_LEVEL_CONTY_0 = "0";
    /**
     * 省、直辖市
     */
    public static final String ADMDVS_LEVEL_PROV_1 = "1";

    /**
     * 地市
     */
    public static final String ADMDVS_LEVEL_CITY_2 = "2";

    /**
     * 区县、地州
     */
    public static final String ADMDVS_LEVEL_COUNTY_3 = "3";

    /**
     * 行政区划等级：基层组织
     */
    public static final String ADMDVS_LEVEL_BASE_4 = "4";


    /**********  行政区划查询级别     ******************/

    /**********  应缴类型 start     ******************/
    /**
     * 正常应缴
     */
    public static final String RECB_TYPE_ZC = "Z";

    /**
     * 退收
     */
    public static final String RECB_TYPE_TS = "2";

    /**
     * 中断补收
     */
    public static final String RECB_TYPE_ZDBS = "3";

    /**
     * 一次性补收
     */
    public static final String RECB_TYPE_YCXBS = "4";

    /**
     * 退休补收
     */
    public static final String RECB_TYPE_TXBS = "5";

    /**
     * 缴费基数调整补收
     */
    public static final String RECB_TYPE_JFJSTZBS = "6";

    /**
     * 缴费比例调整补收
     */
    public static final String RECB_TYPE_JFBLTZBS = "7";

    /**
     * 一次性缴费
     */
    public static final String RECB_TYPE_YCXJF = "8";

    /**
     * 单位预缴核定
     */
    public static final String RECB_TYPE_YJHD = "51";

    /**
     * 单位预缴返还
     */
    public static final String RECB_TYPE_YJFH = "52";

    /**
     * 待转金按单分配
     */
    public static final String RECB_TYPE_ADFP = "53";
    /**********  应缴类型 end     ******************/
    /**********  性别 start     ******************/
    /**
     * 未知
     */
    public static final String GEND_WZ = "0";

    /**
     * 男
     */
    public static final String GEND_NAN = "1";

    /**
     * 女
     */
    public static final String GEND_NV = "2";

    /**
     * 未说明性别
     */
    public static final String GEND_WSM = "9";
    /**********  性别 end     ******************/
    /**********  拨付计划拨付标识     ******************/

    //已拨付
    public static final String PAY_PLAN_FLAG_IS = "1";
    //未拨付
    public static final String PAY_PLAN_FLAG_NO = "0";
    //已失效
    public static final String PAY_PLAN_FLAG_2 = "2";
    /**********  拨付计划拨付标识     ******************/


    /**********  人员待遇登记     ******************/
    /**
     * 西药中成药
     */
    public static final String WESTERN__MEDICINE_1 = "1";

    /**
     * 中草药
     */
    public static final String HERB_MEDICINE_2 = "2";

    /**
     * 民族药品分支
     */
    public static final String NATY_PREPARED_MEDICINE_3 = "3";


    /**
     * 民族药品分支  SelfPreparedInfo
     */
    public static final String SELF_PREPARED_MEDICINE_4 = "4";
    /**********  人员待遇登记     ******************/


    /*************************返还类型*******************************/
    //全额返还
    public static final String RETN_TYPE_QEFH = "1";
    //部分返还
    public static final String RETN_TYPE_BFFH = "2";


    /********************************* MDTRT_CERT_TYPE 就诊凭证类型*********************************/
    /**
     * 电子医保凭证
     */
    public static final String MDTRT_CERT_TYPE_01 = "01";

    /**
     * 身份证
     */
    public static final String MDTRT_CERT_TYPE_02 = "02";

    /**
     * 社会保障卡
     */
    public static final String MDTRT_CERT_TYPE_03 = "03";

    /**
     * 终端扫码
     */
    public static final String MDTRT_CERT_TYPE_04 = "04";

    /**
     * 终端扫脸
     */
    public static final String MDTRT_CERT_TYPE_05 = "05";

    /**
     * 行政区划级别 -- 省
     */
    public static final String ADMDVS_LV_PRO = "1";
    /**
     * 行政区划级别 -- 市
     */
    public static final String ADMDVS_LV_CITY = "2";
    /**
     * 行政区划级别 -- 县
     */
    public static final String ADMDVS_LV_X = "3";
    /********************************************************转移模式*************************************************************/
    /**
     * 老转移（有联系函）
     */
    public static final String TRANS_MODE_1_LZY = "1";
    /**
     * 转出地发起
     */
    public static final String TRANS_MODE_2_ZCDFQ = "2";
    /**
     * 转入地发起（有通知单）
     */
    public static final String TRANS_MODE_3_ZRDFQ = "3";

    /********************************************************转移方向*************************************************************/
    /**
     * 转入
     */
    public static final String TRAF_DIRC_1_ZR = "1";
    /**
     * 转出
     */
    public static final String TRAF_DIRC_2_ZC = "2";
    /********************************************************转移地域范围*************************************************************/
    /**
     * 统筹区内
     */
    public static final String TRAF_AREA_SCP_1_TCQN = "1";
    /**
     * 夸统筹区
     */
    public static final String TRAF_AREA_SCP_2_KTCQ = "2";
    /********************************************************转移制度方向*************************************************************/
    /**
     * 职工基本医疗保险制度内转移
     */
    public static final String TRAF_PROT_DIRC_11_ZGZDN = "11";

    /********************************************************转移平台参数类型*************************************************************/

    /**
     * 转移平台地址
     */
    public static final String TRAF_PLAF_PARA_TYPE_ADDR = "1";

    /**
     * 省级转移行政区划
     */
    public static final String TRAF_PLAF_PARA_TYPE_ADMDVS = "2";


    /********************************* CHRGITM_LV 收费项目等级*********************************/

    /********************************* HOSP_LV 医院等级*********************************/
    /**
     * 三级特等
     */
    public static final String HOSP_LV_01 = "01";
    /**
     * 三级甲等
     */
    public static final String HOSP_LV_02 = "02";
    /**
     * 三级乙等
     */
    public static final String HOSP_LV_03 = "03";
    /**
     * 三级丙等
     */
    public static final String HOSP_LV_04 = "04";

    /**
     * 一级丙等
     */
    public static final String HOSP_LV_10 = "10";

    /**
     * 无等级
     */
    public static final String HOSP_LV_11 = "11";


    /********************************* CHCECKDATA_INPUT 数据校验规则入参*********************************/
    /**
     * 欠费的情况
     */
    public static final String CHECKDATA_INPUT_UNITARRAREA = "c00001";
    /**
     * 待转金余额
     */
    public static final String CHECKDATA_INPUT_UNITTRAF = "c00002";
    /**
     * 被合并单位的在途信息
     */
    public static final String CHECKDATA_INPUT_UNITONLINE = "c00003";
    /**
     * 单位下正常参保人数
     */
    public static final String CHECKDATA_INPUT_UNITPSNSIZE = "c00004";

    /**
     * 最大账期
     */
    public static final String CHECKDATA_INPUT_UNITMAXINUSSE = "c00005";
    /**
     * 合并号单位险种列表信息
     */
    public static final String CHECKDATA_INPUT_UNITINSUS_MAIN = "c00005_1";
    /**
     * 被合并号单位险种列表信息
     */
    public static final String CHECKDATA_INPUT_UNITINSUS_SLAVE = "c00005_2";
    /**
     * 单位险种列表信息
     */
    public static final String CHECKDATA_INPUT_UNITINSUS = "c00006";

    /********************************* CHCECKDATA_INPUT 数据校验规则入参*********************************/
    /********************************* RULE_BIZ_TYPE 规则关联业务类型*********************************/
    /**
     * 公共参数 P0
     */
    public static final String RULE_BIZ_TYPE_P0 = "P0";
    /**
     * 公共参数 P00110
     */
    public static final String RULE_BIZ_TYPE_P00110 = "P00110";
    /**
     * 职工参保登记管理 N0103
     */
    public static final String RULE_BIZ_TYPE_N0103 = "N0103";
    /**
     * 单位参保登记 N010101
     */
    public static final String RULE_BIZ_TYPE_N010101 = "N010101";
    /**
     * 职工参保登记 N010102
     */
    public static final String RULE_BIZ_TYPE_N010102 = "N010102";
    /**
     * 单位信息维护 N010201
     */
    public static final String RULE_BIZ_TYPE_N010201 = "N010201";
    /**
     * 单位缴费状态变更 N010202
     */
    public static final String RULE_BIZ_TYPE_N010202 = "N010202";
    /**
     * 单位合并 N010203
     */
    public static final String RULE_BIZ_TYPE_N010203 = "N010203";
    /**
     * 单位分立 N010204
     */
    public static final String RULE_BIZ_TYPE_N010204 = "N010204";
    /**
     * 单位注销 N010205
     */
    public static final String RULE_BIZ_TYPE_N010205 = "N010205";
    /**
     * 人员特殊信息维护
     */
    public static final String RULE_BIZ_TYPE_N010304 = "N010304";
    /**
     * 人员一般信息维护
     */
    public static final String RULE_BIZ_TYPE_N010303 = "N010303";
    /**
     * 人员多号合并
     */
    public static final String RULE_BIZ_TYPE_N010305 = "N010305";
    /**
     * 人员特殊身份认定
     */
    public static final String RULE_BIZ_TYPE_N010306 = "N010306";
    /**
     * 灵活就业人员中断缴费
     */
    public static final String RULE_BIZ_TYPE_N010302 = "N010302";
    /**
     * 医疗视同缴费年限认定
     */
    public static final String RULE_BIZ_TYPE_N010307 = "N010307";
    /**
     * 在职转退休 N010308
     */
    public static final String RULE_BIZ_TYPE_N010308 = "N010308";
    /**
     * 退休参数 P005
     */
    public static final String RULE_BIZ_TYPE_P005 = "P005";


    /**
     * 职工参保人员暂停缴费 N010301
     */
    public static final String RULE_BIZ_TYPE_N010301 = "N010301";
    /**
     * 人员终止参保 N010309
     */
    public static final String RULE_BIZ_TYPE_N010309 = "N010309";
    /**
     * 单位补收核定 N020103
     */
    public static final String RULE_BIZ_TYPE_N020103 = "N020103";
    /**
     * 个人账户注入 N030103
     */
    public static final String RULE_BIZ_TYPE_N030103 = "N030103";

    /**
     * 基本医疗保险转移申请 N010601
     */
    public static final String RULE_BIZ_TYPE_N010601 = "N010601";

    /**
     * 基本医疗保险转出 N010602
     */
    public static final String RULE_BIZ_TYPE_N010602 = "N010602";

    /**
     * 基本医疗保险转入 N010603
     */
    public static final String RULE_BIZ_TYPE_N010603 = "N010603";

    /**
     * 基本医疗保险转入基金人员匹配 N010604
     */
    public static final String RULE_BIZ_TYPE_N010604 = "N010604";

    /**
     * 跨省基本医疗保险转移申请 N010605
     */
    public static final String RULE_BIZ_TYPE_N010605 = "N010605";

    /**
     * 跨省基本医疗保险转出 N010606
     */
    public static final String RULE_BIZ_TYPE_N010606 = "N010606";

    /**
     * 跨省基本医疗保险转入 N010607
     */
    public static final String RULE_BIZ_TYPE_N010607 = "N010607";


    /**
     * 险种依赖互斥配置 P00202
     */
    public static final String RULE_BIZ_TYPE_P00202 = "P00202";
    /**
     * 重复参保校验 N04
     */
    public static final String RULE_BIZ_TYPE_N04 = "N04";
    /********************************* 业务名称*********************************/
    public static final String EVT_NAME_ZS = "01";
    public static final String EVT_NAME_FH = "01";//返回
    public static final String EVT_NAME_QT = "02";
    // 转出
    public static final String EVT_NAME_ZC = "03";
    /********************************* 材料信息*********************************/
    public static final String MATL_B_DE = "0";
    public static final String MATL_B_CZ = "1";
    /********************************* MENUCODG 菜单编码*********************************/
    //参数规则通用的配置  mbs-rule-cfg
    public static final String MENU_CODG_RULE_CFG_01 = "mbs-rule-cfg-01";
    //模拟待办跳转  mbs-999-4
    public static final String MENU_CODG_999_4 = "mbs-999-4";
    //单位参保登记  mbs-emp-insu-1
    public static final String MENU_CODG_EMP_INSU_1 = "mbs-emp-insu-01";
    //职工参保登记  mbs-psn-insu-01
    public static final String MENU_CODG_STAF_INSU_01 = "mbs-psn-insu-01";
    //灵活就业人员参保登记  mbs-psn-insu-02
    public static final String MENU_CODG_FLX_INSU_01 = "mbs-flx-insu-01";
    //退休人员登记  mbs-retr-insu-01
    public static final String MENU_CODG_RETR_INSU_01 = "mbs-retr-insu-01";

    //单位信息维护
    public static final String MENU_CODG_MBS_EMP_MNT_01 = "mbs-emp-mnt-01";
    //单位缴费状态变更  mbs-emp-clctchg-01
    public static final String MENU_CODG_EMP_CLCTCHG_01 = "mbs-emp-clchg-01";
    //单位合并  mbs-emp-merg-01
    public static final String MENU_CODG_EMP_MERG_01 = "mbs-emp-merg-01";
    //单位分立  mbs-emp-merg-01
    public static final String MENU_CODG_EMP_SPLT_01 = "mbs-emp-splt-01";
    //单位注销  mbs-emp-canc-01
    public static final String MENU_CODG_EMP_CANC_01 = "mbs-emp-canc-01";
    //单位扩展信息登记  mbs-emp-ext-01
    public static final String MENU_CODG_EMP_EXT_01 = "mbs-emp-ext-01";

    //参保人员暂停缴费  mbs-psn-pausclct-01
    public static final String MENU_CODG_PSN_PAUSCLCT_01 = "mbs-psn-paucl-01";
    //灵活就业人员中断缴费  mbs-psn-pausclct-02
    public static final String MENU_CODG_PSN_PAUSCLCT_02 = "mbs-flx-paucl-01";
    //居民暂停参保  mbs-rsdt-pausclct-01
    public static final String MENU_CODG_PSN_PAUSCLCT_03 = "mbs-rsdt-paucl-01";
    //居民暂停参保  MBS-RSDT-PAUCL-01_GGFW
    public static final String MENU_CODG_PSN_PAUSCLCT_03_GGFW = "MBS-RSDT-PAUCL-01_GGFW";
    //居民信息维护
    public static final String MENU_CODG_RSDT_MNT_01 = "mbs-rsdr-mnt-01";
    //人员信息维护
    public static final String MENU_CODG_PSN_MNT_01 = "mbs-psn-mnt-01";
    //人员终止参保 mbs-psn-expiinsu-01
    public static final String MENU_CODG_PSN_EXPIINSU_01 = "mbs-psn-exins-01";
    //特殊身份认定 mbs-psn-insu-3
    public static final String MENU_CODG_PSN_SPIDET_01 = "mbs-psn-spdet-01";
    //城乡居民特殊身份认定
    public static final String MENU_CODG_PSN_INSU_3 = "mbs-psn-insu-3";
    //人员多号合并  mbs-psn-merg-01
    public static final String MENU_CODG_PSN_MERG_01 = "mbs-psn-merg-01";
    //在职转退休  mbs-psn-retr-01
    public static final String MENU_CODG_PSN_RETR_01 = "mbs-psn-retr-01";
    //医疗视同缴费年限认定  mbs-psn-tratcrtf-01
    public static final String MENU_CODG_PSN_TRATCRTF_01 = "mbs-psn-tratf-01";
    //人员扩展信息登记  mbs-psn-ext-01
    public static final String MENU_CODG_PSN_EXT_01 = "mbs-psn-ext-01";

    //基本医疗保险转入申请（关系转移申请通知单） mbs-tra-appy-01
    public static final String MENU_CODG_TRA_APPY_01 = "mbs-tra-apply-01";
    //基本医疗保险转入申请（关系转移接续联系函）mbs-tra-conlet-01
    public static final String MENU_CODG_TRA_CONLET_01 = "mbs-tra-conlt-01";
    //基本医疗保险转出 mbs-tra-trafout-01
    public static final String MENU_CODG_TRA_TRAFOUT_01 = "mbs-tra-trout-01";
    //基本医疗保险转入 mbs-tra-trafin-01
    public static final String MENU_CODG_TRA_TRAFIN_01 = "mbs-tra-trin-01";
    // 关系转移经办机构管理 mbs-tra-opt-01
    public static final String MENU_CODG_TRA_OPT_01 = "mbs-tra-opt-01";
    // 转移基金匹配 mbs-tra-fund-01
    public static final String MENU_CODG_TRA_FUND_01 = "mbs-tra-fund-01";

    //单位差额补退
    public static final String MENU_CODG_CRT_EMPRVIS_01 = "mbs-crt-emprv-01";
    //人员差额补退
    public static final String MENU_CODG_CRT_PSNRVIS_01 = "mbs-crt-psnrv-01";

    //单位预缴返还  mbs-adv-paybak-01
    public static final String MENU_CODG_ADV_PAYBAK_01 = "mbs-crt-paybk-01";
    //单位预缴核定  mbs-adv-paycrt-01
    public static final String MENU_CODG_ADV_PAYCRT_01 = "mbs-crt-paycr-01";
    //待转金按单分配  mbs-adv-paydocass-01
    public static final String MENU_CODG_ADV_PAYDOCASS_01 = "mbs-crt-paydc-01";
    //单位补收核定  mbs-crt-empfmspay-01
    public static final String MENU_CODG_CRT_EMPFMSPAY_01 = "mbs-crt-empfp-01";
    //个人账户管理  mbs-n03
    public static final String MENU_CODG_N03 = "mbs-n03";
    //个人账户收入管理  mbs-n0301
    public static final String MENU_CODG_N0301 = "mbs-n0301";
    //个人账户注入
    public static final String MENU_CODG_ACC_PSNPOUINT_01 = "mbs-acc-injec-01";
    //异地安置网上申请信息下载
    public static final String MENU_CODG_N040218 = "mbs-n040218";
    //异地安置网上申请信息审核
    public static final String MENU_CODG_N040219 = "mbs-n040219";
    /**
     * 个人账户预划
     */
    public static final String MENU_CODG_ACC_PREPL_01 = "mbs-acc-prepl-01";
    /**
     * 统筹区差额补退
     */
    public static final String MENU_CODG_MBS_CRT_OPARV_01 = "mbs-crt-oparv-01";
    /**
     * 个人账户计息
     */
    public static final String MENU_CODG_ACC_INT_01 = "menu_codg_acc_int_01";

    //单位退休人员划账户  mbs-acc-empretint-01
    public static final String MENU_CODG_ACC_EMPRETINT_01 = "mbs-acc-empda-01";
    //灵活就业退休人员划账户  mbs-acc-psnretint-01
    public static final String MENU_CODG_ACC_PSNRETINT_01 = "mbs-acc-psnda-01";

    //数据权限  mbs-data-access
    public static final String MENU_CODG_DATA_ACCESS = "mbs-data-access";
    //功能数据权限管理  mbs-access-manage
    public static final String MENU_CODG_ACCESS_MANAGE = "mbs-access-manage";
    //数据权限测试  mbs-access-test
    public static final String MENU_CODG_ACCESS_TEST = "mbs-access-test";
    //个人待遇管理  mbs-n04
    public static final String MENU_CODG_N04 = "mbs-n04";
    //个人待遇结算管理  mbs-n0405
    public static final String MENU_CODG_N0405 = "mbs-n0405";
    //个人零星报销登记  mbs-n040501
    public static final String MENU_CODG_N040501 = "mbs-n040501";
    //个人零星报销结算  mbs-n040502
    public static final String MENU_CODG_N040502 = "mbs-n040502";
    //费用明细批量录入  mbs-n040503
    public static final String MENU_CODG_N040503 = "mbs-n040503";
    //零星报销撤销
    public static final String MENU_CODG_N040510 = "mbs-n040510";
    //个人账户返还  mbs-n040601
    public static final String MENU_CODG_N040601 = "mbs-040601";
    //个人账户返还审核  mbs-n040602
    public static final String MENU_CODG_N040602 = "mbs-040602";
    //个人账户做实  mbs-n040701
    public static final String MENU_CODG_N040701 = "mbs-n040701";
    //个人账户做实审核 mbs-n040702
    public static final String MENU_CODG_N040702 = "mbs-040702";
    //个人账户清退  mbs-n040801
    public static final String MENU_CODG_N040801 = "mbs-n040801";
    //个人账户清退审核  mbs-n040802
    public static final String MENU_CODG_N040802 = "mbs-040802n";
    //账户年终结转  mbs-n040901
    public static final String MENU_CODG_N040901 = "mbs-n04090101";
    //账户共济  mbs-n041001
    public static final String MENU_CODG_N041001 = "mbs-041001";
    //账户共济审核  mbs-n041002
    public static final String MENU_CODG_N041002 = "mbs-n041002";
    //特殊药品登记审核 mbs-n040211
    public static final String MENU_CODG_N040211 = "mbs-n040211";
    public static final String MENU_CODG_N040212 = "mbs-n040212";
    public static final String MENU_CODG_N040213 = "mbs-n040213";
    public static final String MENU_CODG_N040214 = "mbs-n040214";
    public static final String MENU_CODG_N040221 = "mbs-n040221";
    //定点机构结算管理  mbs-n07
    public static final String MENU_CODG_N07 = "mbs-n07";
    //医药机构月度结算  mbs-n0702
    public static final String MENU_CODG_N0702 = "mbs-n0702";
    //月结申报  mbs-n070201
    public static final String MENU_CODG_N070201 = "mbs-n070201";
    //受理  mbs-n070202
    public static final String MENU_CODG_N070202 = "mbs-n070202";
    //审核结算  mbs-n070203
    public static final String MENU_CODG_N070203 = "mbs-n070203";
    //生成拨付单  mbs-n070204
    public static final String MENU_CODG_N070204 = "mbs-n070204";
    //预留金（保证金）管理  mbs-n0703
    public static final String MENU_CODG_N0703 = "mbs-n0703";
    //制定预留金拨付计划  mbs-n070301
    public static final String MENU_CODG_N070301 = "mbs-n070301";
    //预留金拨付计划审核  mbs-n070302
    public static final String MENU_CODG_N070302 = "mbs-n070302";
    //生成拨付单  mbs-n070303
    public static final String MENU_CODG_N070303 = "mbs-n070303";
    //预留金扣款  mbs-n070305
    public static final String MENU_CODG_N070305 = "mbs-n070305";
    //预留金扣款审核  mbs-n070306
    public static final String MENU_CODG_N070306 = "mbs-n070306";
    //核定年终清算
    public static final String MENU_CODG_N070401 = "mbs-n070401";
    //调整年终清算
    public static final String MENU_CODG_N070402 = "mbs-n070402";
    //审核年终清算
    public static final String MENU_CODG_N070403 = "mbs-n070403";
    public static final String MENU_CODG_N070405 = "mbs-n070405";
    public static final String MENU_CODG_N070406 = "mbs-n070406";
    //    //医保目录业务属性信息维护  mbs-n12
//    public static final String MENU_CODG_N12 = "mbs-n12";
//    //药品目录业务属性信息维护  mbs-n120101
//    public static final String MENU_CODG_N120101 = "mbs-n120101";
    //统一门户测试  mbs-portal-test
    public static final String MENU_CODG_PORTAL_TEST = "mbs-portal-test";


    //医疗救助人员登记  mbs-n100101
    public static final String MENU_CODG_TEMP_MA_01 = "mbs-n100101";
    //救助人员信息审核  mbs-n100102
    public static final String MENU_CODG_TEMP_MA_02 = "mbs-n100102";
    //救助人员信息公示  mbs-n100103
    public static final String MENU_CODG_TEMP_MA_03 = "mbs-n100103";
    //公示信息审核  mbs-n100108
    public static final String MENU_CODG_TEMP_MA_08 = "mbs-n100108";
    //公示结果审核  mbs-n100106
    public static final String MENU_CODG_TEMP_MA_06 = "mbs-n100106";
    //救助人员信息二级公示  mbs-n100109
    public static final String MENU_CODG_TEMP_MA_09 = "mbs-n100109";
    //二级公示信息审核  mbs-n100110
    public static final String MENU_CODG_TEMP_MA_10 = "mbs-n1001010";
    //二级公示结果审核  mbs-n100111
    public static final String MENU_CODG_TEMP_MA_11 = "mbs-n100111";
    //公示信息打印  mbs-n100107
    public static final String MENU_CODG_TEMP_MA_07 = "mbs-n100107";


    //公示信息举报  mbs-n100104
    public static final String MENU_CODG_TEMP_MA_04 = "mbs-n100104";
    //举报信息审核  mbs-n100105
    public static final String MENU_CODG_TEMP_MA_05 = "mbs-n100105";

    //医疗救助报销
    public static final String MENU_CODG_N1002 = "mbs-ui-n1002";
    //医疗救助登记
    public static final String MENU_CODG_N100201 = "mbs-n100201";
    //医疗救助结算
    public static final String MENU_CODG_N100202 = "mbs-n100202";
    //医疗救助审核
    public static final String MENU_CODG_N100203 = "mbs-n100203";
    //灵活报销结果录入
    public static final String MENU_CODG_N040507 = "mbs-N04050701";
    public static final String MENU_CODG_N04050703 = "mbs-N04050703";
    public static final String MENU_CODG_N04050702 = "mbs-N04050702";
    public static final String MENU_CODG_N04050704 = "mbs-N04050704";
    //年度内二次报销登记
    public static final String MENU_CODG_N04050601 = "mbs-n04050601";
    public static final String MENU_CODG_N04050603 = "mbs-n04050603";
    public static final String MENU_CODG_N04050604 = "mbs-n04050604";
    //零星二次补差登记
    public static final String MENU_CODG_N040505 = "mbs-n04050501";
    public static final String MENU_CODG_N04050503 = "mbs-n04050503";
    public static final String MENU_CODG_N04050505 = "mbs-n04050505";
    public static final String MENU_CODG_N04050507 = "mbs-n04050507";
    //零星二次补差批量登记
    public static final String MENU_CODG_N04050509 = "mbs-n04050509";
    public static final String MENU_CODG_N04050511 = "mbs-n04050511";
    public static final String MENU_CODG_N04050513 = "mbs-n04050513";
    //特殊人群奖励金拨付登记
    public static final String MENU_CODG_N040508 = "mbs-n040508";
    public static final String MENU_CODG_N04050803 = "mbs-n04050803";

    //工资基数申报
    public static final String MENU_CODG_N010603 = "mbs-n010603";
    //缴费工资申报-公共服务
    public static final String MENU_CODG_N010603_GGFW = "mbs-n010603_ggfw";
    //无医保凭证结算备案登记
    public static final String MENU_CODG_N050112 = "mbs-n050112";
    //定点医药机构考核
    public static final String MENU_CODG_N050113 = "mbs-n050113";
    //卫生技术人员考核
    public static final String MENU_CODG_N050115 = "mbs-n050115";
    //临床检查报告记录
    public static final String MENU_CODG_FSI4501 = "FSI-4501";
    //临床检验报告记录
    public static final String MENU_CODG_FSI4502 = "FSI-4502";


    //医保目录限价维护
    public static final String MENU_CODG_N12_01 = "mbs-n12-01";
    //医保目录自付比例维护
    public static final String MENU_CODG_N12_02 = "mbs-n12-02";

    //根据医疗目录对医保目录维护
    public static final String MENU_CODG_N122_01 = "mbs-n122-01";

    //医保目录特殊属性
    public static final String MENU_CODG_N122_02 = "mbs-n122-02";

    //住院人员特殊标识备案新增
    public static final String MENU_CODG_W0001 = "mbs-w0001";
    //居民医疗保险费退费
    public static final String MENU_CODG_MBS_N020413 = "mbs-N020413";
    //居民医疗保险费退费审核
    public static final String MENU_CODG_MBS_N020414 = "mbs-N020414";


    /********************************* STT_MON 统计月份*********************************/
    //一月
    public static final String STT_MON_JAN = "01";
    //二月
    public static final String STT_MON_FEB = "02";
    //三月
    public static final String STT_MON_MAR = "03";
    //四月
    public static final String STT_MON_APR = "04";
    //五月
    public static final String STT_MON_MAY = "05";
    //六月
    public static final String STT_MON_JUNE = "06";
    //七月
    public static final String STT_MON_JULY = "07";
    //八月
    public static final String STT_MON_AUG = "08";
    //九月
    public static final String STT_MON_SEPT = "09";
    //十月
    public static final String STT_MON_OCT = "10";
    //十一月
    public static final String STT_MON_NOV = "11";
    //十二月
    public static final String STT_MON_DEC = "12";
    //一季度
    public static final String STT_MON_Q1 = "13";
    //二季度
    public static final String STT_MON_Q2 = "14";
    //三季度
    public static final String STT_MON_Q3 = "15";
    //四季度
    public static final String STT_MON_Q4 = "16";
    //上半年
    public static final String STT_MON_H1 = "17";
    //下半年
    public static final String STT_MON_H2 = "18";
    //全年
    public static final String STT_MON_YEAR = "19";
    /********************************* ISADD 是否新增*********************************/
    //否，不新增
    public static final String ISADD_0_F = "0";
    //是，需新增
    public static final String ISADD_1_S = "1";
    /********************************* VERIFYFLAG 核验标志*********************************/
    //核验标志 不核验
    public static final String VERIFYFLAG__BHY = "";
    //核验标志 1 核验通过
    public static final String VERIFYFLAG_1_HYTG = "1";
    //核验标志 2 核验不通过
    public static final String VERIFYFLAG_2_HYBTG = "2";
    //核验标志 3 未核验
    public static final String VERIFYFLAG_3_WHY = "3";

    /********************************* UrbmiClctBill 状态*********************************/
    //通知单已到账
    public static final String URBMICLCTBILL_YDZ = "1";
    //通知单未到账
    public static final String URBMICLCTBILL_WDZ = "0";
    /*******************************到账标志****************************************************/
    /**
     * 到账标志-未到账
     */
    public static final String ARVL_TRAF_FLAG_NO = "0";
    /**
     * 到账标志-已到账
     */
    public static final String ARVL_TRAF_FLAG_YES = "1";

    /********************************* FUND_STAS 基金状态*********************************/


    // 未使用
    public static final String FUND_STAS_1 = "1";
    // 已使用
    public static final String FUND_STAS_2 = "2";
    // 退回
    public static final String FUND_STAS_3 = "3";

    /********************************* ISCHECKED 是否需要审核*********************************/
    // 否
    public static final String IS_CHECKED_0 = "0";
    // 是
    public static final String IS_CHECKED_1 = "1";

    /********************************* TRAF_ACCT_FLAG 转移个人账户标志*********************************/

    // 是
    public static final String TRAF_ACCT_FLAG_1 = "1";
    // 否
    public static final String TRAF_ACCT_FLAG_0 = "0";

    /********************************* prcsName 流程定义名称*********************************/

    public static final String PRCS_NAME_RESERVERD_FUND = "预留金管理";

    //扣款服务事项名称
    public static final String PRCS_NAME_DET = "预留金扣款管理";

    public static final String PRCS_NAME_PSNINSU_SAVE = "城乡居民参保";

    /*医疗救助认定*/
    public static final String PRCS_NAME_TEMPMA = "tempMa";
    /*医疗救助公示信息举报*/
    public static final String PRCS_NAME_TEMPMAACSN = "tempMaAcsn";

    /*********************************PRCS_NAME 业务流程名称*********************************/
    /**
     * 人员特殊身份认定定义名
     */
    public static final String PRCS_NAME_PSN_SPIDET = "业务基础人员特殊身份认定流程";
    /**
     * 单位分立流程定义名
     */
    public static final String PRCS_NAME_EMP_SPLIT = "业务基础单位分立流程";
    /**
     * 单位参保登记流程定义名
     */
    public static final String PRCS_NAME_EMP_REG = "单位参保登记";
    /**
     * 单位注销流程定义名
     */
    public static final String PRCS_NAME_EMP_CANC = "业务基础单位注销流程";
    /**
     * 单位合并流程定义名
     */
    public static final String PRCS_NAME_EMP_MERGE = "业务基础单位合并流程";
    /**
     * 单位缴费状态变更流程定义名
     */
    public static final String PRCS_NAME_EMP_CLCTCHG = "empClctStasChg";
    /**
     * 医疗救助报销流程
     */
    public static final String PRCS_NAME_YLJZBX = "医疗救助报销";
    /**
     * 灵活报销流程
     */
    public static final String PRCS_NAME_LHBX = "灵活报销";
    /**
     * 年度内二次报销流程
     */
    public static final String PRCS_NAME_NDNECBX = "年度内二次报销";
    /**
     * 零星二次补差报销流程
     */
    public static final String PRCS_NAME_LXECBCBX = "零星二次补差报销";
    /**
     * 零星二次补差批量报销流程
     */
    public static final String PRCS_NAME_LXECBCPLBX = "零星二次补差批量报销";
    /**
     * 特殊人群奖励金拨付流程
     */
    public static final String PRCS_NAME_TSRQJLJ = "spGrpRwamtReg";
    /**
     * 无审核界面情况
     */
    public static final String PRCS_IS_SPECIAL = "SPECIALNOPAGE";

    /**
     * 流程最后一个节点配置
     */
    public static final String PRCS_IS_LASTNODE = "ISLASTNODE";
    /**
     * 稽核审查扣款定义名
     */
    public static final String PRCS_NAME_AUDIT = "稽核审查扣款流程";
    /**
     * 明细审核扣费定义名
     */
    public static final String PRCS_NAME_SETLCHK = "明细审核扣款流程";

    /**
     * 审核核查，
     */
    public static final String PSN_CHECK_TYPE_SFHC = "sfhc";
    /******************************* WORK_FLOW_TYPE:工作流的操作类型 *******************************/
    //工作流的操作类型：提交工作流
    public static final String WORK_FLOW_TYPE_COMMIT = "commit";
    //工作流的操作类型：开启工作流
    public static final String WORK_FLOW_TYPE_START = "start";

    /******************************* CRT_PRCS_STAS:当前办理状态 *******************************/
    /**
     * 办理中	表示正处理当前环节处理
     */
    public static final String CRT_PRCS_STAS_1 = "1";
    /**
     * //已办结	当前环节处理完成，正常进入下一环节
     */
    public static final String CRT_PRCS_STAS_2 = "2";
    /**
     * //已回退	当前环节处理完成，异常返回前序环节
     */
    public static final String CRT_PRCS_STAS_3 = "3";
    /**
     * //待审批	当前审批环节处理待审批
     */
    public static final String CRT_PRCS_STAS_11 = "11";
    /**
     * //审批通过	当前审批环节处理已审批通过
     */
    public static final String CRT_PRCS_STAS_12 = "12";
    /**
     * //审批不通过	当前审批环节处理审批未通过
     */
    public static final String CRT_PRCS_STAS_13 = "13";
    /**
     * 审批中
     */
    public static final String CRT_PRCS_STAS_14 = "14";

    /******************************* OT_FLAG:超时标志 *******************************/
    //未超时	当前服务事项/环节未超过限定经办时限
    public static final String OT_FLAG_0 = "0";
    //已超时	当前服务事项/环节已超过限定经办时限
    public static final String OT_FLAG_1 = "1";

    /******************************* REC_FLAG:税务接收标志 *******************************/
    /**
     * 未推送
     */
    public static final String REC_FLAG_NOT_PUSH = "0";

    /**
     * 已接收
     */
    public static final String REC_FLAG_SUCCESS = "1";

    /**
     * 未接收
     */
    public static final String REC_FLAG_FAIL = "0";

    /**
     * 拒绝
     */
    public static final String REC_FLAG_REJECT = "2";

    /******************************* ONLN_STAS:入网标志 *******************************/
    /**
     * 入网标志 0 未入网
     */
    public static final String ONLN_STAS_WRW = "0";
    /**
     * 入网标志 1 已入网，正常运行
     */
    public static final String ONLN_STAS_YRWZC = "1";

    /**
     * 入网标志 2 已入网，暂停运行
     */
    public static final String ONLN_STAS_YRWZT = "2";

    /******************************* BIZ_APPY_OBJ_TYPE:业务申请对象类型 *******************************/
    public static final String BIZ_APPY_OBJ_TYPE_1 = "1";   // 单位
    public static final String BIZ_APPY_OBJ_TYPE_2 = "2";   // 个人

    /******************************* MAT_IDET_CODE:救助对象身份代码 *******************************/
    /**
     * 因病致贫救助对象
     */
    public static final String MAT_IDET_CODE_6 = "2306";

    /******************************* MAT_DATA_SOUC:救助对象数据来源 *******************************/
    /**
     * 医保认定
     */
    public static final String MAT_DATA_SOUC_4 = "9";

    /******************************* TEMP_MA_CRTF_TYPE:临时救助认定类型 *******************************/
    /**
     * 单次救助
     */
    public static final String TEMP_MA_CRTF_TYPE_01 = "01";
    /**
     * 长期救助
     */
    public static final String TEMP_MA_CRTF_TYPE_02 = "02";
    /******************************* FNL_TYPE:丧葬类型 *******************************/
    /**
     * 火葬
     */
    public static final String FNL_TYPE_1 = "1";
    /**
     * 火化区土葬
     */
    public static final String FNL_TYPE_2 = "2";
    /**
     * 土葬
     */
    public static final String FNL_TYPE_3 = "3";

    /******************************* TRAT_CLCT_TYPE:人员视同缴费类型 *******************************/

    /**
     * 工龄视同 
     */
    public static final String TRAT_CLCT_TYPE_GL = "10";

    /**
     * 军龄视同 
     */
    public static final String TRAT_CLCT_TYPE_JL = "11";

    /**
     * 转入视同  
     */
    public static final String TRAT_CLCT_TYPE_ZR = "12";

    /**
     * 其他
     */
    public static final String TRAT_CLCT_TYPE_QT = "99";


    /******************************* PSN_TYPE:人员类别 *******************************/

    /**
     * 在职
     */
    public static final String PSN_TYPE_ZZ = "11";
    /**
     * 职工在职
     */
    public static final String PSN_TYPE_ZGZZ = "1101";
    /**
     * 公务员在职
     */
    public static final String PSN_TYPE_GWYZZ = "1102";
    /**
     * 灵活就业人员在职
     */
    public static final String PSN_TYPE_LHJYRYZZ = "1103";
    /**
     * 地方其他扩展人员
     */
    public static final String PSN_TYPE_DFQTKZRY_1160 = "1160";
    /**
     * 退休人员
     */
    public static final String PSN_TYPE_TX = "12";
    /**
     * 职工退休
     */
    public static final String PSN_TYPE_ZGTX = "1201";
    /**
     * 公务员退休
     */
    public static final String PSN_TYPE_GWYTX = "1202";
    /**
     * 灵活就业人员退休
     */
    public static final String PSN_TYPE_LHJYRYTX = "1203";
    /**
     * 地方其他扩展人员
     */
    public static final String PSN_TYPE_DFQTKZRY_1260 = "1260";
    /**
     * 离休
     */
    public static final String PSN_TYPE_LX = "13";
    /**
     * 离休人员
     */
    public static final String PSN_TYPE_LXRY = "1300";
    /**
     * 地方其他扩展人员
     */
    public static final String PSN_TYPE_DFQTKZRY_1360 = "1360";
    /**
     * 居民（未成年）
     */
    public static final String PSN_TYPE_JM_WCN = "14";
    /**
     * 新生儿
     */
    public static final String PSN_TYPE_XSR = "1401";
    /**
     * 学龄前儿童
     */
    public static final String PSN_TYPE_XQET = "1402";
    /**
     * 中小学生
     */
    public static final String PSN_TYPE_ZXXS = "1403";
    /**
     * 大学生
     */
    public static final String PSN_TYPE_DXS = "1404";
    /**
     * 未成年（未入学）
     */
    public static final String PSN_TYPE_WCN_WRX = "1405";
    /**
     * 居民（成年）
     */
    public static final String PSN_TYPE_JM_CN = "15";
    /**
     * 普通居民（成年）
     */
    public static final String PSN_TYPE_PTJM_CN = "1501";
    /**
     * 地方其他扩展身份
     */
    public static final String PSN_TYPE_DFQTKZSF = "1560";
    /**
     * 居民（老年）
     */
    public static final String PSN_TYPE_JM_LN = "16";

    /**
     * 地震截瘫（市属离休）
     */
    public static final String PSN_TYPE_DZJT_SHIS = "136004";

    /**
     * 离休省属有级别
     */
    public static final String PSN_TYPE_LXSSYJB_SHENGS = "136005";

    /**
     * 离休省属无级别
     */
    public static final String PSN_TYPE_LXSSWJB_SHENGS = "136006";
    /**
     * 离休市属有级别
     */
    public static final String PSN_TYPE_LXSSYJB_SHIS = "136007";
    /**
     * 离休市属无级别
     */
    public static final String PSN_TYPE_LXSSWJB_SHIS = "136008";

    /**
     * 市直离休
     */
    public static final String PSN_TYPE_SZLX_SHIS = "136009";


    /**
     * 建国前老工人(市属离休)
     */
    public static final String PSN_TYPE_JGQLGR_SHIS = "136010";

    /**
     * 二等乙(市属离休)
     */
    public static final String PSN_TYPE_EDY_SHIS = "136011";

    public static final String[] SHENG_SHU_LX = {PSN_TYPE_LXSSYJB_SHENGS,PSN_TYPE_LXSSWJB_SHENGS};
    public static final String[] SHI_SHU_LX = {PSN_TYPE_DZJT_SHIS,PSN_TYPE_LXSSYJB_SHIS,PSN_TYPE_LXSSWJB_SHIS,PSN_TYPE_SZLX_SHIS,PSN_TYPE_JGQLGR_SHIS,PSN_TYPE_EDY_SHIS};
    /******************************* RepayFlag:是否需要办理补收 *******************************/
    // 是
    public static final String REPAYFLAG_1 = "1";
    // 否
    public static final String REPAYFLAG_0 = "0";

    /******************************* RLOC_TYPE:异地安置类别 *******************************/

    /******************************* ASOCLEGENTFLAG:是否关联法人 *******************************/
    // 是
    public static final String ASOCLEGENTFLAG_1 = "1";
    // 否
    public static final String ASOCLEGENTFLAG_0 = "0";

    /******************************* RLOC_TYPE:异地安置类别 *******************************/
    /**
     * 非异地安置
     */
    public static final String RLOC_TYPE_1 = "1";
    /**
     * 省内异地安置
     */
    public static final String RLOC_TYPE_2 = "2";
    /**
     * 省外异地安置
     */
    public static final String RLOC_TYPE_3 = "3";

    /******************************* 灵活就业单位集合 *******************************/

    public static final String LHJYDW = BusinessConst.EMP_MGT_TYPE_02_LHJYXNDW + "," + BusinessConst.EMP_MGT_TYPE_03_LHJYXNDW + BusinessConst.EMP_MGT_TYPE_05_LHJYXNDW;

    /*********************************** 医疗类别分类 ***********************************/
    /**
     * 门诊
     */
    public static final String MED_TYPE_SORT_1 = "1";

    /**
     * 住院
     */
    public static final String MED_TYPE_SORT_2 = "2";

    /**
     * 药店
     */
    public static final String MED_TYPE_SORT_3 = "3";

    /**
     * 医疗类别 门诊挂号
     */
    public static final String MED_TYPE_12 = "12";
    /**
     * 医疗类别 急诊
     */
    public static final String MED_TYPE_13 = "13";
    /**
     * 医疗类别 普通住院
     */
    public static final String MED_TYPE_21 = "21";
    /**
     * 医疗类别 外伤住院
     */
    public static final String MED_TYPE_22 = "22";

    /**
     * 转外诊治住院
     */
    public static final String MED_TYPE_23 = "23";

    /**
     * 急诊转住院
     */
    public static final String MED_TYPE_24 = "24";

    /**
     * 双通道处方流转
     */
    public static final String MED_TYPE_9216 = "9216";
    /**
     * 公务员体检
     */
    public static final String MED_TYPE_9107 = "9107";

    /**
     * 普通门诊救助
     */
    public static final String MED_TYPE_9118 = "9118";
    /**
     * 门诊慢特病救助
     */
    public static final String MED_TYPE_9119 = "9119";

    /**
     * 住院救助
     */
    public static final String MED_TYPE_9218 = "9218";
    /**
     * 重特大疾病救助
     */
    public static final String MED_TYPE_9219 = "9219";
    /*********************************** 基金支付类型 ***********************************/
    /**
     * 城镇职工基本医疗保险统筹基金
     */
    public static final String FUND_PAY_TYPE_310100_CZZGJBYLBXTCJJ = "310100";
    /**
     * 城镇职工基本医疗保险个人账户基金
     */
    public static final String FUND_PAY_TYPE_310200_CZZGJBYLBXGRZHJJ = "310200";
    /**
     * 公务员医疗补助基金
     */
    public static final String FUND_PAY_TYPE_320100_GWYYLBZJJ = "320100";
    /**
     * 大额医疗费用补助基金
     */
    public static final String FUND_PAY_TYPE_330100_DEYLFYBZJJ = "330100";
    /**
     * 离休人员医疗保障基金
     */
    public static final String FUND_PAY_TYPE_340100_LXRYYLBZJJ = "340100";
    /**
     * 一至六级残疾军人医疗补助基金
     */
    public static final String FUND_PAY_TYPE_350100_YZLJCJJRYLBZJJ = "350100";
    /**
     * 企业补充医疗保险基金
     */
    public static final String FUND_PAY_TYPE_370100_QYBCYLBXJJ = "370100";
    /**
     * 城乡居民基本医疗保险基金
     */
    public static final String FUND_PAY_TYPE_390100_CXJMJBYLBXJJ = "390100";
    /**
     * 医疗救助基金
     */
    public static final String FUND_PAY_TYPE_610100_YLJZJJ = "610100";
    /**
     * 城乡居民大病医疗保险基金
     */
    public static final String FUND_PAY_TYPE_390200_CXJMDBYLBXJJ = "390200";
    /**
     * 居民基本医疗保险个人账户基金
     */
    public static final String FUND_PAY_TYPE_99999739_CXJMJBGRZH = "99999739";
    /**
     * 公务员补助账户支付(业财使用)
     */
    public static final String FUND_PAY_TYPE_99999702_GWYBZZHZF = "99999702";
    /**
     * 离休医疗保险账户支付
     */
    public static final String FUND_PAY_TYPE_99999703_LXYLBXZHZF= "99999703";
    /**
     * 企业补充账户1支出  4%
     */
    public static final String FUND_PAY_TYPE_99999704_QYBC = "99999704";
    /**
     * 企业补充账户4支出  10%
     */
    public static final String FUND_PAY_TYPE_99999705_QYBC = "99999705";

    /**
     * 公务员补助账户支付(国家赋码-基金分项使用)
     */
    public static final String FUND_PAY_TYPE_99999750_GWYBZZHZF = "99999750";

    /**
     * 其他个人账户基金支付(暂时自定，等待国家赋码)
     */
    public static final String FUND_PAY_TYPE_99999790_QTGRZHJJZF = "99999790";

    /*********************************** 统筹区基金支付类型 ***********************************/

    /**
     * 城镇职工基本医疗保险统筹基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_310101_CZZGJBYLBXTCJJ = "310101";
    /**
     * 城镇职工基本医疗保险个人账户基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_310201_CZZGJBYLBXGRZHJJ = "310201";
    /**
     * 公务员医疗补助基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_320101_GWYYLBZJJ = "320101";
    /**
     * 大额医疗费用补助基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_330101_DEYLFYBZJJ = "330101";
    /**
     * 离休人员医疗保障基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_340101_LXRYYLBZJJ = "340101";
    /**
     * 一至六级残疾军人医疗补助基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_350101_YZLJCJJRYLBZJJ = "350101";
    /**
     * 企业补充医疗保险基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_370101_QYBCYLBXJJ = "370101";
    /**
     * 城乡居民基本医疗保险基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_390101_CXJMJBYLBXJJ = "390101";
    /**
     * 医疗救助基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_610101_YLJZJJ = "610101";
    /**
     * 城乡居民大病医疗保险基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_390201_CXJMDBYLBXJJ = "390201";
    /**
     * 个人支出部分（个人账户+现金支出）
     */
    public static final String POOLAREA_FUND_PAY_TYPE_999999_GRZCBF = "999999";
    /**
     * 现金支出
     */
    public static final String POOLAREA_FUND_PAY_TYPE_999998_XJZC = "999998";
    /**
     * 医院垫付
     */
    public static final String POOLAREA_FUND_PAY_TYPE_999996_YYDF = "999996";

    /**
     * 生育基金
     */
    public static final String POOLAREA_FUND_PAY_TYPE_510101_SYJJ = "510101";

    /**
     * 公务员补助账户支付(国家赋码-基金分项使用)
     */
    public static final String POOLAREA_FUND_PAY_TYPE_99999754_GWYBZZHZF = "99999754";

    /**
     * 其他个人账户基金支付
     */
    public static final String POOLAREA_FUND_PAY_TYPE_99999799_QTGRZHJJZF = "99999799";

    /*********************************** 是否允许超支 ***********************************/
    /**
     * 允许超支
     */
    public static final String OVER_FLAG_Y = "1";
    /**
     * 不允许超支
     */
    public static final String OVER_FLAG_N = "0";

    /*********************************** 医保区划范围 ***********************************/
    /**
     * 区县
     */
    public static final String INSU_OPTINS_SCP_QX = "1";
    /**
     * 地市
     */
    public static final String INSU_OPTINS_SCP_DS = "2";

    /*********************************** 清退公共调用标志 ***********************************/
    /**
     * 公共调用
     */
    public static final String CLEAR_COMM_FLAG_1 = "1";
    /**
     * 其他地方调用
     */
    public static final String CLEAR_COMM_FLAG_2 = "2";
    /********************************** 定额征缴标识 begin ********************************/
    /**
     * 定额
     */
    public static final String QUOT_CLCT_FLAG_DE_1 = "1";

    /**
     * 非定额
     */
    public static final String QUOT_CLCT_FLAG_FDE_0 = "0";


    /********************************** 定额征缴标识 end ********************************/
    /********************************** 当年历年标识 begin ********************************/
    /**
     * 当年:1
     */
    public static final String YEAR_MARK_1 = "1";

    /**
     * 历年：0
     */
    public static final String YEAR_MARK_0 = "0";


    /********************************** 当年历年标识 end ********************************/
    /********************************** 申报周期 begin ********************************/
    /**
     * 月
     */
    public static final String DCLA_PRD_Y = "1";

    /**
     * 年
     */
    public static final String DCLA_PRD_N = "2";

    /**
     * 季度
     */
    public static final String DCLA_PRD_J = "3";


    /********************************** 定额征缴标识 end ********************************/


    /*********************************** 经办渠道OPT_CHNL ***********************************/
    /**
     * 企业网厅
     */
    public static final String OPT_CHNL_QYWT = "1";
    /**
     * 个人网厅
     */
    public static final String OPT_CHNL_GRWT = "2";
    /**
     * 柜台经办
     */
    public static final String OPT_CHNL_GTJB = "3";
    /**
     * 柜台经办
     */
    public static final String OPT_CHNL_SJAPP = "4";
    /**
     * 手机APP
     */
    public static final String OPT_CHNL_WX = "5";
    /**
     * 微信
     */
    public static final String OPT_CHNL_ZZZD = "6";
    /**
     * 其他
     */
    public static final String OPT_CHNL_QT = "7";
    public static final String OPT_CHNL_QT_TAX = "702";
    /**
     * 基层网厅
     */
    public static final String OPT_CHNL_JCWT = "8";
    /*********************************** 补缴标志 ***********************************/
    /**
     * 不补缴
     */
    public static final String SUB_PAYNT_FLAG_NO = "0";
    /**
     * 提示补缴
     */
    public static final String SUB_PAYNT_FLAG_PRM = "1";
    /**
     * 强制补缴
     */
    public static final String SUB_PAYNT_FLAG_FORCE = "2";

    /******************************** 事务一致性处理常量 *********************************/
    /**
     * 事务不完整时，缓存参数的KEY
     */
    public static final String TX_FAIL_PARAMS_KEY = "TXFAILPARAMS";
    /**
     * 同一笔业务重试次数计数KEY
     */
    public static final String FAIL_RETRY_TIMES_KEY = "FAILRETRYTIMES";
    /**
     * 死海地址
     */
    public static final String DEATH_TASK_POOL_KEY = "DEATHTASKPOOL";
    /**
     * 处理未完成事务的MQ的topic TODO 暂时借用账户结转的TOPIC
     */
    public static final String TX_FAIL_TOPIC_ID = "mbs_mq_str_kafka";

    public static final String TOPIC_MQ_MBS_ACCT_DEV_DTO = "mbs_mq_dto_kafka";

    /**
     * 处理未完成事务的方法名
     */
    public static final String CONFIRMTXMETHOD = "confirmTx";


    /*************************************** 利率类型begin *******************************************/
    /**
     * 本年利率
     */
    public static final String INTRATE_TYPE_BNLV_1 = "1";
    /**
     * 上年利率
     */
    public static final String INTRATE_TYPE_SNLV_2 = "2";
    /**
     * 历年利率
     */
    public static final String INTRATE_TYPE_LNLV_3 = "3";

    /***************************************  管理事件类型begin *******************************************/
    /**
     * 管理事件类型--单位
     */
    public static final String MGTYPE_DW_1 = "1";
    /**
     * 管理事件类型--人员
     */
    public static final String MGTYPE_RY_2 = "2";
    /**
     * 管理事件类型--工资
     */
    public static final String MGTYPE_GZ_3 = "3";
    /**
     * 管理事件类型--转移
     */
    public static final String MGTYPE_ZY_4 = "4";
    /**
     * 管理事件类型--核定
     */
    public static final String MGTYPE_HD_5 = "5";
    /**
     * 管理事件类型--征集
     */
    public static final String MGTYPE_ZJ_6 = "6";
    /**
     * 管理事件类型--个人账户
     */
    public static final String MGTYPE_GRZH_7 = "7";

    /*****************************业务申请类型***************************/

    /**
     * 业务申请类型--门慢门特登记
     */
    public static final String BIZ_APPY_TYPE_01_MMMTDJ = "01";
    /**
     * 业务申请类型--意外伤害登记
     */
    public static final String BIZ_APPY_TYPE_02_YWSHDJ = "02";
    /**
     * 业务申请类型--就医定点医疗机构登记
     */
    public static final String BIZ_APPY_TYPE_03_JYDDYLJGDJ = "03";
    /**
     * 业务申请类型--家庭病床登记
     */
    public static final String BIZ_APPY_TYPE_04_JTBCDJ = "04";
    /**
     * 业务申请类型--家庭医生签约登记
     */
    public static final String BIZ_APPY_TYPE_05_JTYSQYDJ = "05";
    /**
     * 业务申请类型--转诊转院登记
     */
    public static final String BIZ_APPY_TYPE_06_ZZZYDJ = "06";
    /**
     * 业务申请类型--异地急诊住院登记
     */
    public static final String BIZ_APPY_TYPE_07_YDJZZYDJ = "07";
    /**
     * 业务申请类型--异地安置登记
     */
    public static final String BIZ_APPY_TYPE_08_YDAZDJ = "08";
    /**
     * 业务申请类型--特检特治登记
     */
    public static final String BIZ_APPY_TYPE_09_TJTZDJ = "09";
    /**
     * 业务申请类型--特殊药品登记
     */
    public static final String BIZ_APPY_TYPE_10_TSYPDJ = "10";
    /**
     * 业务申请类型--长期带药登记
     */
    public static final String BIZ_APPY_TYPE_11_CQDYDJ = "11";
    /**
     * 业务申请类型--代购药品登记
     */
    public static final String BIZ_APPY_TYPE_12_DGYPDJ = "12";
    /**
     * 业务申请类型--生育备案登记
     */
    public static final String BIZ_APPY_TYPE_13_SYBADJ = "13";
    /**
     * 业务申请类型--账户备案登记
     */
    public static final String BIZ_APPY_TYPE_14_ZHBADJ = "14";
    /**
     * 业务申请类型--临时医疗救助人员资格认定
     */
    public static final String BIZ_APPY_TYPE_15_LSYLJZRYZGRD = "15";
    /**
     * 业务申请类型--年度救助备案登记
     */
    public static final String BIZ_APPY_TYPE_16_NDJZBADJ = "16";
    /**
     * 业务申请类型--按病种结算登记
     */
    public static final String BIZ_APPY_TYPE_17_ABZJSDJ = "17";
    /**
     * 业务申请类型--无医保凭证结算备案登记
     */
    public static final String BIZ_APPY_TYPE_18_WYBPZJSBADJ = "18";
    /**
     * 业务申请类型--退费备案登记
     */
    public static final String BIZ_APPY_TYPE_19_TFBADJ = "19";
    /**
     * 业务申请类型--外检外购登记
     */
    public static final String BIZ_APPY_TYPE_20_WJWGDJ = "20";

    /**
     * 业务申请类型--人员长期护理登记
     */
    public static final String BIZ_APPY_TYPE_21 = "21";
    /**
     * 业务申请类型--其他
     */
    public static final String BIZ_APPY_TYPE_99_QT = "99";

    /**
     * 业务申请类型--门诊统筹备案
     */
    public static final String BIZ_APPY_TYPE_9916 = "9916";
    /**
     * 前端控制配置 灵活单位
     */
    public static final String VIEW_CONFIG_XN = "0";
    /**
     * 前端控制配置 普通单位
     */
    public static final String VIEW_CONFIG_PT = "1";
    /**
     * 是否调用决策树标志 否
     */
    public static final String RULE_FLAG_0_N = "0";
    /**
     * 是否调用决策树标志 是
     */
    public static final String RULE_FLAG_1_Y = "1";

    /*****************************回退类型***************************/
    /**
     * 1:审核到未复核
     */
    public static final String RCHKTYPE_1_FH2WFH = "1";
    /**
     * 2：未复核到已回退
     */
    public static final String RCHKTYPE_2_WFH2YHT = "2";
    /**
     * 3：审核到已回退
     */
    public static final String RCHKTYPE_3_FH2YHT = "3";
    /**
     * 4：未复核到未复核
     */
    public static final String RCHKTYPE_4_WFH2WFH = "4";

    /*****************************清退原因***************************/
    /**
     * 死亡
     */
    public static final String RETT_REA_01_SW = "01";
    /**
     * 出国定居
     */
    public static final String RETT_REA_02_CGDJ = "02";
    /**
     * 港澳台定居
     */
    public static final String RETT_REA_03_GATDJ = "03";
    /**
     * 人员转出统筹范围外
     */
    public static final String RETT_REA_04_RYZCTCQFWW = "04";
    /**
     * 退保
     */
    public static final String RETT_REA_05_TB = "05";
    /**
     * 离境
     */
    public static final String RETT_REA_06_LJ = "06";
    /**
     * 职工转城居保险
     */
    public static final String RETT_REA_07_ZGZCJBX = "07";
    /**
     * 人员失踪
     */
    public static final String RETT_REA_08_RYSZ = "08";
    /**
     * 其他原因
     */
    public static final String RETT_REA_99_QTYY = "99";

    /**
     * 版本号
     */
    public static final String VERSION_01 = "01";

    /**
     * 行政区划级联数据缓存key
     */
    public static final String LOC_ADMDVS_CACHE_KEY = "CASCADE_LOC_ADMDVS";
    /**
     * 医保区划级联数据缓存key
     */
    public static final String INSU_ADMDVS_CACHE_KEY = "CASCADE_INSU_ADMDVS";
    /**
     * 医保区划无级联数据缓存key
     */
    public static final String INSU_ADMDVS_ALL_CACHE_KEY = "ALL_INSU_ADMDVS";
    /**
     * 字典扩展自定义码表 缓存key
     */
    public static final String EXT_DATA_DIC_A_CACHE_KEY = "EXT_DATA_DIC_A_LIST";


    public static final String SP_DRUG_REG = "10";
    public static final String LONG_DRUG_REG = "11";
    public static final String PRX_DRUG_REG = "12";
    public static final String MAT_REG = "13";
    public static final String ETI_BUY_REG = "20";
    public static final String REG_OTHE = "99";


    /*****************异地备案类型******************/
    /**
     * 异地安置
     */
    public static final String OUT_FIL_TYPE_02_YDAZ = "02";
    /**
     * 转外就医
     */
    public static final String OUT_FIL_TYPE_06_ZWJY = "06";
    /**
     * 异地长期居住人员
     */
    public static final String OUT_FIL_TYPE_07_YDCQJZRY = "07";
    /**
     * 常驻异地工作人员
     */
    public static final String OUT_FIL_TYPE_08_CZYDGZRY = "08";

    /** 异地安置退休人员 **/
    public static final String OUT_FIL_TYPE_02 = "02";

    /** 常驻异地工作人员 **/
    public static final String OUT_FIL_TYPE_08 = "08";

    /** 异地长期居住人员 **/
    public static final String OUT_FIL_TYPE_07 = "07";

    /** 跨省异地长期居住人员 */
    public static final String OUT_FIL_TYPE_09 = "09";

    /** 跨省临时外出就医人员 */
    public static final String OUT_FIL_TYPE_10 = "10";

    /** 异地转诊人员 **/
    public static final String OUT_FIL_TYPE_06 = "06";

    /** 其他跨省临时外出就医人员 **/
    public static final String OUT_FIL_TYPE_11 = "11";

    /**
     * 暂停类别
     */
    public static final String PAUS_TYPE_1 = "1"; // 暂停账户
    public static final String PAUS_TYPE_2 = "2"; // 暂停统筹
    public static final String PAUS_TYPE_3 = "3"; // 暂停全部

    //服务事项事件名称
    public static final String BIZ_EVT_NAME_DJ = "预留金管理登记事件";

    //服务事项事件名称
    public static final String BIZ_EVT_NAME_SH = "预留金管理审核事件";

    //服务事项环节名称
    public static final String BIZ_NODE_NAME_DJ = "预留金管理登记环节";

    //打印次数
    public static int PRINT_TIMES = 1;

    //服务事项环节/事件序号
    public static final int NODE_EVT_SEQ_1 = 1;

    //服务事项环节/事件序号
    public static final int NODE_EVT_SEQ_2 = 2;

    //查询标志（查询有无单据号的标志）
    public static final String IS_NOT_EXSIT_DOCNOBZ_0 = "0";

    //查询标志（查询有无单据号的标志）
    public static final String IS_NOT_EXSIT_DOCNOBZ_1 = "1";

    //主诊断标志
    public static final String MAINDIAG_FLAG = "1";

    //扣款方式
    public static final String DET_WAY_1 = "1";

    //扣款方式
    public static final String DET_WAY_3 = "3";
    //扣款方式
    public static final String DET_WAY_6 = "6";

    //扣款模式
    public static final String DET_MODE_3 = "3";

    //扣款模式
    public static final String DET_MODE_2 = "2";

    //扣款顺序
    public static final int DET_SEQ = 1;

    //服务事项环节编号
    public static String SERV_MATT_EVT_NO = "mbs-n07020201";

    //服务事项环节编号
    public static String SERV_MATT_EVT_NAME = "定点医药机构结算受理";

    //服务事项名称
    public static String MEDINS_MON_SET_NAME = "定点医药机构结算";

    //服务事项环节编号
    public static String MEDINS_MON_SET_NODE_NO = "mbs-n070201";

    //服务事项环节名称
    public static String MEDINS_MON_SET_NODE_NAME = "定点医药机构结算申请";

    //流程名称
    public static String MEDINS_MON_SET_PRCS_NAME = "定点医药机构结算";

    //服务事项环节编号
    public static String MEDINS_MON_SET_EVT_NO = "mbs-n07020101";

    //服务事项环节编号
    public static String MEDINS_MON_SET_EVT_NAME = "定点医药机构结算申报";

    //服务事项事件编号
    public static String MON_SETTLEMENT_EVT_NO = "mbs-n07020301";

    //服务事项事件名称
    public static String MON_SETTLEMENT_EVT_NAME = "定点医药机构结算审核结算";

    /**
     * 是否需要审核标志 否
     */
    public static String WHETHER_CHKFLAG_N = "N";

    /**
     * 是否需要审核标志 是
     */
    public static String WHETHER_CHKFLAG_Y = "Y";

    /*************************************** BIZ_PAY_TYPE:下账业务类型 *******************************/

    /**
     * 灵活报销业务
     */
    public static final String BIZ_PAY_TYPE_LHBX = "lhbx";
    /**
     * 零星二次报销业务
     */
    public static final String BIZ_PAY_TYPE_LXECBX = "psn_sec_setl";


    /*********************************** 不同字段类型赋值空 ***********************************/
    public static final String FIELD_TYPE_STRING_NULL = null;

    public static final BigDecimal FIELD_TYPE_BIGDECIMAL_NULL = null;

    public static final Date FIELD_TYPE_DATE_NULL = null;

    public static final Integer FIELD_TYPE_INTEGER_NULL = null;


    public static final List FIELD_TYPE_LIST_NULL = null;

    public static final OutputStream OUTPUT_STREAM_NULL = null;

    public static final InputStream INPUT_STREAM_NULL = null;

    public static final HSSFRichTextString HSSF_RICH_TEXT_STRING_NULL = null;


    /*************************************** TRT_PSN_MERG_DSPO_TYPE:待遇人员合并处理类型 *******************************/
    public static final String PSN_MERG_DSPO_TYPE_GX = "1";
    /**
     * 更新
     **/

    public static final String PSN_MERG_DSPO_TYPE_LJ = "2";  /** 累计 **/


    /******************************************************************************************/
    /* *************************************** 用用事件表相关 BEGIN ******************************************************* */
    // CRT_PROS_STAS  服务事项实例字段： 当前办理状态
    public static final String CRT_PRCS_STAS_INPROCESS = "01";//办理中
    public static final String CRT_PRCS_STAS_DONE = "02";//已办结
    public static final String CRT_PRCS_STAS_CANCEL = "03";//已回退
    public static final String CRT_PRCS_STAS_TOBE_APPROVED = "11";//待审批
    public static final String CRT_PRCS_STAS_APPROVED = "12";//审批通过
    public static final String CRT_PRCS_STAS_NOT_APPROVED = "13";//审批不通过

    // OT_FLAG 服务事项实例字段： 超时标志
    public static final String OT_FLAG_NO = "0";//未超时
    public static final String OT_FLAG_YES = "1";//超时

    //服务事项环节实例ID 缓存key后缀，：用于生成顺序号，同一秒内生成的前缀作为key
    public static final String SERVMATTID_KEY_SUFFIX = "_SERVMATT_MBS";
    public static final String NODEINSTID_KEY_SUFFIX = "_NODE_MBS";
    public static final String EVTINSTID_KEY_SUFFIX = "_EVT_MBS";

    public static final String REGISTER_RCHK_FLAG_TOBE_APPROVED = "0";//待审批
    public static final String REGISTER_RCHK_FLAG_APPROVED = "1";//审批通过
    public static final String REGISTER_RCHK_FLAG_NOT_APPROVED = "2";//审批不通过



    /* *************************************** 用用事件表相关 END ******************************************************* */


    /* *************************************** 门慢门特开展信息常量 START ******************************************************* */
    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_OPSP_DISE = "mbs-n050501";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_OPSP_DISE = "门慢门特病种开展信息登记";

    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_OPSP_DISE_INTERRUPT = "mbs-n050505";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_OPSP_DISE_INTERRUPT = "门慢门特病种开展信息停用2";

    //服务事项环节/事件序号
    public static final int OPSP_NODE_EVT_SEQ_1 = 1;

    //服务事项环节/事件序号
    public static final int OPSP_NODE_EVT_SEQ_2 = 2;

    //服务事项事件名称
    public static final String BIZ_EVT_NAME_TY = "门慢门特信息开展信息停用事件";

    //服务事项事件名称
    public static final String OPSP_BIZ_EVT_NAME_SH = "门慢门特信息开展信息停用审核事件";

    //服务事项环节名称
    public static final String BIZ_NODE_NAME_TY = "门慢门特信息开展信息停用环节";


    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_OPSP_DISE_CHANGE = "mbs-n050503";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_OPSP_DISE_CHANGE = "门慢门特信息开展信息变更管理";


    //服务事项事件名称
    public static final String BIZ_EVT_NAME_BG = "门慢门特信息开展信息变更事件";

    //服务事项事件名称
    public static final String BIZ_EVT_NAME_BGSH = "门慢门特信息开展信息变更审核事件";

    //服务事项环节名称
    public static final String BIZ_NODE_NAME_BG = "门慢门特信息开展信息变更环节";


    /* *************************************** 门慢门特开展信息常量 END ******************************************************* */

    /* *************************************** 个人特殊待遇状态常量 start ******************************************************* */

    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_PSN_SP_TRT_STAS = "mbs-n040226";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_PSN_SP_TRT_STAS = "人员特殊待遇状态登记";

    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_PSN_SP_TRT_STAS_CHK = "mbs-n040226";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_PSN_SP_TRT_STAS_CHK = "人员特殊待遇状态审核";

    //服务事项环节/事件序号
    public static final int PSN_SP_TRT_STAS_NODE_EVT_SEQ_1 = 1;

    //服务事项环节/事件序号
    public static final int PSN_SP_TRT_STAS_NODE_EVT_SEQ_2 = 2;




    /* *************************************** 个人特殊待遇状态常量 END ******************************************************* */


    /* *************************************** 人员长期护理登记常量 start ******************************************************* */


    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_LONG_TERM = "mbs-n040222";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_LONG_TERM = "人员长期护理登记管理";


    //服务事项事件名称
    public static final String LONG_TERM_BIZ_EVT_NAME_DG = "人员长期护理登记事件";

    //服务事项事件名称
    public static final String LONG_TERM_BIZ_EVT_NAME_DGSH = "人员长期护理登记审核事件";

    //服务事项环节名称
    public static final String LONG_TERM_BIZ_NODE_NAME_DG = "人员长期护理登记环节";

    //环节编号
    public static final int LONG_TERM_NODE_EVT_SEQ_1 = 1;

    public static final int LONG_TERM_NODE_EVT_SEQ_2 = 2;

    /* *************************************** 人员长期护理登记常量 END ******************************************************* */

    /* *************************************** 特殊病种维护常量 start ******************************************************* */

    /**
     * 服务事项编码：菜单编码
     */
    public static final String BIZ_EVT_TYPE_SP_DISE_MNT = "mbs-n120601";
    /**
     * 服务事项名称
     */
    public static final String SERV_MATT_NAME_SP_DISE_MNT = "MBS_spDiseMnt";


    //服务事项事件名称
    public static final String SP_DISE_MNT_BIZ_EVT_NAME_DG = "特殊病种维护事件";

    //服务事项事件名称
    public static final String SP_DISE_MNT_BIZ_EVT_NAME_DGSH = "特殊病种维护审核事件";

    //服务事项环节名称
    public static final String SP_DISE_MNT_BIZ_NODE_NAME_DG = "特殊病种维护环节";

    //环节编号
    public static final int SP_DISE_MNT_NODE_EVT_SEQ_1 = 1;

    public static final int SP_DISE_MNT_NODE_EVT_SEQ_2 = 2;

    /* *************************************** 特殊病种维护常量 END ******************************************************* */

    /****************异地联网开通类型*********************/
    /*非异地定点*/
    public static String OUT_ONLN_OPEN_TYPE_NO = "01";
    /*省内异地定点*/
    public static String OUT_ONLN_OPEN_TYPE_SN = "02";
    /*国家异地定点*/
    public static String OUT_ONLN_OPEN_TYPE_GJ = "03";

    /****************定点协议管理事件类型*********************/
    /*属性管理*/
    public static String ATTR_BIZ_EVT_TYPE = "fixmedinsAttrCheck01";
    /*属性暂停*/
    public static String ATTR_BIZ_EVT_TYPE_PAUSE = "pauseFixMedins01";
    public static String ATTR_BIZ_EVT_SERV_PAUSE = "pauseFixMedinsServ01";
    /*银行账户*/
    public static String BANK_BIZ_EVT_TYPE = "fixmedinsBankCheck01";
    /*协议管理*/
    public static String CNTR_BIZ_EVT_TYPE = "fixmedinsCntrCheck01";
    /*科室管理*/
    public static String DEPT_BIZ_EVT_TYPE = "deptMgtCheck01";
    /*科室暂停*/
    public static String DEPT_BIZ_EVT_TYPE_PAUSE = "pauseDeptMgtCheck01";
    public static String DEPT_BIZ_EVT_TYPE_EXPI = "expiDeptMgtCheck01";
    /*医师管理*/
    public static String PRAC_BIZ_EVT_TYPE = "pracPsnCheck01";
    /*医师暂停*/
    public static String PRAC_BIZ_EVT_TYPE_PAUSE = "pausePracPsnCheck01";
    public static String PRAC_BIZ_EVT_TYPE_EXPI = "expiPracPsnCheck01";
    /*服务管理*/
    public static String SERV_BIZ_EVT_TYPE = "fixmedinsServCheck01";
    /*病种管理*/
    public static String DISE_BIZ_EVT_TYPE = "fixmedinsDiseCheck01";
    /*目录匹配管理*/
    public static String LIST_BIZ_EVT_TYPE = "medinsListMapCheck01";
    /*退费备案登记管理*/
    public static String REG_BIZ_EVT_TYPE = "refdRegCheck01";

    /************************************************医院统计报表菜单*******************************************/

    //门诊收费日报
    public static final String HOS_REPORT_W56 = "W56";
    //住院收费日报
    public static final String HOS_REPORT_W57 = "W57";
    //医院收入日报
    public static final String HOS_REPORT_W58 = "W58";
    //医院总收入报表
    public static final String HOS_REPORT_W59 = "W59";
    //医院扣款分析报表
    public static final String HOS_REPORT_W60 = "W60";

    /**
     * 8 删除
     */
    public static final String EVT_TYPE_SC = "08";

    /**
     * 中等偏下
     */
    public static final int PAGE_SIZE_MEDIUM_DOWN = 30;

    /************************************************税务交互*******************************************/
    /**
     * 新增
     */
    public static final String DATA_TRAM_TYPE_ADD = "1";
    /**
     * 变更
     */
    public static final String DATA_TRAM_TYPE_MODIFY = "2";
    /**
     * 终止
     */
    public static final String DATA_TRAM_TYPE_TERMINAL = "3";
    /**
     * 差异反馈
     */
    public static final String DATA_TRAM_TYPE_DIFFFCK = "4";
    /**
     * 撤销
     */
    public static final String DATA_TRAM_TYPE_RESET = "5";
    /**
     * 空
     */
    public static final String DATA_TRAM_TYPE_EMPTY = "0";

    /************************************************税务交互*******************************************/

    /**
     * 定点医药机构对账标志 未对账
     */
    public static final String MEDINS_STMT_FLAG_0 = "0";

    /**
     * 定点医药机构对账标志 对账成功
     */
    public static final String MEDINS_STMT_FLAG_1 = "1";

    /****************************************获取全局唯一序列BEGIN**********************************************/
    /**
     * 唯一记录号:长期护理保险审核过程(通用表)
     */
    public static final String LTCI_CHK_PROC_EVT_RID = "ltciChkProcEvtRid";
    /**
     * 唯一记录号:长期护理保险失能评估标准(业务表)
     */
    public static final String LTCI_DSABASMT_STD_RID = "ltciDsabasmtStdRid";

    /**
     * 唯一记录号:长期护理保险失能评估标准(事件表)
     */
    public static final String LTCI_DSABASMT_STD_EVT_RID = "ltciDsabasmtStdEvtRid";

    /**
     * 唯一记录号:长期护理保险失能评估标准版本号(事件表)
     */
    public static final String LTCI_DSABASMT_STD_EVT_VER = "ltciDsabasmtStdEvtVer";

    /**
     * 唯一记录号:长期护理保险失能评估标准选项(业务表)
     */
    public static final String LTCI_DSABASMT_OPT_RID = "ltciDsabasmtStdRid";

    /**
     * 唯一记录号:长期护理保险失能评估标准选项（事件表）
     */
    public static final String LTCI_DSABASMT_OPT_EVT_RID = "ltciDsabasmtOptEvtRid";

    /**
     * 唯一记录号:长期护理保险失能评估标准选项版本号(事件表)
     */
    public static final String LTCI_DSABASMT_OPT_EVT_VER = "ltciDsabasmtOptEvtVer";

    /****************************************获取全局唯一序列END**********************************************/

    /************************************************ 工作流相关 *******************************************/
    /**
     * 正在进行
     */
    public static final String WORKFLOW_STATUS_ING = "0";

    /**
     * 审核通过完结
     */
    public static final String WORKFLOW_STATUS_SUCCESS = "1";

    /**
     * 审核不通过完结
     */
    public static final String WORKFLOW_STATUS_FAIL = "2";

    /************************************************ 工作流相关 *******************************************/

    //签到状态 1有效  0无效
    public static final String SIGN_IN_STAS_0 = "0";
    public static final String SIGN_IN_STAS_1 = "1";
    //签退状态 1有效  0无效
    public static final String SIGN_OUT_STAS_0 = "0";
    public static final String SIGN_OUT_STAS_1 = "1";

    /************************************************ 目录查询相关 *******************************************/
    /**
     * 目录医保属性
     */
    public static final String CATALOGWOWN_TYPE_MLYBSX = "hilist_b";

    /**********个人账户注入（注入类型）*********/
    //公务员一次性注入
    public static final String INJ_TYPE_01 = "01";
    //企业注入
    public static final String INJ_TYPE_02 = "02";
    //其他注入
    public static final String INJ_TYPE_03 = "03";

    //***********************************************医联体 关系维护相关***************************************/
    //是否是根节点
    public static final String PRNTMEMID_DJ = "0";
    //牵头成员标志 0 否  1是
    public static final String LEAD_MEM_FLAG_IS = "1";
    public static final String LEAD_MEM_FLAG_NO = "0";

    /************************************************ 税务交互反馈结果 *******************************************/
    /**
     * 处理成功
     */
    public static final String FBCK_RSLT_SUCCESS = "10000";

    /************************************************ 税务交互反馈结果 *******************************************/


    /************************************************ 个人待遇登记 *******************************************/
    /**
     * matnQuaRegStas 生育资格登记状态
     */
    public static final String MATN_QUA_REG_STAS_1 = "1";
    public static final String MATN_QUA_REG_STAS_2 = "2";

    /************************************************ 个人待遇登记 *******************************************/


    /************************************************ 人员身份类型 *******************************************/
    /**
     * 优抚人员
     */
    public static final String PSN_IDET_TYPE_YFRY = "21";
    /**
     * 因公牺牲军人家属
     */
    public static final String PSN_IDET_TYPE_YGXSJRJS = "2101";
    /**
     * 退出现役的残疾军人
     */
    public static final String PSN_IDET_TYPE_TCXYCJJR = "2102";
    /**
     * 二等乙级伤残军人
     */
    public static final String PSN_IDET_TYPE_EDYJCJJR = "2103";
    /**
     * 一至六级残疾军人
     */
    public static final String PSN_IDET_TYPE_YZLJCJJR = "2104";
    /**
     * 老红军
     */
    public static final String PSN_IDET_TYPE_LHJ = "2105";
    /**
     * 地方扩展优抚人员
     */
    public static final String PSN_IDET_TYPE_DFKZYFRY = "2160";
    /**
     * 医疗照顾人员
     */
    public static final String PSN_IDET_TYPE_YLCGRY = "22";
    /**
     * 副省级以上在职和退休领导
     */
    public static final String PSN_IDET_TYPE_FSJYSZZHTXLD = "2201";
    /**
     * 两院院士
     */
    public static final String PSN_IDET_TYPE_LYYS = "2211";
    /**
     * 省直直管优秀专家
     */
    public static final String PSN_IDET_TYPE_SZZGYXZJ = "2212";
    /**
     * 国家级劳模
     */
    public static final String PSN_IDET_TYPE_GJJLM = "2231";
    /**
     * 享受公务员的省级劳模
     */
    public static final String PSN_IDET_TYPE_XSGWYDSJLM = "2232";
    /**
     * 亚洲以上冠军运动员
     */
    public static final String PSN_IDET_TYPE_YZYSGJYDY = "2241";
    /**
     * 地方扩展医疗照顾人员
     */
    public static final String PSN_IDET_TYPE_DFKZYLZGRY = "2260";
    /**
     * 医疗救助人员
     */
    public static final String PSN_IDET_TYPE_YLJZRY = "23";
    /**
     * 三无人员
     */
    public static final String PSN_IDET_TYPE_SWRY = "2301";
    /**
     * 建档立卡贫困人员
     */
    public static final String PSN_IDET_TYPE_JDLKPKRY = "2302";
    /**
     * 低保救助对象
     */
    public static final String PSN_IDET_TYPE_DBJZDX = "2303";
    /**
     * 特困救助对象
     */
    public static final String PSN_IDET_TYPE_TKJZDX = "2304";
    /**
     * 低收入救助对象
     */
    public static final String PSN_IDET_TYPE_DSRJZDX = "2305";
    /**
     * 因病致贫救助对象（含重特大疾病人员）
     */
    public static final String PSN_IDET_TYPE_YBZPJZDX = "2306";
    /**
     * 农村五保户
     */
    public static final String PSN_IDET_TYPE_LCWBH = "2307";
    /**
     * 残疾人员
     */
    public static final String PSN_IDET_TYPE_CJRY = "2308";
    /**
     * 地方扩展医疗救助对象人员
     */
    public static final String PSN_IDET_TYPE_DFKZYLJZDXRY = "2360";
    /**
     * 军人
     */
    public static final String PSN_IDET_TYPE_JR = "24";
    /**
     * 现役军人家属
     */
    public static final String PSN_IDET_TYPE_XYJRJS = "2401";
    /**
     * 地方扩展军人人员，其他军转人员
     */
    public static final String PSN_IDET_TYPE_DFKZJRRY = "2460";
    /**
     * 计划生育户
     */
    public static final String PSN_IDET_TYPE_JHSYH_31 = "31";
    /**
     * 双女结扎户
     */
    public static final String PSN_IDET_TYPE_SNJZH = "32";
    /**
     * 三结合户
     */
    public static final String PSN_IDET_TYPE_SJHH = "33";
    /**
     * 独女户
     */
    public static final String PSN_IDET_TYPE_DNH = "34";
    /**
     * 放弃生育指标户
     */
    public static final String PSN_IDET_TYPE_FQSYZBH = "35";
    /**
     * 独生子女户
     */
    public static final String PSN_IDET_TYPE_DSZNH = "36";
    /**
     * 地方扩展其他特殊待遇人员
     */
    public static final String PSN_IDET_TYPE_DFKZQTTSDYRY = "60";
    /**
     * 文革基残保健对象
     */
    public static final String PSN_IDET_TYPE_WGJCBJDX = "6001";
    /**
     * 文革全残
     */
    public static final String PSN_IDET_TYPE_WGQC = "6002";
    /**
     * 建国前老工人
     */
    public static final String PSN_IDET_TYPE_JGQLGR = "6003";
    /**
     * 计划生育户
     */
    public static final String PSN_IDET_TYPE_JHSYH_6004 = "6004";
    /**
     * 实行退牧的牧民
     */
    public static final String PSN_IDET_TYPE_SXTMDMM = "6005";
    /**
     * 退地农业劳动力
     */
    public static final String PSN_IDET_TYPE_TDLYNDL = "6006";
    /**
     * 城中村
     */
    public static final String PSN_IDET_TYPE_CZC = "6007";
    /**
     * 失独父母
     */
    public static final String PSN_IDET_TYPE_SDFM = "6008";

    /************************************************ 人员身份类型 *******************************************/

    /************************************************  虚实账 *******************************************/
    /**
     * makeRealAccounts 虚实账
     */
    public static final String MAKE_REAL_ACCOUNTS_NO = "0";
    public static final String MAKE_REAL_ACCOUNTS_YES = "1";
    /************************************************  虚实账 *******************************************/

    /************************************************  人员待遇合并 *******************************************/
    /**
     * 系统名称-业务基础子系统-MBS
     */
    public final static String SYSTEM_MBS = "mbs";

    /**
     * 系统名称-结算中心-SMC
     */
    public final static String SYSTEM_SMC = "smc";

    /**
     * 待遇人员合并处理类型 1 原值更新
     */
    public static final String TRT_PSN_MERG_DSPO_TYPE_1_YZGX = "1";

    /**
     * 待遇人员合并处理类型 待遇人员合并处理类型 2 值累计
     */
    public static final String TRT_PSN_MERG_DSPO_TYPE_2_ZLJ = "2";
    /************************************************  人员待遇合并 *******************************************/

    /************************************************id生成统一编码*******************************************/
    public static final String MDTRT_ID = "mdtrt_id";

    public static final String SETL_ID = "setl_id";

    /***********************************************查询方式自定义字典*******************************************/
    public static final String QUERY_TYPE_FUZZY_ALL = "fuzzyAll";
    public static final String QUERY_TYPE_FUZZY_LATER = "fuzzyLater";
    public static final String QUERY_TYPE_PRECISE = "precise";

    public static final String MEDINS_LV_WDJ = "11";
    public static final String POOLAREANO_130181 = "130181"; //辛集
    //核定方式-年
    public static final String CLCT_TYPE_YEAR = "Year";
    public static final String FIXMEDINS_CODE_BYSY = "H13070900593";

    /**
     * 服务事项表信息记录(不使用工作流)
     */
    public static final String NONE_WORKFLOW = "NON_WORKFLOW";

    /**
     * 数据来源
     */
    public static final String DATA_SOUC_GGFW = "DATA_SOUC_GGFW";

    //清算来源0两定1经办
    public static final String CLR_SOUC_0 = "0";

    public static final String CLR_SOUC_1 = "1";

    /**
     * 特殊处理地区编码
     */
    public final static String XINJI_CODE = "130181";
    public final static String DINGZHOU_CODE = "130682";
    public final static String HUAYOU_CODE = "139903";
    public final static String SHITIE_CODE = "139904";
    public final static String DIANLI_CODE = "139905";
    public final static String SBJ_CODE = "139900";
    public final static String HEBEI_CODE = "130000";
    /*********************************单位 NewDiffOldFlag:是否用现参保单位补退旧参保单位差额*********************************/
    public static final String NEW_DIFF_OLD_FLAG_0="0";//否
    public static final String NEW_DIFF_OLD_FLAG_1="1";

    /**
     * 双通道
     */
    public final static String EXRA_ATTR_TYPE_9949="9949";
    public final static String ATTR_IS_9949 = "1";
    public final static String ATTR_IS_NOT_9949 = "0";
    public final static String EPC_USE_FLAG_1 = "1";
    public final static String EPC_USE_FLAG_0 = "0";

    /**
     * 公立医院改革标志
     */
    public final static String EXRA_ATTR_TYPE_9905="9905";

    /**
     * 医疗收费项目类别 诊查费
     */
    public final static String MED_CHRGITM_TYPE_02="02";

    /**
     * 医疗收费项目类别 西药费
     */
    public final static String MED_CHRGITM_TYPE_09="09";
    /************************************************业务类型*******************************************/
    /**
     * 定点零售药店结算901
     */
    public static final String BIZ_TYPE_901 = "901";
    /**
     * 定点医疗机构费用结算902
     */
    public static final String BIZ_TYPE_902 = "902";
    /**
     * 定点药店保证金结算903
     */
    public static final String BIZ_TYPE_903 = "903";
    /**
     * 定点医疗机构保证金结算904
     */
    public static final String BIZ_TYPE_904 = "904";
    /**
     * 定点医疗机构住院年终清算905
     */
    public static final String BIZ_TYPE_905 = "905";
    /**
     * 体检费用结算906
     */
    public static final String BIZ_TYPE_906 = "906";
    /**
     * 异地就医人员医药费用结算907
     */
    public static final String BIZ_TYPE_907 = "907";
    /**
     * 现金报销908
     */
    public static final String BIZ_TYPE_908 = "908";
    /**
     * 生育津贴909
     */
    public static final String BIZ_TYPE_909 = "909";
    /**
     * 退保个人账户返还910
     */
    public static final String BIZ_TYPE_910 = "910";
    /**
     * 异地个人账户返还911
     */
    public static final String BIZ_TYPE_911 = "911";
    /************************************************医疗类别*******************************************/
    /**
     * 医疗类别普通门诊11
     */
    public static final String MED_TYPE_11 = "11";
    /**
     * 医疗类别门慢门特14
     */
    public static final String MED_TYPE_14 = "14";
    //住院类型合集,其他住院，普通住院，外伤住院，转外诊治住院，急诊转住院，生育住院
    public static final String MED_TYPE_ZY ="92,21,22,23,24,52";
    /**
     * 生育门诊
     */
    public static final String MED_TYPE_51 = "51";
    /**
     * 生育住院
     */
    public static final String MED_TYPE_52 = "52";

    /**
     * 医疗类别药店购药41
     */
    public static final String MED_TYPE_41 = "41";

    /************************************************医药机构编码标识*******************************************/

    public static final String FIXMEDINS_CODE_YY="H";//医院
    public static final String FIXMEDINS_CODE_YD="P";//药店


    /************************************************核拨类型*******************************************/

    public static final String APPROPRIATION_TYPE_ZG_PE = "01";//个人职工待遇核拨
    public static final String APPROPRIATION_TYPE_ZG_UN = "02";//单位职工待遇核拨
    public static final String APPROPRIATION_TYPE_JGLX_PE = "03";//个人机关离休核拨
    public static final String APPROPRIATION_TYPE_JGLX_UN = "04";//单位机关离休核拨
    public static final String APPROPRIATION_TYPE_QYLX_PE = "05";//个人企业离休核拨
    public static final String APPROPRIATION_TYPE_QYLX_UN = "06";//单位企业离休核拨
    public static final String APPROPRIATION_TYPE_SC_PE = "07";//个人伤残核拨
    public static final String APPROPRIATION_TYPE_SC_UN = "08";//单位伤残核拨
    public static final String APPROPRIATION_TYPE_GZFH_PE = "09";//个人个账返还核拨
    public static final String APPROPRIATION_TYPE_GZFH_UN = "10";//单位个账返还核拨
    public static final String APPROPRIATION_TYPE_JM_PE = "11";//居民待遇核拨
    public static final String APPROPRIATION_TYPE_YDZG = "12";//药店职工
    public static final String APPROPRIATION_TYPE_YDJM = "13";//药店居民
    public static final String APPROPRIATION_TYPE_YYZG = "14";//医院职工
    public static final String APPROPRIATION_TYPE_YYJM = "15";//医院居民
    public static final String APPROPRIATION_TYPE_LXDD = "16";//离休定点
    public static final String APPROPRIATION_TYPE_SNYDYDZG = "17";//省内异地药店职工
    public static final String APPROPRIATION_TYPE_SNYDYDJM = "18";//省内异地药店居民
    public static final String APPROPRIATION_TYPE_SNYDYYZG = "19";//省内异地医院职工
    public static final String APPROPRIATION_TYPE_SNYDYYJM = "20";//省内异地医院居民
    public static final String APPROPRIATION_TYPE_SNYDYYLX = "21";//省内异地医院离休
    public static final String APPROPRIATION_TYPE_KSYDYDZG = "22";//跨省异地药店职工
    public static final String APPROPRIATION_TYPE_KSYDYDJM = "23";//跨省异地药店居民
    public static final String APPROPRIATION_TYPE_KSYDYYZG = "24";//跨省异地医院职工
    public static final String APPROPRIATION_TYPE_KSYDYYJM = "25";//跨省异地医院居民
    public static final String APPROPRIATION_TYPE_KSYDYYLX = "26";//跨省异地医院离休
    public static final String APPROPRIATION_TYPE_RSDT_REFUND = "27";//居民退费核拨
    public static final String APPROPRIATION_TYPE_GZFH_JM = "28";//居民个账返还核拨
    public static final String APPROPRIATION_TYPE_47 = "47";//转移接续个账转出
    public static final String APPROPRIATION_TYPE_50 = "50";//预留保障金支付
    public static final String APPROPRIATION_TYPE_58 = "58";//个人账户支付城乡居民医保费用
    public static final String APPROPRIATION_TYPE_65 = "65";//商业保险

    public static final String APPROPRIATION_TYPE_GZFH_GRJGLX = "41";//个人机关离休个账返还核拨
    public static final String APPROPRIATION_TYPE_GZFH_GRQYLX = "42";//个人企业离休个账返还核拨
    public static final String APPROPRIATION_TYPE_GZFH_DWJGLX = "43";//单位机关个账返还核拨
    public static final String APPROPRIATION_TYPE_GZFH_DWQYLX = "44";//单位企业个账返还核拨

    public static final String APPROPRIATION_TYPE_MATN_SECOND = "45";//生育津贴二次补偿

    public static final String APPROPRIATION_TYPE_SHNEGS_LX = "48";//省属离休
    public static final String APPROPRIATION_TYPE_SHIS_LX = "49";//市属离休

    public static final String APPROPRIATION_TYPE_51 = "51";//年终清算-居民
    public static final String APPROPRIATION_TYPE_52 = "52";//年终清算-职工
    public static final String APPROPRIATION_TYPE_53 = "53";//年终清算-离休
    /**
     * 基金划转
     */
    public static final String APPROPRIATION_TYPE_63 = "63";// 基金划转

    public static final String APPROPRIATION_TYPE_DSREC = "57";//低收入人口二次报销
    public static final String APPROPRIATION_TYPE_GRSSLX = "59";//个人省属离休
    public static final String APPROPRIATION_TYPE_DWSSLX = "60";//单位省属离休
    public static final String APPROPRIATION_TYPE_GRSHISLX = "61";//个人市属离休
    public static final String APPROPRIATION_TYPE_DWSHISLX = "62";//单位市属离休
    /************************************************报销类别 REIM_CODE*******************************************/
    public static final String BIZ_TYPE_CODE_01 = "01";//基本医疗报销
    public static final String BIZ_TYPE_CODE_02 = "02";//生育报销
    public static final String BIZ_TYPE_CODE_03 = "03";//津贴发放
    public static final String BIZ_TYPE_CODE_04 = "04";//离休报销
    public static final String BIZ_TYPE_CODE_05 = "05";//伤残报销
    public static final String BIZ_TYPE_CODE_06 = "06";//个账清退
    public static final String BIZ_TYPE_CODE_07 = "07";//个账返还
    public static final String BIZ_TYPE_CODE_08 = "08";//居民退费

    public static final String BIZ_TYPE_CODE_09 = "09";//居民个账清退
    public static final String BIZ_TYPE_CODE_10 = "10";//生育津贴二次补偿
    public static final String BIZ_TYPE_CODE_11 = "11";//生育津贴核销
    public static final String BIZ_TYPE_CODE_15 = "15";//低收入人口二次报销
    /********************************* FIN_VALI_FLAG:财务有效状态*********************************/
    public static final String FIN_VALI_FLAG_Z = "Z";//财务正常状态
    public static final String FIN_VALI_FLAG_F = "F";//财务撤销
    public static final String FIN_VALI_FLAG_ZZ = "+";//财务冲销正账
    public static final String FIN_VALI_FLAG_FZ = "-";//财务冲销负账
    /******************************* SLH:零星报销结算发票号信息表受理号暂存就诊id字段MdtrtId *******************************/
    /**
     * 受理号 SLH
     */
    public static final String SLH = "SLH";

    /*********************************省平台 FEE_TYPE:费用类型*********************************/
    public static final String CTS_FEE_TYPE_1 = "1";//结算费用
    public static final String CTS_FEE_TYPE_2 = "2";//审核扣款


    /**
     * 中途结算标志 否
     */
    public static final String MID_SETL_FLAG_0="0";

    /**
     * 中途结算标志 是
     */
    public static final String MID_SETL_FLAG_1="1";


    public static final String TASK_TYPE_TREATMENT_BASE_MEDFEE_PSN="biz_appr_treatment_base_medfee_psn";//待遇基本医疗费 个人职工
    public static final String TASK_TYPE_TREATMENT_BASE_MEDFEE_EMP="biz_appr_treatment_base_medfee_emp";//待遇基本医疗费 单位职工
    public static final String TASK_TYPE_TREATMENT_BASE_MEDFEE_RESIDENT="biz_appr_treatment_base_medfee_resident";//待遇基本医疗费 居民
    public static final String TASK_TYPE_TREATMENT_MATN_MEDFEE_PSN="biz_appr_treatment_matn_medfee_psn";//待遇生育医疗费 个人职工
    public static final String TASK_TYPE_TREATMENT_MATN_MEDFEE_EMP="biz_appr_treatment_matn_medfee_emp";//待遇生育医疗费 单位职工
    public static final String TASK_TYPE_TREATMENT_MATN_MEDFEE_RESIDENT="biz_appr_treatment_matn_medfee_resident";//待遇生育医疗费 居民
    public static final String TASK_TYPE_TREATMENT_MATN_ALWN_PSN="biz_appr_treatment_matn_alwn_psn";//待遇生育津贴 个人职工
    public static final String TASK_TYPE_TREATMENT_MATN_ALWN_EMP="biz_appr_treatment_matn_alwn_emp";//待遇生育津贴 单位职工
    public static final String TASK_TYPE_TREATMENT_MATN_ALWN_CANNL_PSN="biz_appr_treatment_matn_cannl_psn";//待遇生育津贴核销 个人职工
    public static final String TASK_TYPE_TREATMENT_MATN_ALWN_CANNL_EMP="biz_appr_treatment_matn_cannl_emp";//待遇生育津贴核销 单位职工
    public static final String TASK_TYPE_PSN_ORGAN_RETIRE="biz_appr_organ_retire_psn";//个人机关离休
    public static final String TASK_TYPE_EMP_ORGAN_RETIRE="biz_appr_organ_retire_emp";//单位机关离休
    public static final String TASK_TYPE_PSN_ENTERPRISE_RETIRE="biz_appr_enterprise_retire_psn";//个人企事业离休
    public static final String TASK_TYPE_EMP_ENTERPRISE_RETIRE="biz_appr_enterprise_retire_emp";//单位企事业离休
    public static final String TASK_TYPE_PSN_SHENG_RETIRE="biz_appr_organ_sheng_psn";//个人省属离休
    public static final String TASK_TYPE_EMP_SHENG_RETIRE="biz_appr_organ_sheng_emp";//单位省属离休
    public static final String TASK_TYPE_PSN_SHI_RETIRE="biz_appr_organ_shi_psn";//个人市属离休
    public static final String TASK_TYPE_EMP_SHI_RETIRE="biz_appr_organ_shi_emp";//单位市属离休

    public static final String TASK_TYPE_PSN_MAIM="biz_appr_maim_psn";//个人伤残
    public static final String TASK_TYPE_EMP_MAIM="biz_appr_maim_emp";//单位伤残

    public static final String TASK_TYPE_PSN_ACCT_PAY="biz_appr_psn_acct_pay";//个人账户返还
    public static final String TASK_TYPE_EMP_ACCT_PAY="biz_appr_emp_acct_pay";//单位账户返还

    public static final String TASK_TYPE_PSN_ORGAN_ACCT_PAY="biz_appr_psn_organ_acct_pay";//个人机关离休账户返还
    public static final String TASK_TYPE_EMP_ORGAN_ACCT_PAY="biz_appr_emp_organ_acct_pay";//单位机关离休账户返还

    public static final String TASK_TYPE_PSN_ENTERPRISE_ACCT_PAY="biz_appr_psn_enterprise_acct_pay";//个人企业离休账户返还
    public static final String TASK_TYPE_EMP_ENTERPRISE_ACCT_PAY="biz_appr_emp_enterprise_acct_pay";//单位企业离休账户返还

    public static final String TASK_TYPE_PSN_CAUSE_ACCT_PAY="biz_appr_psn_cause_acct_pay";//个人事业离休账户返还
    public static final String TASK_TYPE_EMP_CAUSE_ACCT_PAY="biz_appr_emp_cause_acct_pay";//单位事业离休账户返还

    public static final String TASK_TYPE_RSDT_REFUND="biz_appr_rsdt_refund";//居民退费

    public static final String TASK_TYPE_RSDT_ACCT_PAY="biz_appr_rsdt_acct_pay";//居民账户清退
    public static final String TASK_TYPE_PAY_PLAN_A = "task_type_pay_plan_a";//两定机构支付计划
    public static final String TASK_TYPE_PAY_PLAN_A_YEARENDCLR = "task_type_pay_plan_a_yearEndClr";//两定机构支付计划-年终清算
    public static final String TASK_TYPE_FUND_TRANS_GENERATE_BIZBATCHID = "fund_trans_generate_bizbatchid";//基金划转批次号生成
    public static final String TASK_TYPE_PAY_PLAN_A_MARGIN = "task_type_pay_plan_a_margin";//两定机构支付计划( 保证金)
    public static final String TASK_TYPE_RSDT_SECOND_PAY_LOG_TYPE =  "task_type_rsdt_second_pay_log";;


    public static final String TASK_TYPE_EXPORT_SETL_CHKL_DET_INFO = "export_setl_chk_det_info";//导出结算中心明细审核扣款数据

    public static final String BIZ_PLAN_FLAG_0="0";//未生成业务批次号
    public static final String BIZ_PLAN_FLAG_1="1";//已生成业务批次号
    public static final String BIZ_PLAN_FLAG_2="2";//已作废数据

    public static final String PSN_TYPE_CODE_0="0";//人员类型 0-职工
    public static final String PSN_TYPE_CODE_1="1";//人员类型 1-居民
    public static final String PSN_TYPE_CODE_2="2";//人员类型 2-离休

    public static final String REPEAT_MDTRT_MSG="该参保人在相同时间段内存在就诊信息或正在院。"; // 重复就诊报错信息

    /**
     * 处方审核状态 待审核
     */
    public static final String AUDIT_STATUS_0="0";//未审核

    /**
     * 处方审核状态 审核失败
     */
    public static final String AUDIT_STATUS_FAIL="-1";//审核失败

    /**
     * 处方审核状态 审核成功
     */
    public static final String AUDIT_STATUS_1="1";//审核成功
    /**********************************--zy 申请校验状态************************************************/
    /**
     * @Description 转出地未生成
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_0 = "0";

    /**
     * @Description 转出地已生成
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_1 = "1";

    /**
     * @Description 转入地已接收
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_2 = "2";

    /**
     * @Description 转入地已拒绝
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_3 = "3";

    /**
     * @Description 转出地已回退
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_4 = "4";

    /**
     * @description 转出地已拒绝
     * @author kangxi
     * @date 17:36 2021/9/22
     */
    public static final String APPY_STAS_5 = "5";

    /**
     * @description 转入地已锁定
     * @author kangxi
     * @date 17:37 2021/9/22
     */
    public static final String APPY_STAS_6 = "6";

    /**
     * @Description 撤销申请
     * @author zousheng
     * @date 2021/9/1
     */
    public static final String APPY_STAS_7 = "7";

    /****************************** --zy新转移 缴费年限状态 start ***********************************/
    /**
     *
     * 转出地未生成
     */
    public static final String NEW_ZY_CLCT_0 = "0";
    /**
     * 转出地已生成
     */
    public static final String NEW_ZY_CLCT_1 = "1";
    /**
     * 转入地已接收
     */
    public static final String NEW_ZY_CLCT_2 = "2";
    /**
     * 转入地已拒绝
     */
    public static final String NEW_ZY_CLCT_3 = "3";
    /**
     * 转出地已回退
     */
    public static final String NEW_ZY_CLCT_4 = "4";
    /**
     * 转出地已撤销
     */
    public static final String NEW_ZY_CLCT_5 = "5";
    /**
     * 转出地已锁定
     */
    public static final String NEW_ZY_CLCT_6 = "6";
    /****************************** --zy新转移 缴费年限状态 end ***********************************/
    /****************************** --zy新转移 办结状态 start ***********************************/
    /**
     * 未办结
     */
    public static final String NEW_ZY_FNS_0 = "0";
    /**
     * 已办结
     */
    public static final String NEW_ZY_FNS_1 = "1";
    /****************************** --zy新转移 办结状态 end ***********************************/

    /*********************************************转移制度方向******************************************************/

    /**
     * @Description 转移制度方向 职工转职工
     */
    public static final String TRAF_PROT_DIRC_STAFF_11 = "11";


    /**
     * @Description 转移制度方向 职工转居民
     */
    public static final String TRAF_PROT_DIRC_STAFF_12 = "12";


    /**
     * @Description 转移制度方向 居民转居民
     */
    public static final String TRAF_PROT_DIRC_RSDT_TO_41 = "41";

    /**
     * @Description 转移制度方向 居民转职工
     */
    public static final String TRAF_PROT_DIRC_RSDT_TO_42 = "42";

    /*********************************************菜单标志******************************************************/

    /****************************** --zy新转移 接收状态 start ***********************************/
    /**
     * 未接收
     */
    public static final String NEW_ZY_ACCEPT_0 = "0";
    /**
     * 已接收
     */
    public static final String NEW_ZY_ACCEPT_1 = "1";
    /**
     * 已拒绝
     */
    public static final String NEW_ZY_ACCEPT_2 = "2";
    /****************************** --zy新转移接收状态 end ***********************************/

    /**
     * 新转移 --zy
     */
    public static final String TRANS_MODE_4_ZRDFQ = "4";
    /**
     * 转出地发起 新转移 --zy
     */
    public static final String TRANS_MODE_5_ZRDFQ = "5";

    /**
     * 免申转
     */
    public static final String TRANS_MODE_99_ZRDFQ = "99";
    /************************************************  关系转移报表类型 *******************************************/
    /**
     * 关系转移报表类型-参保信息表
     */
    public static final String TRAF_REPORT_TYPE_INSU = "1";
    /**
     * 关系转移报表类型-个账转出核定单
     */
    public static final String TRAF_REPORT_TYPE_TRAFOUT_ACCT = "2";
    /**
     * 关系转移报表类型-个账转入核定单
     */
    public static final String TRAF_REPORT_TYPE_TRAFIN_ACCT = "3";
    /************************************************************************************************************/


    /**
     * --zy基本医疗保险转入方接收参保凭证
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_TRAFIN_CERT = "RLTS_TRAF_TRAFIN_CERT-01";

    /**∑
     *转出地申请模式
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_APPY_FLAG_0= "0";

    /**
     * 转入地申请模式
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_APPY_FLAG_1= "1";

    /**
     *转移校验成功
     */
    public static final String RLTS_TRAF_APPY_CHCK_1= "1";

    /**
     * 转移校验失败
     */
    public static final String RLTS_TRAF_APPY_CHCK_0= "0";

    /**
     * --zhouhengyu基本医疗保险转出方接收转移申请单
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_TRAFOUT_APPY_RECEIVE = "RLTS_TRAF_TRAFOUT_APPY-01";
    /**
     * --zhouhengyu基本医疗保险转出方拒收转移申请单
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_TRAFOUT_APPY_REFUSE = "RLTS_TRAF_TRAFOUT_APPY-02";
    /**
     * --zhouhengyu基本医疗保险转出方撤销接收转移申请单
     */
    public static final String BIZ_AREA_TYPE_RLTS_TRAF_TRAFOUT_APPY_ROLLBACK = "RLTS_TRAF_TRAFOUT_APPY-03";

    /*************************************** APPY_CHK_STAS:申请校验状态 *******************************/

    /**
     * 校验通过
     */
    public static final String APPY_CHK_STAS_ACCESS = "1";
    /**
     * 校验失败
     */
    public static final String APPY_CHK_STAS_FAIL = "2";
    /**
     * 撤销申请
     */
    public static final String APPY_CHK_STAS_ROLLBACK = "3";
    /**
     * 转出地未校验
     */
    public static final String APPY_CHK_STAS_TRAFOUT_WAIT = "4";
    /**
     * 转入地未校验
     */
    public static final String APPY_CHK_STAS_TRAFIN_WAIT = "5";

    /*************************************** CERT_STAS:参保凭证状态 *******************************/

    /**
     * 转出地未生成
     */
    public static final String CERT_STAS_TRAFOUT_NOT_GENERATE = "0";
    /**
     * 转出地已生成
     */
    public static final String CERT_STAS_TRAFOUT_GENERATED = "1";
    /**
     * 转入地已接收
     */
    public static final String CERT_STAS_TRAFIN_RECEIVED = "2";
    /**
     * 转入地已拒绝
     */
    public static final String CERT_STAS_TRAFIN_REFUSED = "3";

    /*************************************** CONLET_STAS:联系函状态 *******************************/

    /**
     * 转入地未生成
     */
    public static final String CONLET_STAS_TRAFIN_NOT_GENERATE = "0";
    /**
     * 转入地已生成
     */
    public static final String CONLET_STAS_TRAFIN_GENERATED = "1";
    /**
     * 转出地已接收
     */
    public static final String CONLET_STAS_TRAFOUT_RECEIED = "2";
    /**
     * 转出地已拒绝
     */
    public static final String CONLET_STAS_TRAFOUT_REFUSED = "3";
    /** --zy 转入缴费年限  */
    public static final String TRAT_CLCT_TYPE_ZRNX = "13";


    /*************************************关系转移定时任务：同步任务名 **************************************/
    /**
     * 关系转移定时任务：转出地调用转移平台的转移申请增量同步
     */
    public static final String RLTS_SYNC_APPY_JOB = "transferSyncAppyJobHandler";
    /**
     * 关系转移定时任务：关系转移缴费年限信息及基金明细增量同步
     */
    public static final String RLTS_SYNC_FUND_CLCT_JOB = "transferSyncFundClctJobHandler";
    /**
     * 关系转移定时任务：关系转移经办机构信息增量同步
     */
    public static final String RLTS_SYNC_OPTINS_JOB = "transferSyncOptinsJobHandler";
    /**
     * 关系转移定时任务：关系转移省级开通地方信息增量同步
     */
    public static final String RLTS_SYNC_PROV_OPEN_INFO = "transferSyncProvOpenInfoJobHandler";

    /*************************************关系转移定时任务：同步英文表名 **************************************/
    /**
     * 关系转移定时任务：关系转移申请地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_APPY_D_TRAFIN = "place_rlts_traf_appy_d (转入地同步)";
    /**
     * 关系转移定时任务：关系转移申请地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_APPY_D_TRAFOUT = "place_rlts_traf_appy_d (转出地同步)";
    /**
     * 关系转移定时任务：关系转移缴费年限地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_CLCT_YEARS_D = "place_rlts_traf_clct_years_d";
    /**
     * 关系转移定时任务：关系转移基金地方明细表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_FUND_DETL_D = "place_rlts_traf_fund_detl_d";
    /**
     * 关系转移定时任务：关系接续转移节点地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_NODE_D_TRAFIN = "place_rlts_traf_node_d (转入地同步)";
    /**
     * 关系转移定时任务：关系接续转移节点地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_NODE_D_TRAFOUT = "place_rlts_traf_node_d (转出地同步)";
    /**
     * 关系转移定时任务：关系转移经办机构信息表
     */
    public static final String RLTS_SYNC_RLTS_TRAF_OPTINS_D = "rlts_traf_bank_d";
    /**
     * 关系转移定时任务：关系转移省级开通地方信息表
     */
    public static final String RLTS_SYNC_PLACE_RLTS_TRAF_PROV_OPEN_INFO_D = "PLACE_RLTS_TRAF_PROV_OPEN_D";

    /*************************************关系转移定时任务：同步成功标志 **************************************/
    /**
     * 关系转移定时任务：同步成功
     */
    public static final String RLTS_SYNC_SUCCESS_FLAG = "1";
    /**
     * 关系转移定时任务：同步失败
     */
    public static final String RLTS_SYNC_FAIL_FLAG = "0";

    /*************************************关系转移定时任务：手动同步标志 **************************************/
    /**
     * 关系转移定时任务：手动同步
     */
    public static final String RLTS_SYNC_MANUAL_FLAG = "1";
    /**
     * 关系转移定时任务：自动同步
     */
    public static final String RLTS_SYNC_AUTOMATIC_FLAG = "0";


    public static final String EMP_TYPE_10="10";//企业
    public static final String EMP_TYPE_30="30";//机关
    public static final String EMP_TYPE_50="50";//事业单位
    public static final String EMP_TYPE_55="55";//全额拨款事业单位
    public static final String EMP_TYPE_56="56";//差额拨款事业单位
    public static final String EMP_TYPE_57="57";//自收自支事业单位

    public final static String EXRA_ATTR_TYPE_9939 ="9939";//DRG定点属性
    public final static String EXRA_ATTR_TYPE_9950 ="9950";//DIP定点属性

    /*********************************大病大额医保局拨付标志*********************************/
    public static final String HIFMI_HIFOB_APPR_RULE_0 = "0";//医保局不拨付大病大额标志
    public static final String HIFMI_HIFOB_APPR_RULE_1 = "1";//医保局拨付大病大额标志
    /** 定点医疗服务机构类型 **/
    public final static String FIXMEDINS_TYPE_1 = "1"; //定点医疗机构
    public final static String FIXMEDINS_TYPE_2 = "2"; //定点零售药店
    public final static String FIXMEDINS_TYPE_3 = "3"; //工伤定点康复机构
    public final static String FIXMEDINS_TYPE_4 = "4"; //辅助器具配置机构
    public final static String FIXMEDINS_TYPE_5 = "5"; //计划生育服务机构

    /**
     * 是否是离休单位 否
     */
    public static final String LX_FLAG_0="0";

    /**
     * 是否是离休单位 是
     */
    public static final String LX_FLAG_1="1";

    /*********************************两定核拨结算查询数据生成*********************************/
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_201 = "resident_med_insura_dfr_souc_201"; //居民定点医疗机构统筹区内清算支付
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_99901 = "resident_med_insura_dfr_souc_99901"; //居民定点医疗机构省内异地清算支付
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_99902 = "resident_med_insura_dfr_souc_99902"; //居民定点医疗机构跨省异地清算支付

    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_201 = "resident_med_pharmacy_insura_dfr_souc_201"; //居民定点药店统筹区内清算支付
    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_99901 = "resident_med_pharmacy_insura_dfr_souc_99901"; //居民定点药店省内异地清算支付
    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_99902 = "resident_med_pharmacy_insura_dfr_souc_99902"; //居民定点药店跨省异地清算支付


    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_201 = "staf_hosp_med_insura_dfr_souc_201"; //职工医院统筹区内清算支付
    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_99901 = "staf_hosp_med_insura_dfr_souc_99901"; //职工医院省内异地清算支付
    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_99902 = "staf_hosp_med_insura_dfr_souc_99902"; //职工医院省异地清算支付

    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_201 = "staf_drug_med_insura_dfr_souc_201"; //职工药店统筹区内清算支付
    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_99901 = "staf_drug_med_insura_dfr_souc_99901"; //职工药店省内异地清算支付
    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_99902 = "staf_drug_med_insura_dfr_souc_99902"; //职工药店省异地清算支付

    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_203 = "staf_drug_med_insura_dfr_souc_203"; //保证金清算支付

    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_201 = "retire_psn_med_instura_dfr_souc_201"; //离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_99901 = "retire_psn_med_instura_dfr_souc_99901"; //离休定点医疗机构省内异地清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_99902 = "retire_psn_med_instura_dfr_souc_99902"; //离休定点医疗机构跨省异地清算支付

    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_JG_201 = "retire_psn_med_instura_dfr_souc_jg_201"; //机关离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_JG_99901 = "retire_psn_med_instura_dfr_souc_jg_99901"; //机关离休定点医疗机构省内异地清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_JG_99902 = "retire_psn_med_instura_dfr_souc_jg_99902"; //机关离休定点医疗机构跨省异地清算支付

    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QS_201 = "retire_psn_med_instura_dfr_souc_qs_201"; //企事业单位离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QS_99901 = "retire_psn_med_instura_dfr_souc_qs_99901"; //企事业单位离休定点医疗机构省内异地清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QS_99902 = "retire_psn_med_instura_dfr_souc_qs_99902"; //企事业单位离休定点医疗机构跨省异地清算支付

    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QY_201 = "retire_psn_med_instura_dfr_souc_qy_201"; //企业单位离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QY_99901 = "retire_psn_med_instura_dfr_souc_qy_99901"; //企业单位离休定点医疗机构省内异地清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_QY_99902 = "retire_psn_med_instura_dfr_souc_qy_99902"; //企业单位离休定点医疗机构跨省异地清算支付

    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_SY_201 = "retire_psn_med_instura_dfr_souc_sy_201"; //事业单位离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_SY_99901 = "retire_psn_med_instura_dfr_souc_sy_99901"; //事业单位离休定点医疗机构省内异地清算支付
    public final static String RETIRE_PSN_MED_INSTURA_DFR_SOUC_SY_99902 = "retire_psn_med_instura_dfr_souc_sy_99902"; //事业单位离休定点医疗机构跨省异地清算支付

    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_201 = "retire_psn_med_pharmacy_insura_dfr_souc_201"; //离休定点零售药店统筹区内清算支付
    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_99901 = "retire_psn_med_pharmacy_insura_dfr_souc_99901"; //离休定点零售药店省内异地清算支付
    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_99902 = "retire_psn_med_pharmacy_insura_dfr_souc_99902"; //离休定点零售药店跨省异地清算支付


    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_SHENGS_201 = "retire_psn_med_pharmacy_insura_dfr_souc_shengshu_201"; //离休定点医疗机构统筹区内清算支付
    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_SHIS_201 = "retire_psn_med_pharmacy_insura_dfr_souc_shishu_201"; //离休定点医疗机构统筹区内清算支付

    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_SHENGS_Y_201 = "retire_psn_med_pharmacy_insura_dfr_souc_shengshu_y_201"; //离休定点零售药店统筹区内清算支付
    public final static String RETIRE_PSN_MED_PHARMACY_INSURA_DFR_SOUC_SHIS_Y_201 = "retire_psn_med_pharmacy_insura_dfr_souc_shishu_y_201"; //离休定点零售药店统筹区内清算支付

    public final static String RESIDENT_YEAR_END_CLR_DFR_SOUC_204 = "resident_year_end_clr_dfr_souc_204"; //居民-年终清算支付
    public final static String STAF_YEAR_END_CLR_DFR_SOUC_204 = "staf_year_end_clr_dfr_souc_204"; //职工-年终清算支付
    public final static String RETIRE_YEAR_END_CLR_DFR_SOUC_204 = "retire_year_end_clr_dfr_souc_204"; //离休-年终清算支付


    //定点协议类型--主协议
    public final static String FIX_CNTR_TYPE_1="1";
    //定点协议类型--其他协议
    public final static String FIX_CNTR_TYPE_2="2";
    //定点协议类型--双通道协议
    public final static String FIX_CNTR_TYPE_908="908";
    //药店门诊统筹协议
    public final static String FIX_CNTR_TYPE_909="909";
    //单独支付药品协议
    public final static String FIX_CNTR_TYPE_910="910";

    /*********************************两定核拨费用生成*********************************/
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_QUERY_201 = "resident_med_insura_dfr_souc_query_201"; //居民定点医疗机构统筹区内清算支付
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_QUERY_99901 = "resident_med_insura_dfr_souc_query_99901"; //居民定点医疗机构省内异地清算支付
    public final static String RESIDENT_MED_INSURA_DFR_SOUC_QUERY_99902 = "resident_med_insura_dfr_souc_query_99902"; //居民定点医疗机构跨省异地清算支付

    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_QUERY_201 = "resident_med_pharmacy_insura_dfr_souc_query_201"; //居民定点药店统筹区内清算支付
    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_QUERY_99901 = "resident_med_pharmacy_insura_dfr_souc_query_99901"; //居民定点药店省内异地清算支付
    public final static String RESIDENT_MED_PHARMACY_INSURA_DFR_SOUC_QUERY_99902 = "resident_med_pharmacy_insura_dfr_souc_query_99902"; //居民定点药店跨省异地清算支付


    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_QUERY_201 = "staf_hosp_med_insura_dfr_souc_query_201"; //职工医院统筹区内清算支付
    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_QUERY_99901 = "staf_hosp_med_insura_dfr_souc_query_99901"; //职工医院省内异地清算支付
    public final static String STAF_HOSP_MED_INSURA_DFR_SOUC_QUERY_99902 = "staf_hosp_med_insura_dfr_souc_query_99902"; //职工医院省异地清算支付

    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_QUERY_201 = "staf_drug_med_insura_dfr_souc_query_201"; //职工药店统筹区内清算支付
    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_QUERY_99901 = "staf_drug_med_insura_dfr_souc_query_99901"; //职工药店省内异地清算支付
    public final static String STAF_DRUG_MED_INSURA_DFR_SOUC_QUERY_99902 = "staf_drug_med_insura_dfr_souc_query_99902"; //职工药店省异地清算支付

    /*********************************特殊身份批量登记*********************************/
    public final static String SPCL_OPT_TYPE_1 = "1"; //操作类型：1.登记
    public final static String SPCL_OPT_TYPE_2 = "2"; //操作类型：2.变更
    public final static String SPCL_OPT_TYPE_3 = "3"; //操作类型：3.作废

    public final static String SPECIA_PSN_DATA = "specialPsn_data"; //批量登记
    public final static String SPECIA_PSN_DATA_CHANGE = "specialPsn_data_change"; //批量变更
    public final static String SPECIA_PSN_DATA_DEL = "specialPsn_data_del"; //批量作废

    //核销类型
    public final static String CANC_TYPE_03="03";//居民退费
    public final static String PUB_HOSP_RFOM_FLAG_CODE = "9905"; //公立医院改革标识代码

    /**
     * 是否是公共服务请求 否
     */
    public static final String GGFW_FLAG_0="0";
    /**
     * 是否是公共服务请求 是
     */
    public static final String GGFW_FLAG_1="1";

    /**
     * 是否死亡后账户余额划拨基本 是
     */
    public static final String DEAD_BLC_FLAG_1="1";
    /**
     * 是否死亡后账户余额划拨基本 否
     */
    public static final String DEAD_BLC_FLAG_0="0";
    /*********************************操作数据库表类型*******************************/
    /**
     * 更新
     */
    public static final String OPERATE_TYPE_0 = "0";
    /**
     * 增加
     */
    public static final String OPERATE_TYPE_1 = "1";
    /**
     * 删除
     */
    public static final String OPERATE_TYPE_2 = "2";

    /**
     *  是
     */
    public static final String FLAG_1 = "1";
    /**
     * 否
     */
    public static final String FLAG_0 = "0";

    /*****************************零星报销材料类型***********************************/
    /**
     * 身份证或社保卡
     */
    public static final String LXBX_CARD_1 = "1";
    /**
     * 医院收费票据
     */
    public static final String LXBX_BILL_2 = "2";
    /**
     * 费用清单
     */
    public static final String LXBX_COST_3 = "3";
    /**
     * 门诊处方底方
     */
    public static final String LXBX_BOTTOM_4 = "4";
    /**
     * 诊断证明
     */
    public static final String LXBX_DIAGNOSIS_5 = "5";
    /**
     * 交通事故认定书等
     */
    public static final String LXBX_ACCIDENT_6 = "6";
    /**
     * 准生证
     */
    public static final String LXBX_BIRTH_7 = "7";
    /**
     * 病历资料
     */
    public static final String LXBX_RECORDS_8 = "8";
    /**
     * 出生医学证明
     */
    public static final String LXBX_BORN_9 = "9";
    /**
     * 配偶无工作证明或承诺书
     */
    public static final String LXBX_SPOUSE_10 = "10";
    /**
     * 代办授权书
     */
    public static final String LXBX_ATTORNEY_11 = "11";
    /**
     * 代办人身份证件
     */
    public static final String LXBX_AGENCY_12 = "12";
    /*****************************零星报销业务来源***********************************/
    /**
     * 门诊
     */
    public static final String LXBX_SOURCE_DOOR_1 = "1";
    /**
     * 住院
     */
    public static final String LXBX_SOURCE_HOSPITALIZED_2 = "2";
    /**
     * 生育医疗
     */
    public static final String LXBX_SOURCE_MEDICAL_3 = "3";
    /**
     * 生育津贴
     */
    public static final String LXBX_SOURCE_ALLOWANCE_4 = "4";




    /*********************************推送国家app返回值*******************************/

    /**
     * 返回code   成功
     */
    public static final String CODE_SUCCESS_STR = "0";


    /**
     * 等待运行
     */
    public static final String TASK_STATUS_0 = "0";

    /**
     * 运行中
     */
    public static final String TASK_STATUS_1 = "1";

    /**
     * 运行异常
     */
    public static final String TASK_STATUS_2 = "2";

    /**
     * 运行成功
     */
    public static final String TASK_STATUS_3 = "3";




    /*******************缴费工资申报统计状态*************/
    public static final String REQUEST_FLAG_0 = "0";
    public static final String REQUEST_FLAG_1 = "1";
    /** 肾透析扩展病种编码 **/
    public static final String DISE_NO_M07801 = "M07801-";

    public static final String GGFW_NO = "9999";

    /**
     * 机构支付财务审核工作流nodeNo
     */
    public static final String CHECK_NODENO = "PAY_PLAN_0102";

    /**
     * 机构支付财务复核工作流nodeNo
     */
    public static final String RECHECK_NODENO = "PAY_PLAN_0103";

    /**
     * 审核标识 财务审核
     */
    public static final String CHKFLAG_CHECK = "check";
    /**
     * 审核标识 财务复核
     */
    public static final String CHKFLAG_RECHECK = "recheck";


    /*********************************零星报销业务来源*******************************/
    /**
     * 门诊
     */
    public static final String LXBX_MZ = "1";

    /**
     * 住院
     */
    public static final String LXBX_ZY = "2";

    /**
     * 生育医疗费
     */
    public static final String LXBX_SYYL = "3";
    /**
     * 生育津贴
     */
    public static final String LXBX_SYJT = "4";
    /**
     * 个账清退事务回滚taskType
     */
    public final static String ACCT_TRAN_ROLL = "acct_tran_roll";




    /*********************************是否计划生育*******************************/


    /**
     * 不计划生育
     */
    public static final String YJFLAG_1 = "1";

    /**
     * 计划生育
     */
    public static final String YJFLAG_0 = "0";


    /********************结算分布式锁 redis key*********************/
    public static final String REDIS_KEY_SETL_LOCK="mbs:setllock:key:";
    public static final String REDIS_KEY_ACCT_MULAID_MAP="mbs:setllock:map:acctmulaid:";
    /*****************************************/
    /********************结算分布式锁 redis key*********************/
    public static final String REDIS_KEY_TRANSFEROUT_LOCK="mbs:transferoutlock:key:";
    /*****************************************/
    /**
     * 基金划转转出地审核分布式锁
     */
    public static final String REDIS_KEY_FUND_TRANS_OUT_LOCK="mbs:fund:trans:out:lock:key:";


    /*********************************近12个月内是否申领过生育津贴*******************************/
    /**
     * 否
     */
    public static final int CLAIM_STATUS_0 = 0;
    /**
     * 是
     */
    public static final int CLAIM_STATUS_1 = 1;

    /**
     * 材料类型 费用清单 3
     */
    public static final String MATL_TYPE_3 = "3";

    /**
     * 电子凭证二次校验token类型
     */
    public static final String TOKEN_CHECK_TYPE_OC = "oc";


    /*********************************查询类型*******************************/
    /**
     * 医保区划
     */
    public static final String QUERY_TYPE_1 = "1";
    /**
     * 市级
     */
    public static final String QUERY_TYPE_2 = "2";
    /**
     * 省级
     */
    public static final String QUERY_TYPE_3 = "3";


/*********************************零星报销 rchk_flag*******************************/

    /**
     * 单位审核通过
     */
    public static final String RCHK_TYPE_1 = "1";




    /*********************************两定核拨异步任务生成批次号*********************************/
    /**职工医疗保险定点医疗机构*/
    public final static String STAFF_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "staff_hosp_sync_save_prt_btchNo_dfr_souc_201";
    public final static String STAFF_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "staff_hosp_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String STAFF_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "staff_hosp_sync_save_prt_btchNo_dfr_souc_99902";
    /**职工医疗保险定点零售药店*/
    public final static String STAFF_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "staff_phar_sync_save_prt_btchNo_dfr_souc_201";
    public final static String STAFF_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "staff_phar_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String STAFF_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "staff_phar_sync_save_prt_btchNo_dfr_souc_99902";
    /**居民医疗保险定点医疗机构*/
    public final static String RESIDENT_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "resident_hosp_sync_save_prt_btchNo_dfr_souc_201";
    public final static String RESIDENT_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "resident_hosp_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String RESIDENT_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "resident_hosp_sync_save_prt_btchNo_dfr_souc_99902";
    /**居民医疗保险定点零售药店*/
    public final static String RESIDENT_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "resident_phar_sync_save_prt_btchNo_dfr_souc_201";
    public final static String RESIDENT_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "resident_phar_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String RESIDENT_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "resident_phar_sync_save_prt_btchNo_dfr_souc_99902";
    /**离休人员定点医疗机构*/
    public final static String RETIRED_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "retired_hosp_sync_save_prt_btchNo_dfr_souc_201";
    public final static String RETIRED_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "retired_hosp_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String RETIRED_HOSP_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "retired_hosp_sync_save_prt_btchNo_dfr_souc_99902";
    /**离休人员定点零售药店*/
    public final static String RETIRED_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_201 = "retired_phar_sync_save_prt_btchNo_dfr_souc_201";
    public final static String RETIRED_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99901 = "retired_phar_sync_save_prt_btchNo_dfr_souc_99901";
    public final static String RETIRED_PHAR_SYNC_SAVE_PRT_BTCHNO_DFR_SOUC_99902 = "retired_phar_sync_save_prt_btchNo_dfr_souc_99902";


    /**年终清算*/
    public final static String RESIDENT_YEARENDCLR_SYNC_SAVE_PRT_BTCHNO = "resident_yearEndClr_sync_save_prt_btchNo";
    public final static String RETIRE_YEARENDCLR_SYNC_SAVE_PRT_BTCHNO = "retire_yearEndClr_sync_save_prt_btchNo";
    public final static String STAF_YEARENDCLR_SYNC_SAVE_PRT_BTCHNO = "staf_yearEndClr_sync_save_prt_btchNo";



    /**
     * 共济账户使用标志 0-未使用  1-使用
     */
    public final static String ACCT_MULAID_USED_FLAG_0 = "0";
    public final static String ACCT_MULAID_USED_FLAG_1 = "1";

    /**
     * OCR_Flag
     */
    public static final String OCR_FALG_1 = "1";

    /**
     * 质控结果 QLTCTRL_RSLT 0-质控失败，1-质控成功
     */
    public static final String QLTCTRL_RSLT_0 = "0";
    public static final String QLTCTRL_RSLT_1 = "1";


    /*********************************本地参保信息上传国家*********************************/
    /**
     * 处理标志   0-未处理
     */
    public static final String DSPO_FLAG_0 = "0";
    /**
     * 处理标志  1-已处理
     */
    public static final String DSPO_FLAG_1 = "1";

    // SYNC_FLAG 同步标志
    /**  同步标志  0-未同步 */
    public static final String SYNC_FLAG_0 = "0";
    /**  同步标志  1-已同步 */
    public static final String SYNC_FLAG_1 = "1";
    /**  同步标志  2-同步异常  自定义的一个值，为了标记异常数据*/
    public static final String SYNC_FLAG_2 = "2";

    // 单位编号来源 EMP_NO_SOUC  1是参保单位信息表 2是基层医保区划表 3是学校信息表
    /** 单位编号来源   1是参保单位信息表 2是基层医保区划表 3是学校信息表 */
    public static final String EMP_NO_SOUC_1 = "1";
    /** 单位编号来源   1是参保单位信息表 2是基层医保区划表 3是学校信息表 */
    public static final String EMP_NO_SOUC_2 = "2";
    /** 单位编号来源   1是参保单位信息表 2是基层医保区划表 3是学校信息表 */
    public static final String EMP_NO_SOUC_3 = "3";

    /*********************************本地参保信息上传国家*********************************/
//FixmedinsEvaluate
    public static final String FIXMEDINS_EVALUATE_LOCK_KEY = "FIXMEDINS_EVALUATE_LOCK_KEY";

    /**
     * 证件类型 字典中值 LiST列表
     */
    public static List<String> PSN_CERT_TYPE_LIST = Lists.newArrayList("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","90","99");

    /**
     * 业财一体化数据提取状态 成功
     */
    public static final String FIN_STATUS_SUCCESS = "1";
    /**
     * 业财撤回标志
     */
    public static final String REVOKE_FLAG = "1";

    /**
     * 写入撤销月结记录表任务
     */
    public static final String TASK_TYPE_MEDINS_CLR_RECORD_OPERATION = "medins_clr_record_operation";


    /*******************************************个人账户共济类型****************************************************/

    /**
     * 医保区划内共济
     */
    public static final String ACCT_MULAID_FEE_TYPE_0 = "0";
    /**
     * 统筹区内共济
     */
    public static final String ACCT_MULAID_FEE_TYPE_1 = "1";
    /**
     * 跨统筹区共济
     */
    public static final String ACCT_MULAID_FEE_TYPE_2 = "2";

    /**
     * 应收
     */
    public static final String YS_YF_TYPE_01 = "01";
    /**
     *应付
     */
    public static final String YS_YF_TYPE_02 = "02";


    /**
     * 个账清算类型 1 省内就医
     */
    public static final String MULAID_PAY_TYPE_01 = "1";
    /**
     * 个账清算类型 2 跨省就医
     */
    public static final String MULAID_PAY_TYPE_02 = "2";

    /**
     * 个账清算类型 2 跨省就医
     */
    public static final List<String> MULAID_PAY_TYPE_LIST = Arrays.asList(MULAID_PAY_TYPE_01,MULAID_PAY_TYPE_02);




    /*******************************************清算状态****************************************************/

    /**
     * 账户共济清算申请  清算状态 10
     */
    public static final String ACCT_MULAID_CLR_STAS_10 = "10";

    /**
     * 账户共济清算确认 清算状态 40
     */
    public static final String ACCT_MULAID_CLR_STAS_40 = "40";

    /**
     * 账户共济清算拨付 清算状态 70
     */
    public static final String ACCT_MULAID_CLR_STAS_70 = "70";

    /**
     * 不通过 清算状态 80
     */
    public static final String ACCT_MULAID_CLR_STAS_80 = "80";


    /**
     * 抽取个人账户共济清算数据
     */
    public static final String EXTRACT_ACCT_MULAID_PAY_CLR_DATA_TASK_TYPE ="extract_acct_mulaid_pay_clr_data";
    /**
     * 市域内县域间个人账户共济清算申请
     */
    public static final String POOLAREA_ACCT_MULAID_PAY_CLR_APPLY_TASK_TYPE ="poolarea_acct_mulaid_pay_clr_apply";
    /**
     * 市域内县域间个人账户共济清算生成业财数据
     */
    public static final String POOLAREA_ACCT_MULAID_PAY_CLR_DFR_TASK_TYPE ="poolarea_acct_mulaid_pay_clr_dfr";
    /**
     * 医保区划内个人账户共济清算申请
     */
    public static final String ADMDVS_ACCT_MULAID_PAY_CLR_APPLY_TASK_TYPE ="admdvs_acct_mulaid_pay_clr_apply";
    /**
     * 医保区划内个人账户共济清算生成业财数据
     */
    public static final String ADMDVS_ACCT_MULAID_PAY_CLR_DFR_TASK_TYPE ="admdvs_acct_mulaid_pay_clr_dfr";
    /*********************************网上生育津贴  是否已经核定*********************************/
    public static final String IS_APPROVED_0 = "0";
    public static final String IS_APPROVED_1 = "1";

    /**
     * 审核扣款来源 1-人工审核扣款
     */
    public static final String CHK_DET_SOUC_1 = "1";
    /**
     * 审核扣款来源 2-智能审核扣款
     */
    public static final String CHK_DET_SOUC_2 = "2";
    /**
     * 审核扣款来源 3-考核扣款
     */
    public static final String CHK_DET_SOUC_3 = "3";
    /**
     * 审核扣款来源 4-补扣既往月份扣款
     */
    public static final String CHK_DET_SOUC_4 = "4";

    /**
     * 征收项目
     */
    public static final String ZSXM_10203 = "10203";//灵活就业
    public static final String ZSXM_10212 = "10212";//居民


    // 月结审核结算异步任务 task_key
    public static String TASK_TYPE_LOCAL_MON_AUDT_SETL_DATA = "local_mon_audt_setl_data";
    public static String TASK_TYPE_INPROV_MON_AUDT_SETL_DATA = "inprov_mon_audt_setl_data";
    public static String TASK_TYPE_OUTPROV_MON_AUDT_SETL_DATA = "outprov_mon_audt_setl_data";

    // 月结批量生成拨付单 task_key
    public static String TASK_TYPE_LOCAL_MON_INSERT_MED_DFR_D = "insert_med_dfr_info";
    public static String TASK_TYPE_INPROV_MON_INSERT_MED_DFR_D = "insert_inprovout_med_dfr_info";
    public static String TASK_TYPE_OUTPROV_MON_INSERT_MED_DFR_D = "insert_outprovout_med_dfr_info";
    /********************************* PROJECT_STATUS 办件状态 *********************************/

    public static final String PROJECT_STATUS_1000 = "1000";//申报完成
    public static final String PROJECT_STATUS_2000 = "2000";//预审通过
    public static final String PROJECT_STATUS_4000 = "4000";//受理通过
    public static final String PROJECT_STATUS_4001 = "4001";//受理不通过
    public static final String PROJECT_STATUS_6001 = "6001";//不予许可
    public static final String PROJECT_STATUS_9999 = "9999";//异常办结
    /**
     * 批量明细扣款审核
     */
    public static final String BATCH_SETL_DETL_DET_CHK_TASK_TYPE ="batch_setl_detl_det_chk";

    public static final String TX_CHANGE_OPSP_MEMO = "退休职工慢性病待遇失效";//退休省本级公务员门慢特病待遇置为无效备注
    public static final String XZ_CHANGE_OPSP_MEMO = "已认定慢性病种待遇的省本级4%补充险人员，已有“脑血管病后遗症神经功能缺损 代码M04803”如再申报“脑血管病M04806”、M04802 认定成功后原待遇取消";
    public static final String TX_CHANGE_OPSP_BACK_MEMO = "无";//退休省本级公务员门慢特病待遇置为无效备注


    /**
     * 免申转
     */
    public static final String NO_APPLY_TRAF_TASK_TYPE ="no_apply_traf";
    /**
     * 生成医疗救助明细
     */
    public static final String TASK_TYPE_GENERATE_MAF_SETL_DETL = "generate_maf_setl_detl";
    /**
     * 导出生成的医疗救助明细
     */
    public static final String TASK_TYPE_GENERATE_MAF_SETL_DETL_EXPORT = "generate_maf_setl_detl_export";

    /**************************************结算清单状态分类START*******************************************************************/
    /**
     * 未提交
     */
    public static final String STAS_TYPE_0 = "0";

    /**
     * 已提交
     */
    public static final String STAS_TYPE_1 = "1";

    /**
     * 审核通过
     */
    public static final String STAS_TYPE_2 = "2";

    /**
     * 审核未通过
     */
    public static final String STAS_TYPE_3 = "3";
    /**************************************结算清单状态分类END*******************************************************************/

    /**
     *  处方流转标志 RX_CIRC_FLAG  0否，1是
     */
    public static final String RX_CIRC_FLAG_0 = "0";
    public static final String RX_CIRC_FLAG_1 = "1";
    /**
     * 移动支付标志 mmFlag  0-否，1-是，默认为否

     */
    public static final String RX_MM_FLAG_0 = "0";
    public static final String RX_MM_FLAG_1 = "1";
    /********************************* 特殊参保区划集合 *********************************/
    /**特殊的参保区划*/
    public static List<String> SPECIAL_ADMDVS_LIST = CollUtil.newArrayList("130181","130682","139900","139903","139904","139905");
    /********************************* 是否 *********************************/
    public static final String NO = "0";
    public static final String YES = "1";



    /**************************************根据静态要素转换人员身份返回值*******************************************************************/
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_1 = "1"; // 普通职工
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_2 = "2"; // 普通公务员
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_3 = "3"; // 七方面人公务员厅局级
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_4 = "4"; // 七方面人公务员省部级
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_5 = "5"; // 离休
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_6 = "6"; // 伤残六级
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_7 = "7"; // 企业补充百分之四人员
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_8 = "8"; // 企业补充百分之十人员
    public static final String PSN_IDEN_TYPE_TRAN_RETURN_9 = "9"; // 七方面其他

    /**
     * 结算程序自动转换医疗类别的时候对应的"原始医疗类别"key,存储在就诊表和结算表的memo字段中
     */
    public static final String SETL_ORG_MED_TYPE = "setlOrgMedType";//医疗类别：门慢门特

    public static final String SETL_ORG_DISE_NO = "setlOrgDiseNo";//医疗类别：门慢门特

    public static final List<String> PSN_IDEN_TYPE_QFMR = CollUtil.newArrayList("2211","2212","2232","2241","2203","2202","2201","226022","226023","8007","8012","226026","226027","226028","226029","226037","226038","226039","226036");


    /************************************************特例单议编码字符串 *******************************************/
    //申请阶段--未申请
    public static final String TLDY_STATUS_0="0";
    //申请阶段--初审申请
    public static final String TLDY_STATUS_1="1";
    //申请阶段--复议申请
    public static final String TLDY_STATUS_2="2";
    //申请阶段--结束
    public static final String TLDY_STATUS_3="3";

    //-----审核状态、包括初审、复审
    //待审核
    public static final String TLDY_CHK_STATUS_0="0";
    //审核通过
    public static final String TLDY_CHK_STATUS_1="1";
    //审核不通过
    public static final String TLDY_CHK_STATUS_2="2";
    //待稽核
    public static final String TLDY_CHK_STATUS_3="3";
    //已稽核
    public static final String TLDY_CHK_STATUS_4="4";
    //返回值字典-已稽核、未稽核
    // 不存在违规
    public static final String VIOLATION_CONFIRM_0="0";
    //存在违规
    public static final String VIOLATION_CONFIRM_1="1";
    //处理完毕违规、已扣费
    public static final String VIOLATION_CONFIRM_2="2";
    // 不存在违规
    public static final String VIOLATION_FLAG_0="0";
    //存在违规
    public static final String VIOLATION_FLAG_1="1";
    //稽核类型
    public static final String EXAMINE_FLAG_0="0";
    //返回值、查询-已稽核
    public static final String EXAMINE_FLAG_1="1";
    //返回值、查询-待稽核
    public static final String EXAMINE_FLAG_2="2";

    //是确认违规费用 未确认
    public static final String TLDY_VIOLATION_ACCEPT_0="0";
    //是否认可违规费用 确认无违规
    public static final String TLDY_VIOLATION_ACCEPT_1="1";
    //是否认可违规费用 确认有违规
    public static final String TLDY_VIOLATION_ACCEPT_2="2";

    /************************************************特例单议编码字符串 *******************************************/

    /**************************************代办关系*******************************************************************/

    public static final String AGNTER_RLTS_98 = "98";//单位专管员
    public static final String AGNTER_RLTS_99 = "99";//经办人员

    /**
     *  账户注入 业务类型
     */
    public static final String ZR_BIZ_TYPE_01 = "01";//  公务员未体检人员注入


    /**************************************退费状态 tfa101  start *******************************************************************/
    public static final String TFA101_REFUND_0 = "0"; //  初始状态  待核销
    public static final String TFA101_REFUND_91 = "91"; //  已返还核销待生成缴费通知单
    public static final String TFA101_REFUND_92 = "92"; //  已生成缴费通知单待收入登账
    public static final String TFA101_REFUND_1 = "1"; //  退费成功
    /**************************************退费状态 tfa101  end *******************************************************************/
    /** 01-税务全责缴费  */
    public static final String CLCT_MODA_01 = "01";
    /** 02-医保半责缴费  */
    public static final String CLCT_MODA_02 = "02";

    /********************************* 部门代码 *********************************/
    public static final String SCJG_YBJ = "YBJ";//业务上传部门 ybj
    public static final String MBJG_BST = "BST";//目标机构名称 bst
    public static final String MBJG_RST = "RST";//目标机构名称 bst
    public static final String MBJG_YB = "YB";//目标机构名称 bst

    /********************************* DATA_STATUS 数据状态 *********************************/
    public static final String DATA_STATUS_0 = "0";//未处理
    public static final String DATA_STATUS_1 = "1";//已处理

    /********************************* C10 环节代码 *********************************/
    public static final String C10_CODE_60 = "60";//决定
    public static final String C10_CODE_60_NAME = "决定";//决定

    /********************************* C8 业务动作 *********************************/
    public static final String C8_CODE_00 = "00";//通过
    public static final String C8_CODE_00_NAME = "通过";//通过

    public static final String C8_CODE_01 = "01";//不通过
    public static final String C8_CODE_01_NAME = "通过";//不通过

    // 特例单议审核状态
    public static final String TLDY_AUDIT_STATUS_0 = "0";//待审核
    public static final String TLDY_AUDIT_STATUS_1 = "1";//审核通过
    public static final String TLDY_AUDIT_STATUS_2 = "2";//审核不通过
    public static final String AUDIT_STEP_1 = "1"; //县级审核
    public static final String AUDIT_STEP_2 = "2"; //市级审核
    public static final String AUDIT_STEP_3 = "3"; //省级审核

    public static final String TLDY_AUDIT_PROCESS_1 = "1"; //县级待审核
    public static final String TLDY_AUDIT_PROCESS_2 = "2"; //县级审核通过
    public static final String TLDY_AUDIT_PROCESS_3 = "3"; //县级审核不通过
    public static final String TLDY_AUDIT_PROCESS_4 = "4"; //市级待审核
    public static final String TLDY_AUDIT_PROCESS_5 = "5"; //市级审核通过
    public static final String TLDY_AUDIT_PROCESS_6 = "6"; //市级审核不通过
    public static final String TLDY_AUDIT_PROCESS_7 = "7"; //省级待审核
    public static final String TLDY_AUDIT_PROCESS_8 = "8"; //省级审核通过
    public static final String TLDY_AUDIT_PROCESS_9 = "9"; //省级审核不通过
}
