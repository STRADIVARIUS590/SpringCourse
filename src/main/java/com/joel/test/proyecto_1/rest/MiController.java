package com.joel.test.proyecto_1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiController {

    @GetMapping("html")
    public String html()
    {
        return "index";
    }

    @GetMapping("auto")
    public String devtoolsAutoloadTest()
    {
        return "this was saved by devtools reload";
    }
}
