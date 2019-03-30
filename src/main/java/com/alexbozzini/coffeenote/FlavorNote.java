package com.alexbozzini.coffeenote;

import javax.persistence.*;

@Entity
public class FlavorNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String body;

    public FlavorNote(Long id, String body){
        this.id = id;
        this.body = body;
    }

    public FlavorNote(){
        this.id = null;
        this.body = "";
    }
}
