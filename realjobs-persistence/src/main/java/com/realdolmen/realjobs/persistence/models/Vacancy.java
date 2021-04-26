package com.realdolmen.realjobs.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Vacancy {
    @Id
    private Long id;
    private String functionTitle;
    private String contractType;
    private String functionDescription;
    private Instant postingDate;
    private String companyName;
    private String industry;
    private int requiredYearsOfExperience;
    private String requiredExperienceSkillsEducation;
    private String offer;
    @OneToOne
    private Address address;
}
