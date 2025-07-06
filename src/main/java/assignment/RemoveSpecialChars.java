/*
 10. Remove only the special characters from this String
Input: s@atur!day
Output: saturday
 */
package assignment;

import java.util.Scanner;

public class RemoveSpecialChars {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
        }
        
        System.out.println("Output: " + result);
    }
}
