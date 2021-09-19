package com.zwhspace.springbootlearn.dao;


import com.zwhspace.springbootlearn.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description springbootlearn
 * @Author Mr.Zhang
 * @Date 2021/9/12 下午3:09
 */
@Repository
public class DepartmentDao {

    public static final Map<Integer, Department> departments;

    static {
        departments = new HashMap<>();
        departments.put(101,new Department(101,"文化部"));
        departments.put(102,new Department(102,"宣传部"));
        departments.put(103,new Department(103,"人力资源部"));
        departments.put(104,new Department(104,"保卫科"));
        departments.put(105,new Department(105,"信息安全部"));
    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }

    public Department getDepartmentById(int id){
        return departments.get(id);
    }
}
