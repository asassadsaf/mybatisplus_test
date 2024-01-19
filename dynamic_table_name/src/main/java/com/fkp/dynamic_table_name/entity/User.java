package com.fkp.dynamic_table_name.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fkp
 */
@TableName("t_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId
    private Integer id;
    private String name;
    private Integer age;

}
