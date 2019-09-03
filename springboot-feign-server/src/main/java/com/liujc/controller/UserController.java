package com.liujc.controller;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping(value = "user/list/{userName}")
    public List<String> getList(@PathVariable(name="userName") String userName) {
        return Lists.newArrayList(userName, "zhangsan", "list", "wangwu");
    }
}