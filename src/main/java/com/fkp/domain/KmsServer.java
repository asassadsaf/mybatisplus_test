package com.fkp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: fkp
 * @time: 2022-10-10 16:15:50
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KmsServer implements Serializable {
    private String id;

    private String server;

    private String serverStatus;

    /**
     * 0:selected ip,1:all
     */
    private Integer ipAuthorization;

    /**
     * 0:其他服务,1:秘钥服务
     */
    private Integer isKeyserver;

    private String ip;

    private String port;

    /**
     * 0,Not Used,1,Optional,2Required (most secure)
     */
    private String pwdAuth;

    /**
     * 0,Not used,1,Used for SSL session only,2Used for SSL session and
     */
    private String clientcertAuth;

    private String trustedCaId;

    private String serverCertificateId;

    /**
     * 使用ssl 1: 启用 0:不使用
     */
    private String useSsl;

    /**
     * 启用白名单 1:启用 0:不启用
     */
    private String whiteList;

    /**
     * 服务器用户名
     */
    private String serverUsername;

    /**
     * 服务器密码
     */
    private String serverUserpwd;

    private String webappPath;

    private String kmsuser;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remark;

    private static final long serialVersionUID = 1L;
}
