package com.jpicazo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpicazo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.jpicazo.curso.springboot.webapp.springboot_web.models.dto.ParamDtoMix;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamsControler {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "hola desde el default") String message) {

        ParamDto param = new ParamDto();
        param.setMassage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamDtoMix bar(@RequestParam String text, @RequestParam Integer code) {

        ParamDtoMix param = new ParamDtoMix();
        param.setMassage(text);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public ParamDtoMix requesDtoMix(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception

        }

        ParamDtoMix param = new ParamDtoMix();
        param.setCode(code);
        param.setMassage(request.getParameter("message"));

        return param;
    }

}
