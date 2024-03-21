package com.fkp.dynamic_datasource.config;

import com.fkp.dynamic_datasource.annotation.LocalDS;
import com.fkp.dynamic_datasource.constant.DynamicDataSourceGlobalEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/11/15 11:06
 */
@Aspect
@Component
@Slf4j
public class DynamicAspect {

    //扫描所有方法带有LogPointCut注解的方法为切点
    @Pointcut("@within(anno) || @annotation(anno)")
    public void dsPoint(LocalDS anno){
    }

    @Before(value = "dsPoint(anno)", argNames = "joinPoint,anno")
    public void beforeAdvice(JoinPoint joinPoint, LocalDS anno){
        log.info("method: {}, use local data source.", joinPoint.getSignature().getName());
        DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobalEnum.LOCAL);
    }

}
