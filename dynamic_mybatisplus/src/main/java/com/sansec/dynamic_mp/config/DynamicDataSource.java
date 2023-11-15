package com.sansec.dynamic_mp.config;

import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashMap;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public class DynamicDataSource extends AbstractRoutingDataSource {

    private Object writeDataSource;
    private Object readDataSource;
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Override
    public void afterPropertiesSet() {
        if (this.writeDataSource == null) {
            throw new IllegalArgumentException("Property 'writeDataSource' is required");
        }
        setDefaultTargetDataSource(writeDataSource);
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DynamicDataSourceGlobalEnum.WRITE.name(), writeDataSource);
        if (readDataSource != null) {
            targetDataSources.put(DynamicDataSourceGlobalEnum.READ.name(), readDataSource);
        }
        setTargetDataSources(targetDataSources);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        // 开启事务，用主数据源
        return DynamicDataSourceHolder.getDataSource() == DynamicDataSourceGlobalEnum.WRITE ? DynamicDataSourceGlobalEnum.WRITE.name() : DynamicDataSourceGlobalEnum.READ.name();
    }
}
