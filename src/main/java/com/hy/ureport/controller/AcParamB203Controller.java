package com.hy.ureport.controller;


import com.hy.ureport.entity.AcParamB203;
import com.hy.ureport.entity.AcParamB204;
import com.hy.ureport.service.AcParamB203Service;
import com.hy.ureport.util.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 总企业数与带报数传值 前端控制器
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@RestController
@RequestMapping("/acParamB203")
public class AcParamB203Controller {
    @Resource
    private AcParamB203Service acParamB203Service;

    @PostMapping("/save")
    public R save(@RequestBody AcParamB203 acParamB203){
        acParamB203Service.saveParam(acParamB203);
        return R.ok().message("参数导入成功");
    }

}

