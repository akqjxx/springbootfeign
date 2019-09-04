package com.liujc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:9001/",value = "infoService")
public interface InfoService {

    @RequestMapping(method =RequestMethod.GET ,value = "/user/info")
//@RequestLine("GET /user/info")
    String getUserinfo();
}
