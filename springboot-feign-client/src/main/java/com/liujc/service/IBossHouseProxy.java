package com.liujc.service;

import com.liujc.service.fallback.IBossHouseProxyFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "springboot-feign-server-boss",fallbackFactory = IBossHouseProxyFallbackFactory.class)
public interface IBossHouseProxy extends  IHouseServiceProxy{
}
