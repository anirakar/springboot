package com.ashan.example.spring.jpa.entity;

import lombok.*;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthDate;
}
