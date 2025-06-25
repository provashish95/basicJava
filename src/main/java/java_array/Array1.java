
package java_array;

public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        
        System.out.println("Array value: "+ number[2]);
        System.out.println("Array size: "+ number.length);
        System.out.println("Array sum: "+ (number[0] + number[1]));
        
    }
}
