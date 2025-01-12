package com.fkp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.test.entity.KeyObject;
import com.fkp.test.entity.KeyServer;
import com.fkp.test.entity.LogConfiguration;
import com.fkp.test.mapper.KeyObjectMapper;
import com.fkp.test.mapper.KeyServerMapper;
import com.fkp.test.mapper.LogConfigurationMapper;
import com.fkp.util.MybatisPlusUtils;
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

    @Autowired
    private KeyObjectMapper keyObjectMapper;
    public static final String KEY_INFO_CACHE_KEY_ALG_PREFIX = "key_statistics_";
    private static final String[] ALGS = {"AES", "3DES", "SM4", "HMAC_SHA1", "HMAC_SHA224", "HMAC_SHA256", "HMAC_SHA384", "HMAC_SHA512", "HMAC_SM3", "SM2", "RSA", "ECDSA", "SM1", "SM9"};
    public static final String KEY_INFO_CACHE_KEY_STATE_PREFIX = "key_statistics_state_";
    private static final Integer PRE_ACTIVE_STATE = 1;
    private static final Integer ACTIVE_STATE = 2;
    private static final Integer DE_ACTIVATED_STATE = 3;
    private static final Integer DESTROYED_STATE = 5;

    Map<String, Map<String, Long>> initKeyAlgStateMap(){
        Map<String, Map<String, Long>> map = new HashMap<>();
        for (String alg : ALGS) {
            map.put(KEY_INFO_CACHE_KEY_ALG_PREFIX + alg, initStateMap());
        }
        return map;
    }

    Map<String, Long> initStateMap(){
        Map<String, Long> stateMap = new HashMap<>();
        stateMap.put(KEY_INFO_CACHE_KEY_STATE_PREFIX + PRE_ACTIVE_STATE, 0L);
        stateMap.put(KEY_INFO_CACHE_KEY_STATE_PREFIX + ACTIVE_STATE, 0L);
        stateMap.put(KEY_INFO_CACHE_KEY_STATE_PREFIX + DE_ACTIVATED_STATE, 0L);
        stateMap.put(KEY_INFO_CACHE_KEY_STATE_PREFIX + DESTROYED_STATE, 0L);
        return stateMap;
    }

    @Test
    void testGroup(){
        Map<String, Map<String, Long>> resMap = initKeyAlgStateMap();
        String algField = MybatisPlusUtils.getColumnNameByRef(KeyObject::getSCryptographicAlgorithm);
        String stateField = MybatisPlusUtils.getColumnNameByRef(KeyObject::getSState);
        QueryWrapper<KeyObject> keyObjectQueryWrapper = new QueryWrapper<>();
        keyObjectQueryWrapper.select("count(1) as count", algField, stateField)
                        .groupBy(algField, stateField);
        List<Map<String, Object>> maps = keyObjectMapper.selectMaps(keyObjectQueryWrapper);

        for (Map<String, Object> map : maps) {
            String algorithm = (String) map.get(StringUtils.lowerCase(algField, Locale.ROOT));
            if(StringUtils.isBlank(algorithm)){
                continue;
            }
            Integer state = (Integer) map.get(StringUtils.lowerCase(stateField, Locale.ROOT));
            Long count = (Long) map.get("count");
            resMap.computeIfAbsent(KEY_INFO_CACHE_KEY_ALG_PREFIX + algorithm, k -> initStateMap())
                    .put(KEY_INFO_CACHE_KEY_STATE_PREFIX + state, count);
        }
        System.out.println(resMap);
    }

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
