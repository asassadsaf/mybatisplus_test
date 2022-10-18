package com.fkp.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlSessionFactoryUtils {

    public static SqlSessionFactory sqlSessionFactory;

    @Autowired
    private void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        if(SqlSessionFactoryUtils.sqlSessionFactory == null){
            SqlSessionFactoryUtils.sqlSessionFactory = sqlSessionFactory;
        }
    }
}
