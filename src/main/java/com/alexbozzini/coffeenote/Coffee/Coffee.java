package com.alexbozzini.coffeenote.Coffee;

import com.alexbozzini.coffeenote.Note.Note;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String origin;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Note> notes;

    public Coffee(Long id, String name, String brand, String origin, Set<Note> notes){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.origin = origin;
        this.notes = notes;
    }

    public Coffee(String name, String brand, String origin, Set<Note> notes) {
        this.name = name;
        this.brand = brand;
        this.origin = origin;
        this.notes = notes;
    }

    public Coffee(String name, String brand, String origin) {
        this.name = name;
        this.brand = brand;
        this.origin = origin;
    }

    public Coffee(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
}
