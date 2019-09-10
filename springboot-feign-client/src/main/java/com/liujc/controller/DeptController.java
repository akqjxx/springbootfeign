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
import java.util.concurrent.TimeUnit;

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

    @RequestMapping("/dept/get")
    @HystrixCommand(fallbackMethod = "fallback2")
    public List<Integer> getList2()
    {
        int i=1/0;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Lists.newArrayList(1,2,3,4,5,6,7,8,9);
    }
    public List<Integer> fallback2(){
        return Lists.newArrayList(0,0,0,0,0,0,0,0,0);
    }
}
