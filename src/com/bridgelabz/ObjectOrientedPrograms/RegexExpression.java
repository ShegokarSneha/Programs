package com.bridgelabz.ObjectOrientedPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.Util.Util;

public class RegexExpression {
	static  Pattern pattern = null;
	public static void main(String[] args) {
		System.out.println("**** Program using REGEX Function ****");
		
		String bio = "Hello <<name>>, \nWe have your full"
				+ "name as <<full name>> in our system. \nyour contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification. \n\nThank you BridgeLabz 01/01/2016.";
		System.out.println(bio);
		String pattern = "[a-zA-Z]+";
		String name;
		
		do {
		System.out.println("\nEnter the Name of Student:");
		name = Util.getInputString();
		System.out.println("\nEnter your fullname:-");
		String fullname = Util.getInputString();
	
		Pattern r = Pattern.compile(pattern);
		
		if (Pattern.matches(pattern, name)) {
			bio = bio.replaceAll("<<name>>", name);
			bio = bio.replaceAll("<<full name>>", fullname);
		}
		else {
			System.out.println("Entered Invalid Input");
		}
		} while(Pattern.matches(pattern, name) == false);
		String mobile;
		do {
			System.out.println("\nPlease Enter Your Mobile Number:");
			mobile = Util.getInputString();
			if (Pattern.matches("[789][0-9]{9}", mobile)) {
			bio = bio.replaceAll("x{10}", mobile);
		}
		else {
			System.out.println("\nEntered Invalid Number");
		}
		}while(Pattern.matches("[789][0-9]{9}", mobile) == false);
		
		String date = "";
		do {
		System.out.println("\nEnter the Date:");
		date = Util.getInputString();
		if (Pattern.matches("^[1-3][0-9]/[0-1][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", date)) {
			bio = bio.replaceAll("01/01/2016", date);
		}
		else {
			System.out.println("\nEntered Invalid Date");
		}
		}while(Pattern.matches("^[0-9][0-9]/[0-1][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", date) == false);
		System.out.println(bio);
	}

	
	public static boolean validateName(String txt)
	{
		String regex ="[a-zA-Z]+\\.?";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(txt);
		return matcher.find();
    }
	public static boolean validatemobileNumber(String mobileNo)
	{
		String regex ="[0-9]{10}$";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(mobileNo);
		return matcher.find();
    }
	
	
	public static boolean validatefullName(String fullName)
	{
		String regex ="[a-zA-Z]+\\.?";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(fullName);
		return matcher.find();
    }
	public static boolean validateDate(String Date)
	{
		String regex ="\\d{2}/\\d{2}/\\d{4}";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(Date);
		return matcher.find();
	}

}
