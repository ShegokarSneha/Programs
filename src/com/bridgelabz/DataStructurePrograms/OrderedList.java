
/***********************************************************************************************************
* @problem statement: Read a List of Numbers from a file and arrange it ascending Order in a Linked List.
*                    
* @param: created the class of orderlist using Iofile,linked list.
* 
* @author:  Sneha 
* @date:    15/06/2019
* @version: 1.0
*************************************************************************************************************/
package com.bridgelabz.DataStructurePrograms;

import java.io.IOException;

import com.bridgelabz.Util.Util;
	
public class OrderedList {
	
	public void orderList() throws IOException {
		IoFile io = new IoFile();
		String str[]=io.readFromFile("/home/admin1/Desktop/Files/OrderedList").split(" ");
		int [] arr = new int[str.length];
		for(int j = 0; j < str.length; j++) {
			String numstring = str[j];
			arr[j] = Integer.parseInt(numstring);
		}
	
		OrderedLinkedList <Integer> list = new OrderedLinkedList<Integer>();
		for(int i=0; i < arr.length; i++) 
		{
			list.add(arr[i]);
		}
		list.display();
		System.out.println();
		System.out.println("\nEnter Number:");
		int number = Util.getInputInteger();
		if(list.search(number)) 
		{
			list.remove(number);
		}
		else 
		{
			list.add(number);
		}
		list.display();
		//String rList = list.toString();
		System.out.println(list);
		//io.writeToFile(rList,"/home/admin1/Desktop/Files/OrderedList");
	}
			
	public static void main(String[] args) throws IOException {
				
		OrderedList list = new OrderedList();
		list.orderList();
			}
		}
