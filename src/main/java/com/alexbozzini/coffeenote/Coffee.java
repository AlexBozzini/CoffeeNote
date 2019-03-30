package com.alexbozzini.coffeenote;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String origin;

    public Coffee(Long id, String name, String brand, String origin){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.origin = origin;
    }

    public Coffee(){
        this.id = null;
        this.name = "";
        this.brand = "";
        this.origin = "";
    }
}
