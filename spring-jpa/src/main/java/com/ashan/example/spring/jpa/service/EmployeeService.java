package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Employee;
import com.ashan.example.spring.jpa.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}
