package com.fkp.conf;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.fkp.constant.CommonConstants;
import com.fkp.constant.DatabaseIdEnum;
import com.fkp.util.DynamicTableNameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;
import java.util.Properties;

@Configuration(proxyBeanMethods = false)
public class MybatisPlusConfiguration {

    @Value("${mybatis.databaseType}")
    private String dbtype;

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        if(StringUtils.isBlank(dbtype)){
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        }else{
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.getDbType(dbtype)));
        }
        return interceptor;
    }

    /**
     * 多数据库适配支持，xml中通过_databaseId参数配合if标签或查询等标签中通过databaseId指定flagName适配多数据库
     */
//    @Bean   通过MyVendorDatabaseIdProvider实现
    public DatabaseIdProvider databaseIdProvider(){
        DatabaseIdProvider provider = new VendorDatabaseIdProvider();
        Properties properties = new Properties();
        properties.setProperty(DatabaseIdEnum.MYSQL.getProductName(), DatabaseIdEnum.MYSQL.getFlagName());
        properties.setProperty(DatabaseIdEnum.SQLITE.getProductName(), DatabaseIdEnum.SQLITE.getFlagName());
        provider.setProperties(properties);
        return provider;
    }

    @Bean
    public IdentifierGenerator myIdentifierGenerator(){
        return new MyIdentifierGenerator();
    }

    //拦截器，获取到表名给替换
    @Bean
    public MybatisPlusInterceptor dynamicTableNameInnerInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor = new DynamicTableNameInnerInterceptor();
        dynamicTableNameInnerInterceptor.setTableNameHandler((sql, tableName) -> {
            if(StringUtils.equalsIgnoreCase(CommonConstants.TABLE_KEY_OBJECT, tableName) && Optional.ofNullable(DynamicTableNameUtils.INSTANCE.getKeyObjectHistoryTable()).orElse(false)){
                tableName = CommonConstants.TABLE_KEY_OBJECT_HISTORY;
            }
            return tableName;
        });
        interceptor.addInnerInterceptor(dynamicTableNameInnerInterceptor);
        return interceptor;
    }

}
