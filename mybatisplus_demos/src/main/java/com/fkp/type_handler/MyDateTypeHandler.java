package com.fkp.type_handler;

import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateTypeHandler extends DateTypeHandler {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = format.format(parameter);
        ps.setString(i, dateFormat);
    }
}
