package com.kum.controller;

import com.alibaba.fastjson.JSONObject;
import com.kum.domain.AjaxResult;
import com.kum.domain.entity.SysBuilding;
import com.kum.service.SysBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @Package com.kum.controller
 * @auhter 温彬
 * @date
 */

@RestController
@RequestMapping("/system/building")
public class SysBuildingController {

    @Autowired
    private SysBuildingService sysBuildingService;

    @GetMapping("/list")
    public AjaxResult getList(){
        return AjaxResult.success(sysBuildingService.list());
    }

    @GetMapping("/name/list")
    public AjaxResult getNameList(){
        return AjaxResult.success(sysBuildingService.nameList());
    }

//    @PreAuthorize("@ps.hasPermi('system:building:save')")
    @PostMapping("/save")
    public AjaxResult saveBuilding(@RequestBody SysBuilding sysBuilding) {
        sysBuildingService.save(sysBuilding);
        return AjaxResult.success();
    }
//    @PreAuthorize("@ps.hasPermi('system:building:delete')")
    @PostMapping("/delete")
    public AjaxResult deleteBuilding(@RequestBody JSONObject jsonObject) {
        if(sysBuildingService.delete(jsonObject.getString("id"))){
            return AjaxResult.success();
        }
        return AjaxResult.error();
    }




}
