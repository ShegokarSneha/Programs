package ProxyDesignPattern;

public class Company {
	private String companyname;
	private String companylocation;
	private String comanycontactno;
    EmployeeList employeelist;
    
    public Company(String companyname, String companylocation, String companycontactno, EmployeeList employeelist) {
    	this.companyname = companyname;
    	this.companylocation = companylocation;
    	this.comanycontactno = companycontactno;
    	this.employeelist = employeelist;
    	System.out.println("Company Object created....!");
    }
    
	public String getCompanyname() {
		return companyname;
	}
	
	public String getCompanylocation() {
		return companylocation;
	}
	
	public String getComanycontactno() {
		return comanycontactno;
	}
	
	public EmployeeList getEmployeelist() {
		return employeelist;
	}
	
}
