package com.zwhspace.springbootlearn.controller;

import com.zwhspace.springbootlearn.dao.DepartmentDao;
import com.zwhspace.springbootlearn.pojo.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @Description springbootlearn
 * @Author Mr.Zhang
 * @Date 2021/9/12 上午11:28
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Resource
    private DepartmentDao departmentDao;

    @GetMapping("/getList")
    public Collection<Department> findDepartment(){

        return departmentDao.getDepartments();
    }
}
