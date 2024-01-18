package com.fkp.dynamic_table_name.config;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author fkp
 */
@Component
public class IdDynamicTableNameInterceptor implements InnerInterceptor {

    @Override
    public boolean willDoUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {

        return true;
    }

    @Override
    public boolean willDoQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        Object id = getRealParameter(parameter, "id");
        System.out.println(id);
        return true;
    }

    @Override
    public void beforeQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {

    }

    @Override
    public void beforeUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {

    }

    @Override
    public void beforePrepare(StatementHandler sh, Connection connection, Integer transactionTimeout) {
        // 在准备 SQL 语句之前获取连接等信息
        System.out.println("Before Prepare Connection: " + connection);
    }

    @Override
    public void beforeGetBoundSql(StatementHandler sh) {
        // 在获取 BoundSql 对象之前获取 StatementHandler 信息
        System.out.println("Before GetBoundSql StatementHandler: " + sh);
    }

    @Override
    public void setProperties(Properties properties) {
        InnerInterceptor.super.setProperties(properties);
    }

    // 获取真实的参数
    private Object getRealParameter(Object parameter, String column) {
        if(parameter instanceof MapperMethod.ParamMap){
            Object wrapper = ((MapperMethod.ParamMap) parameter).get("ew");
            if(wrapper instanceof LambdaQueryWrapper){
                LambdaQueryWrapper lambdaQueryWrapper = (LambdaQueryWrapper) wrapper;
                Map<String, Object> paramMap = lambdaQueryWrapper.getParamNameValuePairs();
                String sql = lambdaQueryWrapper.getSqlSegment();
                if(!sql.contains(column)){
                    throw new IllegalArgumentException(column + "is not sql condition.");
                }
                String[] split = StringUtils.substringBetween(sql, column, "}").split("\\.");
                String columnKey = split[split.length - 1];
                 return paramMap.get(columnKey);
            }
        }
        return null;
    }
}

