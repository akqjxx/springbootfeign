package com.liujc.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springboot-feign-server-boss")
public interface IBossHouseProxy extends  IHouseServiceProxy{
}
