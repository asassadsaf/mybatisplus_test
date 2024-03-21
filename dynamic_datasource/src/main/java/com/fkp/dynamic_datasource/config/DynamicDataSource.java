package com.fkp.dynamic_datasource.config;

import com.fkp.dynamic_datasource.constant.DynamicDataSourceGlobalEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

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

    private DataSource remoteDataSource;
    private DataSource localDataSource;
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Override
    public void afterPropertiesSet() {
        setDefaultTargetDataSource(localDataSource);
        Map<Object, Object> targetDataSources = new HashMap<>();
        if(remoteDataSource != null){
            targetDataSources.put(DynamicDataSourceGlobalEnum.REMOTE, remoteDataSource);
        }
        if(localDataSource != null) {
            targetDataSources.put(DynamicDataSourceGlobalEnum.LOCAL, localDataSource);
        }
        setTargetDataSources(targetDataSources);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        DynamicDataSourceGlobalEnum dataSourceKey = DynamicDataSourceHolder.getDataSource();
        log.info("determineCurrentLookupKey: " + dataSourceKey);
        return dataSourceKey;
    }
}
