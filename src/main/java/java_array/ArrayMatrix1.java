
package java_array;

//import java.util.Scanner;

public class ArrayMatrix1 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
        int[][] A = new int[4][5]; 
        int k = 0; 
        
        //Value assign in a 2D matrix...
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 5; col++){
                A[row][col] = k; 
                k++; 
            }
        }
        
        //Print Matrix value...
        System.out.print("Matrix:");
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 5; col++){
                System.out.print("\t"+ A[row][col]);
            }
            System.out.println(" ");
        }
        
    }
}
