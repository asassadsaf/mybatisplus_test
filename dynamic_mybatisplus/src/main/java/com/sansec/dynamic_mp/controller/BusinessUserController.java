package com.sansec.dynamic_mp.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sansec.dynamic_mp.entity.BusinessUser;
import com.sansec.dynamic_mp.mapper.BusinessUserMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
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

    @Autowired
    private TransactionTemplate transactionTemplate;

    @PostMapping(value = "/save")
    @Transactional
    public String save(@RequestBody BusinessUser businessUser){
        BusinessUser businessUser1 = businessUserMapper.selectOne(Wrappers.lambdaQuery(BusinessUser.class).eq(BusinessUser::getUsername, businessUser.getUsername()));
        System.out.println(businessUser1);
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(@NotNull TransactionStatus status) {
//                try {
//                    int insert = businessUserMapper.insert(businessUser);
//                    System.out.println(insert);
//                }catch (Exception e){
//                    e.printStackTrace();
//                    status.setRollbackOnly();
//                }
//            }
//        });
        int insert = businessUserMapper.insert(businessUser);
        System.out.println(insert);

        return "1";
    }

    @GetMapping(value = "/query")
//    @Transactional
    public String query(@RequestParam("username") String username){
        BusinessUser businessUser = businessUserMapper.selectOne(Wrappers.lambdaQuery(BusinessUser.class).eq(BusinessUser::getUsername, username));
        return JSON.toJSONString(businessUser);
    }
}
