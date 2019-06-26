
/*********************************************************************
* Compilation: javac -d bin EuclideanDistance.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.EuclideanDistance
*
* Purpose: Determines Euclidean distance.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class EuclideanDistance {

	/*
	* The main function is written to test Euclidean Distance class
	*/
	
	public static void main (String args[]) {
		System.out.println("*** Program to Calculate Euclidean Distance ***");
		System.out.println("\nEnter first points to Calculate Distance:");
		int x = Util.getInputInteger();
		System.out.println("\nEnter Second point to Calculate Distance:");
		int y = Util.getInputInteger();
		double total = Util.calculateDistance(x, y);
		System.out.println("\nThe Euclidean Distance is "+total);
		}
	
	
	}


