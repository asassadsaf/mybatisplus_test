package com.sansec.dynamic_mp.config;

import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.sansec.dynamic_mp.constant.DynamicDataSourceGlobalEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author fengkunpeng
 */
@Slf4j
public class WriteReadMybatisIntercepts implements InnerInterceptor {

    @Override
    public boolean willDoQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        log.info("willDoQuery");
        DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobalEnum.READ);
        return true;
    }

    @Override
    public boolean willDoUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {
        log.info("willDoUpdate");
        DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobalEnum.WRITE);
        return true;
    }

    @Override
    public void beforeQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        log.info("beforeQuery");
    }

    @Override
    public void beforeUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {
        log.info("beforeUpdate");
    }

    @Override
    public void beforePrepare(StatementHandler sh, Connection connection, Integer transactionTimeout) {
        log.info("beforePrepare");
    }
}
