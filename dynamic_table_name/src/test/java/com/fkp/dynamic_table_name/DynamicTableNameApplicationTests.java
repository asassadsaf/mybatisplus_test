package com.fkp.dynamic_table_name;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.dynamic_table_name.entity.User;
import com.fkp.dynamic_table_name.mapper.UserMapper;
import com.fkp.dynamic_table_name.utils.DynamicTableNameUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicTableNameApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试动态修改表名功能
     */
    @Test
    void contextLoads() {
        //手动切换到t_user2
        DynamicTableNameUtils.applyTable(2);
        System.out.println(userMapper.selectList(Wrappers.lambdaQuery(User.class).eq(User::getId, 2).eq(User::getName, "fkp")));

//        //检查操作上次操作完后是否恢复到查询默认t_user
//        System.out.println(userMapper.selectList(Wrappers.emptyWrapper()));
//
//        //手动切换到t_user3
//        DynamicTableNameUtils.applyTable(3);
//        System.out.println(userMapper.selectList(Wrappers.emptyWrapper()));
//
//        //检查操作上次操作完后是否恢复到查询默认t_user
//        System.out.println(userMapper.selectList(Wrappers.emptyWrapper()));

    }

}
