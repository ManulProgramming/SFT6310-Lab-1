package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class APIController {
    @GetMapping({"","/"})
    public String index() {
        return "Hi! Go to /api/hello to see Hello World, or /api/status to see a dictionary (HashMap)";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/status")
    public Map<String, Object> status() {
        Map<String, Object> dictionary = new HashMap<>();
        dictionary.put("status", 200);
        dictionary.put("msg", "Hello World!");
        dictionary.put("timestamp", System.currentTimeMillis());
        return dictionary;
    }
}
