package com.realdolmen.realjobs.dto;

import java.time.Instant;

public class VacancyDTO {
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
    private AddressDTO address;
}
