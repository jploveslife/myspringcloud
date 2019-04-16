package com.ji.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jipeng
 * @Description:
 * @Date: Created in 2018/6/8 7:52
 */
@RestController
public class TestController {
    @Value("${configtest.version}")
    private String version;

    @RequestMapping("/test")
    public String from() {
        return this.version;
    }
}
