package com.kum.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @version V1.0
 * @Package com.kum.domain.entity
 * @auhter 温彬
 * @date 2023/2/11-10:13 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysNotice {
    private String id;
    private String title;
    private Date date;
    private String text;
    private String html;
    private String author;
}
