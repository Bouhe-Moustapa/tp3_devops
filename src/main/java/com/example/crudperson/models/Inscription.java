package com.example.crudperson.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInscription;

    // ✅ Foreign key to ETUDIANT
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_etudiant", nullable = false)
    private Etudiant etudiant;

    // ✅ Foreign key to COURS
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_cours", nullable = false)
    private Cours cours;

    private LocalDate dateInscription = LocalDate.now();

    private Double note;
}
