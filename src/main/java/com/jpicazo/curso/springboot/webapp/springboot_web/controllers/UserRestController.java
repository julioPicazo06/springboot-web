package com.jpicazo.curso.springboot.webapp.springboot_web.controllers;

import com.jpicazo.curso.springboot.webapp.springboot_web.models.User;
import com.jpicazo.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;

// this is a rest controller that returns a map with a title and a user object
@RestController
// this is the path for the rest controller
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/users")
    public UserDto usersDetails() {
        UserDto userDto = new UserDto();
        User user = new User("Julio", "Picazo");
        userDto.setUser(user);
        userDto.setTitle("Spring rest");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {

        User user = new User("Julio", "Picazo");
        User user2 = new User("Eduardo", "Rodriguez");
        User user3 = new User("Blondie", "Picazo");
        List<User> users = Arrays.asList(user, user2, user3);
        return users;
    }

    // this is the method that returns the map
    @GetMapping("/users-details")
    // this is the map that is returned
    public Map<String, Object> users() {
        User user = new User("Julio", "Picazo");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Spring rest");
        body.put("user", user);

        return body;
    }

}
