package com.sansec.dynamic_mp.config;

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

import javax.sql.DataSource;
import java.util.Optional;

@AutoConfigureBefore(DruidDataSourceAutoConfigure.class)
@Configuration
@ConfigurationProperties(prefix = "spring.datasource.druid")
@Data
public class DataSourceConfig {

    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private Long maxWait;
    private Long minEvictableIdleTimeMillis;
    private Long timeBetweenEvictionRunsMillis;
    private Boolean testWhileIdle;

    @Bean(name = "writeDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.write-data-source")
    public DataSource masterDataSource() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        parseDruidConfig(dataSource);
        return dataSource;
    }

    @Bean(name = "readDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.read-data-source")
    public DataSource slaveDataSource() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        parseDruidConfig(dataSource);
        return dataSource;
    }

    private void parseDruidConfig(DruidDataSource dataSource) {
        Optional.ofNullable(initialSize).ifPresent(dataSource::setInitialSize);
        Optional.ofNullable(maxActive).ifPresent(dataSource::setMaxActive);
        Optional.ofNullable(minIdle).ifPresent(dataSource::setMinIdle);
        Optional.ofNullable(maxWait).ifPresent(dataSource::setMaxWait);
        Optional.ofNullable(minEvictableIdleTimeMillis).ifPresent(dataSource::setMinEvictableIdleTimeMillis);
        Optional.ofNullable(timeBetweenEvictionRunsMillis).ifPresent(dataSource::setTimeBetweenEvictionRunsMillis);
        Optional.ofNullable(testWhileIdle).ifPresent(dataSource::setTestWhileIdle);
    }

    /**
     * 在实例化dynamicDataSource之前，需要保证master和demo数据源已注入IoC容器
     *
     * @Primary 必不可少，多个数据源的前提下，引入MybatisPlusAutoConfiguration时需要有一个@Primary数据源才会后续注入SqlSessionFactory
     * 且依赖注入DataSource时，返回DynamicDataSource
     */
    @Bean(name = "dynamicDataSource")
    @DependsOn({"writeDataSource", "readDataSource"})
    @Primary
    public DynamicDataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(masterDataSource());
        dynamicDataSource.setWriteDataSource(masterDataSource());
        dynamicDataSource.setReadDataSource(slaveDataSource());
        return dynamicDataSource;
    }


    @Bean
    @ConditionalOnMissingBean({MybatisPlusInterceptor.class})
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 在这里可以扩展自己的MP拦截器组件
        interceptor.addInnerInterceptor(new WriteReadMybatisIntercepts());
        return interceptor;
    }

    /**
     * 配置事务管理器
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}
