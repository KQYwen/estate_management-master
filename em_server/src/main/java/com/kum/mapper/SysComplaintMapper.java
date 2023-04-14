package com.kum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kum.domain.entity.SysComplaint;
import com.kum.domain.entity.SysRepair;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version V1.0
 * @Package com.kum.mapper
 * @auhter 温彬
 * @date 2023/2/18-9:43 PM
 */

@Mapper
public interface SysComplaintMapper extends BaseMapper<SysComplaint> {
}
