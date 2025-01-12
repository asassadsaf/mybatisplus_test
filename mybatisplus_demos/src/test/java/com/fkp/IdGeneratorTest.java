package com.fkp;

import com.fkp.util.StrIdGenerator;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2024/6/20 15:28
 */
public class IdGeneratorTest {

    @Test
    void test(){
        String s = StrIdGenerator.getInstance().nextId();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(String.valueOf(Long.MAX_VALUE).length());

    }
}
