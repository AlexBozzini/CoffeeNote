package com.alexbozzini.coffeenote;

import javax.persistence.*;
import java.util.List;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Coffee coffee;
    @Column(length = 50)
    private String brewingMethod;
    @Column(length = 50)
    private String coffeeBody;
    private List<FlavorNote> flavorNotes;
    private List<FoodPairing> foodPairings;
    private String noteBody;

    public Note(Long id, Coffee coffee, String brewingMethod, String coffeeBody, List<FlavorNote> flavorNotes,
        List<FoodPairing> foodPairings, String noteBody){
        this.id = id;
        this.coffee = coffee;
        this.brewingMethod = brewingMethod;
        this.coffeeBody = coffeeBody;
        this.flavorNotes = flavorNotes;
        this.foodPairings = foodPairings;
        this.noteBody = noteBody;
    }
}
