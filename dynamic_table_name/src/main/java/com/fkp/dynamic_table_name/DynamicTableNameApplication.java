package com.fkp.dynamic_table_name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过Mybatis-Plus的DynamicTableNameInnerInterceptor实现操作数据库时动态修改表名的功能
 * @author fengkunpeng
 */
@SpringBootApplication
public class DynamicTableNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicTableNameApplication.class, args);
    }

}
