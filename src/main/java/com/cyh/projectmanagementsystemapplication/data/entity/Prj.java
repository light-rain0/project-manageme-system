package com.cyh.projectmanagementsystemapplication.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 项目信息
 *
 * @author cyh
 * @since 2024/12/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prj {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 项目名称,不能为空
     */
    private String prjName;

    /**
     * 开始日期,不能为空
     */
    private Date prjStartDate;

    /**
     * 结束日期,不能为空
     */
    private Date prjEndDate;

    /**
     * 项目负责人
     */
    private Integer prjManager;

    // 所有实体类里面一切类型使用包装类型

}
