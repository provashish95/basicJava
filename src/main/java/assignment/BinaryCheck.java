/*
 12. Write a program that evaluates a string entered by the user to determine whether it is binary or not.
Example 1 input: 1001
output: true
Example 2 input: 2001
output: false
 */
package assignment;

import java.util.Scanner;

public class BinaryCheck {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);

    }
}
