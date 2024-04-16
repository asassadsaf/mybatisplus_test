package com.fkp.service;

import com.fkp.domain.LockTable;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/4/16 17:43
 */
public interface TestService2 {

    String save(LockTable lockTable);

    String doLock(LockTable lockTable);
}
