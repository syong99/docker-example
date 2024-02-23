package org.ohgiraffers.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String home(){
        return "Hello Docker World";
    }
}
