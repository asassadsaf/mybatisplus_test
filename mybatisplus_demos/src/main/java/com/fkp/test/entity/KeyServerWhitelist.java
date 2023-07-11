package com.fkp.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author fengkunpeng
 * @since 2023-07-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("key_server_whitelist")
@ApiModel(value = "KeyServerWhitelist对象", description = "")
public class KeyServerWhitelist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    private String serverId;

    private String serverType;

    @TableField("`port`")
    private String port;

    private Integer configRule;

    private String whiteListIp;

    private String maskBit;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remark;
}
