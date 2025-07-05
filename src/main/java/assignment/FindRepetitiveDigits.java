/*
 6. numbers[] = {1,2,3,4,4,5,6,6, 7} return only the repetitive digits. Output: 4,6
 */
package assignment;

public class FindRepetitiveDigits {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int[] count = new int[max + 1];
        for (int num : numbers) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println(i);
            }
        }
    }
}
