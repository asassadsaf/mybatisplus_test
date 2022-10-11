package com.fkp.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author fengkunpeng
 */
@Configuration
public class DruidConfiguration {

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }
}
