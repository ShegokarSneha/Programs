package ClinicManagement;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Util.Util;

public class ClinicMethods {
	
	static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<Doctors> dlist = new LinkedList<>();
	static LinkedList<Patients> plist = new LinkedList<>();
	static LinkedList<Appointment> alist = new LinkedList<>();
	static Doctors doctor = new Doctors();
	static Patients patient = new Patients();
	static Appointment appointment = new Appointment();
	static String location = "/home/admin1/eclipse-workspace/JSON File/";
	static String doctorfile = "Doctors";
	static String patientfile = "Patients";
	static String appointmentfile = "Appointments";
	String name;
	int id;
	int age;
	String specialization;
	String mobileno;
	String availability;
	String date;

	public void addDetails() throws JsonGenerationException, JsonMappingException, IOException {
		int choice = 0;
		
		do {
			System.out.println("\nOperations Menu:\n1. Add Doctor Details "
					+ "\n2. Add Patient Details \n3. Previous Menu \n4. Exit");
			choice = Util.getInputInteger();
			switch (choice) {
			case 1:
				addDoctorDetails();
				break;
				
			case 2:
				addPatientDetails();
				break;
				
			case 3:
				return;
				
			case 4:
				System.out.println("\nExit Successfully....");
				quit();
				break;
				
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice >= 1 && choice <= 4);
		}
		
	private void addPatientDetails() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter Patient Details");
		System.out.println("Enter Patient ID:");
		id = Util.getInputInteger();
		patient.setId(id);
		System.out.println("Enter Patient Name:");
		name = Util.getInputString();
		patient.setName(name);
		System.out.println("Enter Patient Age:");
		age = Util.getInputInteger();
		patient.setAge(age);
		System.out.println("Enter Patient Mobile No:");
		mobileno = Util.getInputString();
		patient.setMobileNo(mobileno);
		plist.add(patient);
		saveDetails(patientfile);
		System.out.println("\nPatient Details Added Successfully....");
		
	}

	
	

	private void addDoctorDetails() throws JsonGenerationException, JsonMappingException, IOException {
		
		System.out.println("Enter Doctor Details:");
		System.out.println("Enter Doctor ID:");
		id = Util.getInputInteger();
		doctor.setId(id);
		System.out.println("Enter Doctor Name:");
		name = Util.getInputString();
		doctor.setName(name);
		System.out.println("Enter Doctor Specialization:");
		specialization = Util.getInputString();
		doctor.setSpecialization(specialization);
		System.out.println("Enter Doctor Availability: (AM/PM/BOTH");
		availability = Util.getInputString();
		doctor.setAvailability(availability);
		dlist.add(doctor);
		saveDetails(doctorfile);
		System.out.println("\nDoctor Details Added Successfully....");
		
	}

