package com.github.sparamonov.simplegameframework.core.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app")
public class AppController {
    @RequestMapping(value = {"", "{_:^(?!index\\.html).*$}"})
    public String forward() {
        return "forward:/app/index.html";
    }
}
