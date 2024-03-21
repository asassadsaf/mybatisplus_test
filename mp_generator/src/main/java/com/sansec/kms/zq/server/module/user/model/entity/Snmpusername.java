package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "Snmpusername对象", description = "")
public class Snmpusername implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String securitylevel;

    private String authprotocol;

    private String authpassword;

    private String privpassword;

    private String mibaccess;

    private String ip;

    private String trap;

    private String privProtocol;

    @TableField("`port`")
    private String port;
}
