/*
Author: Denoon, Derek
Date: September 15, 2021
Assignment: Shuffling
 */

package apcsjava;

import java.util.stream.IntStream;

public class Deck {
    // int array with length 52 to represent a deck of cards
    private int[] deck = new int[52];

    public Deck() {
        // no arg constructor to initialize "deck" to its starting values
        // this is same as using a for loop it just goes through each value in the IntStream and assigns that index of
        // the deck to (index + 1)
        IntStream.range(0, 52).forEach(i -> deck[i] = i + 1);
    }

    // set and get methods for private array "deck"
    public int[] getDeck() {
        return deck;
    }

    public void setDeck(int[] deck) {
        this.deck = deck;
    }
}
