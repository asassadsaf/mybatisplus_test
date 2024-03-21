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
@TableName("tde_dbuser")
@ApiModel(value = "TdeDbuser对象", description = "")
public class TdeDbuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("数据库ID")
    private Integer databaseid;

    private String dbip;

    private String dbport;

    @ApiModelProperty("Oracle数据库的实例名")
    private String dbsid;

    private String dbusername;

    private String dbuserpwd;

    @ApiModelProperty("创建人")
    private String createby;

    @ApiModelProperty("创建时间")
    private String createtime;

    @ApiModelProperty("备注")
    private String remarks;
}
