package com.ashan.example.spring.jpa.repository;

import com.ashan.example.spring.jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class PersonJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(?, ?, ?, ?)",
                new Object[]{person.getId(),
                person.getName(), person.getLocation(),
                new Date(person.getBirthDate().getTime())});
    }

    public int update(Person person) {
        return jdbcTemplate.update("UPDATE PERSON SET NAME=?, LOCATION=?, BIRTH_DATE=? WHERE ID=?",
                new Object[]{person.getName(), person.getLocation(),
                        new Date(person.getBirthDate().getTime()),
                        person.getId()});
    }
}
