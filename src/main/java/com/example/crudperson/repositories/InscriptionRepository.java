package com.example.crudperson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crudperson.models.Inscription;
import org.springframework.stereotype.Repository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
