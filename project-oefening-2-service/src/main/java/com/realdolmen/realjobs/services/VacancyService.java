package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.application.models.Vacancy;

import java.util.List;

public interface VacancyService {
    List<Vacancy> findAll();
}
