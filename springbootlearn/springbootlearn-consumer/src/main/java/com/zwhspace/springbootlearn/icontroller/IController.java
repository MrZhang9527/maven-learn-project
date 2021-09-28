package com.zwhspace.springbootlearn.icontroller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author Mr.Zhang
 * @description springbootlearn
 * @date 2021/9/28 下午9:46
 */
@FeignClient("service-controller")
public interface IController {

    @GetMapping("/department/getList")
    Collection findDepartment();
}
