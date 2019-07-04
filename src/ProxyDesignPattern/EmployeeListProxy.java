package ProxyDesignPattern;

import java.util.List;

public class EmployeeListProxy implements EmployeeList{
	
	private EmployeeList employeelist;
	 
    @Override
    public List<Employee> getEmployeeList() {
        if(employeelist == null){
            System.out.println("Fetching list of employees...");
            employeelist = new EmployeeData();
        }
        return employeelist.getEmployeeList();
    }
   

}
