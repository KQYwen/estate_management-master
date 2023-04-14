package com.kum.service;

import com.kum.domain.entity.SysRole;
import com.kum.mapper.SysRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @Package com.kum.service
 * @auhter 温彬
 * @date 2023/3/20-3:27 PM
 */

@Service
public class SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    public SysRole findById(Integer id){
        return sysRoleMapper.selectById(id);
    }







}
