package com.fkp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: fkp
 * @time: 2023-02-02 15:12:51
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogConfiguration implements Serializable {
    private String id;

    private String logName;

    private String logRotation;

    private Integer filesNum;

    private Integer logLevel;

    private Integer maxLogSize;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remark;

    private static final long serialVersionUID = 1L;
}
