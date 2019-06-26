package com.bridgelabz.AlgorithumPrograms;
/*
* JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
* NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN
HEADER, PACKAGE,
*
IMPORT STATEMENTS, CLASS DECLARATION, etc
*/

/****************************************************************************
* Compilation: javac -d bin GregorianCalendar.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.GregorianCalendar 
*
* Purpose: Determines the Day of the entered Date.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
******************************************************************************/

/*
* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
*/

import com.bridgelabz.Util.Util;

/*
* JAVA STYLE GUIDE - IMPORT STATEMENtS
* NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*;
* NO LINE WRAPING - APPEARS IN ONE LINE
*/



public class GregorianCalendar {
	
	/*
	* Driver program to test Gregorian Calendar class. Ideally this function should be in a separate user class.
	*/
	
	public static void main (String args[]) {
		System.out.println("*** Program To Calculate Day of week ***");
		System.out.println("\nEnter Month: ");
		int month = Util.getInputInteger();
		System.out.println("\nEnter Day: ");
		int days = Util.getInputInteger();
		System.out.println("\nEnter Year: ");
		int year = Util.getInputInteger();
		int day = Util.dayOfWeek(days, month, year);
		System.out.println("\nDay of Week is: " +day + "\n");
		System.out.println("Day of the week is:");
		switch(day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
		}
		
	}

}
