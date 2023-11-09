package com.sansec.dynamic_mp.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sansec.dynamic_mp.entity.BusinessUser;
import com.sansec.dynamic_mp.mapper.BusinessUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/11/9 16:35
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class BusinessUserController {

    @Autowired
    private BusinessUserMapper businessUserMapper;

    @PostMapping(value = "/save")
    public String save(@RequestBody BusinessUser businessUser){
        int insert = businessUserMapper.insert(businessUser);
        return String.valueOf(insert);
    }

    @GetMapping(value = "/query")
    public String query(@RequestParam("username") String username){
        BusinessUser businessUser = businessUserMapper.selectOne(Wrappers.lambdaQuery(BusinessUser.class).eq(BusinessUser::getUsername, username));
        return JSON.toJSONString(businessUser);
    }
}
