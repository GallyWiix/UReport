package com.hy.ureport.service.impl;

import com.hy.ureport.entity.ResultIndustrial;
import com.hy.ureport.mapper.ResultIndustrialMapper;
import com.hy.ureport.service.ResultIndustrialService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 工业b204b203结果 服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
@Service
public class ResultIndustrialServiceImpl extends ServiceImpl<ResultIndustrialMapper, ResultIndustrial> implements ResultIndustrialService {

    @Resource
    private ResultIndustrialMapper resultIndustrialMapper;

    @Override
    public List<ResultIndustrial> getResult() {
        List<ResultIndustrial> resultIndustrialList = resultIndustrialMapper.selectResult();
        return resultIndustrialList;
    }
}
