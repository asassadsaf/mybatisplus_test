package com.fkp.gaussdb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author fengkunpeng
 * @since 2023-07-01
 */
@Data
@TableName("gauss_person_byte")
@ApiModel(value = "GaussPersonByte对象", description = "")
public class GaussPersonByte implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private byte[] byteContentBlob;

    private byte[] byteContentBytea;
}
