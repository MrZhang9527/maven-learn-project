package com.zwhspace.springbootlearn.dao;

import com.zwhspace.springbootlearn.pojo.Department;
import com.zwhspace.springbootlearn.pojo.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description springbootlearn
 * @Author Mr.Zhang
 * @Date 2021/9/12 下午3:20
 */
@Repository
public class EmployeeDao {

    public static final Map<Integer, Employee> EMPLOYEE_MAP;
    private Integer initId = 10005;

    @Resource
    private DepartmentDao departmentDao;

    static {
        EMPLOYEE_MAP = new HashMap<>();
        EMPLOYEE_MAP.put(10001,new Employee(10001,"张三","test@qq.com","0",new Department(101,"文化部"),"1999-1-1"));
        EMPLOYEE_MAP.put(10002,new Employee(10002,"王五","test@qq.com","1",new Department(103,"人力资源部"),"2000-3-1"));
        EMPLOYEE_MAP.put(10003,new Employee(10003,"路人甲","test@qq.com","1",new Department(104,"保卫科"),"2000-1-3"));
        EMPLOYEE_MAP.put(10004,new Employee(10004,"路人乙","test@qq.com","0",new Department(105,"信息安全部"),"2000-12-1"));
    }

    public void add(Employee employee){
        employee.setId(initId++);
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        EMPLOYEE_MAP.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return EMPLOYEE_MAP.values();
    }

    public Employee selectById(int id){
        return EMPLOYEE_MAP.get(id);
    }

    public void deleteById(int id){
        EMPLOYEE_MAP.remove(id);
    }
}
