/*
Author: Denoon, Derek
Date: September 15, 2021
Assignment: Shuffling
 */

package apcsjava;

import apcsjava.Deck;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // creates new Deck
        Deck myDeck = new Deck();
        // prints the initial deck
        System.out.println(Arrays.toString(myDeck.getDeck()));
        //
        for (int i = 0;i < 8;i++){
            myDeck.setDeck(Shuffling.riffle(myDeck.getDeck()));
            System.out.println(Arrays.toString(myDeck.getDeck()));
        }
    }
}
