package com.realdolmen.realjobs.persistence.models;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Vacancy {
    @Id
    private Long id;
    private String functionTitle;
    private String functionDescription;
    private Instant postingDate;
    private String companyName;
    private int requiredYearsOfExperience;
    private String requiredExperienceSkillsEducation;
    private String offer;
    @Enumerated(EnumType.STRING)
    private ContractType contractType;
    @ManyToOne
    private Industry industry;
    @OneToOne
    private Address address;
}
