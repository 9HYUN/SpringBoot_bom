package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 Class 는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI를 지정해주는 Annotation (주소 할당)
public class Apicontroller
{
    @GetMapping("/hello") // http://localhost:8080/api/hello    localhost(현재 내 서버 주소)
    public String hello()
    {
        return "hello spring boot!!";
    }
}
