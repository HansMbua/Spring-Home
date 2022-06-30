package com.example.springmvcdemo.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
    @RequestMapping("/")
    public String homePage() {
        return "Home";
    }
}
