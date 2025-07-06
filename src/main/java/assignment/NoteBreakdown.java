/*
 *14. Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:
notes=[1000,500,200,100,50,20,10,5,2,1] Marks:10
Input: 546
Output:
500 1
20 2
5 1
1 1
 */
package assignment;

import java.util.Scanner;

public class NoteBreakdown {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = scanner.nextInt();

 
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};


        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " " + count);
                amount = amount % notes[i]; 
            }
        }
    }
}
