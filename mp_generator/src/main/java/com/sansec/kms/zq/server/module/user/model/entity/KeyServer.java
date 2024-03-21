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
@TableName("key_server")
@ApiModel(value = "KeyServer对象", description = "")
public class KeyServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String serverType;

    @TableField("`port`")
    private String port;

    private String useSsl;

    private String serverCert;

    private String trustCA;

    @TableField("`description`")
    private String description;

    private String useAble;

    private Integer isCertAuth;

    private String matchItem;

    private String enccert;

    private String signcert;

    private String kmips;

    private Integer usepwd;

    @ApiModelProperty("Hadoop")
    @TableField("`authentication`")
    private String authentication;

    @ApiModelProperty("Hadoop")
    private String userAndPassword;
}
