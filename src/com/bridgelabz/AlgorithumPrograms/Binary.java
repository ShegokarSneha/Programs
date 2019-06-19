/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines reverse equivalent of binary number. 
*
* @author Sneha
* @version 1.0
* @since 03-06-2017
*
*********************************************************************/
package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class Binary {
	
	/*
	* Driver program to test Binary class. Ideally this function should be in a separate user class.
	*/
			
	public static void main(String args[]) {
		System.out.println("*** Program to convert Decimal Number to Binary Equivalent ***\n");
		System.out.println("Enter Decimal Number:");
		int deci = Util.getInputInteger();
		String binary = Util.toBinary(deci);
		System.out.println("\nBinary Equivalent of Decimal Number "+deci+" is: " +binary);
		Util.appendZero(binary);
			
			}
}
		
