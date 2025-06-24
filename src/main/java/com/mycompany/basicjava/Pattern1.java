
package com.mycompany.basicjava;
import java.util.Scanner; 


public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please enter line numbers: ");
        int n = input.nextInt(); 
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <=row; col++){
                //System.out.print(col);
                //System.out.print("#");
                //System.out.print("*");
                System.out.print((char)('a' + col - 1));
            }
            System.out.println(" ");
            }
        
         for( int row = n; row >= 1; row--){
                for(int col = 1; col <= row; col++){
                    System.out.print((char)('a' + col -1));
                }
                System.out.println(" ");
        }   
    }
}
