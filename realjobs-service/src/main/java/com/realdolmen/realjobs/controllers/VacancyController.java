package com.realdolmen.realjobs.controllers;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.specifications.VacancySpecification;
import com.realdolmen.realjobs.services.VacancyService;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "vacancy")
public class VacancyController {
    private VacancyService vacancyService;

    public VacancyController(VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    @GetMapping("")
    public Iterable<Vacancy> getVacancies(@RequestParam(required = false) List<String> industryNames,
                                          @RequestParam(required = false) List<String> contractTypes,
                                          @RequestParam(required = false) Integer maxPostedDate,
                                          @RequestParam(required = false) Integer minYearsOfExperience,
                                          @RequestParam(required = false) Integer maxYearsOfExperience) {
        Specification<Vacancy> vacancySpecification = VacancySpecification.withIndustryNames(industryNames)
                .and(VacancySpecification.withContractTypes(contractTypes)
                        .and(VacancySpecification.withDatePostedNotOlderThan(maxPostedDate))
                        .and(VacancySpecification.withExperienceBetween(minYearsOfExperience, maxYearsOfExperience)));
        return vacancyService.findAll(vacancySpecification);
    }
}
