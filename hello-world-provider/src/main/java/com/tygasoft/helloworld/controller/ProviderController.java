package com.tygasoft.helloworld.controller;

import com.tygasoft.helloworld.api.HelloWorldInterfaces;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@RestSchema(schemaId = "providerController")
public class ProviderController implements HelloWorldInterfaces {

    @GetMapping("hello")
    @Override
    public String sayHello(String name) {
        System.out.println("名称是："+name);
        return "请求成功，返回名称："+name;
    }
}
