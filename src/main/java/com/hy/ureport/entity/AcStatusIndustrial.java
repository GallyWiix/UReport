package com.hy.ureport.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AcStatusIndustrial implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tyshxydm;

    /**
     * 组织机构代码
     */
    private String zzjgdm;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 数据处理地
     */
    private Long regionCode;

    /**
     * 报表类型
     */
    private String type;

    /**
     * 是否活跃
     */
    private String isActive;

    /**
     * 是否上报
     */
    private String isCommit;

    /**
     * 上报时间
     */
    private String commitDate;


}
