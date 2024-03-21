package com.fkp.dynamic_datasource;

import com.fkp.dynamic_datasource.annotation.LocalDS;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicDatasourceApplicationTests {

    @Test
    @LocalDS
    void contextLoads() {
        System.out.println();
    }

}
