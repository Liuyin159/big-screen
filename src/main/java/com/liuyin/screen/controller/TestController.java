package com.liuyin.screen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liu-Yin
 * @Create 2022-08-09 -16:48
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String testController(){
        return "欢迎光临";
    }
}
