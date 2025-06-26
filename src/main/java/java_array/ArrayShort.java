package java_array;

import java.util.Arrays;

public class ArrayShort {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 11, 23};
        String[] names = {"B", "C", "Arunima", "Div", "Sumitra"};

        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.print(" Ascending Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println(" ");

        System.out.print(" Descending Array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        
        System.out.println(" ");
        
        System.out.print(" Names Array: ");
        for(int i = 0; i < names.length; i++) {
            System.out.print(" " + names[i]);
        }
    }
}
