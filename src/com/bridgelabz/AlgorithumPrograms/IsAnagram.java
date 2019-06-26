
/*********************************************************************
* Compilation: javac -d bin IsAnagram.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.IsAnagram
*
* Purpose: Determines whether String is Anagram or Not.
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
