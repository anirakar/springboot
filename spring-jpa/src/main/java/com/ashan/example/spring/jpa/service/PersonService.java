package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Person;
import com.ashan.example.spring.jpa.repository.PersonJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonJdbcRepository repository;

    public List<Person> getAllPerson() {
        return repository.findAll();
    }

    public Person getOnePerson(int id) {
        return repository.findById(id);
    }
}
