package com.fkp.dynamic_table_name.utils;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 15:56
 */
public class DynamicTableNameUtils {

    //t_user -> t_user0 - t_user2
    private static final ThreadLocal<Integer> DYNAMIC_TABLE_T_USER = new ThreadLocal<>();

    static {
        DYNAMIC_TABLE_T_USER.set(0);
    }

    public static void applyTable(int index){
        DYNAMIC_TABLE_T_USER.set(index);
    }

    public static void releaseCurrTableName(){
        //默认访问t_user1
        DYNAMIC_TABLE_T_USER.set(0);
    }

    public static String getCurrTableName(){
        return "t_user" + DYNAMIC_TABLE_T_USER.get();
    }
}
