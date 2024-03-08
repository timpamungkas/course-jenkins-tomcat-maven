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
}
package com.course.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TomcatApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatApplication.class, args);
	}

}
