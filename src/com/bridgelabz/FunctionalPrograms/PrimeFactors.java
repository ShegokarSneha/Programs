
/*********************************************************************
* Compilation: javac -d bin PrimeFactors.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.PrimeFactors
*
* Purpose: Determines whether or not n is prime.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.Util.Util;


public class PrimeFactors {
	
	/*
	* The main function is written to test Prime Factors class
	*/
	
	public static void main(String args[]) {
		
		System.out.println("*** Program to find Prime Factors");
		System.out.println("\nEnter Number to Find Prime Factors: ");
		int number = Util.getInputInteger();
		System.out.println("\nPrime Factors of " +number+" are:");
		
		//for loop for checking number till n
		
		for(int i = 2; i <= number; i++) {
			if(number%i == 0) {
				boolean count = Util.isPrime(i);
				if(count) {
					System.out.print(i +" ");
				}
			}
		}
		
	}
}
