package com.loinx.springhibernate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loinx.springhibernate.entity.Employee;
import com.loinx.springhibernate.repository.EmployeeRepository;

@SpringBootApplication
public class SpringHibernateApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	} 

//	@PostConstruct
	void init() {
		for (long i = 0; i < 10000; i++) {
			Employee employee = new Employee();
			employee.setEmail("tcruise@example.com");
			employee.setFirstName("Tome");
			employee.setLastName("Cruise");
			employee.setPhone("123-484-4994");
			employeeRepository.save(employee);
		}
	}
}
