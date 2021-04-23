package com.realdolmen.realjobs.repositories;

import com.realdolmen.realjobs.models.Vacancy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacancyRepository extends PagingAndSortingRepository<Vacancy, Long> {
}
