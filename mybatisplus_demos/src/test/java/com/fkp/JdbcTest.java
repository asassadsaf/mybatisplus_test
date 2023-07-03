package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.postgresql.entity.PersonByte;
import com.fkp.postgresql.mapper.PersonByteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.sql.*;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class JdbcTest {

    @Test
    void test() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.200.200:5432/postgres?currentSchema=public", "gaussdb", "Fkp@123456");
        //开启事务
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement("insert into gauss_person_byte values (?, ?, ?, ?)");
        preparedStatement.setString(1, UUID.randomUUID().toString());
        preparedStatement.setString(2, "zhangsan");
        byte[] bytes = {1, 2, 3, 4};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        //gaussDB的bytea类型可以通过setBinaryStream,setBytes,setObject插入数据，setBlob不可用，报错openGauss does not support large object yet
//        preparedStatement.setBinaryStream(3, inputStream);
//        preparedStatement.setBytes(3, bytes);
//        preparedStatement.setObject(3, bytes);
        preparedStatement.setBlob(3, inputStream);
        //gaussDB的bytea类型插入null的JDBCType可以为VARBINARY，NULL，OTHER，通过BLOB报错：column "byte_content" is of type bytea but expression is of type oid
//        preparedStatement.setNull(3, JDBCType.VARBINARY.getVendorTypeNumber());
//        preparedStatement.setNull(3, JDBCType.BLOB.getVendorTypeNumber());
//        preparedStatement.setNull(3, JDBCType.NULL.getVendorTypeNumber());
//        preparedStatement.setNull(3, JDBCType.OTHER.getVendorTypeNumber());
        //gaussDB的blob类型，通过setObject,setBytes,setBinaryStream均无法插入，报错：column "byte_content2" is of type blob but expression is of type bytea；通过setBlob也无法插入，报错：openGauss does not support large object yet
//        preparedStatement.setObject(4, bytes);
//        preparedStatement.setBytes(4, bytes);
//        preparedStatement.setBinaryStream(4, inputStream);
//        preparedStatement.setBlob(4, inputStream);
        //gaussDB的blob类型插入null,JDBCType为BLOB,VARBINARY均无法插入，通过OTHER,NULL可以插入
//        preparedStatement.setNull(4, JDBCType.OTHER.getVendorTypeNumber());
        preparedStatement.setNull(4, JDBCType.NULL.getVendorTypeNumber());
        boolean execute = preparedStatement.execute();
        //提交事务
        connection.commit();
        System.out.println(execute);
        preparedStatement.close();
        connection.close();
    }

}
