/******************************************************************************
*  Compilation: javac -d bin CalendarUsingStack.java 
*  
*  Execution:   java -cp bin com.bridgelabz.datastructureprograms.CalendarUsingStack 
*  
*  Purpose: To print Month Calendar Using stack.
*  
*  @author  Sneha
*  @version 1.0 
*  @since   14-06-2019
*
******************************************************************************/

package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class CalendarUsingStack {
	//creating the stack object.
		Stack<Object> stack = new Stack<Object>(); 
		Stack<Object> stackOne = new Stack<Object>(); 
		
		/**
		 * This method is used to initialize stack with week object.
		 * @return Nothing.
		 */
		public void addCalendarInStack() {
			int size = CalendarUsingQueue.queue.size();
			
			//for loop for adding the week object from queue to stack.
			for(int i=1;i <= size;i++) {
				stack.push(CalendarUsingQueue.queue.deQueue());
			}
			
			//for loop to pop the object from one and push to another stack.
			for(int i = 1 ; i <= size ; i++) {
				stackOne.push(stack.pop());  
			}
		}
		
		/**
		 * This method is used to display the calender.
		 * @param month This is the first parameter of displayCalender method.
		 * @param year This is the second parameter of displayCalender method.
		 * @return Nothing.
		 */
		public void displayCalender(int month , int year) {
			int sizeOfStack = stackOne.size();
			 String[] months = {"", "January", "February", "March", "April", "May", "June",
			            "July", "August", "September", "October", "November", "December" };

			        // days[i] = number of days in month i
			        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			        // check for leap year
			        if (month == 2 && Util.isLeapYear(year)) days[month] = 29;


			        // print calendar header
			        System.out.println("\t\t" + months[month] + " " + year);
			      

		
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			
			for(int i = 1 ; i <sizeOfStack ; i++) {
				System.out.print(stackOne.pop()+"\t");
				if(i%7 == 0) {
					System.out.println();
				}
			}
		}
		
		/**
		* This is the main method which makes use of addCalendarInStack, displayCalendar and
		* dayOfWeek method of Util class.
		* @param args[0] This is the first parameter of main method for taking month of the year.
		* @param args[1] This is the second parameter of main method for year.
		* @return Nothing.
		* @exception IOException On input error.
		* @see IOException
		*/
	public static void main(String[] args) {
		System.out.println("*** Program to Print Month Calendar Using Stack ***");

			
		// taking input from command line
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
			
			//creating object of CalendarUsingQueue.
			CalendarUsingQueue calendarUsingQueue = new CalendarUsingQueue();
			
			//calling the addCalendarInQueue method of CalendarUsingQueue class.
			calendarUsingQueue.addCalendarInQueue(month , year);
			
			//creating the object of CalendarUsingStack.
			CalendarUsingStack calendarUsingStack = new CalendarUsingStack();
			
			//calling the addCalenderInStack method.
			calendarUsingStack.addCalendarInStack();
			
			//calling the displayCalendar method.
			calendarUsingStack.displayCalender(month , year);
		}

	}


