package com.zwhspace.springbootlearn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author admin
 */
@FeignClient(name = "service-department",path = "/department")
public interface IDepartmentController {

    @GetMapping("/getList")
    Collection findDepartment();
}
