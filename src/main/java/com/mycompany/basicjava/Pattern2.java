
package com.mycompany.basicjava;
import java.util.Scanner; 

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter line numbers: ");
        int n = input.nextInt(); 
        
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                //System.out.print(col%2);
                //System.out.print(row);
                //System.out.print(row%2);
                System.out.print(col);
            }
            System.out.println("");
        }
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<= n; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print(row*col);
            }
            System.out.println("");
        }
       
        
    }
}
