package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class CalendarUsingQueue {
	static Queue<Object> queue =new Queue<Object>();

   class Week {
	   String[] day = {"S ","M ","Tu","W ","Th", "F ", "S "};
	   String dayName;
	   String date;
	
	public Week(int number, String date) {
		this.dayName = day[number];
		this.date=date;
	}
	public String toString() {
		return this.date;
	}
   }
	
public void showCalendar(int month ,int year) {
	String[] months = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };
		int size = queue.size();
		System.out.println();
		System.out.println("\t\t" + months[month] + " " + year);
        System.out.println(" S\tM\tTu\tW\tTh\tF\tS");
		
		//for loop for printing the date of calendar.
        
        for(int i = 1 ; i < size ; i++) {
        	
			System.out.printf(queue.deQueue()+"\t");
        	
			if(i%7 == 0) {
				System.out.println();
			}
			
        }
}
	
	public void addCalendarInQueue(int month,int year) {
		int l = 1;
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		if (month == 2 && Util.isLeapYear(year)) days[month] = 29;

        // print calendar header
        
		int emptyDate = Util.dayOfWeek(1, month, year);
		
		//This for loop for creating object of week class of empty date with weekday.
		for(int i = 0;i < emptyDate; i++) {
			Week week = new Week(i,"  ");
			queue.enQueue(week);
		}
		int k = 1; //for incrementing the date.
		
		//this for loop for creating object of week class date with weekday.
		for(int i = emptyDate ; i <= days[month-1]+emptyDate ; i++) {
			int daynumber = Util.dayOfWeek(l++, month, year);
		
			Week week = new Week(daynumber," " + k++);
			queue.enQueue(week);
		
	}
	}
	
			
    public static void main(String args[]) {
		System.out.println("*** Program to Print Month Calendar Using Queue ***");

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
        	//creating object.
    		CalendarUsingQueue calendarUsingQueue = new CalendarUsingQueue();
    		
    		//calling addCalendarInQueue method.
    		calendarUsingQueue.addCalendarInQueue(month, year);

    		//calling showCalendar method.
    		calendarUsingQueue.showCalendar(month, year);
		    }

}



