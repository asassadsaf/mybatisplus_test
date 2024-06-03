package com.fkp.conf;

import com.alibaba.druid.util.DruidPasswordCallback;
import org.apache.commons.codec.binary.Base64;

import javax.security.auth.callback.PasswordCallback;
import java.util.Properties;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/6/3 16:04
 */
public class MyDruidPasswordCallBack extends DruidPasswordCallback {

    //重写该方法实现自定义的密码处理逻辑，这里以解Base64编码为例
    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String password = properties.getProperty("password");
        byte[] pwdBytes = Base64.decodeBase64(password);
        setPassword(new String(pwdBytes).toCharArray());
    }
}
