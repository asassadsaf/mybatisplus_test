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
@TableName("s_manage_roletopermission")
@ApiModel(value = "SManageRoletopermission对象", description = "")
public class SManageRoletopermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("人员：角色")
    @TableId(value = "R_ID", type = IdType.AUTO)
    private Integer rId;

    @ApiModelProperty("角色ID")
    private String rRoleId;

    @ApiModelProperty("权限ID")
    private String rPermissionId;

    @ApiModelProperty("备注")
    private String rRemarks;

    @ApiModelProperty("供应商--扩展")
    private String rExtend1;

    @ApiModelProperty("供应商--扩展")
    private String rExtend2;

    @ApiModelProperty("供应商--扩展")
    private String rExtend3;
}
