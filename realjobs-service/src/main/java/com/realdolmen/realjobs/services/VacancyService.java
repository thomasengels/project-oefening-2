package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Vacancy;

public interface VacancyService {
    Iterable<Vacancy> findAll();
}
