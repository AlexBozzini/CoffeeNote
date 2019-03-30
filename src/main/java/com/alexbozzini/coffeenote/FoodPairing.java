package com.alexbozzini.coffeenote;

import javax.persistence.*;

@Entity
public class FoodPairing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String body;

    public FoodPairing(Long id, String body){
        this.id = id;
        this.body = body;
    }

    public FoodPairing(){
        this.id = null;
        this.body = "";
    }
}
