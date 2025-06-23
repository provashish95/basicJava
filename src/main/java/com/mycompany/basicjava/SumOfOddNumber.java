
package com.mycompany.basicjava;
import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter First Number & Last Number: ");
        int firstNumber = input.nextInt(); 
        int lastNumber = input.nextInt(); 
        int sum = 0; 
        
        for(int i = firstNumber; i <= lastNumber; i = i+2){
            sum = sum + i; 
        }
        
        System.out.println("Total sum of odd numbers is: "+ sum);
    }
}
