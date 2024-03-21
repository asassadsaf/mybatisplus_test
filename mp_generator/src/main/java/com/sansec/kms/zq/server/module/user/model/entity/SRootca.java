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
@TableName("s_rootca")
@ApiModel(value = "SRootca对象", description = "")
public class SRootca implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("证书类型（X.509）")
    private String certtype;

    @ApiModelProperty("创建人")
    private String createby;

    @ApiModelProperty("创建时间")
    private String createtime;

    @ApiModelProperty("客户系统编号")
    private String customercode;

    @ApiModelProperty("加密证书（base64编码）")
    private String encryptcert;

    @ApiModelProperty("证书过期时间")
    private String endtime;

    @ApiModelProperty("签名哈希算法")
    private String hashalg;

    @ApiModelProperty("颁发着")
    @TableField("`issuer`")
    private String issuer;

    @ApiModelProperty("公钥")
    private String publickey;

    @ApiModelProperty("序列号")
    private String serialnumber;

    @ApiModelProperty("签名算法")
    private String signalg;

    @ApiModelProperty("开始时间")
    private String starttime;

    @ApiModelProperty("使用者")
    @TableField("`user`")
    private String user;

    @ApiModelProperty("验签证书（base64编码）")
    private String verifycert;

    @ApiModelProperty("版本")
    private String version;
}
