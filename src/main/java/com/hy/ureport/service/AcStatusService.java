package com.hy.ureport.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatus;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.ureport.entity.query.TableQuery;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-12
 */
public interface AcStatusService extends IService<AcStatus> {

    void importData(InputStream inputStream);

    List<AcStatus> listAll();

    IPage<AcStatus> listPage(Page<AcStatus> acStatusPage, String keyword);

    IPage<AcStatus> listByCond(Page<AcStatus> pageParam, TableQuery tableQuery);


    void truncate();
}
