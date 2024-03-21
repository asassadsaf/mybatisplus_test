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
@TableName("disk_file")
@ApiModel(value = "DiskFile对象", description = "")
public class DiskFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String diskName;

    private String diskSize;

    private String diskLocation;

    private String driveLetter;

    private Integer deviceNumber;

    private String localUser;

    private String keyName;

    @TableField("`status`")
    private String status;

    @TableField("`server`")
    private String server;
}
