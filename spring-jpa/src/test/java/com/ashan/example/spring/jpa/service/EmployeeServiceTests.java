package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Employee;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EmployeeServiceTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void testSaveEmployee(){
        Employee employee = new Employee();
        employee.setName("Alex week");
        employee.setSalary(2000);
        employee.setJoiningDate(LocalDate.now());

        Employee savedEmployee = employeeService.saveEmployee(employee);

        assertNotNull(savedEmployee.getId());
    }
}
