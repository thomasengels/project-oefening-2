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
public class ContractType {
    @Id
    private Long id;
    private String contractTypeName;
}
