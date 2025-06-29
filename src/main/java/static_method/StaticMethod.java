package static_method;

public class StaticMethod {
    
    static int x = 10; 

    void display() {
        System.out.println("I am Non static method");
    }

    static void display1() {
        System.out.println("x: "+ x);
        System.out.println("I am static method");
    }
}
