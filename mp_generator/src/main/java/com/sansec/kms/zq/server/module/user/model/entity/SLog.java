package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("s_log")
@ApiModel(value = "SLog对象", description = "")
public class SLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("日志--ID")
    @TableId(value = "S_ID", type = IdType.AUTO)
    private Integer sId;

    @ApiModelProperty("日志--类型")
    private String sType;

    @ApiModelProperty("日志--操作类型")
    private String sOper;

    @ApiModelProperty("日志--操作结果")
    private String sResult;

    @ApiModelProperty("日志--	错误信息")
    private String sErrormsg;

    @ApiModelProperty("日志--操作参数")
    private String sParams;

    @ApiModelProperty("日志--操作类")
    private String sClass;

    @ApiModelProperty("日志--操作人员编号")
    private String sLoginuserid;

    @ApiModelProperty("日志--操作人员")
    private String sLoginuser;

    @ApiModelProperty("日志--操作时间")
    private String sTime;

    @ApiModelProperty("日志--用户MD5")
    private String sUsergroupMd5;

    private String sExtend1;

    private String sExtend2;

    private String sExtend3;
}
