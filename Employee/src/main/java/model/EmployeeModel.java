package model;



import entities.Employee;

public class EmployeeModel {
	private int id;
	private String name;
	private int age;
	private int experience;
	private int seniority;
	private int salary;
	private int deptId;
	
	
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee getEmployee() {
		return new Employee(id, name, age, experience, seniority, salary, deptId);
	}
	

	public  EmployeeModel(Employee e)
	{
		this.id=e.getId();
		this.name=e.getName();
		this.age=e.getAge();
		this.experience=e.getExperience();
		this.salary=e.getSalary();
		this.seniority=e.getSeniority();
		this.deptId=e.getDeptId();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
