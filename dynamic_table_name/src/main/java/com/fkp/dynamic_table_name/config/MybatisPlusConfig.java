package com.fkp.dynamic_table_name.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.fkp.dynamic_table_name.constant.CommonConstants;
import com.fkp.dynamic_table_name.utils.DynamicTableNameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 15:41
 */
@Configuration(proxyBeanMethods = false)
public class MybatisPlusConfig {

    //拦截器，获取到表名给替换
    @Bean
    public MybatisPlusInterceptor dynamicTableNameInnerInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor = new DynamicTableNameInnerInterceptor();
        dynamicTableNameInnerInterceptor.setTableNameHandler((sql, tableName) -> {
            //若操作的表是key_object表且ThreadLocal存储的history标志是true，则实际操作key_object_history表
            if(StringUtils.equalsIgnoreCase(CommonConstants.TABLE_KEY_OBJECT, tableName) && Optional.ofNullable(DynamicTableNameUtils.getKeyObjectHistoryTable()).orElse(false)){
                tableName = CommonConstants.TABLE_KEY_OBJECT_HISTORY;
                //执行完本次操作后还原标志位，避免在后续操作中影响对原来表的正常操作
                DynamicTableNameUtils.releaseKeyObjectHistoryTable();
            }
            return tableName;
        });
        interceptor.addInnerInterceptor(dynamicTableNameInnerInterceptor);
        return interceptor;
    }
}
