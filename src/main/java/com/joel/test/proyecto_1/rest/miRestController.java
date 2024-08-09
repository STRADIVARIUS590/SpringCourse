package com.joel.test.proyecto_1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class miRestController {

    @GetMapping("/")
    public String saludo()
    {
        return "Hola";
    }


}
