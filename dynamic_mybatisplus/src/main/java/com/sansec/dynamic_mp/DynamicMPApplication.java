package com.sansec.dynamic_mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sansec.dynamic_mp.mapper")
public class DynamicMPApplication {
	public static void main(String[] args) {
		SpringApplication.run(DynamicMPApplication.class, args);
	}

}
