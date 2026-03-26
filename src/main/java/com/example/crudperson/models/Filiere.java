package com.example.crudperson.models;

import jakarta.persistence.*;

@Entity

public class  Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFiliere;

    @Column(nullable = false, unique = true)
    private String nomFiliere;
}
