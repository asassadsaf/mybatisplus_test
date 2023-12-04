package com.sansec.dynamic;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.sansec.dynamic.mapper.BusinessUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

/**
 * @author fengkunpeng
 */
@SpringBootApplication
@MapperScan(basePackages = "com.sansec.dynamic.mapper")
@EnableScheduling
public class DynamicApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DynamicApplication.class, args);
		ConfigurableEnvironment environment = run.getEnvironment();

	}

}
