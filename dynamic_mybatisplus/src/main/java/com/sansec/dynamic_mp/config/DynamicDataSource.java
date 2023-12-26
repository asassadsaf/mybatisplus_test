package com.sansec.dynamic_mp.config;

import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fengkunpeng
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    private DataSource writeDataSource;
    private DataSource readDataSource;
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Override
    public void afterPropertiesSet() {
        if (this.writeDataSource == null) {
            throw new IllegalArgumentException("Property 'writeDataSource' is required");
        }
        setDefaultTargetDataSource(writeDataSource);
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DynamicDataSourceGlobalEnum.WRITE, writeDataSource);
        if (readDataSource != null) {
            targetDataSources.put(DynamicDataSourceGlobalEnum.READ, readDataSource);
        }
        setTargetDataSources(targetDataSources);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        // 开启事务，用主数据源
        DynamicDataSourceGlobalEnum dataSourceKey = DynamicDataSourceHolder.getDataSource();
        log.info("determineCurrentLookupKey: " + dataSourceKey);
        return dataSourceKey;
    }
}
