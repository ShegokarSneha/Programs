/***********************************************************************************************************
* @problem statement: Read a List of Numbers from a file and arrange it in a Linked List.
*                    
* @param: created the class of unorder List using Iofile,linked list.
* 
* @author:  Sneha 
* @date:    15/06/2019
* @version: 1.0
*************************************************************************************************************/

package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class UnorderedList {
	public void unorderList() 
		{
			IoFile io = new IoFile();
			String str[]=io.readFromFile("/home/admin1/Desktop/Files/UnorderedList").split(" ");
		
			LinkedList <String> list = new LinkedList<String>();
			for(int i=0; i<str.length; i++) 
			{
				list.add(str[i]);
			}
			list.display();
			System.out.println();
			System.out.println("\nEnter word:");
			String st = Util.getInputString();
			if(list.search(st)) 
			{
				list.remove(st);
			}
			else 
			{
				list.add(st);
			}
			list.display();
			io.writeToFile(list,"/home/admin1/Desktop/Files/UnorderedList");
		}
		
		public static void main(String[] args) {
			
			UnorderedList un = new UnorderedList();
			System.out.println("*** Program for Unordered Linked List ***");
			un.unorderList();
		}

	}