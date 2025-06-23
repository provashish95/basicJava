package com.mycompany.basicjava;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeNumber;
        int count = 0;

        System.out.println("Enter any positive integer number: ");
        primeNumber = input.nextInt();

        if (primeNumber == 0 || primeNumber == 1) {
            System.out.println("Not Prime Number");
        } else {
            for (int i = 2; i < primeNumber / 2; i++) {
                if (primeNumber % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("This is Prime Number");
            } else {
                System.out.println("This is Not a Prime Number");
            }
        }
    }
}
