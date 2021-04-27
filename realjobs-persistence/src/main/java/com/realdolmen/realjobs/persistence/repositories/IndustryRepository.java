package com.realdolmen.realjobs.persistence.repositories;

import com.realdolmen.realjobs.persistence.models.Industry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends PagingAndSortingRepository<Industry, Long> {
}
