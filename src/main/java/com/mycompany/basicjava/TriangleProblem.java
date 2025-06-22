
package com.mycompany.basicjava;
import java.util.Scanner; 

public class TriangleProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        double base, height, area; 
        
        System.out.print("Eneter base: ");
        base = input.nextDouble();
        
        System.out.print("Eneter height: ");
        height = input.nextDouble(); 
        
        area = .5 * base * height; 
        
        System.out.println("Area of Triangle is: " + area);
        
        
    }
}
