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
@TableName("sys_policy")
@ApiModel(value = "SysPolicy对象", description = "")
public class SysPolicy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("私有扩展主键唯一ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("策略名称")
    private String cPolicyName;

    @ApiModelProperty("最大数")
    private Integer iProperties;

    @ApiModelProperty("开始天")
    private Integer iStartDay;

    @ApiModelProperty("开始时")
    private Integer iStartHour;

    @ApiModelProperty("开始分")
    private Integer iStartMin;

    @ApiModelProperty("结束天")
    private Integer iEndDay;

    @ApiModelProperty("结束天")
    private Integer iEndHour;

    @ApiModelProperty("结束天")
    private Integer iEndMin;

    @ApiModelProperty("扩展空间")
    private Integer iTemp;

    @ApiModelProperty("扩展空间")
    private String cTemp;
}
