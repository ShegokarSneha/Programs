/*********************************************************************
* Compilation: javac -d bin IsPalindrome.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.IsPalindrome
*
* Purpose: Determines whether number is prime and Palindrome.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

/*
* JAVA STYLE GUIDE - PACKAGE NAMING STYLE
*/

package com.bridgelabz.AlgorithumPrograms;

import com.bridgelabz.Util.Util;

public class IsPalindrome {
	
	/*
	* Driver program to test Is Palindrome class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to Find PrimePalindrome Numbers Between 0 to 1000 ***");
		System.out.println("\nNumbers that are Prime And Palindrome: ");
		for (int i = 0 ; i <= 1000 ; i++) {
			boolean count = Util.isPrime(i);
			if (count) {
				boolean isPalindrome = Util.isPalindrome(i);
				if(isPalindrome) {
					System.out.println(i);
				}
				}
			}
		}
	}