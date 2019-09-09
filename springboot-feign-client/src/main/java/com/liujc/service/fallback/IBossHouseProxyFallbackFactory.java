package com.liujc.service.fallback;

import com.liujc.service.IBossHouseProxy;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class IBossHouseProxyFallbackFactory implements FallbackFactory<IBossHouseProxy> {
    @Override
    public IBossHouseProxy create(Throwable cause) {
        return new IBossHouseProxy() {

            @Override
            public String getHouse() {
                return "查询房屋信息失败";
            }

            @Override
            public String getList() {
                return "系统服务异常";
            }
        };
    }
}
