/*
Author: Denoon, Derek
Date: September 15, 2021
Assignment: Shuffling
 */

package apcsjava;

public class Shuffling {
    // utility class (not instantiated) to deal with the shuffling of the deck
    public static int[] riffle(int [] toShuffle){
     // Declaration of arrays
     int[]fullCopy = new int[52];
     int[] fHalf = new int[26];
     int[] sHalf = new int[26];

     System.arraycopy(toShuffle, 0, fullCopy, 0, 52);
     // copying the first half of the deck into fHalf and the second half in to sHalf
     // this could be done with for loops but java has a method for it
     System.arraycopy(fullCopy, 0, fHalf, 0, 26);
     System.arraycopy(fullCopy, 26, sHalf, 0, 26);

     for (int i = 0, j = 0; i < 52;i += 2, j++) {
         // chooses the first card from each deck and adds it to the "fullCopy" Array then goes to the second card and
         // does the same thing until the array is full
         fullCopy[i] = fHalf[j];
         fullCopy[i+1] = sHalf[j];
     }
     // returns the shuffled array
     return fullCopy;
    }
}
