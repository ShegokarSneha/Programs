package com.bridgelabz.ObjectOrientedPrograms;

public class DeckOfCards {

	public static void main(String[] args) {
		System.out.println("*** Program to Print Deck of Cards ***");
		
		DeckCardLogic deck = new DeckCardLogic();
		
			int noOfPlayer = 4;
			int noOfCards = 9;
			int temp = 1;
			String[] cards = deck.getCards();
			String[] shuffleCards = deck.shuffleCards(cards);
			String [][] card = deck.distributedCards(shuffleCards, noOfPlayer, noOfCards);
			for(int i = 0; i < noOfPlayer; i++) {
				System.out.print("Player "+temp+" : ");
				System.out.println("\n");
				for(int j = 0; j < noOfCards; j++) {
					System.out.print("\t"+card[i][j]+"  ");
					System.out.print("\n");
					}
				temp++;
				System.out.println("\n");
				}
			}
	}
		

