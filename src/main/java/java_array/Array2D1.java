package java_array;

import java.util.Scanner;

public class Array2D1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("Please enter your A Matrix value: ");
        //Input for A matrix...
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("Please enter your B Matrix value: ");
        //Input for B matrix...   
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t " + A[row][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" "); //for new line between two matrix...
        
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t " + B[row][col]);
            }
            System.out.println(" ");
        }
        
        //Adding A & B Matrix...
        System.out.println(" ");
        System.out.println("A + B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t " + (A[row][col] + B[row][col]));
            }
            System.out.println(" ");
        }
    }
}
