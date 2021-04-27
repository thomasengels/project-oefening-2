package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import com.realdolmen.realjobs.persistence.repositories.VacancyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;
import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class VacancySpecificationDatePostedFilterTest {
    @Autowired
    private VacancyRepository vacancyRepository;


    @BeforeEach
    public void setup() {
        Vacancy vacancy = Vacancy.builder().id(1L).functionTitle("Java developer").postingDate(Instant.now().minus(Period.ofDays(1))).build();
        Vacancy vacancy2 = Vacancy.builder().id(2L).functionTitle("C# developer").postingDate(Instant.now().minus(Period.ofDays(8))).build();
        Vacancy vacancy3 = Vacancy.builder().id(3L).functionTitle("Java developer 2").postingDate(Instant.now().minus(Period.ofDays(30))).build();
        Vacancy vacancy4 = Vacancy.builder().id(4L).functionTitle("C# developer").postingDate(Instant.now().minus(Period.ofDays(365))).build();

        vacancyRepository.save(vacancy);
        vacancyRepository.save(vacancy2);
        vacancyRepository.save(vacancy3);
        vacancyRepository.save(vacancy4);
    }

    @Test
    public void vacancyFilterPostDateNotGreaterThan1DayTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withDatePostedNotOlderThan(2));
        assertEquals(1, vacancies.size());
        assertEquals("Java developer", vacancies.get(0).getFunctionTitle());
        assertEquals(1L, vacancies.get(0).getId());
    }

    @Test
    public void vacancyFilterPostDateNotGreaterThan6DaysTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withDatePostedNotOlderThan(7));
        assertEquals(1, vacancies.size());
    }

    @Test
    public void vacancyFilterPostDateNotGreaterThan1WeekTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withDatePostedNotOlderThan(9));
        assertEquals(2, vacancies.size());
    }

    @Test
    public void vacancyFilterPostDateNotGreaterThan1MonthTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withDatePostedNotOlderThan(31));
        assertEquals(3, vacancies.size());
    }

    @Test
    public void vacancyFilterPostDateNotGreaterThan1YearTest() {
        List<Vacancy> vacancies = vacancyRepository.findAll(VacancySpecification.withDatePostedNotOlderThan(366));
        assertEquals(4, vacancies.size());
    }
}
