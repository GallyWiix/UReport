package com.hy.ureport.controller;


import com.hy.ureport.entity.ResultIndustrial;
import com.hy.ureport.service.ResultIndustrialService;
import com.hy.ureport.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 工业b204b203结果 前端控制器
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
@RestController
@RequestMapping("/resultIndustrial")
public class ResultIndustrialController {

    @Resource
    private ResultIndustrialService resultIndustrialService;

    //获取结果
    @GetMapping("/getResult")
    public R getResult(){
        List<ResultIndustrial> resultIndustrialList = resultIndustrialService.getResult();
        return R.ok().data("list",resultIndustrialList);
    }

}

