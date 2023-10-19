package com.education.common.annotation;

import java.lang.annotation.*;

/**
 * 接口参数校验注解
 * @author zengjintao
 * @version 1.0
 * @create 2018/12/22 16:32
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamsValidate {

    Param[] params();

    ParamsType paramsType() default ParamsType.FORM_DATA; //参数类型
}