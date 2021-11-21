package com.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaolingfeng
 * @Date: 2021/11/22 0:34
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "fff";
    }
}
