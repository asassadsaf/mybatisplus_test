package com.fkp;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
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
 * @date 2023/7/7 13:50
 */
@SpringBootTest
public class MybatisPlusIdGeneratorTest {

    @Autowired
    private KmsServerMapper mapper;

    /**
     * 测试实体注解@TableId，详细参考：<a href="https://www.baomidou.com/pages/223848/#tableid">...</a>
     */
    @Test
    void testTableId(){
        KmsServer kmsServer = mapper.selectOne(Wrappers.lambdaQuery(KmsServer.class).eq(KmsServer::getId, "1"));
        //测试@TableId(type = IdType.ASSIGN_ID)使用雪花算法生成ID，自动set到标注的字段
        kmsServer.setId(null);
        kmsServer.setTypeName("tableIdTest");
        mapper.insert(kmsServer);
        System.out.println("================result==================");
        System.out.println(mapper.selectList(Wrappers.emptyWrapper()));
    }

    @Test
    void testIdGenerator(){
        DefaultIdentifierGenerator defaultIdentifierGenerator = new DefaultIdentifierGenerator();
        System.out.println(defaultIdentifierGenerator.nextId(null).toString().length());
    }
}
