package com.liujc.controller;

import com.liujc.service.IHouseServiceProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController implements IHouseServiceProxy {
    @Override
    @RequestMapping("/getHouse")
    public String getHouse() {
        return "这是我的房子";
    }
}
