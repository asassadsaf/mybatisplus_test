package com.fkp.dynamic_table_name.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author fkp
 */
@TableName("t_user")
@Data
public class User {
    @TableId
    private Integer id;
    private String name;
    private Integer age;

}
