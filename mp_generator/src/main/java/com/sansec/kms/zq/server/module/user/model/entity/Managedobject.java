package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value = "Managedobject对象", description = "")
public class Managedobject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String sArchivedate;

    private String sContactinformation;

    private String sInitialdate;

    private String sLastchangedate;

    private String sNametype;

    private String sNamevalue;

    private String sObjecttype;

    private String sOperationpolicyname;

    private String sUniqueidentifier;

    private String sDeleteable;

    private String sExtractable;

    private Integer groupFlag;
}
