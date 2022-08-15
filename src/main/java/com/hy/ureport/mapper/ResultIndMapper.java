package com.hy.ureport.mapper;

import com.hy.ureport.entity.ResultInd;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 工业b204b203结果 Mapper 接口
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
public interface ResultIndMapper extends BaseMapper<ResultInd> {

    List<ResultInd> selectResult();
}
