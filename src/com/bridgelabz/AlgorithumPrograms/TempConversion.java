
/*********************************************************************
* Compilation: javac -d bin TempConversion.java
* 
* Execution: java -cp bin com.bridgelabz.AlgorithumPrograms.TempConversion
*
* Purpose: Convert entered temprature value in Celcuis or Fahrenheit.
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

public class TempConversion {
	
//********************* To print Result *************************//

	/**
	* Function takes two inputs float and string depending upon the entered string by the user it gives output
	* @param result and String
	* @return nothing
	*/
	
	public static void printResult(float res, String ch) {
		if ("C".equals(ch) || "c".equals(ch)) {
			System.out.println("Temperature in Celcuis : " +res);
		}
		else if ("f".equals(ch) || "F".equals(ch)) {
			System.out.println("Temperature in Fahrenheit : " +res);
		}
   }	
	
	/*
	* Driver program to test temp Conversion class. Ideally this function should be in a separate user class.
	*/
	
	public static void main(String args[]) {
		System.out.println("*** Program for Conversion of Temperature ***");
	
		System.out.println("\nEnter Temperature for Conversion : ");
		float temp = Util.getInputInteger();
		System.out.println("\nEnter Celcuis or Fahrenheit : ");
		String ch = Util.getInputString();
		float res = Util.temperaturConversion(temp, ch);
	
		printResult(res, ch);
	}
	

}
