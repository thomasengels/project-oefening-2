package com.realdolmen.realjobs.controllers;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.services.VacancyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "vacancy")
public class VacancyController {
    private VacancyService vacancyService;

    public VacancyController(VacancyService vacancyService){
        this.vacancyService = vacancyService;
    }

    @GetMapping("")
    public Iterable<Vacancy> getVacancies(){
        return vacancyService.findAll();
    }
}
