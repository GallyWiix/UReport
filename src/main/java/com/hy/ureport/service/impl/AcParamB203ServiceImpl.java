package com.hy.ureport.service.impl;

import com.hy.ureport.entity.AcParamB203;
import com.hy.ureport.entity.AcParamB204;
import com.hy.ureport.mapper.AcParamB203Mapper;
import com.hy.ureport.service.AcParamB203Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 总企业数与带报数传值 服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@Service
public class AcParamB203ServiceImpl extends ServiceImpl<AcParamB203Mapper, AcParamB203> implements AcParamB203Service {

    @Transactional
    @Override
    public void saveParam(AcParamB203 acParamB203) {
        AcParamB203 acParam = new AcParamB203();
        acParam.setTotalHz(acParamB203.getTotalHz());
        acParam.setReHz(acParamB203.getReHz());
        acParam.setTotalWx(acParamB203.getTotalWx());
        acParam.setReWx(acParamB203.getReWx());
        acParam.setTotalNx(acParamB203.getTotalNx());
        acParam.setReNx(acParamB203.getReWx());
        acParam.setTotalDq(acParamB203.getTotalDq());
        acParam.setReDq(acParamB203.getReDq());
        acParam.setTotalCx(acParamB203.getTotalCx());
        acParam.setReCx(acParamB203.getReCx());
        acParam.setTotalAj(acParamB203.getTotalAj());
        acParam.setReAj(acParamB203.getReAj());
        acParam.setTotalCh(acParamB203.getTotalCh());
        acParam.setReCh(acParamB203.getReCh());

        baseMapper.insert(acParam);
    }
}
