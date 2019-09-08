package com.liujc.service;

import com.liujc.bean.Dept;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface IDeptInfoServiceProxy {
    @RequestMapping("/dept/list")
    public List<Dept> getList();
}
