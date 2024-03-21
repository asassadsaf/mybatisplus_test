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
@TableName("struct_tde_user")
@ApiModel(value = "StructTdeUser对象", description = "")
public class StructTdeUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dbuserid", type = IdType.AUTO)
    private Integer dbuserid;

    private String dbinstanceid;

    private String dbip;

    private String dbport;

    private String dbusername;

    private String dbuserpwd;

    private String createby;

    private String createtime;

    private String remarks;
}
