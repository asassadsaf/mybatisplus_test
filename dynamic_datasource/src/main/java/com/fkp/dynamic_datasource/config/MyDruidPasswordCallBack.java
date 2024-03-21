package com.fkp.dynamic_datasource.config;

import com.alibaba.druid.util.DruidPasswordCallback;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/3/21 17:51
 */
@Slf4j
public class MyDruidPasswordCallBack extends DruidPasswordCallback {

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        log.info("exec DruidPasswordCallback setProperties. password: {}", properties.getProperty("password"));
    }

}
