package com.zwhspace.springbootlearn.controller;

import com.zwhspace.springbootlearn.icontroller.IController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author Mr.Zhang
 * @description springbootlearn
 * @date 2021/9/28 下午9:51
 */
@RequestMapping("/test")
@RestController
public class ConsumerController {

    @Resource
    private IController iController;

    @GetMapping("/test")
    public Collection test(){
        return iController.findDepartment();
    }
}
