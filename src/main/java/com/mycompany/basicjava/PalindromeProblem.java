
package com.mycompany.basicjava;
import java.util.Scanner;

public class PalindromeProblem {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int m, n, r, temp, sum, count = 0; 
         System.out.println("Enter first Number: ");
         m = input.nextInt(); 
         
         System.out.println("Enter last number: ");
         n = input.nextInt(); 
         
         for(int i = m; i <= n; i++){
             temp = i;
             sum = 0;
             while(temp != 0){
                 r = temp % 10; 
                 sum = sum * 10 + r; 
                 temp = temp /10; 
             }
             if(sum == i){
                 count++; 
                 System.out.println(i);
             }
         }
         
         System.out.println("Total Number of Palindrome: "+ count);
    }
}
