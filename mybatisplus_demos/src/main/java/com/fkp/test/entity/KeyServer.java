package com.fkp.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author fengkunpeng
 * @since 2023-07-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("key_server")
@ApiModel(value = "KeyServer对象", description = "")
public class KeyServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    @TableId
    private String id;

    @ApiModelProperty("服务类型名称")
    private String serverType;

    @ApiModelProperty("端口号")
    @TableField("`port`")
    private String port;

    @ApiModelProperty("状态 1/0")
    @TableField("`status`")
    private String status;

    @ApiModelProperty("是否开机自启  0/1")
    private String autoStart;

    @ApiModelProperty("是否使用ssl 0/1")
    private String useSsl;

    @ApiModelProperty("证书类型  rsa/sm2")
    private String certAlg;

    @ApiModelProperty("ssl证书id")
    private String sslCertId;

    @ApiModelProperty("ssl证书展示名称")
    private String sslCertDesc;

    @ApiModelProperty("是否开启双向认证  0/1")
    private String useCa;

    @ApiModelProperty("ca证书ids  使用分号分隔")
    private String caCertIds;

    @ApiModelProperty("ca证书展示名称")
    private String caCertDesc;

    @ApiModelProperty("ca证书内匹配项  none/cn/ou")
    private String caMatchItem;

    @ApiModelProperty("是否验证用户名  0/1")
    private String verifyUsername;

    @ApiModelProperty("ip地址")
    private String ipAddress;

    @ApiModelProperty("连接类型   long/short")
    private String connectionType;

    @ApiModelProperty("认证类型  cert/pwd")
    private String authType;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("更新时间")
    private Date updateDate;

    @ApiModelProperty("备注")
    private String remark;
}
