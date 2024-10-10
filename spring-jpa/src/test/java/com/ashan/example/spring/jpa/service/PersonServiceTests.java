package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PersonServiceTests {

    @Autowired
    private PersonService personService;


    @Test
    public void shouldGetAllPerson() {
        List<Person> allPerson = personService.getAllPerson();
        assertEquals(3, allPerson.size());
    }

    @Test
    public void shouldGetOnePerson() {
        Person person = personService.getOnePerson(1001);
        assertNotNull(person);
    }

    @Test
    public void shouldDeleteAPerson() {
        int row = personService.deleteOnePerson(1001);
        assertEquals(1, row);
    }

    @Test
    public void shouldCreateAPerson() {
        Person person = new Person(1004, "Sara", "Berlin", new Date());
        int row = personService.createPerson(person);
        assertEquals(1, row);
    }

    @Test
    public void shouldUpdateAPerson() {
        Person person = new Person(1003, "Sara Ali", "123, Berlin", new Date());
        int row = personService.updatePerson(person);
        assertEquals(1, row);
    }
}
