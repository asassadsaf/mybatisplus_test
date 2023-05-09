package com.fkp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fkp.test.mapper")
public class MybatisplusDemosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusDemosApplication.class, args);
    }

}
