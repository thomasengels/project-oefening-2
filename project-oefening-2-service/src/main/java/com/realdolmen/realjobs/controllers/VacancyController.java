package com.realdolmen.realjobs.controllers;

import com.realdolmen.realjobs.application.models.Vacancy;
import com.realdolmen.realjobs.dto.VacancyDTO;
import com.realdolmen.realjobs.mappers.VacancyMapper;
import com.realdolmen.realjobs.services.VacancyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/REST/vacancy")
public class VacancyController {
    private VacancyService vacancyService;
    private VacancyMapper vacancyMapper;

    public VacancyController(VacancyService vacancyService, VacancyMapper vacancyMapper) {
        this.vacancyService = vacancyService;
        this.vacancyMapper = vacancyMapper;
    }

    @GetMapping("")
    public Iterable<VacancyDTO> getVacancies(){
        return vacancyService.findAll().stream().map(v -> vacancyMapper.mapToDTO(v)).collect(Collectors.toList());
    }

}
