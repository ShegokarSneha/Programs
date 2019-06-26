
/*********************************************************************
* Compilation: javac -d bin QuadraticEquation.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.QuadraticEquation
*
* Purpose: Determines roots of quadratic equation.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class QuadraticEquation {
	/*
	* The main function is written to test Quadratic Equation class
	*/
	
	public static void main(String args[]) {
		
		System.out.println("*** Program To find Roots Of Quadratic Equation ***");
		int a, b, c;
		System.out.println("\nEnter Three Values to Find the Roots:");
		a = Util.getInputInteger();
		b = Util.getInputInteger();
		c = Util.getInputInteger();
		Util.calculateRoots(a, b, c);
		
	}
	
	

}
