package com.bridgelabz.ObjectOrientedPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.Util.Util;

public class RegexExpression {
	static  Pattern pattern = null;
	public static void main(String[] args) {
		String bio = "Hello <<name>>, \nWe have your full"
				+ "name as <<full name>> in our system. \nyour contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification. \n\nThank you BridgeLabz 01/01/2016.";
		System.out.println(bio);
		String pattern = "[a-zA-Z]+";
		System.out.println("\nEnter the Name of Student:");
		String name = Util.getInputString();
		System.out.println("\nEnter your fullname:-");
		String fullname = Util.getInputString();
		@SuppressWarnings("unused")
		Pattern r = Pattern.compile(pattern);
		if (Pattern.matches(pattern, name)) {
			bio = bio.replaceAll("<<name>>", name);
			bio = bio.replaceAll("<<full name>>", fullname);
		}
		System.out.println("\nPlease Enter Your Mobile Number:");
		String numbers = Util.getInputString();
		if (Pattern.matches("[789][0-9]{9}", numbers)) {
			bio = bio.replaceAll("x{10}", numbers);
		}
		System.out.println("\nEnter the Date:");
		String date = Util.getInputString();
		if (Pattern.matches("^[0-3][0-9]/[0-1][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", date)) {
			bio = bio.replaceAll("01/01/2016", date);
		}
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
