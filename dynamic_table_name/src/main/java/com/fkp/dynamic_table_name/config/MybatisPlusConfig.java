package com.fkp.dynamic_table_name.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.fkp.dynamic_table_name.constant.CommonConstants;
import com.fkp.dynamic_table_name.utils.DynamicTableNameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 15:41
 */
@Configuration
public class MybatisPlusConfig {

    @Autowired
    InnerInterceptor idDynamicTableNameInterceptor;

    //拦截器，获取到表名给替换
    @Bean
    public InnerInterceptor dynamicTableNameInnerInterceptor() {
        DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor = new DynamicTableNameInnerInterceptor();
        dynamicTableNameInnerInterceptor.setTableNameHandler((sql, tableName) -> {
            //若操作的表是t_user表，则从ThreadLocal中取表名t_user1 - t_user3，默认t_user1
            if(StringUtils.equalsIgnoreCase(CommonConstants.TABLE_KEY_OBJECT, tableName)){
                tableName = DynamicTableNameUtils.getCurrTableName();
                //执行完本次操作后还原标志位，避免在后续操作中影响对原来表的正常操作
                DynamicTableNameUtils.releaseCurrTableName();
            }
            return tableName;
        });
        return dynamicTableNameInnerInterceptor;
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(idDynamicTableNameInterceptor);
        interceptor.addInnerInterceptor(dynamicTableNameInnerInterceptor());
        return interceptor;
    }


}
