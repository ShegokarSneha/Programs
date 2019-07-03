package PrototypeDesignPattern;

import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees empployee = new Employees();
		empployee.loadData();
		
		//Use the clone method to get the Employee object
		Employees newemployee = (Employees) empployee.clone();
		Employees newemployee1 = (Employees) empployee.clone();
		List<String> newemployeelist = newemployee.getEmpList();
		newemployeelist.add("Ragini");
		List<String> newemployeelist1 = newemployee1.getEmpList();
		newemployeelist1.remove("Lisa");
		
		System.out.println("==========================================");
		System.out.println("Prototype Pattern:");
		System.out.println("==========================================");
		System.out.println("Employee List: " + empployee.getEmpList());
		
		System.out.println("\nNew Employee List: " + newemployeelist);
		
		System.out.println("\nNew Employee 1 List: " + newemployeelist1);
	}


	}
