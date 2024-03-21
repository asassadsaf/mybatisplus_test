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
@TableName("storage_encrypted_dir")
@ApiModel(value = "StorageEncryptedDir对象", description = "")
public class StorageEncryptedDir implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String dirName;

    private String keyId;

    private String keyUser;

    private String keyPassword;

    private String serverIp;

    private Integer stauts;

    @TableField("`status`")
    private String status;

    private String visitUser;

    private String accessUser;

    private String keyAlg;

    @TableField("`type`")
    private String type;

    private String autoEncryption;

    private String fileExtension;
}
