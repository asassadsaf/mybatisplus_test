package com.fkp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/7/14 15:21
 */
public class ConvertTest {

    @Test
    void testConvert() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\fengkunpeng\\Desktop\\730\\sql\\gauss\\old\\svs-gauss.sql");
        BufferedReader br = new BufferedReader(reader);
        FileWriter writer = new FileWriter("C:\\Users\\fengkunpeng\\Desktop\\730\\sql\\gauss\\new\\svs-gauss.sql");
        BufferedWriter bw = new BufferedWriter(writer);
        String s = null;
        while ((s = br.readLine()) != null){
            if(s.contains("varchar") || s.contains("text")){
                //utf8mb4_bin大小写敏感  utf8mb4_general_ci大小写不敏感
                s = s.replaceAll("pg_catalog.default", "pg_catalog.utf8mb4_general_ci");
            }
            bw.write(s + "\r\n");
        };
        bw.close();
        bw.close();
    }

    @Test
    void testReplaceAll(){
        String s = "varchar(32) not null";
        s = s.replaceAll("pg_catalog.default", "pg_catalog.utf8mb4_general_ci");
        System.out.println(s);
    }
}
