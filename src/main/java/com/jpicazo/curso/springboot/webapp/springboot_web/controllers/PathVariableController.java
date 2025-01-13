package com.jpicazo.curso.springboot.webapp.springboot_web.controllers;

import com.jpicazo.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.*;

import com.jpicazo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto bazDto(@PathVariable(name = "message") String message) {

        ParamDto params = new ParamDto();
        params.setMassage(message);
        return params;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return user;
    }

}
