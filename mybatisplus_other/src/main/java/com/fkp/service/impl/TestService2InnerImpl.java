package com.fkp.service.impl;

import com.fkp.domain.LockTable;
import com.fkp.mapper.LockTableMapper;
import com.fkp.service.TestService2Inner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/4/16 20:19
 */
@Service
@Slf4j
public class TestService2InnerImpl implements TestService2Inner {


    @Autowired
    private LockTableMapper mapper;

    //REQUIRES_NEW事务传播级别，开启一个新事务，和原先事务独立运行，方法执行完成立即提交事务，且原先事务回滚不会影响该事务。
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
