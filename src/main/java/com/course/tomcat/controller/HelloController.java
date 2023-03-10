package com.course.tomcat.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping(value = {"", "/", "/now"})
    String hello() {
        return "Now is " + LocalDateTime.now();
    }

}
