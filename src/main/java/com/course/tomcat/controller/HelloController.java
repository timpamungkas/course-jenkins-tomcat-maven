package com.course.tomcat.controller;
 
import org.springframework.web.bind.annotation.*;
 
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
 
@RestController
@RequestMapping("/api")
public class HelloController {
 
    @GetMapping(value = {"", "/", "/now"})
    String hello() {
        return "Now is " + LocalDateTime.now();
    }
    
    @GetMapping(value = "/random")
    int random(){
        return ThreadLocalRandom.current().nextInt(0,1000);
    }
 
    @GetMapping(value = "/hero")
    String hero(){
        return "My favorite superhero is Batman";
    }
 
}
