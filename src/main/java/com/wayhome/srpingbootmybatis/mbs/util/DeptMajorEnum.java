package com.wayhome.srpingbootmybatis.mbs.util;

public enum DeptMajorEnum {

    DeptMajorEnum_1("1", "呼吸内专业"),
    DeptMajorEnum_2("2", "消化内专业"),
    DeptMajorEnum_3("3", "神经内科专业"),
    DeptMajorEnum_4("4", "心血管内专业"),
    DeptMajorEnum_5("5", "血液内专业"),
    DeptMajorEnum_6("6", "肾内科专业"),
    DeptMajorEnum_7("7", "内分泌内专业"),
    DeptMajorEnum_8("8", "肿瘤内专业"),
    DeptMajorEnum_9("9", "风湿免疫专业"),
    DeptMajorEnum_10("10", "血液透析专业"),
    DeptMajorEnum_11("11", "老年病专业"),
    DeptMajorEnum_12("12", "神经外科专业"),
    DeptMajorEnum_13("13", "骨科专业"),
    DeptMajorEnum_14("14", "皮肤病专业"),
    DeptMajorEnum_15("15", "感染性疾病专业"),
    DeptMajorEnum_16("16", "眼科专业"),
    DeptMajorEnum_17("17", "普外科专业"),
    DeptMajorEnum_18("18", "核医学专业"),
    DeptMajorEnum_19("19", "耳鼻咽喉专业"),
    DeptMajorEnum_20("20", "口腔外专业"),
    DeptMajorEnum_21("21", "重症医学专业"),
    DeptMajorEnum_22("22", "疼痛专业"),
    DeptMajorEnum_23("23", "泌尿外科专业"),
    DeptMajorEnum_24("24", "胸外科专业"),
    DeptMajorEnum_25("25", "心脏外专业"),
    DeptMajorEnum_26("26", "妇科专业"),
    DeptMajorEnum_27("27", "儿科专业"),
    DeptMajorEnum_28("28", "康复专业"),
    DeptMajorEnum_29("29", "血管外专业"),
    DeptMajorEnum_30("30", "烧伤专业"),
    DeptMajorEnum_31("31", "肿瘤外专业");


    private DeptMajorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(String code) {
        for (DeptMajorEnum item : DeptMajorEnum.values()) {
            if (item.code.equals(code)) {
                return item.msg;
            }
        }
        return null;
    }

    public static String getCodeByMsg(String msg) {
        for (DeptMajorEnum item : DeptMajorEnum.values()) {
            if (item.msg.equals(msg)) {
                return item.code;
            }
        }
        return null;
    }
}
