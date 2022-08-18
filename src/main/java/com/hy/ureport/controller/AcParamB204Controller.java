package com.hy.ureport.controller;


import com.hy.ureport.entity.AcParamB204;
import com.hy.ureport.service.AcParamB203Service;
import com.hy.ureport.service.AcParamB204Service;
import com.hy.ureport.util.BusinessException;
import com.hy.ureport.util.R;
import com.hy.ureport.util.ResponseEnum;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;

/**
 * <p>
 * 总企业数与带报数传值 前端控制器
 * </p>
 *
 * @author jeremy
 * @since 2022-08-15
 */
@RestController
@CrossOrigin
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

