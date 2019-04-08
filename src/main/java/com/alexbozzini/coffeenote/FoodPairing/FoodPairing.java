package com.alexbozzini.coffeenote.FoodPairing;

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

    public FoodPairing(String body) {
        this.body = body;
    }

    public FoodPairing(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}