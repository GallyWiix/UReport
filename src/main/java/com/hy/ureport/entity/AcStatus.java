package com.hy.ureport.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jeremy
 * @since 2022-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AcStatus对象", description="")
public class AcStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tyshxydm;

    @ApiModelProperty(value = "组织机构代码")
    private String zzjgdm;

    @ApiModelProperty(value = "企业名称")
    private String companyName;

    @ApiModelProperty(value = "数据处理地")
    private Long regionCode;

    @ApiModelProperty(value = "报表类型")
    private String type;

    @ApiModelProperty(value = "是否活跃")
    private String isActive;

    @ApiModelProperty(value = "是否上报")
    private String isCommit;

    @ApiModelProperty(value = "上报时间")
    private String commitDate;






}
