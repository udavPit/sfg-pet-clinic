package com.github.udavpit.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(final Model model) {
        model.addAttribute("hello", "Hello from Thymeleaf");
        return "index";
    }
}
