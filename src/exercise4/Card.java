//Exercise 4 : Deck Of Cards
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a small program to test your deck and card classes.
* The program can be as simple as creating a deck of cards and displaying its cards
* date: 06/02/2023
*/


package exercise4;


public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Exercise4.Card {" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}