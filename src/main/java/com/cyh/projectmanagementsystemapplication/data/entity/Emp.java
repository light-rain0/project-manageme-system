package com.cyh.projectmanagementsystemapplication.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工信息
 *
 * @author cyh
 * @since 2024/12/18
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 员工名称,不能为空
     */
    private String empName;

    /**
     * 员工类型,不能为空 1：项目经理 2：开发人员
     */
    private int empType;
}
