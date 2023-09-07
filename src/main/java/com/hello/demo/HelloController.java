package com.hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> greeting = new HashMap<>();
        greeting.put("English", "Hello!");
        greeting.put("日本語", "こんにちは");
        return greeting;
    }
}
