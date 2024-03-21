package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author fengkunpeng
 * @since 2023-09-05
 */
@Data
@TableName("backup_setting")
@ApiModel(value = "BackupSetting对象", description = "远程备份设置")
public class BackupSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("备份周期")
    private String backupFrequency;

    @ApiModelProperty("备份时间 0表示daily 1表示weekly 2表示monthly")
    private String backupTime;

    @ApiModelProperty("备份密码")
    private String backupPassword;

    @ApiModelProperty("all")
    private String backupRange;

    @ApiModelProperty("远程机器的ip")
    private String hostIp;

    @ApiModelProperty("远程机器登录的用户名")
    private String userName;

    @ApiModelProperty("远程机器登录的密码")
    @TableField("`password`")
    private String password;

    @ApiModelProperty("远程机器的备份目录")
    private String backupDirectory;

    @ApiModelProperty("配置创建或者修改的时间")
    @TableField("`time`")
    private String time;

    @ApiModelProperty("password  or  key")
    @TableField("`authentication`")
    private String authentication;

    private String id;
}
