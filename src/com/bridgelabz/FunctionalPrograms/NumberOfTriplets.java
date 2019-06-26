
/*********************************************************************
* Compilation: javac -d bin NumberOfTriplets.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.NumberOfTriplets
*
* Purpose: Determines sum of triplets.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;

public class NumberOfTriplets {
	
	/*
	* The main function is written to test Number Of Triplets class
	*/ 
	
	public static void main(String args[]) {
		
		System.out.println("*** Program to Calculate Sum of Triplets ***");
		System.out.println("\nEnter No of Array Elements:");
		int n = Util.getInputInteger();
		System.out.println("\nEnter Array Elememts:");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Util.getInputInteger();
		}
	
		//System.out.println("Distinct Triplets: ");
		int dist = Util.sumOfTriplets(arr, n);
		System.out.println("\nNumber of Distinct Triplets: " +dist);
	}



}
