package com.fkp.dynamic_table_name.utils;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 15:56
 */
public class DynamicTableNameUtils {

    private static final ThreadLocal<Boolean> IS_KEY_OBJECT_HISTORY_TABLE = new ThreadLocal<>();

    public static void applyKeyObjectHistoryTable(){
        IS_KEY_OBJECT_HISTORY_TABLE.set(true);
    }

    public static void releaseKeyObjectHistoryTable(){
        IS_KEY_OBJECT_HISTORY_TABLE.remove();
    }

    public static Boolean getKeyObjectHistoryTable(){
        return IS_KEY_OBJECT_HISTORY_TABLE.get();
    }
}
