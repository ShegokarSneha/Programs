package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<String> employeeList;
	
	public Employees(){
		employeeList = new ArrayList<String>();
	}
	
	public Employees(List<String> employeeList){
		this.employeeList = employeeList;
	}
	
	public void loadData(){
		//read all employees from database and put into the list
		employeeList.add("Prachi");
		employeeList.add("Sandhya");
		employeeList.add("Rashmi");
		employeeList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> templist = new ArrayList<String>();
			
		for(String employee : this.getEmpList()){
			templist.add(employee);
			}
		return new Employees(templist);
	}

}
