package com.bridgelabz.ObjectOrientedPrograms;

import java.util.Random;

public class CardLogic {
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
				deckOfCards[count++]=card[i]+" "+rank[j];
				
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
		int temp=1;
		String[][] distributedCards = new String[noOfPlayers][noOfCards];
		for(int i=0; i<noOfPlayers;i++) {
			System.out.print("Player "+temp+" : ");
			System.out.println("\n");
			for(int j=0;j<noOfCards;j++) {
				distributedCards[i][j] = deckOfCards[count++];
				System.out.print("\t"+distributedCards[i][j]+"  ");
				System.out.print("\n");
				}
			temp++;
			System.out.println("\n");
			}
		return distributedCards;
		}
	
	@SuppressWarnings("unchecked")
	public void deckOfCardsQueue(String[][] distributedShuffle, int noOfPlayer, int noOfCards) 
	{
		String[] cards = new String[noOfCards];
		for(int i= 0;i<noOfPlayer;i++) {
			queue.enQueue("\n\nPlayer "+(i+1)+" : ");
			System.out.println(queue.deQueue()+"\t");
			for(int j=0;j<noOfCards;j++)
			{
				cards[j] = distributedShuffle[i][j];
			}
			sortCards(cards);
			for(int k = 0; k < noOfCards; k++) {
				System.out.println(cards[k]);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public  void sortCards(String[] cards) {
		char[] numberRank = {'2','3','4','5','6','7','8','9','0','A','J','K','Q'};
		for(int i = 0 ; i < numberRank.length;i++) {
			for(int j = 0 ; j < cards.length ; j++) {
				String card = cards[j];    
				char cardRank = card.charAt(0);  
				if(cardRank == numberRank[i]) {
					queue1.enQueue(card);
					}
				
				}
			}
		
		}
	}


		