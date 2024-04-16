package com.fkp.service.impl;

import com.fkp.domain.LockTable;
import com.fkp.domain.LogConfiguration;
import com.fkp.mapper.LockTableMapper;
import com.fkp.mapper.LogConfigurationMapper;
import com.fkp.service.TestService2;
import com.fkp.service.TestService2Inner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/4/16 17:44
 */
@Service
@Slf4j
public class TestService2Impl implements TestService2 {

    @Autowired
    private LockTableMapper mapper;

    @Autowired
    private LogConfigurationMapper logConfigurationMapper;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    @Autowired
    private TestService2Inner testService2Inner;

    @Override
    @Transactional
    public String save(LockTable lockTable) {
        LogConfiguration logConfiguration = new LogConfiguration();
        logConfiguration.setId(UUID.randomUUID().toString().substring(0,32));
        //调用代理类的doLock方法，指定的事务传播级别生效。
        String s = testService2Inner.doLock(lockTable);
        int insert = logConfigurationMapper.insert(logConfiguration);
//        int i = 1/0;
        return s;
//        return String.valueOf(insert);
    }

    //调用本类的doLock方法时，指定的事务传播级别失效
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String doLock(LockTable lockTable){
        log.info("call acquireLock...");
        String s = acquireLock(lockTable);
//        int i = 1/0;
        return s;
    }

    private String acquireLock(LockTable lockTable){
        return String.valueOf(mapper.insert(lockTable));
    }
}
