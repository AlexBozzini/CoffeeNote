package com.alexbozzini.coffeenote.Coffee;

import com.alexbozzini.coffeenote.Note.Note;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String origin;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany
    private List<Note> notes;

    public Coffee(Long id, String name, String brand, String origin, List<Note> notes){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.origin = origin;
        this.notes = notes;
    }

    public Coffee(){
        this.id = null;
        this.name = "";
        this.brand = "";
        this.origin = "";
        this.notes = new ArrayList<>();
    }
}
