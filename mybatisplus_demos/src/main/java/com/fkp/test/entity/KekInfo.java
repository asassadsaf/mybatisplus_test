package com.fkp.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 *
 * @author fengkunpeng
 * @since 2023-09-05
 */
@Data
@TableName("kekinfo_0")
@ApiModel(value = "Kekinfo0对象", description = "")
@SuperBuilder
@NoArgsConstructor
public class KekInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分区编号（相同分区的设备在一个表内）")
    @TableField("ZoneNO")
    private String zoneNo;

    @ApiModelProperty("设备id")
    @TableField("DevID")
    private String devId;

    @ApiModelProperty("用户帐号")
    @TableField("UserAcc")
    private String userAcc;

    @ApiModelProperty("用户帐号类别")
    @TableField("AccType")
    private String accType;

    @ApiModelProperty("算法标识：1:RSA 2: SM2  3: AES 4: SM4")
    @TableField("Alg")
    private Integer alg;

    @ApiModelProperty("存储公钥信息")
    @TableField("PubKey")
    private String pubKey;

    @ApiModelProperty("存储私钥信息")
    @TableField("PriKey")
    private String priKey;

    @ApiModelProperty("自增序列号，密钥唯一ID（变更序号）")
    @TableId("ChangeNo")
    private Long changeNo;

    @ApiModelProperty("密钥版本")
    @TableField("KeyVersion")
    private String keyVersion;

    @ApiModelProperty("对称密钥信息(主密钥加密过)")
    @TableField("KeyMaterial")
    private String keyMaterial;

    @ApiModelProperty("生成时间")
    @TableField("CreationDate")
    private String creationDate;

    @ApiModelProperty("密钥状态：0 正常，1 注销……")
    @TableField("Status")
    private Integer status;

    @ApiModelProperty("网关ID")
    @TableField("CreateBy")
    private String createBy;

    @TableField("ServerNo")
    private Integer serverNo;

    @TableField("GWAccount")
    private String gwAccount;

    @TableField("CertNo")
    private String certNo;

    @TableField("LastActiveDate")
    private String lastActiveDate;

    @TableField("CertStartDate")
    private String certStartDate;

    @TableField("CertEndDate")
    private String certEndDate;

    @TableField("KeyIntegrity")
    private String keyIntegrity;

    @TableField("UpdateTime")
    private String updateTime;
}
