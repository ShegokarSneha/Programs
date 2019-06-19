/*
* JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
* NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN
HEADER, PACKAGE,
*
IMPORT STATEMENTS, CLASS DECLARATION, etc
*/

/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines whether or not n is prime.
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

/*
* JAVA STYLE GUIDE - IMPORT STATEMENtS
* NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*;
* NO LINE WRAPING - APPEARS IN ONE LINE
*/

public class IsAnagram {
	
	/*
	* Driver program to test Is Anagram class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program to Find Anagram String or not ***");
		System.out.println("\nEnter First String:");
		String str1 = Util.getInputString();
		System.out.println("\nEnter second String:");
		String str2 = Util.getInputString();
		boolean b = Util.isAnagram(str1, str2);
		if(b) {
			System.out.println("\nThe Strings are Anagram");
			}
		else {
			System.out.println("\nThe Strings not are Anagram");
			}
		}
	}
