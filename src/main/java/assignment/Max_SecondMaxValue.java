
/* 1. Given array: numbers[] = {11,7,2,15,6} Find out the difference between the max and second max value. Output: 4 */

package assignment;


public class Max_SecondMaxValue {
    public static void main(String[] args) {
        int[] numbers = {11, 7, 2, 15, 6}; 
        
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                secondMax = max;
                max = numbers[i];
            }else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        int difference = max - secondMax;
        System.out.println("Difference between max and second max: " + difference);
        
    }        
}
