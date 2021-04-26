package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.VacancyRepository;
import org.springframework.stereotype.Service;

@Service
public class VacancyServiceImpl implements VacancyService {
    private final VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository){
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Iterable<Vacancy> findAll() {
        return vacancyRepository.findAll();
    }
}
