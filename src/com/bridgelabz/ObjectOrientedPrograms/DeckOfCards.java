package com.bridgelabz.ObjectOrientedPrograms;

public class DeckOfCards {

	public static void main(String[] args) {
		
		CardLogic util = new CardLogic();
			int noOfPlayer = 4;
			int noOfCards = 9;
			String[] cards = util.getCards();
			String[] shuffleCards = util.shuffleCards(cards);
			util.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		}
}
