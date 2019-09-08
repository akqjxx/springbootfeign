package com.liujc.controller;

import com.google.common.collect.Lists;
import com.liujc.bean.Dept;
import com.liujc.service.Iipccdeptproxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private Iipccdeptproxy iipccdeptproxy;

    @RequestMapping("/dept/list")
    @HystrixCommand(fallbackMethod = "fallback")//调用超时，则调用fallback方法
    public List<Dept> deptList() {
        return iipccdeptproxy.getList();
    }

    public List<Dept> fallback() {
        ArrayList<Dept> depts = Lists.newArrayList(new Dept(0, "1", "1"));
        return depts;
    }
}
