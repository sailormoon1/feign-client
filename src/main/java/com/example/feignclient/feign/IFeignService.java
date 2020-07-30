package com.example.feignclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@FeignClient("FEIGN-SERVER")
public interface IFeignService {
    @RequestMapping("/gmm/get")
//    @ResponseBody
    public String get();
}
