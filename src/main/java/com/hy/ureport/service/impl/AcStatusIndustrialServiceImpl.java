package com.hy.ureport.service.impl;

import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.entity.AcStatusIndustrial;
import com.hy.ureport.mapper.AcStatusIndustrialMapper;
import com.hy.ureport.service.AcStatusIndustrialService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Service
public class AcStatusIndustrialServiceImpl extends ServiceImpl<AcStatusIndustrialMapper, AcStatusIndustrial> implements AcStatusIndustrialService {

    @Override
    public List<AcStatusIndustrial> listAll() {
        List<AcStatusIndustrial> acStatusList = baseMapper.selectList(null);
        return acStatusList;
    }
}
