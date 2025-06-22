
package com.mycompany.basicjava;
import java.util.Scanner;

public class ArithemeticDemo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); 
        
        int num1, num2, result; 
        System.out.print("Enter First Integer Number: ");
        num1 = input.nextInt(); 
        
        System.out.print("Enter Second Integer Number: ");
        num2 = input.nextInt(); 
        
        result = num1 + num2; 
        System.out.println("Sum: " + result);
        
        result = num1 - num2; 
        System.out.println("Sub: " + result);
        
        result = num1 * num2; 
        System.out.println("Mul: " + result);
        
        result = num1 / num2; 
        System.out.println("Div: " + result);
        
        result = num1 % num2; 
        System.out.println("Reminder: " + result);
    }
}
