package com.example.filter.controller;

import com.example.filter.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/public")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Public Hello";
    }


    @PostMapping("")
    public User user(@RequestBody User user) {
        log.info("USER: {}", user);
        return user;

    }

}
