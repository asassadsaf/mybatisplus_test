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
@TableName("kms_teller_pin")
@ApiModel(value = "KmsTellerPin对象", description = "")
public class KmsTellerPin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键,唯一id")
    private String id;

    @ApiModelProperty("柜员账号")
    private String tellerAccount;

    @ApiModelProperty("柜员PIN码")
    private String tellerPin;

    @ApiModelProperty("创建时间")
    private String createDate;
}
