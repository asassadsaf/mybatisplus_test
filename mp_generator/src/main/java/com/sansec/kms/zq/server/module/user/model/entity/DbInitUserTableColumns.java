package com.sansec.kms.zq.server.module.user.model.entity;

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
@TableName("db_init_user_table_columns")
@ApiModel(value = "DbInitUserTableColumns对象", description = "")
public class DbInitUserTableColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dbTableId;

    private String dbColumnEnc;

    private String dbColumnType;

    private String dbEncType;

    private String dbEncRule;

    private String ruleBegin;

    private String ruleEnd;

    private String createby;

    private String createdate;

    private String remarks;
}
