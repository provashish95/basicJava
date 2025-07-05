/*
 7. Print only the unique characters in string format and their count.Input: abcaabbcc 
Output: abc
Total unique characters: 3
 */
package assignment;

import java.util.Scanner;
import java.util.LinkedHashSet;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }
        System.out.print("Output: ");
        for (char ch : uniqueChars) {
            System.out.print(ch);
        }
        System.out.println("\nTotal unique characters: " + uniqueChars.size());
    }
}
