
/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines nth harmonic number.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class HarmonicNumber {
	/*
	* The main function is written to test Harmonic Number class
	*/
	
	public static void main (String args[]) {
		System.out.println("*** Program to Find Harmonic Value ***");
		System.out.println("\nEnter Harmonic Value:");
		int n = Util.getInputInteger();
		float temp = Util.calculateHarmonic(n);
		System.out.println("\n"+ n +"th Harmonic Value is " +temp);
		
		}
	
	
	}
