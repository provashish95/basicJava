
package com.mycompany.basicjava;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number, r, temp, sum = 0; 
        System.out.println("Enter any interger number: ");
        number = input.nextInt();
        
        temp = number; 
        while(temp != 0){
            r = temp % 10; 
            sum = sum * 10 + r; 
            temp = temp / 10; 
        }
        System.out.println("Reverse number is: " + sum);
        
    }
}


