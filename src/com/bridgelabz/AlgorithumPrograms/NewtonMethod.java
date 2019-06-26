/*********************************************************************
* Compilation: javac -d bin NewtonMethod.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.NewtonMethod
*
* Purpose: Gives the square root of the number.
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/
package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

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
		