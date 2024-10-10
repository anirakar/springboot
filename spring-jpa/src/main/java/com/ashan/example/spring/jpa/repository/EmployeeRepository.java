package com.ashan.example.spring.jpa.repository;

import com.ashan.example.spring.jpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Employee save(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }

    public List<Employee> get() {
        // JPQL query to retrieve all Employee records
        String jpql = "SELECT e FROM Employee e";
        Query query = entityManager.createQuery(jpql, Employee.class);

        // Execute query and get results
        return query.getResultList();
    }

}
