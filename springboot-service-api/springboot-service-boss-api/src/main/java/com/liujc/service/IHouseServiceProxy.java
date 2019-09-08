package com.liujc.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IHouseServiceProxy {
    @RequestMapping("/getHouse")
    String getHouse();
}
