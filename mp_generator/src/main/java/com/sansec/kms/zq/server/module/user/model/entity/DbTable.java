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
@TableName("db_table")
@ApiModel(value = "DbTable对象", description = "")
public class DbTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String dbUser;

    private String dbTablename;

    private String dbAllcolumns;

    private String dbNewtablename;

    private String dbTrigger;

    private String dbView;

    @ApiModelProperty("用于记录所有的列名")
    private String dbExtend1;

    private String dbExtend2;

    private String dbExtend3;

    private String dbExtend4;

    private String dbExtend5;
}
