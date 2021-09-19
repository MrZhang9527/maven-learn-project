package com.zwhspace.springbootlearn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Description 员工类
 * @Author Mr.Zhang
 * @Date 2021/9/12 上午11:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Department department;
    private String birth;
}
