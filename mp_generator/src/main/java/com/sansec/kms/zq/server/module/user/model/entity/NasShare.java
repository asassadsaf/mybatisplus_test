package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("nas_share")
@ApiModel(value = "NasShare对象", description = "")
public class NasShare implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nasId", type = IdType.AUTO)
    private Integer nasId;

    private String nasServerIp;

    private String shareName;

    private String shareType;

    @TableField("`status`")
    private String status;

    private String encrypter;

    private String displayName;

    private Integer fileServerId;

    private String nasUserName;

    private String nasPassword;

    private String createDate;
}
