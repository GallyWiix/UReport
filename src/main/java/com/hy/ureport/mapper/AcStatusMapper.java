package com.hy.ureport.mapper;

import com.hy.ureport.entity.AcStatus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jeremy
 * @since 2022-08-12
 */
public interface AcStatusMapper extends BaseMapper<AcStatus> {

    void insertBatch(List<AcStatus> list);

    void truncate();
}
