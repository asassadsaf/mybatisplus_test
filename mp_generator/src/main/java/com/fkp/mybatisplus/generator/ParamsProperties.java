package com.fkp.mybatisplus.generator;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableConfigurationProperties({ParamsProperties.DataSourceProperties.class, ParamsProperties.ConfigProperties.class})
public class ParamsProperties {

    @Autowired
    public DataSourceProperties dataSourceProperties;

    @Autowired
    public ConfigProperties configProperties;

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Data
    public static class DataSourceProperties{
        private String url;
        private String username;
        private String password;
    }

    @ConfigurationProperties(prefix = "generator")
    @Data
    public static class ConfigProperties{
        private String author;
        private String outPutDir;
        private String parentPackage;
        private List<String> tableNames;
    }
}
