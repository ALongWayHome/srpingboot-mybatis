package com.wayhome.srpingbootmybatis.test;

import com.wayhome.srpingbootmybatis.test.entity.copy.TOpt;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("10");
        BigDecimal div = new BigDecimal("3");

        BigDecimal divide = sum.divide(div, 0, RoundingMode.UP);
        System.out.println(divide);

        TOpt tOpt = new TOpt();
        if (Objects.nonNull(tOpt.getAccount())) {
            String str = String.valueOf(tOpt.getAccount());
            BigDecimal strDecimal = new BigDecimal(str);
            BigDecimal aa = sum.divide(div, 0, RoundingMode.UP);
            System.out.println(aa);
        }
    }
}
