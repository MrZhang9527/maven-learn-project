package com.zwhspace.springbootlearn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 部门类
 * @Author Mr.Zhang
 * @Date 2021/9/12 上午11:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}
