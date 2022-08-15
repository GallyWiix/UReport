package com.hy.ureport.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 测试用
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Test对象", description="测试用")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织机构代码")
    private String zzjgdm;

    @ApiModelProperty(value = "原始数据")
    private BigDecimal dataSource;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标记（0:不可用 1:可用）")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
