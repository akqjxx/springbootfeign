package com.liujc.controller;

import com.liujc.service.IBossHouseProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {

    @Autowired
    private IBossHouseProxy iBossHouseProxy;
    @RequestMapping("/getHouse")
    public String getHouse(){
        return iBossHouseProxy.getHouse();
    }
    @RequestMapping("/getHouse/list")
    public String getHouseList(){
        return iBossHouseProxy.getList();
    }
}
