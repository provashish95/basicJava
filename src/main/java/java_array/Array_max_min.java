
package java_array;
import java.util.Scanner; 

public class Array_max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        double[] number = new double[5];  
        
        System.out.println("Please enter five numbers: ");
        
        for(int i = 0; i < number.length; i++){
            number[i] = input.nextDouble(); 
        }

        double max = number[0];
        double min = number[0];
        
        for(int j = 1; j < number.length; j++){
            if(max < number[j]){
                max = number[j]; 
            }
        }
        for(int j = 1; j < number.length; j++){
            if(min > number[j]){
                min = number[j]; 
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Manimum value is: " + min);
            
    }
}
