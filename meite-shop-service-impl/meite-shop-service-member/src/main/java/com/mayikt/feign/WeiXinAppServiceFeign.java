package com.mayikt.feign;

import com.mayikt.WeiXinAppService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "app-mayikt-weixin")
public interface WeiXinAppServiceFeign extends WeiXinAppService {
    // /**
    // * 功能说明： 应用服务接口
    // */
    // @GetMapping("/getApp")
    // public AppEntity getApp();
}
