
package java_string;


public class StringPlaindrome {
    public static void main(String[] args) {
        
        String s = "121"; 
        
        StringBuffer s1 = new StringBuffer(s); 
         
        
        String name = s1.reverse().toString(); 
       
                
        if(s.equals(name)){
            System.out.println("Plaindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
