package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData implements EmployeeList{

	@Override
	public List<Employee> getEmployeeList() {
		return getList ();
	}
	
	private static List<Employee>getList () {
	List<Employee> list = new ArrayList<Employee>(3);
	list.add(new Employee("Sushant", "Senior Engineer", 50000));
	list.add(new Employee("Rashmi", "Junior Engineer", 30000));
	list.add(new Employee("Ria", "Fellowship Engineer", 10000));
	return list;
	}

}
