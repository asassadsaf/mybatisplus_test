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
@TableName("monitor_alarm")
@ApiModel(value = "MonitorAlarm对象", description = "")
public class MonitorAlarm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("报警时间")
    @TableField("`time`")
    private String time;

    @ApiModelProperty("报警项")
    private String item;

    @TableField("`value`")
    private String value;

    @ApiModelProperty("预警限值")
    private String warnLimit;

    @ApiModelProperty("监控ip")
    private String ip;
}
