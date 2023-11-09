package com.fkp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.test.entity.KeyBusinessUser;
import com.fkp.test.mapper.KeyBusinessUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/10/18 16:57
 */
@SpringBootTest
public class ParaphraseInterceptorTest {

    @Autowired
    private KeyBusinessUserMapper keyBusinessUserMapper;

    @Test
    void test1(){
        List<KeyBusinessUser> keyBusinessUsers = keyBusinessUserMapper.selectList(Wrappers.emptyWrapper());
        System.out.println(keyBusinessUsers);
    }
}
