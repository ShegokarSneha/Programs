package ClinicManagement;

public class Doctors {
	int id;
	String name;
	String specialization;
	String availability;
	int amcount;
	int pmcount;
	
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
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getAvailability() {
		return availability;
	}
	
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public int getAmcount() {
		return amcount;
	}
	
	public void setAmcount(int amcount) {
		this.amcount = amcount;
	}
	
	public int getPmcount() {
		return pmcount;
	}
	
	public void setPmcount(int pmcount) {
		this.pmcount = pmcount;
	}
	
	public String toString() {
		return getId()+"\t\t"+getName()+"\t\t"+getSpecialization()+"\t\t\t\t"+getAvailability();
	}

}
