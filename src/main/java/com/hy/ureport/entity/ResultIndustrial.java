package com.hy.ureport.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 工业b204b203结果
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ResultIndustrial对象", description="工业b204b203结果")
public class ResultIndustrial implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "b204上报数")
    private Integer commitNumberB204;

    @ApiModelProperty(value = "b204活跃数")
    private Integer activeNumberB204;

    @ApiModelProperty(value = "b204总数")
    private Integer totalNumberB204;

    @ApiModelProperty(value = "b204上报率")
    private Float commitRateB204;

    @ApiModelProperty(value = "b204活跃率")
    private Float activeRateB204;

    @ApiModelProperty(value = "b203上报数")
    private Integer commitNumberB203;

    @ApiModelProperty(value = "b203活跃数")
    private Integer activeNumberB203;

    @ApiModelProperty(value = "b203总数")
    private Integer totalNumberB203;

    @ApiModelProperty(value = "b203上报率")
    private Float commitRateB203;

    @ApiModelProperty(value = "b203活跃率")
    private Float activeRateB203;

    public ResultIndustrial(){}


}
