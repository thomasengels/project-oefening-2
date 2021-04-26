package com.realdolmen.realjobs.persistence.repositories;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacancyRepository extends PagingAndSortingRepository<Vacancy, Long> {
}
