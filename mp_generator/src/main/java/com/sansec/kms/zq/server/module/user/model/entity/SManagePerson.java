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
@TableName("s_manage_person")
@ApiModel(value = "SManagePerson对象", description = "")
public class SManagePerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("人员--编号")
    @TableId(value = "P_ID", type = IdType.AUTO)
    private Integer pId;

    private String pName;

    private String pPwd;

    @ApiModelProperty("人员--电话")
    private String pTel;

    @ApiModelProperty("人员--传真")
    private String pFax;

    @ApiModelProperty("人员--网址")
    private String pUrl;

    @ApiModelProperty("人员--证书")
    private String pCert;

    @ApiModelProperty("人员--DN")
    private String pDn;

    @ApiModelProperty("人员--签名信息")
    private String pSign;

    private String pCountry;

    @ApiModelProperty("人员--省份")
    private String pProvince;

    @ApiModelProperty("人员--城市")
    private String pCity;

    @ApiModelProperty("人员--备注")
    private String pRemarks;

    @ApiModelProperty("人员--创建人")
    private String pCreateby;

    @ApiModelProperty("人员--时间")
    private String pCreatetime;

    @ApiModelProperty("供应商--扩展")
    private String pRole;

    private String pGroup;

    @ApiModelProperty("供应商--扩展")
    private String pExtend2;

    @ApiModelProperty("供应商--扩展")
    private String pExtend3;

    private String pUsergroupMd5;

    @ApiModelProperty("storage")
    private String pLock;

    private String pPwdHistory;

    private String pBusercert;

    private String companyId;

    private String hscode;

    private String cardId;

    private String integrity;
}
