package com.example.crudperson.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    private String nom;

    private String prenom;
    private LocalDate dateNaissance;

    // ✅ Foreign key to Genre
    @ManyToOne
    @JoinColumn(name = "id_genre")
    private Genre genre;

    // ✅ Foreign key to Filiere
    @ManyToOne
    @JoinColumn(name = "id_filiere")
    private Filiere filiere;

    // ✅ Reverse relationship (One student has many inscriptions)
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inscription> inscriptions;
}
