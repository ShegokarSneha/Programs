
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

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

/*
* JAVA STYLE GUIDE - IMPORT STATEMENtS
* NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*;
* NO LINE WRAPING - APPEARS IN ONE LINE
*/



public class GuessNumber {
	
//********************* To Guess Number *************************//
	
	/**
   	* Function takes two integer values to find user number
   	* @param Low and high value of range
   	* @return user exact value
   	*/
	
	private static int GuessIteration(int low, int high) {
		while(low != high) {
			int mid = (low + high)/2;
			System.out.println("\nEnter Your Choise: 1 / 2");
			System.out.println("\nEnter 1 If Your no is Between "+low+ " And "+mid);
			System.out.println("\nEnter 2 If Your no is Between "+mid+ " And "+high);
			int choise = Util.getInputInteger();
			
			// if condition to switch between the ranges
			
			if(choise == 1) {
				System.out.println(choise);
				high = mid;
			}
			else {
				low = mid;
			}
			}
		return low;
}
	
	/*
	* Driver program to test Guess number class. Ideally this function should be in a separate user class.
	*/
	
		public static void main(String args[]) {
			System.out.println("*** Program For Guess Number Between 0 to n ***");
			int low = 0;
			System.out.println("\nEnter Number to Decide Last Value of Range: ");
			int n = Util.getInputInteger();
			
			// to calculate last value of range
			
			int high = (int) Math.pow(2, n);
			System.out.println("\nLast value of the range is "+high);
			int result = GuessIteration(low, high);
			System.out.println("\nYour Number is: "+ result);
			
		
		}
		
}
