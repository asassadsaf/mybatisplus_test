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
@TableName("business_user_hw")
@ApiModel(value = "BusinessUserHw对象", description = "")
public class BusinessUserHw implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String adminPermission;

    private String createBy;

    private String createDate;

    private String credentialType;

    private String deviceIdentifier;

    private String deviceSerialNumber;

    private Integer flag;

    private String groupId;

    private String machineIdentifier;

    private String mediaIdentifier;

    private String networkIdentifier;

    private String pwd;

    private String pwdPermission;

    private String updateBy;

    private String updateDate;

    private String userName;

    private String certcn;

    private String certenddate;

    private String cert;

    private Integer groupFlag;
}
