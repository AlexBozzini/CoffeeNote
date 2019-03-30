package com.alexbozzini.coffeenote;

import javax.persistence.*;

@Entity
public class FlavorNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String body;
}
