package com.jpicazo.curso.springboot.webapp.springboot_web.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details() {
        return "details";
    }

}
