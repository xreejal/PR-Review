package org.xreejal.springs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsApplication.class, args);
    }

    @GetMapping
    public String sendHi() {
        return "Hi";
    }



}