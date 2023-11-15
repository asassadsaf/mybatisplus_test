package com.sansec.dynamic_mp.config;

import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/11/15 11:06
 */
@Aspect
@Component
@Order(Ordered.LOWEST_PRECEDENCE - 1)
public class DynamicAspect {

    @Pointcut(value = "execution(public * com.sansec.dynamic_mp.controller.*.*(..)) && @annotation(org.springframework.transaction.annotation.Transactional)")
    public void dynamicPointCut(){}

    @Before(value = "dynamicPointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobalEnum.WRITE);
    }
}
