package com.wayhome.srpingbootmybatis.annotation;

import com.wayhome.srpingbootmybatis.constant.CustomDatePattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CustomDateFormatter {

    CustomDatePattern value();
}
