package com.hy.ureport.service;

import com.hy.ureport.entity.ResultInd;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 工业b204b203结果 服务类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
public interface ResultIndService extends IService<ResultInd> {

    List<ResultInd> getResult();
}
