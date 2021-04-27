package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.ContractType;
import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.VacancyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class VacancySpecificationContractTypeFilterTest {
    @Autowired
    private VacancyRepository vacancyRepository;

    @BeforeEach
    public void setup() {

        Vacancy vacancy = Vacancy.builder().id(1L).functionTitle("Java developer").contractType(ContractType.FULL_TIME).build();


        Vacancy vacancy2 = Vacancy.builder().id(2L).functionTitle("C# developer").contractType(ContractType.STUDENT).build();
        Vacancy vacancy3 = Vacancy.builder().id(3L).functionTitle("Java developer 2").contractType(ContractType.STUDENT).build();

        vacancyRepository.save(vacancy);
        vacancyRepository.save(vacancy2);
        vacancyRepository.save(vacancy3);
    }

    @Test
    public void vacancyFilterBySingleContractTypeTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withContractTypes(Collections.singletonList("FULL_TIME")));
        assertEquals(1, vacancies.size());
        assertEquals(ContractType.FULL_TIME, vacancies.get(0).getContractType());
        assertEquals(1L, vacancies.get(0).getId());
    }

    @Test
    public void vacancyFilterByMultipleContractTypesTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withContractTypes(Arrays.asList("FULL_TIME","STUDENT")));
        assertEquals(3, vacancies.size());
    }

    @Test
    public void vacancyFilterEmptyContractTypesTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withContractTypes(Collections.emptyList()));
        assertEquals(3, vacancies.size());
    }

}
