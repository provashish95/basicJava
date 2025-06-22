
package com.mycompany.basicjava;
import java.util.Scanner; 


public class StringDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String name; 
        System.out.print("Enter Your Name: ");
        //name = input.next(); 
        name = input.nextLine(); 
        
        System.out.println(name);
    }
}
