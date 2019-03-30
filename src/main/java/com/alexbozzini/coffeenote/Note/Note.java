package com.alexbozzini.coffeenote.Note;

import com.alexbozzini.coffeenote.Coffee.Coffee;
import com.alexbozzini.coffeenote.FlavorNote.FlavorNote;
import com.alexbozzini.coffeenote.FoodPairing.FoodPairing;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ManyToOne
    private Coffee coffee;
    @Column(length = 50)
    private String brewingMethod;
    @Column(length = 50)
    private String coffeeBody;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany
    private List<FlavorNote> flavorNotes;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany
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

    public Note(){
        this.id = null;
        this.coffee = new Coffee();
        this.brewingMethod = "";
        this.coffeeBody = "";
        this.flavorNotes = new ArrayList<>();
        this.foodPairings = new ArrayList<>();
        this.noteBody = "";
    }
}
