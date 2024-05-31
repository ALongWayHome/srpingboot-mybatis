package com.wayhome.srpingbootmybatis.dto;

import com.wayhome.srpingbootmybatis.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        QueryHospDTO queryHospDTO = new QueryHospDTO();
//        queryHospDTO.setHospCode("H1300283443855");
//        System.out.println(getHospCode(queryHospDTO));
//
//        String ss = "1.用于既往至少接受过2种系统化疗后出现进展或复发的局部晚期或转移性非小细胞肺癌患者的治疗。对于存在表皮生长因子受体（EGFR）基因突变或间变性淋巴瘤激酶（ALK）阳性的患者，在开始本品治疗前应接受相应的标准靶向药物治疗后进展、且至少接受过2种系统化疗后出现进展或复发。2.用于腺泡状软组织肉瘤、透明细胞肉瘤以及既往至少接受过含蒽环类化疗方案治疗后进展或复发的其他晚期软组织肉瘤患者的治疗。3.用于既往至少接受过2种化疗方案治疗后进展或复发的小细胞肺癌患者的治疗。该适应症是基于一项包括119例既往至少接受过2种化疗方案治疗后进展或复发的小细胞肺癌患者的II期临床试验的结果给予的附条件批准。该适应症的完全批准将取决于正在进行的确证性试验证实本品在该人群的临床获益。4.用于具有临床症状或明确疾病进展的、不可切除的局部晚期或转移性甲状腺髓样癌患者的治疗。该适应症是基于一项包括91例晚期甲状腺髓样癌的IIB期临床试验结果给予的附条件批准。该适应症的完全批准将取决于正在进行的确证性试验证实本品在该人群的临床获益。";
//        System.out.println(ss.length());
        List<User> list = new ArrayList<>();
        Map<Integer, User> collect = list.stream().collect(Collectors.toMap(User::getId, model -> model));
        User user1 = collect.get(0);
        System.out.println(user1);
    }

    public static String getHospCode(Signature signature){
        return signature.getHospCode();
    }
}

