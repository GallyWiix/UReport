package com.hy.ureport.controller;


import com.hy.ureport.entity.ResultInd;
import com.hy.ureport.entity.ResultIndustrial;
import com.hy.ureport.service.ResultIndService;
import com.hy.ureport.service.ResultIndustrialService;
import com.hy.ureport.util.R;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * @since 2022-08-15
 */
@RestController
@CrossOrigin
@RequestMapping("/resultInd")
public class ResultIndController {

    @Resource
    private ResultIndService resultIndService;

    //获取结果
    @GetMapping("/getResult")
    public R getResult(){
        List<ResultInd> resultIndustrialList = resultIndService.getResult();
        return R.ok().data("list",resultIndustrialList);
    }

}

