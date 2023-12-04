package controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.EmployeeModel;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/elist")
	public String EmployeeList(Model model) {
	//model.addAttribute("orders",orderservice.getAllOrders().stream().map(o->new OrderModel(o)).collect(Collectors.toList())));
	model.addAttribute("employees",employeeService.getAllEmployees().stream().map(e->new EmployeeModel(e)).collect(Collectors.toList()));
		return "employees/elist";
	}
	@GetMapping("/new")
	public String newEmployee(Model model) {
		model.addAttribute("employee", new EmployeeModel());
		return "employees/editemp";
	}
	@GetMapping("/editemp")
	public String editEmployee(@RequestParam("id")int id,Model model) {
		
		model.addAttribute("employee",
				new EmployeeModel(employeeService.getEmployee(id)));
		return "employees/editemp";	
	
	
}
}
