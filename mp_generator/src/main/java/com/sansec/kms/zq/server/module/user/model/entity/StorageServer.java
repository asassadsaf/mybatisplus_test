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
@TableName("storage_server")
@ApiModel(value = "StorageServer对象", description = "")
public class StorageServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SID", type = IdType.AUTO)
    private Integer sid;

    @ApiModelProperty("0对应linux系统，1对应windows系统")
    private Integer stype;

    private String sip;

    @TableField("`PORT`")
    private String port;

    private String uname;

    private String upwd;

    private Integer luserid;

    private String luser;

    private Integer createid;

    private String createuser;

    private String createtime;

    private String servername;

    private String extend2;

    private String extend3;

    private String extend4;

    private String extend5;

    private Integer ftype;

    @TableField("`SERIAL`")
    private String serial;

    private String uid;
}
