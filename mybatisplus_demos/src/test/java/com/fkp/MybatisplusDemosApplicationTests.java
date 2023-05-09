package com.fkp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.fkp.test.entity.KmsServer;
import com.fkp.test.mapper.KmsServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

@SpringBootTest
class MybatisplusDemosApplicationTests {

    @Autowired
    private KmsServerMapper kmsServerMapper;

    @Test
    void test() {
        List<KmsServer> kmsServers = kmsServerMapper.selectList(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getId, "1"));
        System.out.println(kmsServers);
    }

    @Test
    void test2() {
        Map<SFunction<KmsServer, ?>, Object> queryCondition = new HashMap<>();
        queryCondition.put(KmsServer::getTypeName, "REST");
        queryCondition.put(KmsServer::getDevelLanguage, "java");
        List<KmsServer> kmsServers = kmsServerMapper.selectList(Wrappers.lambdaQuery(KmsServer.class).allEq(queryCondition));
        System.out.println(kmsServers);
    }

    @Test
    void test3() {
        LambdaQueryWrapper<KmsServer> kmsServerLambdaQueryWrapper = Wrappers.lambdaQuery(KmsServer.class);
        kmsServerLambdaQueryWrapper.eq(KmsServer::getDevelLanguage, "java");
        kmsServerLambdaQueryWrapper.eq(KmsServer::getTypeName, "REST");
        List<KmsServer> kmsServers = kmsServerMapper.selectList(kmsServerLambdaQueryWrapper);
        System.out.println(kmsServers);
    }

}
