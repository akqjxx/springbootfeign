package com.liujc.controller;

import com.liujc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserClientController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/list")
    public List<String> get(){
        return userService.getListProxy("傻大木");
    }

}