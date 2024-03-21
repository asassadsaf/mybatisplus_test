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
@TableName("s_manage_group")
@ApiModel(value = "SManageGroup对象", description = "")
public class SManageGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "G_ID", type = IdType.AUTO)
    private Integer gId;

    private String gName;

    private String gRemarks;

    private String gCreateby;

    private String gCreatetime;

    private String gExtend1;

    private String gExtend2;

    private String gExtend3;
}
