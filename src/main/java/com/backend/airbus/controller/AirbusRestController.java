package com.backend.airbus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirbusRestController {

    @GetMapping("/sayhi")
    public String sayHi() {
        return "Hello Airbus";
    }

}
