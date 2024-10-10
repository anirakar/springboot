package com.ashan.example.spring.jpa.repository;

import com.ashan.example.spring.jpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Employee save(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

}
