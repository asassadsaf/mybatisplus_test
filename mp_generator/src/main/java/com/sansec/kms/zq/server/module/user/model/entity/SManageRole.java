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
@TableName("s_manage_role")
@ApiModel(value = "SManageRole对象", description = "")
public class SManageRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色--编号")
    @TableId(value = "R_ID", type = IdType.AUTO)
    private Integer rId;

    private String rName;

    @ApiModelProperty("角色--备注")
    private String rRemarks;

    @ApiModelProperty("角色--创建人")
    private String rCreateby;

    @ApiModelProperty("角色--时间")
    private String rCreatetime;

    @ApiModelProperty("供应商--扩展")
    private String rExtend1;

    @ApiModelProperty("供应商--扩展")
    private String rExtend2;

    @ApiModelProperty("供应商--扩展")
    private String rExtend3;

    private String rUsergroupMd5;
}
