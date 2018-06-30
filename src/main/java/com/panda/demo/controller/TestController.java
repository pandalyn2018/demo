package com.panda.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器.
 * @
 */
@RestController
public class TestController {

    @GetMapping("/test/hello")
    public String hello() {
        return "Hello world!";
    }
}
