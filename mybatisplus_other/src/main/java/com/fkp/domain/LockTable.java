package com.fkp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用来实现锁的表
 * @author wangjinping
 */
@Data
@TableName("LOCK_TABLE")
public class LockTable {

    /**
     * 设备id
     */
    private String deviceId;

    /**
     * 用户帐号
     */
    private String userAcc;

    /**
     * 用户帐号类别
     */
    private String accountType;

    private String appAccount;
}
