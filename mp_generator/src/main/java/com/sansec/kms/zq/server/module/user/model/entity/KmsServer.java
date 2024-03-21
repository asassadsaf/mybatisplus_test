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
@TableName("kms_server")
@ApiModel(value = "KmsServer对象", description = "")
public class KmsServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`server`")
    private String server;

    private String serverStatus;

    @ApiModelProperty("0:selected ip,1:all")
    private Integer ipAuthorization;

    @ApiModelProperty("0:其他服务,1:秘钥服务")
    private Integer isKeyserver;

    private String ip;

    @TableField("`port`")
    private String port;

    @ApiModelProperty("0,Not Used,1,Optional,2Required (most secure)")
    private String pwdAuth;

    @ApiModelProperty("0,Not used,1,Used for SSL session only,2Used for SSL session and")
    private String clientcertAuth;

    private String trustedCaId;

    private String serverCertificateId;

    @ApiModelProperty("使用ssl 1: 启用 0:不使用")
    private String useSsl;

    @ApiModelProperty("启用白名单 1:启用 0:不启用")
    private String whiteList;

    @ApiModelProperty("服务器用户名")
    private String serverUsername;

    @ApiModelProperty("服务器密码")
    private String serverUserpwd;

    private String webappPath;

    private String kmsuser;
}
