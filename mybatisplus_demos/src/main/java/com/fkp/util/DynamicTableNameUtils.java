package com.fkp.util;

/**
 * @author fengkunpeng
 * @version 1.0
 * @description
 * @date 2023/9/20 15:56
 */
public enum DynamicTableNameUtils {
    INSTANCE;

    private final ThreadLocal<Boolean> isKeyObjectHistoryTable = new ThreadLocal<>();

    public void applyKeyObjectHistoryTable(){
        this.isKeyObjectHistoryTable.set(true);
    }

    public void releaseKeyObjectHistoryTable(){
        this.isKeyObjectHistoryTable.remove();
    }

    public Boolean getKeyObjectHistoryTable(){
        return this.isKeyObjectHistoryTable.get();
    }
}
