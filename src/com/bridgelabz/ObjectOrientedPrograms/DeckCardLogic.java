package com.bridgelabz.ObjectOrientedPrograms;

import java.util.Random;

public class DeckCardLogic {
	@SuppressWarnings("rawtypes")
	QueueCards queue= new QueueCards();
	@SuppressWarnings("rawtypes")
	QueueCards queue1= new QueueCards();
	public String[] getCards() {
		String[] card={"Club","Diamond", "Heart", "Spade"};
		String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String[] deckOfCards=new String[52];		
		int count=0;
		for(int i=0 ; i<card.length;i++) {
			for(int j=0;j<rank.length;j++) {
				deckOfCards[count++]=rank[j]+" "+card[i];
				
				}
			}
		return deckOfCards;
		}
	
	
	public  String[] shuffleCards(String[] deckOfCards) {
		for(int i = 0;i<deckOfCards.length;i++) {
			Random r=new Random();
			int random=r.nextInt(52);
			String temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[random];
			deckOfCards[random] = temp;
			}
		return deckOfCards;
		}
	
	
	
	public  String[][] distributedCards(String[] deckOfCards, int noOfPlayers , int noOfCards) {
		int count=0;
	
		String[][] distributedCards = new String[noOfPlayers][noOfCards];
		for(int i=0; i<noOfPlayers;i++) {
			
			for(int j=0;j<noOfCards;j++) {
				distributedCards[i][j] = deckOfCards[count++];
				
				}
			
			}
		return distributedCards;
		}
	
	@SuppressWarnings("unchecked")
	public void deckOfCardsQueue(String[][] distributedShuffle, int noOfPlayer, int noOfCards) 
	{
		String[] cards = new String[noOfCards];
		for(int i= 0;i<noOfPlayer;i++) {
			queue.enQueue("\nPlayer "+(i+1)+" : ");
			System.out.println(queue.deQueue()+"\t");
			for(int j=0;j<noOfCards;j++)
			{
				cards[j] = distributedShuffle[i][j];
			}
			sortCards(cards);
			for(int k = 0; k < cards.length; k++) {
				System.out.println(cards[k]);
			}
		}
		
		
	}
	
	
	public  void sortCards(String[] cards) {
		//String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String queue ;
		for(int i = 0 ; i < cards.length;i++) {
			queue = cards[i];
			for(int j = i+1 ; j < cards.length ; j++) {
				if(cards[i].compareTo(cards[j]) > 0) {
					queue = cards[j];
					cards[j] = cards[i];
					cards[i] = queue;
					}
				}
			
			}
		
		}
		
	}
		
		
	


		