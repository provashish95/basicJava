package java_array;

import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a matrix: ");
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        //input matrix A...
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.print("A=");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println(" ");
        }

        //Diagonal, upper, lower...
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
            }
        }

        System.out.println("Sum of Diagonal Elements: " + sumOfDiagonalElements);
        System.out.println("Sum of Upper Elements: " + sumOfUpperElements);
        System.out.println("Sum of Lower Elements: " + sumOfLowerElements);

    }
}
