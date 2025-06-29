package javaoop;

public class StaticBlock {

    static int id;
    static String name;

    //static block...
    static {
        id = 101;
        name = "Provashish";
        System.out.println("Staic block");
    }

    //static method
    static void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
        System.out.println("main method");
    }
}
