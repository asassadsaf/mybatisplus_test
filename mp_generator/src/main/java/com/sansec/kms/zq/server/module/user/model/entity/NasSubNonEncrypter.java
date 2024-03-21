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
@TableName("nas_sub_non_encrypter")
@ApiModel(value = "NasSubNonEncrypter对象", description = "")
public class NasSubNonEncrypter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "subId", type = IdType.AUTO)
    private Integer subId;

    private Integer nonEncId;

    private String subDirName;

    private String keyId;

    private String keyName;

    private String keyAlg;

    @TableField("`status`")
    private String status;

    private String fileType;
}
