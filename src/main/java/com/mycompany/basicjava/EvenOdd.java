
package com.mycompany.basicjava;
import java.util.Scanner; 

public class EvenOdd {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in); 
          
          int num; 
          System.out.println("Enter any positive number: ");
          
          num = input.nextInt(); 
          
          if(num % 2 == 0){
              System.out.println("Even");
          }else{
              System.out.println("Odd");
          }
    }
}
