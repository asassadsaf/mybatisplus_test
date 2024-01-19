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
     * 测试通过手动设置来动态修改表名功能
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

    /**
     * 测试通过固定策略来动态修改表名功能
     */
    @Test
    void contextLoads2() {
        //以主键id%3的策略动态修改表名，t_user(id%3)
        //查询
        System.out.println(userMapper.selectList(Wrappers.query(new User()).eq("id", 3).eq("name", "fkp")));

        //插入
        User user = User.builder().id(12).name("fkp").age(25).build();
        System.out.println(userMapper.insert(user));

        //修改
        //主键在实体类中不生效
//        User user = User.builder().id(12).name("fkp2").build();
//        System.out.println(userMapper.update(user, Wrappers.emptyWrapper()));

        User user2 = User.builder().name("fkp3").build();
        System.out.println(userMapper.update(user2, Wrappers.lambdaUpdate(User.class).eq(User::getId, 11)));

        //删除
        System.out.println(userMapper.delete(Wrappers.lambdaQuery(User.class).eq(User::getId, 11)));
    }

}
