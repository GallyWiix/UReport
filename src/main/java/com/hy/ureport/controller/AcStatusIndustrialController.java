package com.hy.ureport.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.entity.AcStatusIndustrial;
import com.hy.ureport.entity.query.TableQuery;
import com.hy.ureport.service.AcStatusIndustrialService;
import com.hy.ureport.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@RestController
@CrossOrigin
@RequestMapping("/acStatusIndustrial")
public class AcStatusIndustrialController {
    @Resource
    private AcStatusIndustrialService acStatusIndustrialService;
    //分页条件查询
    @GetMapping("/listByCond/{page}/{limit}")
    public R listCond(
            @PathVariable Long page,
            @PathVariable Long limit,
            TableQuery tableQuery){
        Page<AcStatusIndustrial> pageParam = new Page<>(page,limit);
        IPage<AcStatusIndustrial> pageModel = acStatusIndustrialService.listByCond(pageParam,tableQuery);

        return R.ok().data("pageModel",pageModel);
    }
}

