package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.mapper.LockTableMapper;
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/6/3 15:50
 */
@SpringBootTest
public class DruidCallBackTest {

    @Autowired
    private LockTableMapper mapper;

    @Value("${spring.datasource.druid.password}")
    private String datasourcePwd;

    @Test
    void test(){
//        System.out.println(Base64.encodeBase64String(datasourcePwd.getBytes()));
        System.out.println(mapper.selectList(Wrappers.emptyWrapper()));

    }
}
