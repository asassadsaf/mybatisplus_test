package com.fkp.dynamic_datasource.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.dynamic_datasource.annotation.LocalDS;
import com.fkp.dynamic_datasource.mapper.BusinessUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/3/21 17:30
 */
@RestController
public class TestController {

    @Autowired
    private BusinessUserMapper mapper;

    @GetMapping(value = "/testLocal")
    @LocalDS
    public String testLocal(){
        Long aLong = mapper.selectCount(Wrappers.emptyWrapper());
        return "success local" + aLong;
    }

    @GetMapping(value = "/testRemote")
    public String testRemote(){
        Long aLong = mapper.selectCount(Wrappers.emptyWrapper());
        return "success remote" + aLong;
    }
}
