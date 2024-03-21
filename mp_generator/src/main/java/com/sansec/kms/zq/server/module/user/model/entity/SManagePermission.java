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
@TableName("s_manage_permission")
@ApiModel(value = "SManagePermission对象", description = "")
public class SManagePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("权限--编号")
    @TableId(value = "P_ID", type = IdType.AUTO)
    private Integer pId;

    @ApiModelProperty("权限--名称")
    private String pName;

    @ApiModelProperty("权限--备注")
    private String pRemarks;

    @ApiModelProperty("权限--创建人")
    private String pCreateby;

    @ApiModelProperty("权限--时间")
    private String pCreatetime;

    @ApiModelProperty("供应商--扩展")
    private String pExtend1;

    @ApiModelProperty("供应商--扩展")
    private String pExtend2;

    @ApiModelProperty("供应商--扩展")
    private String pExtend3;

    @ApiModelProperty("树的id")
    private String pTreeid;

    @ApiModelProperty("链接")
    private String pHref;

    @ApiModelProperty("暂时无用")
    private String pDataurl;

    @ApiModelProperty("主菜单样式图标")
    private String pClass;

    @ApiModelProperty("父亲id")
    private String pParentid;

    private String pNameZh;
}
