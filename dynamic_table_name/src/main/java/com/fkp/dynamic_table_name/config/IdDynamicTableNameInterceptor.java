package com.fkp.dynamic_table_name.config;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.fkp.dynamic_table_name.utils.DynamicTableNameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fkp
 * @description 根据主键id%3的策略动态修改表名的拦截器示例
 */
@Component
public class IdDynamicTableNameInterceptor implements InnerInterceptor {

    @Override
    public void beforeQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        Object param = getRealParameter(ms, parameter, "id");
        int id;
        if(param instanceof Integer){
            id = (Integer) param;
        }else if(param instanceof String && StringUtils.isNumeric((String) param)){
            id = Integer.parseInt((String) param);
        }else {
            throw new IllegalArgumentException("column is not numeric.");
        }
        DynamicTableNameUtils.applyTable(id % 3);
    }

    @Override
    public void beforeUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {
        Integer id = (Integer) getRealParameter(ms, parameter, "id");
        DynamicTableNameUtils.applyTable(id % 3);
    }

    // 获取真实的参数
    private Object getRealParameter(MappedStatement ms, Object parameter, String column) {
        if (ms.getSqlCommandType().equals(SqlCommandType.INSERT)) {
            Field declaredField;
            try {
                declaredField = parameter.getClass().getDeclaredField(column);
            } catch (NoSuchFieldException e) {
                throw new IllegalArgumentException("column: " + column + " not exist.", e);
            }
            declaredField.setAccessible(true);
            try {
                return declaredField.get(parameter);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }else {
            if(parameter instanceof MapperMethod.ParamMap){
                Object wrapper = ((MapperMethod.ParamMap) parameter).get("ew");
                if(wrapper instanceof AbstractWrapper){
                    AbstractWrapper abstractWrapper = (AbstractWrapper) wrapper;
                    Map<String, Object> paramMap = abstractWrapper.getParamNameValuePairs();
                    String sql = abstractWrapper.getSqlSegment();
                    if(!sql.contains(column)){
                        throw new IllegalArgumentException(column + "is not sql condition.");
                    }
                    String[] split = StringUtils.substringBetween(sql, column, "}").split("\\.");
                    String columnKey = split[split.length - 1];
                    return paramMap.get(columnKey);
                }
            }
            throw new IllegalArgumentException("parameter type error or column not exist. column: " + column);
        }

    }
}

