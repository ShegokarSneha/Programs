/*********************************************************************
* Compilation: javac -d bin MonthlySalary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.MonthlySalary
*
* Purpose: Determines Monthly Salary Of Person using Formula.
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
