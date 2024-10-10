package com.ashan.example.spring.jpa.service;

import com.ashan.example.spring.jpa.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void testGetAllEmployee() {
        Employee meera = new Employee();
        meera.setName("Meera Joshi");
        meera.setSalary(5000);
        meera.setJoiningDate(LocalDate.parse("2023-02-17"));
        employeeService.saveEmployee(meera);

        Employee arjun = new Employee();
        arjun.setName("Arjun Patel");
        arjun.setSalary(4000);
        arjun.setJoiningDate(LocalDate.parse("2022-03-10"));
        employeeService.saveEmployee(arjun);

        Employee rahul = new Employee();
        rahul.setName("Rahul Sharma");
        rahul.setSalary(6000);
        rahul.setJoiningDate(LocalDate.parse("2022-03-10"));
        employeeService.saveEmployee(rahul);

        List<Employee> allEmployee = employeeService.getAllEmployee();

        assertEquals(3, allEmployee.size());
    }


}
