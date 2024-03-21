package com.sansec.kms.zq.server.module.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value = "Ldapproperties对象", description = "")
public class Ldapproperties implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("ldapserver hostname or ip")
    private String ip;

    @ApiModelProperty("端口号")
    @TableField("`port`")
    private Integer port;

    @ApiModelProperty("是否使用ssl")
    private Integer usessl;

    private String trustca;

    private String binddn;

    private String bindpwd;

    private String hashalg;
}
