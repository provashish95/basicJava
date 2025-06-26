package java_string;

public class StringMethod {

    public static void main(String[] args) {

        String s1 = "Provashish";
        String s2 = new String("provashish");
        char[] s3 = {'a', 'p', 'v'};
        
        System.out.println(s1.length());
        
        if(s1.equals(s3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        
        System.out.println(" R is present? " + (s1.contains("r"))); 
        System.out.println(" S1 is empty? " + (s1.isEmpty())); 
        
    }
}
