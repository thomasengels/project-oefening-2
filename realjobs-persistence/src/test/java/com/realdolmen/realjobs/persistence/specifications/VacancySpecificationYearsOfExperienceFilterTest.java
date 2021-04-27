package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.VacancyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class VacancySpecificationYearsOfExperienceFilterTest {
    @Autowired
    private VacancyRepository vacancyRepository;

    @BeforeEach
    public void setup() {
        Vacancy vacancy = Vacancy.builder().id(1L).functionTitle("Java developer").requiredYearsOfExperience(0).build();

        Vacancy vacancy2 = Vacancy.builder().id(2L).functionTitle("C# developer").requiredYearsOfExperience(1).build();

        Vacancy vacancy3 = Vacancy.builder().id(3L).functionTitle("Java developer 2").requiredYearsOfExperience(3).build();

        vacancyRepository.save(vacancy);
        vacancyRepository.save(vacancy2);
        vacancyRepository.save(vacancy3);
    }

    @Test
    public void vacancyFilterYearsOfExperience0Test() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withExperienceBetween(0,0));
        assertEquals(1, vacancies.size());
    }

    @Test
    public void vacancyFilterYearsOfExperienceLessThanAYearTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withExperienceBetween(0,1));
        assertEquals(2, vacancies.size());
    }

    @Test
    public void vacancyFilterYearsOfExperienceBetween2And5Test() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withExperienceBetween(2,5));
        assertEquals(1, vacancies.size());
    }
}
