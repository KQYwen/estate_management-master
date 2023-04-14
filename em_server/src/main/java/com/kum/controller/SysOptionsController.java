package com.kum.controller;

import com.kum.domain.AjaxResult;
import com.kum.domain.entity.SysOptions;
import com.kum.service.SysOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @Package com.kum
 * @auhter 温彬
 * @date
 */

@RestController
@RequestMapping("/system/options")
public class SysOptionsController {

    @Autowired
    private SysOptionsService sysOptionsService;

    @GetMapping("/get/{id}")
    public AjaxResult getOptions(@PathVariable("id") String id) {
        return AjaxResult.success(sysOptionsService.findById(id));
    }
//    @PreAuthorize("@ps.hasPermi('system:options:save')")
    @PostMapping("/save")
    public AjaxResult saveOptions(@RequestBody SysOptions sysOptions) {
        sysOptionsService.save(sysOptions);
        return AjaxResult.success();
    }


}
