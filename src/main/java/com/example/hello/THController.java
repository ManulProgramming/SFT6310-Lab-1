package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class THController {
    @GetMapping("")
    public String load_template(Model model) {
        model.addAttribute("data", List.of(
                "This is a test text to see how this Thymeleaf library (dependency) would correlate with Jinja2 in Python Flask/Django",
                "A pretty interesting experiment at least for me, as I try to find analogues within different languages and structures. Would be pretty good if I am successfully at finding at least some equivalence",
                "Flask is made for very quick and easy web applications. It is absolutely minimal at it's structure, as everything you want to implement needs to be created by you. This is like a double-edged sword, while on one hand, for simple websites it is quite practical with it's minimalism, but on the other hand, for bigger and robust applications this philosophy might become a problem down the line. However, in this way a developer knows exactly what is used and how it is created without some unnecessary bloat existing within code and libraries... While also reinventing a wheel so to speak.",
                "While Spring will be VERY different at it, as even the language that this framework exists on is more structured than Python. So, we'll see how this process might go.",
                ":)"
        ));
        return "test.html";
    }
}