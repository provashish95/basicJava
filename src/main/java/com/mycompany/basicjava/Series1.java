
package com.mycompany.basicjava;
import java.util.Scanner; 

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int n, sum = 0; 
        System.out.println("Enter the last number: ");
        n = input.nextInt(); 
        
        for(int i = 1; i <= n; i++){
            sum = sum + i; 
            System.out.print(i + " ");
        }
        System.out.println("\n Sum of all numbers are: " + sum);
    }
}
