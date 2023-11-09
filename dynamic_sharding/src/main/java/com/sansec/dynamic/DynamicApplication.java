package com.sansec.dynamic;

import com.sansec.dynamic.mapper.BusinessUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sansec.dynamic.mapper")
public class DynamicApplication {
	public static void main(String[] args) {
		SpringApplication.run(DynamicApplication.class, args);
	}

}
