package com.fkp.dynamic_datasource.annotation;

import java.lang.annotation.*;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description 带有该注解的类或方法走本地数据源
 * @date 2024/3/21 16:11
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LocalDS {

}
