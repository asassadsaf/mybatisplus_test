package com.fkp;

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
        List<KmsServer> kmsServers = kmsServerMapper.selectList(null);
        System.out.println(kmsServers);
    }

}
