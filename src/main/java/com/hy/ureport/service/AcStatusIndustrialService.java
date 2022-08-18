package com.hy.ureport.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatusIndustrial;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.ureport.entity.query.TableQuery;

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

    IPage<AcStatusIndustrial> listByCond(Page<AcStatusIndustrial> pageParam, TableQuery tableQuery);
}
