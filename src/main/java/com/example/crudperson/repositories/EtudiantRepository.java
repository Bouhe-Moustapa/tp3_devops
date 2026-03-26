package com.example.crudperson.repositories;
import com.example.crudperson.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
