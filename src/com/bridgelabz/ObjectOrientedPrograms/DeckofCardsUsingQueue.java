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
			
			System.out.println("\n*** AFTER SORTING ***");	
			
			CardLogic.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
	    }
	}