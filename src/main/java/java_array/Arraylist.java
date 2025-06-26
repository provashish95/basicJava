package java_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(1, 400);
        //System.out.println("Size: " + numbers);
        
        for(int i = 0; i < 5; i++){
            numbers.add(i); 
        }
        
        
        

        Iterator itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
        System.out.println("");

        for (int x : numbers) {
            System.out.print(" " + x);
        }

        //Removing elements...
        //numbers.remove(2); 
        // System.out.println("Size: " + numbers); 
        System.out.println("");
        System.out.println("20 is present: " + (numbers.contains(20)));
        System.out.println("Index: " + (numbers.indexOf(20)));
        System.out.println("Array is empty or not: " + numbers.isEmpty());

        //Array sort by ascending order...
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
