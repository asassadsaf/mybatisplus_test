package com.fkp.util;

import com.alibaba.fastjson.JSON;
import com.fkp.domain.KmsServer;
import com.fkp.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MapperUtils {

    private final SqlSession sqlSession;

    private final TestMapper testMapper;

    {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.sqlSessionFactory;
        this.sqlSession = sqlSessionFactory.openSession();
        this.testMapper = this.sqlSession.getMapper(TestMapper.class);

    }

//    public String selectAll(){
//        List<KmsServer> kmsServers = testMapper.selectList(null);
//        return JSON.toJSONString(kmsServers);
//    }

    public void closeSqlSession(){
        this.sqlSession.close();
    }
}
