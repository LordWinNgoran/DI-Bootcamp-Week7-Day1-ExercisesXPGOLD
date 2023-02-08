//Exercise 4 : Deck Of Cards
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a small program to test your deck and card classes.
* The program can be as simple as creating a deck of cards and displaying its cards
* date: 06/02/2023
*/

package exercise4;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card1 = new Card(Deck.SEVEN, Deck.DIAMONDS);
		Card card2 = new Card(Deck.THREE, Deck.CLUBS);
		Card card3 = new Card(Deck.KING, Deck.SPADES);

		deck.addCard(card1);
		deck.addCard(card2);
		deck.addCard(card3);

		deck.displayCards();
	}
}