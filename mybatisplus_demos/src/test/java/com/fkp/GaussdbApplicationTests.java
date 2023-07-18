package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.gaussdb.entity.EncDirEntity;
import com.fkp.gaussdb.entity.GaussPersonByte;
import com.fkp.gaussdb.mapper.EncDirDAO;
import com.fkp.gaussdb.mapper.GaussPersonByteMapper;
import com.fkp.postgresql.entity.PersonByte;
import com.fkp.postgresql.mapper.PersonByteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class GaussdbApplicationTests {

    @Autowired
    private GaussPersonByteMapper gaussPersonByteMapper;

    @Autowired
    private EncDirDAO encDirDAO;

    @Test
    void test() {
        List<GaussPersonByte> gaussPersonBytes = gaussPersonByteMapper.selectList(Wrappers.emptyWrapper());
        System.out.println(gaussPersonBytes);
    }

    @Test
    void testInsert(){
        GaussPersonByte gaussPersonByte = new GaussPersonByte();
        gaussPersonByte.setId(UUID.randomUUID().toString());
        gaussPersonByte.setName("zhangsan");
//        gaussPersonByte.setByteContentBytea(new byte[]{1,2,3,4});
        gaussPersonByte.setByteContentBlob(new byte[]{1,2,3,4});
        gaussPersonByteMapper.insert(gaussPersonByte);
    }

    @Test
    void testInsertNull(){
        GaussPersonByte gaussPersonByte = new GaussPersonByte();
        gaussPersonByte.setId(UUID.randomUUID().toString());
        gaussPersonByte.setName("zhangsan");
        gaussPersonByte.setByteContentBytea(null);
//        gaussPersonByte.setByteContentBlob(null);
        gaussPersonByteMapper.insert(gaussPersonByte);
    }

    @Test
    void testInsertEmpty(){
        GaussPersonByte gaussPersonByte = new GaussPersonByte();
        gaussPersonByte.setId(UUID.randomUUID().toString());
        gaussPersonByte.setName("zhangsan");
//        gaussPersonByte.setByteContentBytea(new byte[0]);
        gaussPersonByte.setByteContentBlob(new byte[0]);
        gaussPersonByteMapper.insert(gaussPersonByte);
    }

    @Test
    void testUpdate(){
        GaussPersonByte gaussPersonByte = gaussPersonByteMapper.selectOne(Wrappers.lambdaQuery(GaussPersonByte.class).eq(GaussPersonByte::getId, "8086bba1-0332-49f2-8709-1ee0f2921fab"));
//        gaussPersonByte.setByteContentBlob(new byte[]{1,2,3,4,5,6});
        gaussPersonByte.setByteContentBytea(new byte[]{1,2,3,4,5,6});
        gaussPersonByteMapper.updateById(gaussPersonByte);
    }

    @Test
    void testUpdateNull(){
        GaussPersonByte gaussPersonByte = gaussPersonByteMapper.selectOne(Wrappers.lambdaQuery(GaussPersonByte.class).eq(GaussPersonByte::getId, "8086bba1-0332-49f2-8709-1ee0f2921fab"));
        gaussPersonByte.setByteContentBlob(null);
//        gaussPersonByte.setByteContentBytea(null);
//        gaussPersonByteMapper.update(gaussPersonByte, Wrappers.lambdaUpdate(GaussPersonByte.class).eq(GaussPersonByte::getId, gaussPersonByte.getId()).set(GaussPersonByte::getByteContentBytea, gaussPersonByte.getByteContentBytea()));
        gaussPersonByteMapper.update(null, Wrappers.lambdaUpdate(GaussPersonByte.class).eq(GaussPersonByte::getId, gaussPersonByte.getId()).set(GaussPersonByte::getByteContentBlob, gaussPersonByte.getByteContentBlob()));
    }

    @Test
    @Transactional
    void testUpdateEmpty(){
        GaussPersonByte gaussPersonByte = gaussPersonByteMapper.selectOne(Wrappers.lambdaQuery(GaussPersonByte.class).eq(GaussPersonByte::getId, "8086bba1-0332-49f2-8709-1ee0f2921fab"));
        gaussPersonByte.setByteContentBlob(new byte[0]);
//        gaussPersonByte.setByteContentBytea(new byte[0]);
        gaussPersonByteMapper.updateById(gaussPersonByte);
    }

    @Test
    void testSelectByMsg(){
        EncDirEntity entity = new EncDirEntity();
        entity.setDirName("/home/fkp/aaa");
        entity.setServer_ip("10.0.103.160");
        EncDirEntity res = encDirDAO.selectByMsg(entity);
        System.out.println(res);
    }

}
