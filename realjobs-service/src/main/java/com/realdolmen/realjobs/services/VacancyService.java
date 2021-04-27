package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface VacancyService {
    Iterable<Vacancy> findAll(Specification<Vacancy> vacancySpecification);

    List<String> findAllContractTypes();
}
