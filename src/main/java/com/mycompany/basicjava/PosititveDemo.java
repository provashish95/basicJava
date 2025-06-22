
package com.mycompany.basicjava;
import java.util.Scanner; 

public class PosititveDemo {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
         
         int number; 
         System.out.println("Enter any number: ");
         
         number = input.nextInt(); 
         
         if(number > 0){
             System.out.println("This is positive Number");
         }else{
             System.out.println("This is negative number");
         }
    }
}
