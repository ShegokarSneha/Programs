package com.bridgelabz.ObjectOrientedPrograms;

public class DeckofCardsUsingQueue {
	
		public static void main(String[] args) 
		{
			DeckCardLogic CardLogic=new DeckCardLogic();
			System.out.println("*** Program of Deck Of Cards Using Queue ***");
			int noOfPlayer = 4;
			int noOfCards = 9;
			String[] init = CardLogic.getCards();
			String[] shuffleCards = CardLogic.shuffleCards(init);
			String[][] distributedShuffle =CardLogic.distributedCards(shuffleCards, noOfPlayer, noOfCards);
			System.out.println("\n************* Before Sorting ************");
			int temp = 1;
			for(int i = 0; i < noOfPlayer; i++) {
				System.out.print("Player "+temp+" : ");
				System.out.println("\n");
				for(int j = 0; j < noOfCards; j++) {
					System.out.print("\t"+distributedShuffle[i][j]+"  ");
					System.out.print("\n");
					}
				temp++;
				System.out.println("\n");
				}
			
			System.out.println("\n************* AFTER SORTING *************");	
			
			CardLogic.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
	    }
	}