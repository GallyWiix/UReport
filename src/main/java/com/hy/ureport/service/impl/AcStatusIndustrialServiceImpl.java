package com.hy.ureport.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.entity.AcStatusIndustrial;
import com.hy.ureport.entity.query.TableQuery;
import com.hy.ureport.mapper.AcStatusIndustrialMapper;
import com.hy.ureport.service.AcStatusIndustrialService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
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
        List<AcStatusIndustrial> acStatusList = baseMapper.selectList(new QueryWrapper<AcStatusIndustrial>().last("limit 30"));
        return acStatusList;
    }

    @Override
    public IPage<AcStatusIndustrial> listByCond(Page<AcStatusIndustrial> pageParam, TableQuery tableQuery) {
        if(tableQuery == null){
            return baseMapper.selectPage(pageParam,null);
        }
        Long regionCode = tableQuery.getRegionCode();
        String type = tableQuery.getType();
        String isActive = tableQuery.getIsActive();
        String isCommit = tableQuery.getIsCommit();

        QueryWrapper<AcStatusIndustrial> acStatusQueryWrapper = new QueryWrapper<>();
        acStatusQueryWrapper
                .like(regionCode != null,"region_code",regionCode)
                .eq(StringUtils.isNotBlank(type),"type",type)
                .eq(StringUtils.isNotBlank(isActive),"is_active",isActive)
                .eq(StringUtils.isNotBlank(isCommit),"is_commit",isCommit);
        return baseMapper.selectPage(pageParam,acStatusQueryWrapper);
    }
}
