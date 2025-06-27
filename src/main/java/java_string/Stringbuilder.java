
package java_string;


public class Stringbuilder {
    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("Provashish");
        
        name.append(" Roy"); 
        name.append( 121); 
        name.append(true); 
        
        System.out.println(name);
    }
}
