package ProxyDesignPattern;

public class Employee {
	private String employeename;
	private String employeedesignation;
	private double employeesalary;
	
	public Employee(String employeename, String employeedesignation, double employeesalary) {
		this.employeename = employeename;
		this.employeedesignation = employeedesignation;
		this.employeesalary = employeesalary;
	}
	
	public String toString() {
		return "Employee Name : "+getEmployeename() + "\nEmployee Designation :  " + getEmployeedesignation()+
				"\nEmployee Salary : " + getEmployeesalary(); 
		}
	
	public String getEmployeename() {
		return employeename;
	}
	
	public String getEmployeedesignation() {
		return employeedesignation;
	}
	
	
	public double getEmployeesalary() {
		return employeesalary;
	}

}
