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
@TableName("database_synchronization_config")
@ApiModel(value = "DatabaseSynchronizationConfig对象", description = "")
public class DatabaseSynchronizationConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("all synchronized database ip")
    private String allSynchronizedIp;

    @ApiModelProperty("yes-Synchronized,no-Unsynchronized")
    private String synStatus;

    private String extend1;

    private String extend2;

    private String extend3;

    private String remarks;
}
