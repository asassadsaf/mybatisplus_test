package com.fkp;

import com.fkp.util.SqlSessionFactoryUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fkp.mapper")
public class MybatisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisTestApplication.class, args);
		System.out.println(SqlSessionFactoryUtils.sqlSessionFactory);
	}
}
