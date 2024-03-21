package com.fkp.dynamic_datasource.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author fengkunpeng
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("key_business_user")
public class BusinessUser {
    @TableId("id")
    private String id;

    @TableField("USER_NAME")
    private String username;

    @TableField("TENANTACCOUNT")
    private String tenantAccount;

    @TableField("ADMIN_PERMISSION")
    private String adminPermission;

    @TableField("CREDENTIALTYPE")
    private String credentialType;

    @TableField("DEVICEIDENTIFIER")
    private String deviceIdentifier;

    @TableField("DEVICESERIALNUMBER")
    private String deviceSerialNumber;

    @JSONField(serialize = false)
    @TableField("FLAG")
    private Integer flag;

    @TableField("GROUP_ID")
    private String groupId;

    @TableField(exist = false)
    private String groupName;

    @TableField("MACHINEIDENTIFIER")
    private String machineIdentifier;

    @TableField("MEDIAIDENTIFIER")
    private String mediaIdentifier;

    @TableField("NETWORKIDENTIFIER")
    private String networkIdentifier;

    @TableField("PWD")
    private String pwd;

    @TableField("PWD_PERMISSION")
    private String pwdPermission;

    @TableField("CERTCN")
    private String certCn;

    @TableField("CERTENDDATE")
    private String certEndDate = "";

    @TableField("CERT")
    private String cert = "";

    @TableField("CERTBAK")
    private String certBak;

    @TableField("CERTCNBAK")
    private String certCnBak;

    @TableField("CERTENDDATEBAK")
    private String certEndDateBak;

    @JSONField(serialize = false)
    @TableField("GROUP_FLAG")
    private Integer groupFlag;

    @JSONField(serialize = false)
    @TableField("TABLESUFFIX")
    private String tableSuffix;

    @JSONField(serialize = false)
    @TableField(exist = false)
    private String roleId = "-1";

    @TableField("CREATEDATE")
    private Date createDate;

    @TableField("UPDATEDATE")
    private Date updateDate;

    @TableField("CREATEBY")
    private String createBy;

    @TableField("UPDATEBY")
    private String updateBy;

    @TableField("REMARK")
    private String remark;

}
