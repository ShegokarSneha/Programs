package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("*** Program to Print Month Calendar ***");
		System.out.print("\nEnter full year : ");
        int year = Util.getInputInteger();
        
        // Gregorian Calendar Start from 1582
        while(year < 1582) {   
        	System.out.println("\nEntered Wrong Input !");
        	System.out.print("\nEnter full year : ");
	        year = Util.getInputInteger();
        }
        
     // Prompt the user to enter month
        
        System.out.print("\nEnter month in number between 1 and 12: ");
        int month = Util.getInputInteger();
        
        while(month < 1 || month > 12) {
        	System.out.println("\nEntered Wrong Input !");
        	System.out.print("\nEnter month in number between 1 and 12: ");
            month = Util.getInputInteger();
        }


        // months[i] = name of month i
     // leave empty so that months[1] = "January"
        
        String[] months = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

        // days[i] = number of days in month i
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // check for leap year
        if (month == 2 && Util.isLeapYear(year)) days[month] = 29;


        // print calendar header
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = Util.dayOfWeek(1, month, year);

        // print the calendar
        for (int i = 0; i < d; i++)
        	System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
        	System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }

    }
}