package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value = "Operatelist对象", description = "")
public class Operatelist implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String sUniqueidentifier;

    private String sNamevalue;

    private String tENANTAccount;

    private String operDateTime;

    private String devID;

    private String logLevel;

    private String operator;

    private String operType;

    private String args;

    private String operResult;

    private String message;

    @TableField("`Session`")
    private String session;

    private String terminalIP;

    private String terminalCert;

    private String serviceName;

    private String serviceIP;

    private String servicePort;

    private String remark;

    @TableField("`signed`")
    private String signed;

    private String versifyed;

    private String auditOper;
}
