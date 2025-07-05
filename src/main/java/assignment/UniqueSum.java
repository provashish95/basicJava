/*
 3. Given array: numbers[] = {11,7,7, 11, 2,15, 6, 6} Remove the duplicate values and then sum of the unique digits only. Output: 41
 */
package assignment;

public class UniqueSum {

    public static void main(String[] args) {
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};
        int[] unique = new int[numbers.length];
        int uniqueCount = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
                sum = sum + numbers[i];
            }
        }

        System.out.println("Sum of Unique values are : " + sum);
    }
}
