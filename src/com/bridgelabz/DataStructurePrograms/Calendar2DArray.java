/******************************************************************************
*  Compilation: javac -d bin Calendar2DArray.java 
*  
*  Execution:   java -cp bin com.bridgelabz.datastructureprograms.Calendar2DArray 
*  
*  Purpose: To print Month Calendar in 2D Array.
*  
*  @author  Sneha
*  @version 1.0 
*  @since   14-06-2019
*
******************************************************************************/
package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class Calendar2DArray {
	static int[][] calender = new int[6][7];
	public static void initCal() {
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = -10;				
				}
			}
		}
		
	public static void putCalender(int d) {
		int d1 = 1;
		for (int i = d; i < calender[0].length; i++) {
				// System.out.print(d1);
			calender[0][i] = d1++;
		}
		for (int i = 1; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = d1++;
			}
		}
	}

	public static void display(int month, int year) {
		String[] months = {"", "January", "February", "March", "April", "May", "June",
		            "July", "August", "September", "October", "November", "December" };

		        // days[i] = number of days in month i
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		        // check for leap year
		if (month == 2 && Util.isLeapYear(year)) days[month] = 29;


		        // print calendar header
		System.out.println("\t\t" + months[month] + " " + year);
		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) 
			{
				if (calender[i][j] < 0 || calender[i][j] > days[month]) {
					System.out.print("\t ");
					} 
				else if (calender[i][j] > 0) {
					System.out.print( calender[i][j] + "\t" + " ");
					}
				}
				System.out.println("\t");
			}
		}

	public static void main (String[] args) {
		System.out.println("*** Program to Print Month Calendar in 2D Array ***");
		System.out.println("\nEnter year:");
		int year = Util.getInputInteger();
		System.out.print("\nEnter month in number between 1 and 12: ");
        int month = Util.getInputInteger();
		while(month < 1 || month > 12) {
			System.out.println("\nEntered Wrong Input !");
        	System.out.print("\nEnter month in number between 1 and 12: ");
        	month = Util.getInputInteger();
		}
		
		int d = Util.dayOfWeek(1, month, year);
		initCal();
		putCalender(d);
		display(month, year);
		}

}
