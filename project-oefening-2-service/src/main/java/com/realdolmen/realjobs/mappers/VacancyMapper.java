package com.realdolmen.realjobs.mappers;

import com.realdolmen.realjobs.application.models.Vacancy;
import com.realdolmen.realjobs.dto.VacancyDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

@Mapper(config = VacancyMapperConfig.class, uses = AddressMapper.class,componentModel = "spring")
public abstract class VacancyMapper {
    @InheritConfiguration(name = "toVacancyDTO")
    public abstract VacancyDTO mapToDTO(Vacancy vacancy);
    @InheritConfiguration(name = "toVacancyModel")
    public abstract Vacancy mapToModel(VacancyDTO vacancyDTO);
}
