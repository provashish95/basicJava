/*
 *11.  Remove Vowels from a String
Input: I am a SQA Engineer
Output: m sq ngnr
 */
package assignment;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                result += ch;
            }
        }

        System.out.println("Output: " + result);

        scanner.close();
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
