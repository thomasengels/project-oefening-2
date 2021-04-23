package com.realdolmen.realjobs.application.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
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
