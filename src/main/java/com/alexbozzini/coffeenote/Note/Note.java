package com.alexbozzini.coffeenote.Note;

import com.alexbozzini.coffeenote.Coffee.Coffee;
import com.alexbozzini.coffeenote.FlavorNote.FlavorNote;
import com.alexbozzini.coffeenote.FoodPairing.FoodPairing;

import javax.persistence.*;
import java.util.Set;

import javax.persistence.CascadeType;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Coffee coffee;
    private String brewingMethod;
    private String acidity;
    private String coffeeBody;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<FlavorNote> flavorNotes;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<FoodPairing> foodPairings;
    private String noteBody;

    public Note(Long id, Coffee coffee, String brewingMethod, String acidity, String coffeeBody, Set<FlavorNote> flavorNotes,
        Set<FoodPairing> foodPairings, String noteBody){
        this.id = id;
        this.coffee = coffee;
        this.brewingMethod = brewingMethod;
        this.acidity = acidity;
        this.coffeeBody = coffeeBody;
        this.flavorNotes = flavorNotes;
        this.foodPairings = foodPairings;
        this.noteBody = noteBody;
    }

    public Note(Coffee coffee, String brewingMethod, String acidity, String coffeeBody, Set<FlavorNote> flavorNotes, Set<FoodPairing> foodPairings, String noteBody) {
        this.coffee = coffee;
        this.brewingMethod = brewingMethod;
        this.acidity = acidity;
        this.coffeeBody = coffeeBody;
        this.flavorNotes = flavorNotes;
        this.foodPairings = foodPairings;
        this.noteBody = noteBody;
    }

    public Note(String brewingMethod, String acidity, String coffeeBody, String noteBody) {
        this.brewingMethod = brewingMethod;
        this.acidity = acidity;
        this.coffeeBody = coffeeBody;
        this.noteBody = noteBody;
    }

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getBrewingMethod() {
        return brewingMethod;
    }

    public void setBrewingMethod(String brewingMethod) {
        this.brewingMethod = brewingMethod;
    }

    public String getAcidity(){
        return acidity;
    }

    public void setAcidity(String acidity){
        this.acidity = acidity;
    }

    public String getCoffeeBody() {
        return coffeeBody;
    }

    public void setCoffeeBody(String coffeeBody) {
        this.coffeeBody = coffeeBody;
    }

    public Set<FlavorNote> getFlavorNotes() {
        return flavorNotes;
    }

    public void setFlavorNotes(Set<FlavorNote> flavorNotes) {
        this.flavorNotes = flavorNotes;
    }

    public Set<FoodPairing> getFoodPairings() {
        return foodPairings;
    }

    public void setFoodPairings(Set<FoodPairing> foodPairings) {
        this.foodPairings = foodPairings;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