	public void deleteDetails() throws JsonParseException, JsonMappingException, IOException {
		int choice = 0;
		do {
			System.out.println("\nOperations Menu:\n1. Delete Doctor Details \n2. Delete Patient Details "
					+ "\n3. Previous Menu \n4. Exit");
			choice = Util.getInputInteger();
			switch (choice) {
			case 1:
				deleteDoctorDetails();
				break;
				
			case 2:
				deletePatientDetails();
				break;
				
			case 3:
				return;
				
			case 4:
				System.out.println("\nExit Successfully....");
				quit();
				break;
				
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice >= 1 && choice <= 4);
		}
		
	private void deletePatientDetails() throws JsonParseException, JsonMappingException, IOException {
		plist = mapper.readValue(new File(location + patientfile + ".json"),
				new TypeReference<LinkedList<Patients>>() {});
		System.out.println("Enter Patient ID You Want to delete Information:");
		id = Util.getInputInteger();
	
		int i = 0;
		for (i = 0; i < plist.size(); i++) {
			if (plist.get(i).getId() == id) {
				plist.remove(i);
			}
		}
		if (i == dlist.size()) {
			System.out.println("No Doctor Found With This Id");
			}
		mapper.writeValue(new File(location + doctorfile + ".json"), plist);
		System.out.println("\nDoctor Details Deleted Successfully...");
		
	}

	private void deleteDoctorDetails() throws JsonParseException, JsonMappingException, IOException {
		dlist = mapper.readValue(new File(location + doctorfile + ".json"),
				new TypeReference<LinkedList<Doctors>>() {});
		System.out.println("Enter Doctor ID:");
		id = Util.getInputInteger();
		int i = 0;
		for (i = 0; i < dlist.size(); i++) {
			if (dlist.get(i).getId() == id) {
				dlist.remove(i);
			}
		}
		if (i == dlist.size()) {
			System.out.println("No Doctor Found With This Id");
			}
		mapper.writeValue(new File(location + doctorfile + ".json"), dlist);
		System.out.println("Doctor Details Deleted Successfully...");
	}

	public void fixAppointment() {
		int temp;
		int count = 0;
		String doctorname = "";
		int choice = 0;
		try {
			plist = mapper.readValue(new File(location + patientfile + ".json"),
					new TypeReference<LinkedList<Patients>>() {});
			dlist = mapper.readValue(new File(location + doctorfile + ".json"),
					new TypeReference<LinkedList<Doctors>>() {});
			System.out.println("\nFor Fixing Appointment Enter Details:");
			System.out.println("\nEnter Doctor ID :");
			int doctorid = Util.getInputInteger();
			System.out.println("\nEnter Patient ID :");
			id = Util.getInputInteger();
			System.out.println("\nEnter Patient Name:");
			name = Util.getInputString();
			
			System.out.println("\nEnter Patient Mobile Number:");
			mobileno = Util.getInputString();
			System.out.println("\nEnter Patient Age:");
			age = Util.getInputInteger();
			do {
			System.out.println("\nEnter Date to take Appointment:");
			date = Util.getInputString();
			for(int i = 0 ; i < dlist.size(); i++) {
				if(dlist.get(i).getId() == doctorid) {
					doctorname = dlist.get(i).getName();
					availability = dlist.get(i).getAvailability();
					if(dlist.get(i).getAvailability().equalsIgnoreCase("AM")) {
						if(dlist.get(i).getAmcount() > 5) {
							System.out.println("Doctor Already Have Appointments");
							return;
						}
						else {
							temp = dlist.get(i).getAmcount();
							dlist.get(i).setAmcount(temp+1);
							saveDetails(doctorfile);
							count++;
						}
					}
					else if(dlist.get(i).getAvailability().equalsIgnoreCase("PM")){
						if(dlist.get(i).getPmcount() > 5) {
							System.out.println("Doctor Already Have Appointments");
							return;
						}
						else {
							temp = dlist.get(i).getAmcount();
							dlist.get(i).setPmcount(temp+1);
							saveDetails(doctorfile);
							count++;
							}
						}
					}
				}
			if(count == 0) {
			System.out.println("\nDoctor Already Have Fixed Appointments.\nTry For Another Date");
			System.out.println("\nDo You Want To Fix an Appointment On other Date:\n1. Yes \n2. No");
			choice = Util.getInputInteger();
			}
			}while(choice == 1);
			appointment.setDoctorid(doctorid);
			appointment.setDoctorname(doctorname);
			appointment.setAvailability(availability);
			appointment.setDate(date);
			appointment.setPatientage(age);
			appointment.setPatientid(id);
			appointment.setPatientname(name);
			appointment.setPatientmobileno(mobileno);
			alist.add(appointment);
			saveDetails(appointmentfile);
			System.out.println("Appointment Fixed");
			}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
	/*		mapper.writeValue(new File(location + appointmentfile+".json"), alist);
			System.out.println("Appointment Fixed");
			System.out.println("First Appointment Added */
		
	}

	public void searchInformation() throws JsonParseException, JsonMappingException, IOException {
		int choice = 0;
		do {
			System.out.println("\nEnter What You Want to Search:");
			System.out.println("\nEnter Your Choice: \n1. Search Doctors Information "
					+ "\n2. Search Patients Information \n3. Previous Menu \n4. Exit Operations");
			choice = Util.getInputInteger();
			switch(choice) {
			
			case 1:
				searchDoctor();
				break;
				
			case 2:
				searchPatient();
				break;
				
			case 3:
				return;
				
			case 4:
				System.out.println("Exit Successfully...");
				quit();
				break;
				
			default:
				System.out.println("\nInvalid Entry");
			}
		}while(choice >= 1 && choice <=4);
		
	}

	private void searchPatient() throws JsonParseException, JsonMappingException, IOException {
		int choice = 0;
		do {
			System.out.println("\nSearch Patients Information:");
			System.out.println("\nEnter Choice:\n1. Search By ID \n2. Search By Name "
					+ "\n3. Search By Mobile No \n4. Previous Case \n5. Exit");
			choice = Util.getInputInteger();
			
			switch(choice) {
			
			case 1:
				searchById(patientfile);
				break;
				
			case 2:
				searchByName(patientfile);
				break;
				
			case 3:
				searchByMobile();
				break;
				
			case 4:
				return;
				
			case 5:
				System.out.println("\nExit Successfully...");
				quit();
				break;
				
			default:
				System.out.println("\nInvalid Entry");
			}
		}while(choice >=1 && choice <= 5);
		}

	private void searchByMobile() throws JsonParseException, JsonMappingException, IOException {
		try {
			plist = mapper.readValue(new File(location + patientfile + ".json"),
					new TypeReference<LinkedList<Patients>>() {});
			System.out.println("\nEnter Mobile No You Want To Search:");
			mobileno = Util.getInputString();
			int j = 0;
			for(int i = 0; i < plist.size(); i++) {
				if(plist.get(i).getMobileNo().equals(mobileno)) {
					j++;
					System.out.println("Patient Found");
					System.out.println("\n**************** Patient Information *****************\n");
					System.out.println("Patient ID\tPatient Name\t\tPatient Mobile No\tPatient Age");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println(plist.get(i));
					System.out.println("--------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("No Patient Found With This Mobile No: "+mobileno);
			}
		}
		catch(IOException e) {
			System.out.println("\nEmpty File");
		}	
	}
 
	private void searchById (String filename) throws JsonParseException, JsonMappingException, IOException {
		dlist = mapper.readValue(new File(location + doctorfile + ".json"),
				new TypeReference<LinkedList<Doctors>>() {});
		plist = mapper.readValue(new File(location + patientfile + ".json"),
				new TypeReference<LinkedList<Patients>>() {});
		System.out.println("\nEnter ID you want To search:");
		id = Util.getInputInteger();
		if(filename.equals(doctorfile)) {
			int j = 0;
			for(int i = 0; i < dlist.size(); i++) {
				if(dlist.get(i).getId() == id) {
					j++;
					System.out.println("Doctor Found");
					System.out.println("\n**************** Doctor Information *****************\n");
					System.out.println("Doctor ID\tDoctor Name\tDoctor Specialization No\tDoctor Availability");
					System.out.println("------------------------------------------------------------------------");
					System.out.println(dlist.get(i));
					System.out.println("------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("No Doctor Found With This ID :"+id);
			}
		}
		else {
			int j = 0;
			for(int i = 0; i < plist.size(); i++) {
				if(plist.get(i).getId() == id) {
					j++;
					System.out.println("Patient Found");
					System.out.println("\n**************** Patient Information *****************\n");
					System.out.println("Patient ID\tPatient Name\t\tPatient Mobile No\tPatient Age");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println(plist.get(i));
					System.out.println("--------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("No Patient Found With This ID :"+id);
			}
			
		}
	}

	private void searchByName(String filename) throws JsonParseException, JsonMappingException, IOException {
		try {
		dlist = mapper.readValue(new File(location + doctorfile + ".json"),
				new TypeReference<LinkedList<Doctors>>() {});
		plist = mapper.readValue(new File(location + patientfile + ".json"),
				new TypeReference<LinkedList<Patients>>() {});
		System.out.println("Enter Name to be Search :");
		name = Util.getInputString();
		int j = 0;
		if(filename.equals(patientfile)) {
			for(int i = 0; i < plist.size(); i++) {
				if(plist.get(i).getName().equalsIgnoreCase(name)) {
					j++;
					System.out.println("Patient Found");
					System.out.println("\n**************** Patient Information *****************\n");
					System.out.println("Patient ID\tPatient Name\t\tPatient Mobile No\tPatient Age");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println(plist.get(i));
					System.out.println("--------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("\nNo Pateint Found With This Name :"+ name);
			}
		}
		else {
			for(int i = 0; i < dlist.size(); i++) {
				if(dlist.get(i).getName().equalsIgnoreCase(name)) {
					j++;
					System.out.println("Doctor Found");
					System.out.println("\n**************** Doctor Information *****************\n");
					System.out.println("Doctor ID\tDoctor Name\tDoctor Specialization No\tDoctor Availability");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println(dlist.get(i));
					System.out.println("--------------------------------------------------------------------------");
					}
				}
			if(j == 0) {
				System.out.println("\nNo Doctor Found With This Name :"+name);
			}
			}
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
	}

	private void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		int choice = 0;
		do {
			System.out.println("\nSearch Doctor Information:");
			System.out.println("\nEnter Choice:\n1. Search By ID \n2. Search By Name "
					+ "\n3. Search By Specialization \n4. Search By Availability \n5. Previous Case \n6. Exit");
			choice = Util.getInputInteger();
			
			switch(choice) {
			
			case 1:
				searchById(doctorfile);
				break;
				
			case 2:
				searchByName(doctorfile);
				break;
				
			case 3:
				searchBySpecialization();
				break;
				
			case 4:
				searchByAvailability();
				break;
				
			case 5:
				return;
				
			case 6:
				System.out.println("\nExit Successfully...");
				quit();
				break;
				
			default:
				System.out.println("\nInvalid Entry");
			}
		}while(choice >=1 && choice <= 5);
		
	}

	private void searchByAvailability() {
		try {
			dlist = mapper.readValue(new File(location + doctorfile + ".json"),
					new TypeReference<LinkedList<Doctors>>() {});
			System.out.println("\nEnter Available Timing You Want To Search:");
			String avail = Util.getInputString();
			int j = 0;
			for(int i = 0; i < dlist.size(); i++) {
				if(dlist.get(i).getAvailability().equalsIgnoreCase(avail)) {
					j++;
					System.out.println("Doctor Found");
					System.out.println("\n**************** Doctor Information *****************\n");
					System.out.println("Doctor ID\tDoctor Name\tDoctor Specialization No\tDoctor Availability");
					System.out.println("------------------------------------------------------------------------");
					System.out.println(dlist.get(i));
					System.out.println("------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("No Doctor Found With This Timing :"+avail);
			}
		}
		catch(IOException e) {
			System.out.println("\nEmpty File");
		}
		
	}

	private void searchBySpecialization() {
		try {
			dlist = mapper.readValue(new File(location + doctorfile + ".json"),
					new TypeReference<LinkedList<Doctors>>() {});
			System.out.println("\nEnter Specialization You Want To Search:");
			String specialization = Util.getInputString();
			int j = 0;
			for(int i = 0; i < dlist.size(); i++) {
				if(dlist.get(i).getSpecialization().equalsIgnoreCase(specialization)) {
					j++;
					System.out.println("Doctor Found");
					System.out.println("\n**************** Doctor Information *****************\n");
					System.out.println("Doctor ID\tDoctor Name\tDoctor Specialization\tDoctor Availability");
					System.out.println("-------------------------------------------------------------------------");
					System.out.println(dlist.get(i));
					System.out.println("-------------------------------------------------------------------------");
				}
			}
			if(j == 0) {
				System.out.println("No Doctor Found With This Specialization :"+specialization);
			}
		}
		catch(IOException e) {
			System.out.println("\nEmpty File");
		}
		
	}

	public void displayInformation() throws JsonParseException, JsonMappingException, IOException {
		int Answer = 0;
		do {
			System.out.println("\nEnter Your Choice To Print Details: ");
			System.out.println("\n1. Print Doctors Information \n2. Print Patients Information "
					+ "\n3. Previous Menu \n4. Exit");
			Answer = Util.getInputInteger();
			switch (Answer) {
			
			case 1:
				doctorInformationDisplay(); // print doctors data
				break;
				
			case 2:
				patientInformationDisplay(); // print patients data
				break;
				
			case 3:
				return;
				
			case 4:
				System.out.println("\nExit Successfully");
				quit();
				break;
				
			default:
				System.out.println("\nInvalid Entry");
			}
		} while (Answer >=1 && Answer <= 3);
		
	}

	private void doctorInformationDisplay() throws JsonParseException, JsonMappingException, IOException {
		try {
		dlist = mapper.readValue(new File(location + doctorfile + ".json"),
				new TypeReference<LinkedList<Doctors>>() {});
		System.out.println("\n*************** Doctor Information ****************\n");
		System.out.println("Doctor ID\tDoctor Name\tDoctor Specialization\tDoctor Availability");
		System.out.println("-------------------------------------------------------------------------");
		dlist.stream().forEach(i -> {
			System.out.println(i.getId()+ "\t\t" + i.getName() + "\t\t" + i.getSpecialization() 
			+"\t\t\t"+ i.getAvailability());
		});
		System.out.println("-------------------------------------------------------------------------");
		}
		catch(IOException e) {
			System.out.println("Empty File Nothing To Display");
		}
		
	}

	private void patientInformationDisplay() throws JsonParseException, JsonMappingException, IOException {
		try {
		plist = mapper.readValue(new File(location + patientfile + ".json"),
				new TypeReference<LinkedList<Patients>>() {});
		System.out.println("\n**************** Patient Information *****************\n");
		System.out.println("Patient ID\tPatient Name\tPatient Mobile No\tPatient Age");
		System.out.println("-------------------------------------------------------------------------");
		plist.stream().forEach(i -> {
			System.out.println(i.getId()+"\t\t" + i.getName() + "\t "+ "\t" + i.getMobileNo() + "\t\t" + i.getAge());
		});
		System.out.println("-------------------------------------------------------------------------");
	}
	catch(IOException e) {
		System.out.println("\nEmpty File Nothing To Display");
	}
		
	}

	public void quit() {
		System.exit(0);
		return;
	}
	private void saveDetails(String filename) throws JsonGenerationException,
	JsonMappingException, IOException {
		
		if(filename.equalsIgnoreCase(doctorfile)) {
			try {
				dlist = mapper.readValue(new File(location + doctorfile + ".json"),
						new TypeReference<LinkedList<Doctors>>() {});
				
				if(dlist.size() == 0) {
					mapper.writeValue(new File(location + doctorfile + ".json"),doctor);
				}
				else {
					dlist.add(doctor);
					mapper.writeValue(new File(location + doctorfile + ".json"), dlist);
				}
			}
			catch (IOException e) {
				mapper.writeValue(new File(location + doctorfile + ".json"),dlist);
				System.out.println("First Doctor Details Added Sucessfully..");
				}
			}
		else if(filename.equalsIgnoreCase(patientfile)) {
			try {
				plist = mapper.readValue(new File(location + patientfile + ".json"),
						new TypeReference<LinkedList<Patients>>() {});
				if(plist.size() == 0) {
					mapper.writeValue(new File(location + patientfile + ".json"),patient);
				}
				else {
					plist.add(patient);
					mapper.writeValue(new File(location + patientfile + ".json"),plist);
					}
				}
			catch (JsonParseException e) {
				e.printStackTrace();
				}
			catch (JsonMappingException e) {
				e.printStackTrace();
				}
			catch (IOException e) {
				mapper.writeValue(new File(location + filename + ".json"), plist);
				System.out.println("First Patients Details Added Sucessfully..");
				}
			}
		else {
			try {
				alist = mapper.readValue(new File(location + appointmentfile + ".json"),
						new TypeReference<LinkedList<Appointment>>() {});
				if(alist.size() == 0) {
					mapper.writeValue(new File(location + appointmentfile + ".json"), appointment);
				}
				else {
					alist.add(appointment);
					mapper.writeValue(new File(location + appointmentfile + ".json"), alist);
				}
			}
			catch (JsonParseException e) {
				e.printStackTrace();
				}
			catch (JsonMappingException e) {
				e.printStackTrace();
				}
			catch (IOException e) {
				mapper.writeValue(new File(location + appointmentfile + ".json"), alist);
				System.out.println("\nFirst Appointment Added Sucessfully..");
				}
		}
	}

}
