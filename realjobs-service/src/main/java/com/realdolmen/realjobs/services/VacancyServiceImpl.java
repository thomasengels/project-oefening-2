package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.VacancyRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {
    private final VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository){
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Iterable<Vacancy> findAll(Specification<Vacancy> vacancySpecification) {
        return vacancyRepository.findAll(vacancySpecification);
    }

    @Override
    public List<String> findAllContractTypes() {
        return null;
    }
}
