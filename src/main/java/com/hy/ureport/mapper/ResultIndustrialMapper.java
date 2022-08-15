package com.hy.ureport.mapper;

import com.hy.ureport.entity.ResultIndustrial;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 工业b204b203结果 Mapper 接口
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
public interface ResultIndustrialMapper extends BaseMapper<ResultIndustrial> {



    List<ResultIndustrial> selectResult();
}
