package com.ashan.example.spring.jpa;

import com.ashan.example.spring.jpa.entity.Employee;
import com.ashan.example.spring.jpa.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@Slf4j
@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("Alex week");
		employee.setSalary(2000);
		employee.setJoiningDate(LocalDate.now());

		Employee savedEmployee = employeeService.saveEmployee(employee);
		log.info("Saved employee {}", savedEmployee);

	}
}
