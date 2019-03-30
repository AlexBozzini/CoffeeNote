package com.alexbozzini.coffeenote;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodPairing {
    @Id
    private Long id;
    @Column(length = 50)
    private String body;
}
