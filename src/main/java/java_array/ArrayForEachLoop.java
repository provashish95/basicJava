
package java_array;

public class ArrayForEachLoop {
    public static void main(String[] args) {
        //String[] names = new String[4]; 
        String[] names = {"Prova", "Tonmoy", "Arunima", "Roy"}; 
        int [] number = {10,20,30,40}; 
        
//        for(int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
        
        for(String x : names){
            System.out.println(x);
        } 
        
        int sum = 0;
        for(int y : number){
            sum = sum + y; 
        }
        System.out.println("Sum is: " + sum);
    }
}
