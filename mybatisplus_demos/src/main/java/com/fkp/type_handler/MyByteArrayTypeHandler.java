package com.fkp.type_handler;

import org.apache.ibatis.type.ByteArrayTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//public class MyByteArrayTypeHandler extends ByteArrayTypeHandler {
//    @Override
//    public void setNonNullParameter(PreparedStatement ps, int i, byte[] parameter, JdbcType jdbcType) throws SQLException {
//        try (InputStream in = new ByteArrayInputStream(parameter)){
//            ps.setBlob(i, in);
//        }catch (IOException e){
//            throw new RuntimeException("TypeHandler byte to ByteArrayInputStream exception.", e);
//        }
//    }
//}
