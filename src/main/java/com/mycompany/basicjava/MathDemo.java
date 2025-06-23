
package com.mycompany.basicjava;


public class MathDemo {
    public static void main(String[] args) {
        int x = 2; 
        int y = 3; 
     
        int result = Math.min(x, y); 
        double pow = Math.pow(x, y); 
        double round  = Math.round(8.8); 
        
        System.out.println(Math.max(x, y));
        System.out.println("Minimum : " + result);
        System.out.println("X to the power y : " + pow);
        System.out.println("8.8 round is : " + round);
        System.out.println("PI: " + Math.PI);
    }
}
