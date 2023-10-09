package com.springweb.springweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index","/","home"})
    public String index() {
        System.out.println("Home page");
        return "index.html";
    }

}
