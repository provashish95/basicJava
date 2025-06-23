
package com.mycompany.basicjava;
import java.util.Scanner;

public class DigitOfSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, r, temp, sum=0; 
        
        System.out.println("Enter any integer number: ");
        number = input.nextInt(); 
        
        temp = number; 
        while(temp != 0){
            r = temp % 10; 
            sum = sum + r; 
            temp = temp / 10; 
        }
        System.out.println("Sum of digit are: " + sum);

    }
}
