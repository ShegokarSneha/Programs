package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class BankingCounter {
	 // Creating queue.
		Queue<Integer> queue = new Queue<Integer>();
		private long mBankCash;
		
		public BankingCounter() {
			mBankCash=100000;
		}
		
	public void inputPannel() {
		int choice = 0;
		int type = 0;
		
			//adding the people into queue.
		do {
			System.out.println("Enter Your Choice:");
			System.out.println("\nDo You want to Deposite or Withdraw the money?");
			System.out.println("\nEnter 1. Deposite \n\t2. Withdraw");
			type = Util.getInputInteger();
			queue.enQueue(type);
			System.out.println("Do you want to add more People");
			System.out.println("\nEnter 1. Yes \n2. No");
			choice = Util.getInputInteger();
		}while(choice == 1);	
		cashCounter();
		
	}
		
		
	public void cashCounter() {
		int queueSize = queue.size();
		int amount = 0;
		int choice = 0;

			// for loop for removing the people one by one.
		for(int i=0; i<queueSize; i++) {
			int moneyType = queue.deQueue();
			switch (moneyType) {
			case 1:
			System.out.println("How much money you want to Deposite:");
			amount = Util.getInputInteger();
			mBankCash = mBankCash + amount;
			System.out.println("Total amount in the bank is : "+mBankCash );
				
			case 2:
				System.out.println("How much money you want to Withdraw:");
				amount = Util.getInputInteger();
				mBankCash = mBankCash - amount;
				System.out.println("Total amount in the bank is : "+mBankCash );
				
				default:
					System.out.println("Enter Valid Choice");
			}
		}
		System.out.println();
		System.out.println("Do you want to add more People");
		System.out.println("\nEnter 1. Yes \n2. No");
		choice = Util.getInputInteger();
		if(choice == 1) {
		  inputPannel();
		}
		System.out.println("Total amount in the bank is : "+mBankCash );
			//asking want to add people into queue after queue gets empty.
	}
		
		
	public static void main(String[] args) {
		System.out.println("*** Program Banking Cash Counter Using Queue ***");
	
			//creating object.
		BankingCounter bankingCashCounter = new BankingCounter();
		bankingCashCounter.inputPannel();
		
		
		}
}


	