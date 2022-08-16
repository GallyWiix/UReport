package com.hy.ureport.service;

import com.hy.ureport.entity.AcStatusIndustrial;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
public interface AcStatusIndustrialService extends IService<AcStatusIndustrial> {

    List<AcStatusIndustrial> listAll();
}
