package com.bridgelabz.ObjectOrientedPrograms;

public class DeckofCardsUsingQueue {
	
		public static void main(String[] args) 
		{
			CardLogic CardLogic=new CardLogic();
			int noOfPlayer = 4;
			int noOfCards = 9;
			String[] init = CardLogic.getCards();
			String[] shuffleCards = CardLogic.shuffleCards(init);
			String[][] distributedShuffle =CardLogic.distributedCards(shuffleCards, noOfPlayer, noOfCards);
			
			System.out.println("*** AFTER SORTING ***");	
			
			CardLogic.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
	    }
	}