package com.kum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kum.domain.entity.SysChargeType;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version V1.0
 * @Package com.kum.mapper
 * @auhter 温彬
 * @date 2023/3/2-8:07 PM
 */

@Mapper
public interface SysChargeTypeMapper extends BaseMapper<SysChargeType> {

    public void list();

}
