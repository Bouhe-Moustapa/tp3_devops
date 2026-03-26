package com.example.crudperson.models;

import jakarta.persistence.*;


@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCours;

    @Column(nullable = false)
    private String nomCours;

    private int coefficient;

    public Long getId() { return idCours; }

    public String getNomCours() { return nomCours; }

    public void setIdCours(Long idCours) {
        this.idCours = idCours;
    }

    public void setNomCours(String nomCours) { this.nomCours = nomCours; }

    public int getCoefficient() { return coefficient; }

    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }

}
