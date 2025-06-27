
package java_array;
import java.util.Scanner; 

public class Array_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        double[] number = new double[5]; 
        double sum = 0; 
        
        System.out.println("Enter please five numbers: ");
//        number[0] = input.nextDouble(); 
//        number[1] = input.nextDouble(); 
//        number[2] = input.nextDouble(); 
//        number[3] = input.nextDouble(); 
//        number[4] = input.nextDouble();

        for(int i = 0; i< number.length; i++){
            number[i] = input.nextDouble();
        }
        
        //sum =  number[0] + number[1] +  number[2] + number[3] + number[4]; 
       
        for(int j = 0; j < number.length; j++){
            sum = sum + number[j]; 
        }
        
        System.out.println("Sum of Array is : " + sum);
        System.out.println("Sum of Array is : " + (sum/number.length));
    }
}
