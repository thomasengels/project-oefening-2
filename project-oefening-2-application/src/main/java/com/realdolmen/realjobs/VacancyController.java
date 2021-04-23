package com.realdolmen.realjobs;

import com.realdolmen.realjobs.dto.VacancyDTO;
import com.realdolmen.realjobs.mappers.VacancyMapper;
import com.realdolmen.realjobs.services.VacancyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/vacancy", produces = "application/json")
public class VacancyController {
//    private final VacancyService vacancyService;
//    private final VacancyMapper vacancyMapper;

//    public VacancyController(VacancyService vacancyService,
//                             VacancyMapper vacancyMapper) {
//        this.vacancyService = vacancyService;
//        this.vacancyMapper = vacancyMapper;
//    }
//
//    @GetMapping("")
//    public Iterable<VacancyDTO> getVacancies(){
//        return vacancyService.findAll().stream().map(v -> vacancyMapper.mapToDTO(v)).collect(Collectors.toList());
//    }

    public VacancyController(){

    }

    @GetMapping("")
    public String getMapping(){
        System.out.println("test");
        return "test";
    }


}
