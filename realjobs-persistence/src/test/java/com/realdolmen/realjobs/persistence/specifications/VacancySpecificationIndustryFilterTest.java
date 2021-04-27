package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.Industry;
import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.IndustryRepository;
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
class VacancySpecificationIndustryFilterTest {
    @Autowired
    private VacancyRepository vacancyRepository;

    @Autowired
    private IndustryRepository industryRepository;

    @BeforeEach
    public void setup() {
        Industry industry = Industry.builder().id(1L).industryName("IT").build();
        Vacancy vacancy = Vacancy.builder().id(1L).functionTitle("Java developer").industry(industry).build();
        Industry industry2 = Industry.builder().id(2L).industryName("Healthcare").build();
        Vacancy vacancy2 = Vacancy.builder().id(2L).functionTitle("C# developer").industry(industry2).build();
        Vacancy vacancy3 = Vacancy.builder().id(3L).functionTitle("Java developer 2").industry(industry).build();
        industryRepository.save(industry);
        industryRepository.save(industry2);
        vacancyRepository.save(vacancy);
        vacancyRepository.save(vacancy2);
        vacancyRepository.save(vacancy3);
    }

    @Test
    public void vacancyFilterBySingleIndustryNameTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withIndustryNames(Collections.singletonList("Healthcare")));
        assertEquals(1, vacancies.size());
        assertEquals("Healthcare", vacancies.get(0).getIndustry().getIndustryName());
        assertEquals(2L, vacancies.get(0).getId());
    }

    @Test
    public void vacancyFilterByMultipleIndustryNamesTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withIndustryNames(Arrays.asList("IT","Healthcare")));
        assertEquals(3, vacancies.size());
    }

    @Test
    public void vacancyFilterEmptyIndustryNamesTest(){
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withIndustryNames(Collections.emptyList()));
        assertEquals(3, vacancies.size());
    }
}
