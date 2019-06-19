
/*
* JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
* NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN
HEADER, PACKAGE,
*
IMPORT STATEMENTS, CLASS DECLARATION, etc
*/

/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines whether or not n is prime.
*
* @author Sneha
* @version 1.0
* @since 06-08-2017
*
*********************************************************************/

/*
* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
*/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

/*
* JAVA STYLE GUIDE - IMPORT STATEMENtS
* NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*;
* NO LINE WRAPING - APPEARS IN ONE LINE
*/


public class MonthlySalary {

	/*
	* Driver program to test Monthly Salary class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
	
		System.out.println("*** Program to Calculate Mo0nthly Salary ***");
		System.out.println("\nEnter Principal Amount: ");
		int principal = Util.getInputInteger();
		System.out.println("\nEnter Rate Percent: ");
		int rate = Util.getInputInteger();
		System.out.println("\nEnter No of years: ");
		int year = Util.getInputInteger();
		double payment = Util.monthlyPayment(principal, rate, year);
		System.out.println("\nMonthly Payment is: "+ payment);
	
	}
	
}
