package com.fkp.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author fengkunpeng
 * @since 2023-07-10
 */
@Data
@TableName("log_configuration")
@ApiModel(value = "LogConfiguration对象", description = "")
public class LogConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("服务编码，例如后台服务（operation-kms,cluster-kms），密钥服务：rest、KMIP、standard")
    @TableField(value = "logName")
    private String logName;

    @ApiModelProperty("轮换间隔")
    @TableField(value = "logRotation")
    private String logRotation;

    @ApiModelProperty("日志级别，0-trace 1-debug 2-info 3-warn 4-error")
    @TableField(value = "logLevel")
    private Integer logLevel;

    @ApiModelProperty("日志文件最大数")
    @TableField(value = "filesNum")
    private Integer filesNum;

    @ApiModelProperty("单个日志文件大小限制（MB）")
    @TableField(value = "maxLogSize")
    private Integer maxLogSize;

    @ApiModelProperty("日志文件保存最大天数")
    @TableField(value = "maxHistory")
    private Integer maxHistory;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remark;
}
