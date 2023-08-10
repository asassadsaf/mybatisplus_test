package com.fkp;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.*;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/7/14 15:21
 */
public class ConvertTest {

//    @Test
//    void testConvert() throws IOException {
//        FileReader reader = new FileReader("C:\\Users\\fengkunpeng\\Desktop\\730\\sql\\gauss\\old\\svs-gauss.sql");
//        BufferedReader br = new BufferedReader(reader);
//        FileWriter writer = new FileWriter("C:\\Users\\fengkunpeng\\Desktop\\730\\sql\\gauss\\new\\svs-gauss.sql");
//        BufferedWriter bw = new BufferedWriter(writer);
//        String s = null;
//        while ((s = br.readLine()) != null){
//            if(s.contains("varchar") || s.contains("text")){
//                //utf8mb4_bin大小写敏感  utf8mb4_general_ci大小写不敏感
//                s = s.replaceAll("pg_catalog.default", "pg_catalog.utf8mb4_general_ci");
//            }
//            bw.write(s + "\r\n");
//        };
//        bw.close();
//        bw.close();
//    }
//
//    @Test
//    void testReplaceAll(){
//        String s = "varchar(32) not null";
//        s = s.replaceAll("pg_catalog.default", "pg_catalog.utf8mb4_general_ci");
//        System.out.println(s);
//    }

    @Test
    void testCheckPrimaryKey() throws IOException {
        RandomAccessFile ras = new RandomAccessFile("C:\\Users\\fengkunpeng\\Desktop\\svs-gauss.sql", "r");
        Map<String, String> tableInfos = getTableNames(ras);
        Map<String, String> tablePrimaryKey = getTablePrimaryKey(ras);
        for (Map.Entry<String, String> entry : tableInfos.entrySet()) {
            String tableName = entry.getKey();
            String primaryKey = tablePrimaryKey.get(tableName);
            if(!entry.getValue().equals(primaryKey)){
                System.out.println(tableName);
            }
//            System.out.println(tableName + "\t" + entry.getValue().equals(primaryKey));
        }
        System.out.println(tablePrimaryKey);
    }

    Map<String, String> getTableNames(RandomAccessFile ras) throws IOException {
       Map<String, String> tableInfos = new HashMap<>();
        String line;
        while ((line = ras.readLine()) != null){
            if(line.contains("CREATE TABLE ")){
                String tableName = line.replaceAll("CREATE TABLE", "").replaceAll(" ", "").replaceAll("\\(", "");
                String oneLine = ras.readLine();
                String columnName = getColumnName(oneLine);
                tableInfos.put(tableName, columnName);
            }
        }
        ras.seek(0);
        return tableInfos;
    }

    Map<String, String> getTablePrimaryKey(RandomAccessFile ras) throws IOException {
        Map<String, String> tableInfos = new HashMap<>();
        String line;
        while ((line = ras.readLine()) != null){
            if(line.contains("ALTER TABLE ") && line.contains("PRIMARY KEY")){
                String[] split = StringUtils.substringAfter(line, "ALTER TABLE ").split(" ");
                String tableName = split[0];
                String primaryKeyName = split[split.length-1].replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(";", "");
                tableInfos.put(tableName, primaryKeyName);
            }
        }
        ras.seek(0);
        return tableInfos;
    }


    String getColumnName(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                return s.substring(i).split(" ")[0];
            }
        }
        return null;
    }
}
