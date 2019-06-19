package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

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
	* @since 03-06-2019
	*
	*********************************************************************/

	/*
	* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
	*/

	public class NewtonMethod {
		
		/*
		* Driver program to test Newton Method class. Ideally this function should be in a separate user class.
		*/
		
		public static void main(String args[]) {
			System.out.println("*** Program to Calculate Square Root of Number ***");
			System.out.println("\nEnter Non Negative Number to find Square root:");
			int number = Util.getInputInteger();
			int  result = Util.sqrt(number);
			System.out.println("\nThe Square Root of " +number+" is "+ result);
		}
			
		}
		