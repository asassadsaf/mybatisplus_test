package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.LambdaUtils;
import com.baomidou.mybatisplus.core.toolkit.support.ColumnCache;
import com.baomidou.mybatisplus.core.toolkit.support.LambdaMeta;
import com.fkp.test.entity.KekInfo;
import org.apache.ibatis.reflection.property.PropertyNamer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 19:43
 */
@SpringBootTest
public class LamdaTest {

    /**
     * 通过方法引用获取该属性对应的数据库字段名
     */
    @Test
    void test(){
        LambdaMeta lambdaMeta = LambdaUtils.extract(KekInfo::getDevId);
        //获取该类所有字段映射
        Map<String, ColumnCache> columnMap = LambdaUtils.getColumnMap(lambdaMeta.getInstantiatedClass());
        //获取类的属性名
        String fieldName = PropertyNamer.methodToProperty(lambdaMeta.getImplMethodName());
        System.out.println("fieldName:" + fieldName);
        //格式化为全大写
        String formatKey = LambdaUtils.formatKey(fieldName);
        System.out.println("formatKey:" + formatKey);
        //获取属性对应的数据库字段名，能够根据驼峰转下划线配置动态修改
        String column = columnMap.get(formatKey).getColumn();
        System.out.println("column:" + column);
//        String value = extract.getInstantiatedClass().getDeclaredField(PropertyNamer.methodToProperty(extract.getImplMethodName())).getAnnotation(TableField.class).value();
//        System.out.println(value);
//        System.out.println(columnMap);
    }
}
