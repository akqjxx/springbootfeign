package com.liujc.service;

import feign.Param;
import feign.RequestLine;
import fuck.feign.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(url="http://localhost:9001/",value = "userService" ,configuration = FeignConfig.class)
public interface UserService {
    @RequestLine("GET /user/list/{userName}")
     List<String> getListProxy(@Param("userName") String userName);

}
