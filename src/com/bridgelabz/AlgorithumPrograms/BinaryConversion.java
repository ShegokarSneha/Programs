
/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines Binary equivalent of decimal number.
*
* @author Sneha
* @version 1.0
* @since 03-06-2017
*
*********************************************************************/
package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class BinaryConversion {
	
	/*
	* Driver program to test Binary Conversion class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to Convert Decimal to Binary ***\n");
		System.out.println("Enter Decimal Number:");
		int deci = Util.getInputInteger();
		String binary =Util.toBinary(deci);
		System.out.println("\nBinary Equivalent of Decimal Number: " +binary);
		int result = Util.binaryRepresentation(binary);
		System.out.println("\nDecimal Equivalent of Binary Number:" +result);
		
	}

}

