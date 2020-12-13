package com.loinx.springhibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loinx.springhibernate.entity.Employee;
import com.loinx.springhibernate.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	private final EmployeeRepository employeeRepository;

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@GetMapping("/find/all")
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@GetMapping("/find/{id}")
	public Optional<Employee> findById(@PathVariable Long id) {
		return employeeRepository.findById(id);
	}
}