package com.liujc.controller;

import com.google.common.collect.Lists;
import com.liujc.bean.Dept;
import com.liujc.service.IDeptInfoServiceProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class DeptController implements IDeptInfoServiceProxy {

    @RequestMapping("/dept/list")
    @Override
    public List<Dept> getList() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Lists.newArrayList(
                new Dept(1, "name", "deptno"),
                new Dept(2, "name", "deptno"),
                new Dept(3, "name", "deptno"),
                new Dept(4, "name", "deptno")
        );
    }
}
