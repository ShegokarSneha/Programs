package ProxyDesignPattern;

import java.util.List;

public class ProxyDesignPattern {
	
	public static void main(String[] args) {
		
		EmployeeList list = new EmployeeListProxy();
	    Company company = new Company("Infosys", "India", "+91-011-28458965", list);
	 
	        System.out.println("Company Name: "+ company.getCompanyname());
	        System.out.println("Company Address: "+ company.getCompanylocation());
	        System.out.println("Company Contact No.: "+ company.getComanycontactno());
	 
	        System.out.println("Requesting for Employee list");
	 
	        list = company.getEmployeelist();
	 
	        List<Employee>empList = list.getEmployeeList();
	        for(Employee emp : empList){
	        	System.out.println();
	            System.out.println(emp);
	        }
		
	}

}
