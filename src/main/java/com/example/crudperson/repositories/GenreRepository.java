package com.example.crudperson.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crudperson.models.Genre;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
