/*
8. Print and count the every possible permutations of this string:
Input: cat
Output:
Count: 6
Permutations: cat, cta, act, atc, tac, tca
 */
package assignment;

import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        int length = input.length();
        char[] chars = input.toCharArray();
        boolean[] used = new boolean[length];
        StringBuilder current = new StringBuilder();
        int total = 1;
        
         for (int i = 1; i <= length; i++) {
            total *= i;
        }
         String[] results = new String[total];
        int[] index = {0};
        class Permute {
            void generate() {
                if (current.length() == length) {
                    results[index[0]] = current.toString();
                    index[0]++;
                    return;
                }

                for (int i = 0; i < length; i++) {
                    if (!used[i]) {
                        used[i] = true;
                        current.append(chars[i]);
                        generate();
                        current.deleteCharAt(current.length() - 1);
                        used[i] = false;
                    }
                }
            }
        }
        
        Permute p = new Permute();
        p.generate();
        
         System.out.print("Permutations: ");
        for (int i = 0; i < index[0]; i++) {
            System.out.print(results[i]);
            if (i < index[0] - 1) {
                System.out.print(", ");
            }
        }
        
         System.out.println("\nCount: " + index[0]);
         
    }
}
