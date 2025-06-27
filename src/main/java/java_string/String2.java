
package java_string;

public class String2 {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Provashish"); 
        
        name.append(" Roy"); 
        name.reverse();

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.capacity());
    }
}
