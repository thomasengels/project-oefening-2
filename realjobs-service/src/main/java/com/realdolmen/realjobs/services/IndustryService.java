package com.realdolmen.realjobs.services;

import com.realdolmen.realjobs.persistence.models.Industry;

public interface IndustryService {
    Iterable<Industry> findAll();
}
