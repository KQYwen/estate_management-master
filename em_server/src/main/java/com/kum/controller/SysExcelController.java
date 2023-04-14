package com.kum.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.kum.service.SysExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @version V1.0
 * @Package com.kum.controller
 * @auhter 温彬
 * @date
 *
 * <p>
 *     下载Excel的功能使用 EasyExcel 进行实现。
 *
 * </p>
 */

@RestController
@RequestMapping("/system/download/excel")
public class SysExcelController {

    @Autowired
    private SysExcelService sysExcelService;

//    @PreAuthorize("@ps.hasPermi('system:rooms:download')")
    @GetMapping("/rooms")
    public void downloadSysRooms(HttpServletResponse httpServletResponse){
        sysExcelService.downloadSysRooms(httpServletResponse);
    }

//    @PreAuthorize("@ps.hasPermi('system:user_HouseholdInfo:download')")
    @GetMapping("/households")
    public void downloadSysHouseholdInfos(HttpServletResponse httpServletResponse){
        sysExcelService.downloadSysHouseholdInfos(httpServletResponse);
    }


}
