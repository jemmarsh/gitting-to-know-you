package com.jemmarsh;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Bollonies {

    @RequestMapping("/")
    String home() {
        return "What did you expect? A hello?";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Bollonies.class, args);
    }

}