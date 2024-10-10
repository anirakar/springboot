package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PersonServiceTests {

    @Autowired
    private PersonService personService;


    @Test
    public void testGetAllPerson() {
        List<Person> allPerson = personService.getAllPerson();
        assertEquals(3, allPerson.size());
    }

    @Test
    public void testGetOnePerson() {
        Person person = personService.getOnePerson(1001);
        assertNotNull(person);
    }
}
