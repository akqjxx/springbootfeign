package com.liujc.service;

import com.liujc.conf.FeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(url="http://localhost:9001/",value = "userService" ,configuration = FeignConfig.class)
public interface UserService {
    @RequestLine("GET /user/list/{userName}")
    @ResponseBody
     List<String> getListProxy(@Param("userName") String userName);
}
