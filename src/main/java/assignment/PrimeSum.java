/*
 2. Given array: numbers[] = {11,7,2,15,6} In the above array, sum of the prime numbers only. Output: 18
 */
package assignment;

public class PrimeSum {
    public static void main(String[] args) {
         int[] numbers = {11, 7, 2, 15, 6};
        int sum = 0;
        
        for(int i =0; i < numbers.length; i++){
            int n = numbers[i]; 
            boolean isPrime = true; 
            
            if(n < 2){
                isPrime = false; 
            }else{
                for(int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        isPrime = false; 
                        break; 
                    }
                }
            }
            if(isPrime){
            sum = sum + n; 
        }
        }
        System.out.println(" Sum of Prime number is: " + sum);
        
    }
 
}
