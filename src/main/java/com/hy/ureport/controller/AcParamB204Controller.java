package com.hy.ureport.controller;


import com.hy.ureport.entity.AcParamB204;
import com.hy.ureport.service.AcParamB204Service;
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
@RequestMapping("/acParamB204")
public class AcParamB204Controller {
    @Resource
    private AcParamB204Service acParamB204Service;
    @PostMapping("/save")
    public R save(@RequestBody AcParamB204 acParamB204){
        acParamB204Service.saveParam(acParamB204);
        return R.ok().message("参数导入成功");

    }

}

