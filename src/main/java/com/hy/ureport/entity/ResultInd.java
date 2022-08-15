package com.hy.ureport.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 工业b204b203结果
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResultInd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * b204活跃数
     */
    private Integer activeNumberB204;

    /**
     * b203活跃数
     */
    private Integer activeNumberB203;

    /**
     * b204上报数
     */
    private Integer commitNumberB204;

    /**
     * b203上报数
     */
    private Integer commitNumberB203;

    /**
     * b204上报率
     */
    private Float commitRateB204;

    /**
     * b203上报率
     */
    private Float commitRateB203;

    /**
     * 工业活跃率
     */
    private Float activeRate;


}
