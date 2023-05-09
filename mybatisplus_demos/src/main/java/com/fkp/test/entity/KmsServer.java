package com.fkp.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author fengkunoeng
 * @since 2023-05-09
 */
@Data
@TableName("kms_server")
@ApiModel(value = "KmsServer对象", description = "")
public class KmsServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("服务类型名称")
    private String typeName;

    @ApiModelProperty("服务启动脚本路径")
    private String startPath;

    @ApiModelProperty("服务停止脚本路径")
    private String stopPath;

    @ApiModelProperty("服务日志配置文件log4j2.xml路径")
    private String logConfigPath;

    @ApiModelProperty("服务开发语言 c/java")
    private String develLanguage;

    @ApiModelProperty("使用该服务的客户名")
    private String kmsUser;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("更新时间")
    private Date updateDate;

    @ApiModelProperty("备注")
    private String remark;
}
