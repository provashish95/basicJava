
package com.mycompany.basicjava;
import java.util.Scanner; 

public class CircleProblem {
    
     public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        double radius, circle; 
        
        System.out.print("Eneter radius: ");
        radius = input.nextDouble();
        
        circle = .5 * radius * radius; 
        
        System.out.println("Circle is: " + circle); 
        
    }
}
