package com.hy.ureport.service;

import com.hy.ureport.entity.ResultIndustrial;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 工业b204b203结果 服务类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
public interface ResultIndustrialService extends IService<ResultIndustrial> {

    List<ResultIndustrial> getResult();
}
