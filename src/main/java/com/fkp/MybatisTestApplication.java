package com.fkp;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = "com.fkp.mapper")
public class MybatisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisTestApplication.class, args);

	}

	private final String dbtype = "mysql";
//	@Bean
//	public MybatisPlusInterceptor paginationInterceptor() {
//		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//		InnerInterceptor innerInterceptor = null;
//		if(StringUtils.isBlank(dbtype)){
//			innerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
//		}else{
//			innerInterceptor = new PaginationInnerInterceptor(DbType.getDbType(dbtype));
//		}
//		interceptor.addInnerInterceptor(innerInterceptor);
//		return interceptor;
//	}

}
