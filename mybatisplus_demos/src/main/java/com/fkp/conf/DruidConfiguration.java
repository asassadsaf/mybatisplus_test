package com.fkp.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration(proxyBeanMethods = false)
public class DruidConfiguration {

    /**
     * 配置DruidDataSource，否则配置文件中配置spring.datasource.druid.url(driver-class-name,xxx)无法自动识别数据源驱动类型，需要去掉druid，使用springboot-jdbc的配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
