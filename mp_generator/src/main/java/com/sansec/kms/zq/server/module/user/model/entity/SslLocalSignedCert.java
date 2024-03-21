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
@TableName("ssl_local_signed_cert")
@ApiModel(value = "SslLocalSignedCert对象", description = "")
public class SslLocalSignedCert implements Serializable {

    private static final long serialVersionUID = 1L;

    private String iId;

    private String iLocalCAId;

    private String cCertSN;

    @ApiModelProperty("证书密钥长度")
    private Integer iKeySize;

    private String cCertificateIssuer;

    private String cCertificateSubject;

    @ApiModelProperty("证书开始日期")
    private String dStartDate;

    @ApiModelProperty("证书过期日期")
    private String dExpiration;

    @ApiModelProperty("0标识证书请求,1标识服务端认证,2标识客户端认证,3标识服务端和客户端认证")
    private Integer iCertificatePurpose;

    @ApiModelProperty("证书状态:0：Request Pending证书请求,1：Active证书有效,2：Expired证书过期,3：UnKnown未知")
    private Integer iCertificateStatus;

    @ApiModelProperty("证书内容:如证书状态是0,该字段存储P10,其他存储证书内容")
    private String cCertificate;

    @ApiModelProperty("预留字段")
    private Integer iExtend;

    @ApiModelProperty("预留字段")
    private String cExtend;
}
