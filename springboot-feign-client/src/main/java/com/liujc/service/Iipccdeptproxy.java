package com.liujc.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springboot-feign-server-ipcc")
public interface Iipccdeptproxy extends IDeptInfoServiceProxy {
}
