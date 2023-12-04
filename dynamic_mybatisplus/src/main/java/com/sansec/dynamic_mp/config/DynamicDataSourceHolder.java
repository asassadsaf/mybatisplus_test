package com.sansec.dynamic_mp.config;

import com.sansec.dynamic_mp.constant.DynamicDataSourceConstant;
import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;

/**
 * @author fengkunpeng
 */
public class DynamicDataSourceHolder {

    private DynamicDataSourceHolder() {
    }

    public static void putDataSource(DynamicDataSourceGlobalEnum dataSource) {
        ThreadLocalUtil.set(DynamicDataSourceConstant.THREAD_DS_KEY, dataSource);
    }

    public static DynamicDataSourceGlobalEnum getDataSource() {
        DynamicDataSourceGlobalEnum tds = ThreadLocalUtil.get(DynamicDataSourceConstant.THREAD_DS_KEY, DynamicDataSourceGlobalEnum.class);
        return tds == null ? DynamicDataSourceGlobalEnum.WRITE : tds;
    }

}
