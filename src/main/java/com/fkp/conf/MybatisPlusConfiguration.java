package com.fkp.conf;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfiguration {

    @Value("${mybatis.databaseType}")
    private String dbtype;

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        InnerInterceptor innerInterceptor = null;
        if(StringUtils.isBlank(dbtype)){
            innerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        }else{
            innerInterceptor = new PaginationInnerInterceptor(DbType.getDbType(dbtype));
        }
        interceptor.addInnerInterceptor(innerInterceptor);
        return interceptor;
    }
}
