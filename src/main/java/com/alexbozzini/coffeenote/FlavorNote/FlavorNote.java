package com.alexbozzini.coffeenote.FlavorNote;

import javax.persistence.*;

@Entity
public class FlavorNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;

    public FlavorNote(Long id, String body){
        this.id = id;
        this.body = body;
    }

    public FlavorNote(String body) {
        this.body = body;
    }

    public FlavorNote(){
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
