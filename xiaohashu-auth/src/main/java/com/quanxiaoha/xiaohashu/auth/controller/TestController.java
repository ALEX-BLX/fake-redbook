package com.quanxiaoha.xiaohashu.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quanxiaoha.framework.common.response.Response;


@RestController
public class TestController {
    @GetMapping("/test")
    public Response<String> test(){
        return Response.success("hello!");
    }
}
