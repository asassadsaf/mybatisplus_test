package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("kms_machineroom_device")
@ApiModel(value = "KmsMachineroomDevice对象", description = "")
public class KmsMachineroomDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String roomId;

    @TableField("`NAME`")
    private String name;

    private String ip;

    private String isMaster;

    private String remark;

    private String extension1;

    private String extension2;
}
