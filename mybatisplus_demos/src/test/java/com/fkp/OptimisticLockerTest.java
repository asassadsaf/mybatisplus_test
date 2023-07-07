package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.test.entity.KmsServer;
import com.fkp.test.mapper.KmsServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/7/7 17:05
 */
@SpringBootTest
public class OptimisticLockerTest {

    @Autowired
    private KmsServerMapper mapper;

    @Test
    void test() throws InterruptedException {
        int count = 50;
        KmsServer insertData = new KmsServer("001", "0", "/opt", "/opt", "/opt", "java");
        mapper.insert(insertData);
        Runnable task = () -> {
            for (int i = 0; i < count; i++) {
                KmsServer kmsServer = mapper.selectOne(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getId, "001"));
                int update = mapper.update(null, Wrappers.lambdaUpdate(KmsServer.class).set(KmsServer::getTypeName, Integer.parseInt(kmsServer.getTypeName()) + 1).eq(KmsServer::getTypeName, kmsServer.getTypeName()));
                while (update <= 0) {
                    kmsServer = mapper.selectOne(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getId, "001"));
                    update = mapper.update(null, Wrappers.lambdaUpdate(KmsServer.class).set(KmsServer::getTypeName, Integer.parseInt(kmsServer.getTypeName()) + 1).eq(KmsServer::getTypeName, kmsServer.getTypeName()));
                }
            }
        };
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(mapper.selectList(Wrappers.emptyWrapper()));
    }
}
