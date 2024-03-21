package com.fkp.dynamic_datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.fkp.dynamic_datasource.mapper")
public class DynamicDatasourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DynamicDatasourceApplication.class, args);
        System.out.println("run...");
    }

}
