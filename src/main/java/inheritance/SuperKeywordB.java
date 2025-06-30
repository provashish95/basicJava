
package inheritance;


public class SuperKeywordB extends SuperKeywordA {
    //int x = 20
    int x = 5; 
    
    @Override
     void display(){
         super.display();
        System.out.println("Display B class");
    }
}
