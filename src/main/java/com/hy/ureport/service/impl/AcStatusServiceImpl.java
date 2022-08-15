package com.hy.ureport.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.entity.query.TableQuery;
import com.hy.ureport.listener.ExcelListener;
import com.hy.ureport.mapper.AcStatusMapper;
import com.hy.ureport.service.AcStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-12
 */
@Service
public class AcStatusServiceImpl extends ServiceImpl<AcStatusMapper, AcStatus> implements AcStatusService {
    @Resource
    AcStatusMapper acStatusMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void importData(InputStream inputStream) {
        EasyExcel.read(inputStream, AcStatus.class, new ExcelListener(baseMapper)).sheet().doRead();
    }


    @Override
    public List<AcStatus> listAll() {
        List<AcStatus> acStatusList = baseMapper.selectList(null);
        return acStatusList;

    }

    @Override
    public IPage<AcStatus> listPage(Page<AcStatus> acStatusPage, String keyword) {
        if(StringUtils.isBlank(keyword)){
            return baseMapper.selectPage(acStatusPage,null);

        }
        QueryWrapper<AcStatus> acStatusQueryWrapper = new QueryWrapper<>();
        acStatusQueryWrapper
                .like("region_code",keyword)
                .or().like("type",keyword)
                .or().like("is_active",keyword)
                .or().like("is_commit",keyword);
        return baseMapper.selectPage(acStatusPage,acStatusQueryWrapper);

    }

    @Override
    public IPage<AcStatus> listByCond(Page<AcStatus> pageParam, TableQuery tableQuery) {
        if(tableQuery == null){
            return baseMapper.selectPage(pageParam,null);
        }
        Long regionCode = tableQuery.getRegionCode();
        String type = tableQuery.getType();
        String isActive = tableQuery.getIsActive();
        String isCommit = tableQuery.getIsCommit();

        QueryWrapper<AcStatus> acStatusQueryWrapper = new QueryWrapper<>();
        acStatusQueryWrapper
                .like(regionCode != null,"region_code",regionCode)
                .eq(StringUtils.isNotBlank(type),"type",type)
                .eq(StringUtils.isNotBlank(isActive),"is_active",isActive)
                .eq(StringUtils.isNotBlank(isCommit),"is_commit",isCommit);
        return baseMapper.selectPage(pageParam,acStatusQueryWrapper);
    }

    @Override
    public void truncate() {
        acStatusMapper.truncate();
    }

}
