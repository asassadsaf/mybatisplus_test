package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.postgresql.entity.PersonByte;
import com.fkp.postgresql.mapper.PersonByteMapper;
import com.fkp.test.entity.KmsServer;
import com.fkp.test.mapper.KmsServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class PostgresqlApplicationTests {

    @Autowired
    private PersonByteMapper personByteMapper;

    @Test
    void test() {
        List<PersonByte> personBytes = personByteMapper.selectList(Wrappers.emptyWrapper());
        System.out.println(personBytes);
    }

    @Test
    void testInsert(){
        PersonByte personByte = new PersonByte();
        personByte.setId(UUID.randomUUID().toString());
        personByte.setName("zhangsan");
        personByte.setByteContent(new byte[]{1,2,3,4});
        personByteMapper.insert(personByte);
    }

    @Test
    void testInsertNull(){
        PersonByte personByte = new PersonByte();
        personByte.setId(UUID.randomUUID().toString());
        personByte.setName("zhangsan");
        personByte.setByteContent(null);
        personByteMapper.insert(personByte);
    }

    @Test
    void testInsertEmpty(){
        PersonByte personByte = new PersonByte();
        personByte.setId(UUID.randomUUID().toString());
        personByte.setName("zhangsan");
        personByte.setByteContent(new byte[0]);
        personByteMapper.insert(personByte);
    }

}
