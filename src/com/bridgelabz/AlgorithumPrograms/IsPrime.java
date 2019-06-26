
/*********************************************************************
* Compilation: javac -d bin IsPrime.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.IsPrime
*
* Purpose: Determines whether or not n is prime.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class IsPrime {

	/*
	* Driver program to test Is Prime class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to find Prime NUmbers Between 0 to 1000 ***");
		System.out.println("\nPrime Numbers Between 0 to 1000 :\n");
	
	//for loop for printing the prime between the specified range

		for (int number = 0 ; number <= 1000 ; number++) {
	
			//calling isPrime method
			
			boolean count = Util.isPrime(number);
	// if loop for checking number is prime or not
	   if (count) {
				System.out.println(number);
				}
			}
		}
	}
