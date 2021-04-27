package com.realdolmen.realjobs.persistence.repositories;

import com.realdolmen.realjobs.persistence.models.ContractType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository extends PagingAndSortingRepository<ContractType, Long> {

}
