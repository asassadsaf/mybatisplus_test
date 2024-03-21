package com.fkp.dynamic_datasource.config;

import com.fkp.dynamic_datasource.constant.DynamicDataSourceConstant;
import com.fkp.dynamic_datasource.constant.DynamicDataSourceGlobalEnum;
import lombok.extern.slf4j.Slf4j;



/**
 * @author fengkunpeng
 */
@Slf4j
public class DynamicDataSourceHolder {

    private DynamicDataSourceHolder() {
    }

    public static void putDataSource(DynamicDataSourceGlobalEnum dataSource) {
        ThreadLocalUtil.set(DynamicDataSourceConstant.THREAD_DS_KEY, dataSource);
    }

    public static DynamicDataSourceGlobalEnum getDataSource() {
        DynamicDataSourceGlobalEnum tds = ThreadLocalUtil.get(DynamicDataSourceConstant.THREAD_DS_KEY, DynamicDataSourceGlobalEnum.class);
        log.info("get data source: {}", tds);
        return tds == null ? DynamicDataSourceGlobalEnum.REMOTE : tds;
    }

}
