package com.jpicazo.curso.springboot.webapp.springboot_web.controllers;

import com.jpicazo.curso.springboot.webapp.springboot_web.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

// this is a controller that returns a view with a user object
@Controller
public class UserController {
    // this is the method that returns the view
    @GetMapping("/details")
    // this is the view that is returned
    public String details(Model model) {
        User user = new User("Julio", "Picazo");
        user.setEmail("jpicazo@gmail.com");
        model.addAttribute("title", "Hola mundo desde Spring boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userMoodel() {
        List<User> users = Arrays.asList(
                new User("pepa", "Gonzales"),
                new User("pepe", "Gonzales", "correo@correo.com"),
                new User("pepo", "Gonzales"),
                new User("pepi", "Gonzales", "email@gmail.com"));
        return users;

    }

}
