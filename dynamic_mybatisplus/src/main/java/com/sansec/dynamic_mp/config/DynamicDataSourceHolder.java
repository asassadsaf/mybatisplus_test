package com.sansec.dynamic_mp.config;

import com.sansec.dynamic_mp.constant.DynamicDataSourceConstant;
import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;

public class DynamicDataSourceHolder {

    private DynamicDataSourceHolder() {
    }

    public static void putDataSource(DynamicDataSourceGlobalEnum dataSource) {
        ThreadLocalUtil.set(DynamicDataSourceConstant.THREAD_DS_KEY, dataSource);
    }

    public static DynamicDataSourceGlobalEnum getDataSource() {
        Object tds = ThreadLocalUtil.get(DynamicDataSourceConstant.THREAD_DS_KEY);
        return tds == null ? DynamicDataSourceGlobalEnum.WRITE : (DynamicDataSourceGlobalEnum) tds;
    }

}
