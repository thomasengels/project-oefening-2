package com.realdolmen.realjobs.persistence.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Address {
    @Id
    private Long id;
    private String country;
    private String city;
    private int postalCode;
    private String streetName;
    private String houseNr;
    private String houseBox;
}
