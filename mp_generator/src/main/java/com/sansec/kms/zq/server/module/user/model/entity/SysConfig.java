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
@TableName("sys_config")
@ApiModel(value = "SysConfig对象", description = "")
public class SysConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer configId;

    private String configName;

    private String configValue;

    private String configRemark;
}
