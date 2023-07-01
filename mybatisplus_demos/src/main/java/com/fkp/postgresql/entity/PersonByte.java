package com.fkp.postgresql.entity;

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
@TableName("person_byte")
@ApiModel(value = "PersonByte对象", description = "")
public class PersonByte implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private byte[] byteContent;
}
