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
@TableName("db_type")
@ApiModel(value = "DbType对象", description = "")
public class DbType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dbType;

    private String dbPort;

    private String dbSid;

    private String dbDba;

    private Integer dbAuth;
}
