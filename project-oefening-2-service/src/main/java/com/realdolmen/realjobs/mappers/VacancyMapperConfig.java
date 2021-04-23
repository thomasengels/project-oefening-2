package com.realdolmen.realjobs.mappers;

import com.realdolmen.realjobs.models.Vacancy;
import com.realdolmen.realjobs.dto.VacancyDTO;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig(componentModel = "spring")
public interface VacancyMapperConfig {
    abstract VacancyDTO toVacancyDTO(Vacancy vacancy, @MappingTarget VacancyDTO vacancyDTO);
    abstract Vacancy toVacancyModel(VacancyDTO vacancyDTO, @MappingTarget Vacancy vacancy);
}
