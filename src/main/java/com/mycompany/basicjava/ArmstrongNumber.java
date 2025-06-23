
package com.mycompany.basicjava;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m, n, r, temp, sum; 
        System.out.println("Enter start number: ");
        m = input.nextInt(); 
        System.out.println("Enter last number: ");
        n = input.nextInt(); 
        
        for(int i = m; i <=n; i++){
            temp = i; 
            sum = 0; 
            while(temp != 0){
                r = temp % 10; 
                sum = sum + r*r*r; 
                temp = temp /10; 
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
