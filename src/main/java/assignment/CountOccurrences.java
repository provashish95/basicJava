/*
 5. numbers[]={1,2,2,3,3,3,4,4,4,4} Count the occurrence of each digits: 
Output:
1 1
2 2
3 3
4 4
 */
package assignment;


public class CountOccurrences {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

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
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
