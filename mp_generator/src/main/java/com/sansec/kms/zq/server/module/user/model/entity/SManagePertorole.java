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
@TableName("s_manage_pertorole")
@ApiModel(value = "SManagePertorole对象", description = "")
public class SManagePertorole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("人员：角色")
    @TableId(value = "P_ID", type = IdType.AUTO)
    private Integer pId;

    @ApiModelProperty("人员ID")
    private String pPersonId;

    @ApiModelProperty("角色ID")
    private String pRoleId;

    @ApiModelProperty("备注")
    private String pRemarks;

    @ApiModelProperty("供应商--扩展")
    private String pExtend1;

    @ApiModelProperty("供应商--扩展")
    private String pExtend2;

    @ApiModelProperty("供应商--扩展")
    private String pExtend3;
}
