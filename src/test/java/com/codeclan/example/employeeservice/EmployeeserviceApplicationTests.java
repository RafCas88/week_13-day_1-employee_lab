package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Raf", 31, 8, "rafa");
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Rosario", 21, 7, "rosario@hotmail.it");
		employeeRepository.save(employee2);



	}

}
