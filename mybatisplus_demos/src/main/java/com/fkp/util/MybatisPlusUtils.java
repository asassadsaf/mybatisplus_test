//package com.fkp.util;
//
//import cn.hutool.core.date.DateUtil;
//import cn.hutool.core.date.TimeInterval;
//import cn.hutool.core.text.CharSequenceUtil;
//import com.baomidou.mybatisplus.core.toolkit.LambdaUtils;
//import com.baomidou.mybatisplus.core.toolkit.support.LambdaMeta;
//import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.reflection.property.PropertyNamer;
//
//import java.util.Optional;
//import java.util.function.Function;
//
///**
// * @author fengkunpeng
// * @version 1.0
// * @description
// * @date 2023/9/15 19:28
// */
//@Slf4j
//public class MybatisPlusUtils {
//
//    /**
//     * 根据lambda方法引用获取字段名
//     * @param func
//     * @return
//     * @param <T>
//     */
//    public static <T> String columnToUnderline(SFunction<T, ?> func) {
//        String fieldName = tryCatch(func, MybatisPlusUtils::columnToString);
//        return Optional.ofNullable(fieldName).map(CharSequenceUtil::toUnderlineCase).orElse(CharSequenceUtil.EMPTY);
//    }
//
//    private static <T, R> R tryCatch(T t, Function<T, R> function) {
//        R r = null;
//        try {
//            r = function.apply(t);
//        } catch (Exception e) {
//            log.error("内部方法Function调用异常,错误信息:{}", e.getMessage(), e);
//        }
////        log.info("内部方法Function调用,耗时:{}ms", timer.interval());
//        return r;
//    }
//
//    private static <T> String columnToString(SFunction<T, ?> func) {
//        // 根据lambda方法引用获取SerializedLambda
//        LambdaMeta extract = LambdaUtils.extract(func);
//        // 根据SerializedLambda获取方法名,然后截取出属性名
//        return PropertyNamer.methodToProperty(extract.getImplMethodName());
//    }
//
//
//
//}
