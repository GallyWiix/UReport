package com.hy.ureport.service.impl;

import com.hy.ureport.entity.ResultInd;
import com.hy.ureport.mapper.ResultIndMapper;
import com.hy.ureport.service.ResultIndService;
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
 * @since 2022-08-15
 */
@Service
public class ResultIndServiceImpl extends ServiceImpl<ResultIndMapper, ResultInd> implements ResultIndService {
    @Resource
    ResultIndMapper resultIndMapper;
    @Override
    public List<ResultInd> getResult() {
        List<ResultInd> resultIndList = resultIndMapper.selectResult();
        return resultIndList;
    }
}
