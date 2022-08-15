package com.hy.ureport.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 总企业数与带报数传值
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AcParamB203 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 湖州总数
     */
    private Integer totalHz;

    /**
     * 湖州代报
     */
    private Integer  subHz;

    /**
     * 吴兴总数
     */
    private Integer totalWx;

    /**
     * 吴兴代报
     */
    private Integer  subWx;

    /**
     * 南浔总数
     */
    private Integer totalNx;

    /**
     * 南浔代报
     */
    private Integer  subNx;

    /**
     * 德清总数
     */
    private Integer totalDq;

    /**
     * 德清代报
     */
    private Integer  subDq;

    /**
     * 长兴总数
     */
    private Integer totalCx;

    /**
     * 长兴代报
     */
    private Integer  subCx;

    /**
     * 安吉总数
     */
    private Integer totalAj;

    /**
     * 安吉代报
     */
    private Integer  subAj;

    /**
     * 南太湖总数
     */
    private Integer totalNth;

    /**
     * 南太湖代报
     */
    private Integer  subNth;

    /**
     * 长合总数
     */
    private Integer totalCh;

    /**
     * 长合代报
     */
    private Integer  subCh;


}
