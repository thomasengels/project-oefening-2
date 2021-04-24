package com.realdolmen.realjobs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class VacancyController {

    @GetMapping("")
    public String getVacancies(){
        return "test";
    }
}
