package com.fkp.dynamic_datasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import lombok.Data;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.util.Optional;


@Configuration
@Data
public class DataSourceConfig {

    @Bean(name = "remoteDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.remote-data-source")
    public DataSource remoteDataSource() {
        return new DruidDataSource();

    }

    @Bean(name = "localDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.local-data-source")
    public DataSource localDataSource() {
        return new DruidDataSource();
    }

    /**
     * 在实例化dynamicDataSource之前，需要保证master和demo数据源已注入IoC容器
     *
     * @Primary 必不可少，多个数据源的前提下，引入MybatisPlusAutoConfiguration时需要有一个@Primary数据源才会后续注入SqlSessionFactory
     * 且依赖注入DataSource时，返回DynamicDataSource
     */
    @Bean(name = "dynamicDataSource")
    @DependsOn({"remoteDataSource", "localDataSource"})
    @Primary
    public DynamicDataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(remoteDataSource());
        dynamicDataSource.setRemoteDataSource(remoteDataSource());
        dynamicDataSource.setLocalDataSource(localDataSource());
        return dynamicDataSource;
    }

    /**
     * 配置事务管理器
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager platformTransactionManager){
        return new TransactionTemplate(platformTransactionManager);
    }
}
