package com.example.crudperson.repositories;

import com.example.crudperson.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CoursRepository extends JpaRepository<Cours,Long> {
}
