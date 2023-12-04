package com.valtech.assignment.Employee;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import entities.Employee;
import service.EmployeeService;

@SpringBootTest
class EmployeeApplicationTests {
	@Autowired
	private EmployeeService employeeService;
	


	@Test
	void contextLoads() {
		Employee e = employeeService.createEmployee(new Employee(1, "harsha", 22, 5, 4, 500000, 1));
		assertEquals(1, e.getId());
		assertTrue(employeeService.getAllEmployees().size()>0);
	}


}
