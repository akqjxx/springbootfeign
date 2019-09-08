package com.liujc.controller;

import com.liujc.bean.Dept;
import com.liujc.service.Iipccdeptproxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private Iipccdeptproxy iipccdeptproxy;
    @RequestMapping("/dept/list")
    public List<Dept> deptList(){
        return iipccdeptproxy.getList();
    }
}
