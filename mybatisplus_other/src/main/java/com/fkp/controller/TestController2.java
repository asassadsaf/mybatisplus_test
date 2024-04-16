package com.fkp.controller;

import com.fkp.domain.LockTable;
import com.fkp.service.TestService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/4/16 17:43
 */
@RestController
@Slf4j
public class TestController2 {

    @Autowired
    private TestService2 testService2;

    @PostMapping (value = "/test")
    public String test(@RequestBody LockTable lockTable){
//        String s = testService2.doLock(lockTable);
//        log.info("doLock result: {}", s);
        return testService2.save(lockTable);
    }
}
