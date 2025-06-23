
package com.mycompany.basicjava;
import java.util.Scanner; 

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int digit; 
        System.out.println("Enter any Number between 1 to 10: "); 
        digit = input.nextInt(); 
        
        switch(digit){       
            case 0: 
                System.out.println("ZERO");
                break; 
            case 1: 
                System.out.println("ONE");
                break; 
            case 2: 
                System.out.println("TWO");
                break; 
            case 3: 
                System.out.println("THREE");
                break; 
            case 4: 
                System.out.println("FOUR");
                break; 
            case 5: 
                System.out.println("FIVE");
                break; 
            case 6: 
                System.out.println("SIX");
                break; 
            case 7: 
                System.out.println("SEVEN");
                break; 
            case 8: 
                System.out.println("EIGHT");
                break; 
            case 9: 
                System.out.println("NINE");
                break; 
            case 10: 
                System.out.println("TEN");
                break; 
            default: 
                System.out.println("INVALID");    
        }        
    }
}
