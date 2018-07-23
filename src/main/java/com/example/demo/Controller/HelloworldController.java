package com.example.demo.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yg on 2018/4/25.
 */
@Controller
@RequestMapping("/index")
public class HelloworldController {

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        System.out.println("----come to index here...");
        return "index";
    }
}
