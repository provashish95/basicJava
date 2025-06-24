
package com.mycompany.basicjava;
import java.util.Scanner; 

public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter how mant line: ");
        int n = input.nextInt(); 
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        //new pattern...
         for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == n || col == 1 || col == row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
         
        //new pattern2...
         for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == col || col + row == n + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        //new pattern with value...
        int count = 0;
         for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(count++);
            }
            System.out.println("");
        }
         
        //New pattern style...
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col<= row; col++){
                System.out.print(col);
            }
            for(int col = row - 1; col>= 1; col--){
                System.out.print(col);
            }
            System.out.println("");
        }
        for(int row = n - 1; row >= 1; row--){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col<= row; col++){
                System.out.print(col);
            }
            for(int col = row - 1; col>= 1; col--){
                System.out.print(col);
            }
            System.out.println("");
        }
 
    }
}
