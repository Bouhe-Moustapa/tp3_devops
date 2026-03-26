package com.example.crudperson.repositories;
import com.example.crudperson.models.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FiliereRepository extends JpaRepository<Filiere,Long> {
}
