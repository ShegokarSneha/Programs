package ClinicManagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
	int doctorid;
	String doctorname;
	int patientid;
	String Patientname;
	int patientage;
	String patientmobileno;
	String availability;
	//Create formatter
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:MM:SS");
		 
		//Local date time instance
	LocalDateTime localDateTime = LocalDateTime.now();
		 
		//Get formatted String
	String date = format.format(localDateTime);
	
	public int getDoctorid() {
		return doctorid;
	}
	
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDoctorname() {
		return doctorname;
	}
	
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	
	public int getPatientid() {
		return patientid;
	}
	
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	
	public String getPatientname() {
		return Patientname;
	}
	
	public void setPatientname(String patientname) {
		Patientname = patientname;
	}
	
	public int getPatientage() {
		return patientage;
	}
	
	public void setPatientage(int pateintage) {
		this.patientage = pateintage;
	}
	
	public String getPatientmobileno() {
		return patientmobileno;
	}
	
	public void setPatientmobileno(String patientmobileno) {
		this.patientmobileno = patientmobileno;
	}
	
	public String getAvailability() {
		return availability;
	}
	
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public String toString() {
		return getDoctorid()+"\t"+getDoctorname()+"\t"+getPatientid()+"\t"+getPatientname()+"\t"
	                 +getPatientage()+"\t"+getPatientmobileno()+"\t"+getAvailability();
	}

}
