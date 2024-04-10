package com.course.tomcat.controller;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ThreadLocalRandom;


import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping(value = {"", "/", "/now"})
    String hello() {
        return "Now is " + LocalDateTime.now();
    }

    @GetMapping("random")
    int random() {
        return ThreadLocalRandom.current().nextInt(0,1000);
    }


    @GetMapping("/hero")
    String hero(){
        return "My Favorite superhero is Deadpool";
    }


    @GetMapping
    String messageInitial(){
        return "Hello Jenkins and Google!";
    }

}
