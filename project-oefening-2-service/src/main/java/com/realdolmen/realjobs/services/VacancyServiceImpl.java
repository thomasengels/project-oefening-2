package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.models.Vacancy;
import com.realdolmen.realjobs.repositories.VacancyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {
    private final VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository){
        this.vacancyRepository = vacancyRepository;
    }

//    @Override
//    public List<Vacancy> findAll() {
//        return vacancyRepository.findAll();
//    }
}
