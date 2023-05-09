package com.fkp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fkp.test.entity.KmsServer;
import com.fkp.test.mapper.KmsServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusDemosApplicationTests {

    @Autowired
    private KmsServerMapper kmsServerMapper;

    @Test
    void contextLoads() {
        List<KmsServer> kmsServers = kmsServerMapper.selectList(new LambdaQueryWrapper<KmsServer>(KmsServer.class).eq(KmsServer::getId, "1"));
        System.out.println(kmsServers);
    }

}
