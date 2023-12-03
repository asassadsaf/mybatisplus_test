package com.fkp.dynamic_table_name;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fkp.dynamic_table_name.mapper.KeyObjectMapper;
import com.fkp.dynamic_table_name.utils.DynamicTableNameUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicTableNameApplicationTests {

    @Autowired
    private KeyObjectMapper keyObjectMapper;

    /**
     * 测试动态修改表名功能
     */
    @Test
    void contextLoads() {
        //操作key_object表
        System.out.println(keyObjectMapper.selectList(Wrappers.emptyWrapper()));

        //通过设置标志位实际操作key_object_history表
        DynamicTableNameUtils.applyKeyObjectHistoryTable();
        System.out.println(keyObjectMapper.selectList(Wrappers.emptyWrapper()));

        //测试上述修改标志位后是否对原key_object表的操作造成影响
        System.out.println(keyObjectMapper.selectList(Wrappers.emptyWrapper()));

    }

}
