package com.hy.ureport.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.ureport.entity.AcStatus;
import com.hy.ureport.entity.AcStatusIndustrial;
import com.hy.ureport.entity.query.TableQuery;
import com.hy.ureport.service.AcStatusIndustrialService;
import com.hy.ureport.service.AcStatusService;
import com.hy.ureport.util.BusinessException;
import com.hy.ureport.util.R;
import com.hy.ureport.util.ResponseEnum;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jeremy
 * @since 2022-08-12
 */
@CrossOrigin
@RestController
@RequestMapping("/acStatus")
public class AcStatusController {

    @Resource
    AcStatusService acStatusService;

    @Resource
    AcStatusIndustrialService acStatusIndustrialService;

    //数据导入
    @PostMapping("/import")
    public R batchImport(
            @RequestParam("file") MultipartFile file){
        try{
            InputStream inputStream = file.getInputStream();
            acStatusService.importData(inputStream);
            return R.ok().message("测试数据导入成功");
        }catch (Exception e){
            throw new BusinessException(ResponseEnum.UPLOAD_ERROR,e);
        }

    }
    //清空数据
    @RequestMapping("/truncateTable")
    public R truncateTable(){
        acStatusService.truncate();
        return R.ok().message("清空数据库成功！");
    }
    //数据回显
//    @GetMapping("/listAll")
//    public R listAll(){
//        List<AcStatus> acStatusList = acStatusService.listAll();
//        return R.ok().data("list",acStatusList);
//    }
    @GetMapping("/listAll")
    public R listAll(){
        List<AcStatusIndustrial> acStatusIndustrialsList = acStatusIndustrialService.listAll();
        return R.ok().data("list",acStatusIndustrialsList);
    }


    //分页显示回显数据
    @GetMapping("/list/{page}/{limit}")
    public R listPage(
            @PathVariable Long page,
            @PathVariable Long limit,
            @RequestParam String keyword){
        Page<AcStatus> acStatusPage = new Page<>(page,limit);
        IPage<AcStatus> pageModel = acStatusService.listPage(acStatusPage,keyword);
        return R.ok().data("pageModel", pageModel);
    }

    //分页条件查询
    @GetMapping("/listByCond/{page}/{limit}")
    public R listCond(
            @PathVariable Long page,
            @PathVariable Long limit,
            TableQuery tableQuery){
        Page<AcStatus> pageParam = new Page<>(page,limit);
        IPage<AcStatus> pageModel = acStatusService.listByCond(pageParam,tableQuery);

        return R.ok().data("pageModel",pageModel);
    }






}

