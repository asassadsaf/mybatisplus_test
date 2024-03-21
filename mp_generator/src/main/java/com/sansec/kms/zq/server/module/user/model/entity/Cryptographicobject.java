package com.sansec.kms.zq.server.module.user.model.entity;

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
@ApiModel(value = "Cryptographicobject对象", description = "")
public class Cryptographicobject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long sUsagelimitscount;

    private Long sUsagelimitstotal;

    private String sUsagelimitsunit;

    private String sActivationdate;

    private String sCompromisedate;

    private String sCompromiseoccurrencedate;

    private String sCryptographicusagemask;

    private String sDeactivationdate;

    private String sDestroydate;

    private String sLeasetime;

    private String sProcessstartdate;

    private String sProtectstopdate;

    private String sRevocationmessage;

    private String sRevocationreasoncode;

    private String sState;

    private Integer id;

    private Integer keyblockId;

    private Integer sRotationstatus;

    private String sRotationstarttime;

    private Integer sAlreadyrotate;

    private Long sKeyversion;
}
