package com.example.crudperson.controllers;

import com.example.crudperson.models.Cours;
import com.example.crudperson.models.Person;
import com.example.crudperson.repositories.CoursRepository;
import com.example.crudperson.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    private final CoursRepository coursRepository;

    public CoursController(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return coursRepository.findAll();
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursRepository.save(cours);
    }

    @GetMapping("/{id}")
    public Cours getCours(@PathVariable Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Person updateCours(@PathVariable Long id, @RequestBody Cours coursDetails) {
        Cours cours = coursRepository.findById(id).orElse(null);
        if (cours != null) {
            cours.setNomCours(coursDetails.getNomCours());
            cours.setCoefficient(coursDetails.getCoefficient());

            return coursRepository.save(cours);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
    }
}
