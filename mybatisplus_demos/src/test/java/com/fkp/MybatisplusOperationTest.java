package com.fkp;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.test.entity.KeyServer;
import com.fkp.test.entity.LogConfiguration;
import com.fkp.test.mapper.KeyServerMapper;
import com.fkp.test.mapper.LogConfigurationMapper;
import com.fkp.util.StrIdGenerator;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/7/10 15:25
 */
@SpringBootTest
public class MybatisplusOperationTest {

    @Autowired
    private KeyServerMapper keyServerMapper;

    @Autowired
    private LogConfigurationMapper logConfigurationMapper;

    @Test
    void testPage() {
        String port = null;
        String serverType = null;
        Page<KeyServer> page = new Page<>();
        page.setCurrent(1);
        page.setSize(10);
        OrderItem orderItem = new OrderItem("id", true);
        List<OrderItem> orderItemList = new ArrayList<>();
        orderItemList.add(orderItem);
        page.setOrders(orderItemList);
        List<String> localIps = Collections.singletonList("10.0.51.68");
        Page<KeyServer> kmipTcp = keyServerMapper.selectPage(page, Wrappers.lambdaQuery(KeyServer.class)
                .and(i -> i.in(KeyServer::getIpAddress, localIps).or(r -> r.isNull(KeyServer::getIpAddress)))
                .like(StringUtils.isNotBlank(port), KeyServer::getPort, Optional.ofNullable(port).orElse(StringUtils.EMPTY).trim())
                .eq(StringUtils.isNotBlank(serverType), KeyServer::getServerType, Optional.ofNullable(serverType).orElse(StringUtils.EMPTY).trim()));
        System.out.println(kmipTcp.getRecords());
    }

    @Test
    void testInsert(){
        keyServerMapper.delete(Wrappers.lambdaQuery(KeyServer.class).eq(KeyServer::getServerType, "fkp"));
        KeyServer keyServer = new KeyServer();
        keyServer.setId(StrIdGenerator.getInstance().nextId());
        keyServer.setServerType("fkp");
        keyServer.setPort("11111");
        keyServer.setStatus("0");
        keyServer.setAutoStart("1");
        keyServer.setUseSsl("0");
        //null的值会自动排除
        keyServer.setUseCa(null);
        //空字符串会插入
        keyServer.setCertAlg(StringUtils.EMPTY);
        keyServer.setRemark("aaaa");
        //相当于insertSelective
        keyServerMapper.insert(keyServer);
        KeyServer keyServer1 = keyServerMapper.selectOne(Wrappers.lambdaQuery(KeyServer.class).eq(KeyServer::getServerType, "fkp"));
        System.out.println(keyServer1);
    }

    @Test
    void testSelectOr(){
        List<String> localIps = Arrays.asList("10.0.51.68", "10.0.51.69");
        List<KeyServer> keyServerList = keyServerMapper.selectList(Wrappers.lambdaQuery(KeyServer.class).in(KeyServer::getIpAddress, localIps).or(i -> i.isNull(KeyServer::getIpAddress)));
        System.out.println(keyServerList);
    }

    @Test
    void testUpdateById(){
        KeyServer keyServer = keyServerMapper.selectOne(Wrappers.lambdaQuery(KeyServer.class).eq(KeyServer::getServerType, "fkp"));
        //null值不会拼接到set中
        keyServer.setPort(null);
        //空字符串会拼接到set中
        keyServer.setRemark(StringUtils.EMPTY);
        System.out.println(keyServer);
        //相当于updateByPrimaryKeySelective
        keyServerMapper.updateById(keyServer);
        System.out.println(keyServerMapper.selectOne(Wrappers.lambdaQuery(KeyServer.class).eq(KeyServer::getServerType, "fkp")));
    }

    @Test
    void testUpdate(){
        LogConfiguration restLogConfig = logConfigurationMapper.selectOne(Wrappers.lambdaQuery(LogConfiguration.class).eq(LogConfiguration::getLogName, "REST"));
        System.out.println(restLogConfig);
        //存在的值都拼接到set中
        restLogConfig.setLogLevel(2);
        //null值忽略
        restLogConfig.setFilesNum(null);
        //空字符串拼接到set中
        restLogConfig.setRemark(StringUtils.EMPTY);
        //相当于updateByExampleSelective，第二个参数拼接where条件
        logConfigurationMapper.update(restLogConfig, Wrappers.lambdaUpdate(LogConfiguration.class).eq(LogConfiguration::getLogName, "REST"));
        System.out.println(logConfigurationMapper.selectOne(Wrappers.lambdaQuery(LogConfiguration.class).eq(LogConfiguration::getLogName, "REST")));
    }
}
