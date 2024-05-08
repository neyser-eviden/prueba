package com.example.prueba.services;

import com.example.prueba.entities.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person save(Person person);

    void delete(Person person);
}
