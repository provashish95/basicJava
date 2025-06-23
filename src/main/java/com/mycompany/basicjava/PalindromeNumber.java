
package com.mycompany.basicjava;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, r, temp, sum=0; 
        System.out.println("Enter any integer number: ");
        num = input.nextInt(); 
        
        temp = num; 
        while(temp != 0){
            r = temp % 10; 
            sum = sum * 10 + r; 
            temp = temp /10; 
        }
        
        if(sum == num){
            System.out.println("This number is Palindrom: " + sum);
        }else{
            System.out.println("This is not Palindrom Number");
        }
                
        
    }
}
