package com.mycompany.basicjava;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("How many numbers: ");
        number = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;

       //System.out.print(first + " " + second);
       //Input 7 = 0112358
        
        for (int i = 3; i <= number; i++) {
            fibo = first + second;
            if(i == 5){
                System.out.println(fibo);
                break; 
            }else{
                first = second;
                second = fibo;
            }
            
        }

    }
}
