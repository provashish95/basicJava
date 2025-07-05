/*
 4. Find the missing number from this array {0,1,2,4,5} Formula: n(n+1)/2 - sum(array) Output: 3
 */
package assignment;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        int n = 5;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
