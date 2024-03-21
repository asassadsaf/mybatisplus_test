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
@TableName("struct_tde_table")
@ApiModel(value = "StructTdeTable对象", description = "")
public class StructTdeTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dbtableid", type = IdType.AUTO)
    private Integer dbtableid;

    private Integer dbuserid;

    private String dbtablename;

    private String dbtablekey;

    private String createby;

    private String createtime;

    private String remarks;
}
