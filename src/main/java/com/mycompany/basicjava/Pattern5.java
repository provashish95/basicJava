
package com.mycompany.basicjava;
import java.util.Scanner;


public class Pattern5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
        System.out.println("Enter line numbers: ");
        int n = input.nextInt(); 
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row*2 -1; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int row = n-1; row >= 1; row--){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row*2 -1; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
