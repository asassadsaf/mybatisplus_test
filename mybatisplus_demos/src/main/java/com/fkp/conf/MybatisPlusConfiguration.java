package com.fkp.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.fkp.constant.DatabaseIdEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
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
    @Bean
    public DatabaseIdProvider databaseIdProvider(){
        DatabaseIdProvider provider = new VendorDatabaseIdProvider();
        Properties properties = new Properties();
        properties.setProperty(DatabaseIdEnum.MYSQL.getProductName(), DatabaseIdEnum.MYSQL.getFlagName());
        properties.setProperty(DatabaseIdEnum.SQLITE.getProductName(), DatabaseIdEnum.SQLITE.getFlagName());
        provider.setProperties(properties);
        return provider;
    }

    /**
     * 配置DruidDataSource，否则配置文件中配置spring.datasource.druid.url(driver-class-name,xxx)无法自动识别数据源驱动类型，需要去掉druid，使用springboot-jdbc的配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
