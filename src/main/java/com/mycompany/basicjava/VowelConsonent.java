
package com.mycompany.basicjava;
import java.util.Scanner; 


public class VowelConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        char letter; 
        
        System.out.println("Enter any letter: ");
        letter = input.next().charAt(0); 
        
        if(letter == 'a'){
            System.out.println("Vowel");   
        }else if(letter == 'e'){
            System.out.println("Vowel");
        }else if(letter == 'i'){
            System.out.println("Vowel");
        }else if(letter == 'o'){
            System.out.println("Vowel");
        }else if(letter == 'u'){
            System.out.println("Vowel");
        }else if(letter == 'A'){
            System.out.println("Vowel");
        }else if(letter == 'E'){
            System.out.println("Vowel");
        }else if(letter == 'I'){
            System.out.println("Vowel");
        }else if(letter == 'O'){
            System.out.println("Vowel");
        }else if(letter == 'U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
       
    }
}
