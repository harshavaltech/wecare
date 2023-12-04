package service;

import java.util.List;

import entities.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	

	Employee createEmployee(Employee emp);



	



	Employee getEmployee(int empId);



	Employee updateEmployee(Employee emp);
	

}
