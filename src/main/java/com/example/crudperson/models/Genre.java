package com.example.crudperson.models;

import jakarta.persistence.*;

@Entity

public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenre;

    @Column(nullable = false, unique = true)
    private String libelle;
}
