package com.realdolmen.realjobs.persistence.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Industry {
    @Id
    private Long id;
    private String industryName;
}
