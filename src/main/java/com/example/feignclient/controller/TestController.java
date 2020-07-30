package com.example.feignclient.controller;

import com.example.feignclient.feign.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class TestController {
    @Autowired
    private IFeignService feignService;
    @RequestMapping("get")
    @ResponseBody
    public String getFeignRequest(){
        return feignService.get();
    }
}
