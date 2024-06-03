# Druid密码回调机制，可用于密码加解密
## 配置
### 定义回调类，重写setProperties实现密码处理逻辑，并调用setPassword方法重新设置密码
com.fkp.conf.MyDruidPasswordCallBack#setProperties <br/>
javax.security.auth.callback.PasswordCallback#setPassword
### 指定密码回调类的全限定名
spring.datasource.druid.password-callback-class-name: com.fkp.conf.MyDruidPasswordCallBack
### 通过connection-properties将原始密码传递给回调方法
spring.datasource.druid.connection-properties: password=${spring.datasource.druid.password}
## 设置
com.alibaba.druid.pool.DruidAbstractDataSource#setPasswordCallbackClassName
## 使用
com.alibaba.druid.pool.DruidAbstractDataSource#createPhysicalConnection
