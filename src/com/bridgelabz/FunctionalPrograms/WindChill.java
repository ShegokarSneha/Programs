
/*********************************************************************
* Compilation: javac -d bin Binary.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.Binary n
*
* Purpose: Determines wind chill.
*
* @author Sneha
* @version 1.0
* @since 03-06-2019
*
*********************************************************************/

package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

import com.bridgelabz.Util.Util;

public class WindChill {
	
	/*
	* The main function is written to test Wind Chil class
	*/
	
	public static void main(String args[]) {
		
		System.out.println("*** Program to Calculate Wind chill ***");
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter value of Temperature:");
		double t = Util.getInputDouble();
		System.out.println("\nEnter value of Wind Speed:");
		double v = Util.getInputDouble();
		Util.calculateWindChill(t, v);
		sc.close();
	}
	


}
