package com.sansec.kms.zq.server.module.user.model.entity;

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
@ApiModel(value = "Kekinfocount对象", description = "")
public class Kekinfocount implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tableName;

    private Integer keyCount;

    private String useFlag;

    private Integer realKeyCount;
}
