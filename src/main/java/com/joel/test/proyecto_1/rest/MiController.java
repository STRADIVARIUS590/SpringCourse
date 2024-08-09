package com.joel.test.proyecto_1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiController {

    @GetMapping("html")
    public String html()
    {
        return "index";
    }
}
