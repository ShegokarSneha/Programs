
/*********************************************************************
* Compilation: javac -d bin LeapYear.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.LeapYear
*
* Purpose: Determines leap year or not.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class LeapYear {
	
	/*
	* The main function is written to test Leap Year class
	*/
	
	public static void main (String args[]) {
		
		System.out.println("*** Program to Find Leap Year or Not ***");
		int year;
		boolean result;
		
		// do while loop for getting 4 digits in the number
		
		do{
			System.out.println("\nEnter Year to Check Leap Year:");
			year = Util.getInputInteger();
			}while(Util.digitCount(year) != 4);
		result = Util.isLeapYear(year);
		if(result) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is not a Leap Year");
		}
		
		}
		
	
}

