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
@TableName("storage_encrypted_directory")
@ApiModel(value = "StorageEncryptedDirectory对象", description = "")
public class StorageEncryptedDirectory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private Integer sid;

    private Integer keyid;

    private String contents;

    private String createby;

    private String createtime;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    private String extend5;
}
