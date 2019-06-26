
/*********************************************************************
* Compilation: javac -d bin PowerOfTwo.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.PowerOfTwo
*
* Purpose: Print table of power of two.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class PowerOfTwo {
	/*
	* The main function is written to test Power Of Two class
	*/ 
	
	public static void main (String args[]) {
		
		System.out.println("*** Program to Print table of power of 2 ***");
		System.out.println ("\nEnter Power value of Two:");
		int no = Util.getInputInteger();
		Util.powerOfTwo(no);
	}
	
	

}
