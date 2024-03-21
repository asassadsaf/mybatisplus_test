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
@TableName("email_properties")
@ApiModel(value = "EmailProperties对象", description = "")
public class EmailProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("邮件域名")
    private String emailHost;

    @ApiModelProperty("是否使用ssl")
    private Integer isUseSsl;

    @ApiModelProperty("邮箱账号")
    private String emailUser;

    @ApiModelProperty("授权码")
    private String emailPwd;
}
