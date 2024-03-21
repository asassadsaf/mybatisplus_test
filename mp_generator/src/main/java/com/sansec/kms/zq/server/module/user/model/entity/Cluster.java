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
@ApiModel(value = "Cluster对象", description = "")
public class Cluster implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键，唯一标识")
    @TableId(value = "iId", type = IdType.AUTO)
    private Integer iId;

    @ApiModelProperty("该IP集群类型")
    private Integer iType;

    @ApiModelProperty("IP")
    private String cServerIP;

    @ApiModelProperty("Port")
    private Integer iServerPort;

    private String cPassword;

    @ApiModelProperty("密钥")
    private String cKey;

    @ApiModelProperty("状态")
    private Integer iStatus;

    @ApiModelProperty("复制设置")
    private String cReplicationSettings;

    @ApiModelProperty("软件版本")
    private String cSoftwareVersion;

    @ApiModelProperty("预留字段")
    private Integer iExtend;

    @ApiModelProperty("预留字段")
    private String cExtend;
}
