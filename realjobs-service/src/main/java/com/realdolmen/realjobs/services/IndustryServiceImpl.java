package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Industry;
import com.realdolmen.realjobs.persistence.repositories.IndustryRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class IndustryServiceImpl implements IndustryService {
    private final IndustryRepository industryRepository;

    public IndustryServiceImpl(IndustryRepository industryRepository) {
        this.industryRepository = industryRepository;
    }

    @Override
    public Iterable<Industry> findAll() {
        return industryRepository.findAll();
    }
}
