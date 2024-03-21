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
@TableName("kekinfo_6")
@ApiModel(value = "Kekinfo6对象", description = "")
public class Kekinfo6 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分区编号（相同分区的设备在一个表内）")
    private String zoneNO;

    @ApiModelProperty("设备id")
    private String devID;

    @ApiModelProperty("用户帐号")
    private String userAcc;

    @ApiModelProperty("用户帐号类别")
    private String accType;

    @ApiModelProperty("算法标识：1:RSA 2: SM2  3: AES 4: SM4")
    private Integer alg;

    @ApiModelProperty("存储公钥信息")
    private String pubKey;

    @ApiModelProperty("存储私钥信息")
    private String priKey;

    @ApiModelProperty("自增序列号，密钥唯一ID（变更序号）")
    private Long changeNo;

    @ApiModelProperty("密钥版本")
    private String keyVersion;

    @ApiModelProperty("对称密钥信息(主密钥加密过)")
    private String keyMaterial;

    @ApiModelProperty("生成时间")
    private String creationDate;

    @ApiModelProperty("密钥状态：0 正常，1 注销……")
    @TableField("`Status`")
    private Integer status;

    @ApiModelProperty("网关ID")
    private String createBy;

    private Integer serverNo;

    private String gWAccount;

    private String certNo;

    private String lastActiveDate;

    private String certStartDate;

    private String certEndDate;

    private String keyIntegrity;

    private String updateTime;
}
