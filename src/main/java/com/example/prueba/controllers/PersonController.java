package com.example.prueba.controllers;

import com.example.prueba.entities.Person;
import com.example.prueba.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> list(){
        return personService.findAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Person person, BindingResult result){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(person));
    }


}
