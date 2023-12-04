package service;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import entities.Employee;
import repository.EmployeeRepo;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@PostConstruct
	public void populateEmployee() {
		employeeRepo.save(new Employee("harsha", 22, 5, 4, 500000, 1));
		employeeRepo.save(new Employee("govindhya",12, 55, 25, 10000, 5));
	}
	@Override
	public Employee createEmployee(Employee emp) {
		System.out.println(employeeRepo.getClass().getName());
		return employeeRepo.save(emp);
	}
	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepo.save(emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepo.getReferenceById(empId);
	}
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
}
	
	
	
