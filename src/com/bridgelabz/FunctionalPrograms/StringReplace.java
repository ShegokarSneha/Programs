
/*********************************************************************
* Compilation: javac -d bin StringReplace.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.StringReplace
*
* Purpose: Print replaced string.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

import com.bridgelabz.Util.Util;

public class StringReplace {
	
	/*
	* The main function is written to test String Replace class
	*/
	
	public static void main (String args[]) {
		
		System.out.println("*** Program to Replace the String ***");
		Scanner sc = new Scanner(System.in);
		int i;
		String name;
		
		// do-while loop to run till it gets 3 characters
		
		do {
		System.out.println("\nEnter Character String with Minimum 3 char:");
		String uname= Util.getInputString();
		name = uname ;
		i = uname.length();
		}while (i < 3);
		System.out.println("Hello " + name + " How are you?");
		sc.close();
	}

}
