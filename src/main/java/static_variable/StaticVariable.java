
package static_variable;


public class StaticVariable {
    
   static String universityName = "DIU"; 
   static int count = 0; 
   
   StaticVariable(){
       count++; 
   }
   
   void display(){
       System.out.println("Student: " + count);
   }
   
}
