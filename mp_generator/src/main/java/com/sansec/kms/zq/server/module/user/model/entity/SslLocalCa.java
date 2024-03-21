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
@TableName("ssl_local_ca")
@ApiModel(value = "SslLocalCa对象", description = "")
public class SslLocalCa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String iId;

    private String cCAName;

    @ApiModelProperty("CA证书密钥长度")
    private Integer iKeySize;

    private String cCertificateIssuer;

    private String cCertificateSubject;

    @ApiModelProperty("CA证书开始日期")
    private String dStartDate;

    @ApiModelProperty("CA证书过期日期")
    private String dExpiration;

    @ApiModelProperty("证书状态:1：Active证书有效,2：Expired证书过期,3：UnKnown未知")
    private Integer iCertificateStatus;

    @ApiModelProperty("证书内容")
    private String cCertificate;

    @ApiModelProperty("证书对应私钥密文")
    private String cEncPrivateKey;

    @ApiModelProperty("预留字段")
    private Integer iExtend;

    @ApiModelProperty("预留字段")
    private String cExtend;
}
