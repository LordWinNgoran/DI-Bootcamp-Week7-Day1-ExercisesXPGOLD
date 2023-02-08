//Exercise 3 : Single Playing Card Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a class whose instances represent a single playing card from a deck of cards.
* laying cards have two distinguishing properties: rank and suit.
* date: 06/02/2023
*/

package exercise3;
public class SinglePlayingCard {
    private int rank;
    private int suit;

    public SinglePlayingCard(int rank, int suit) {
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
        return "SinglePlayingCard{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}