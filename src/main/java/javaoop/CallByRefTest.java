package javaoop;

public class CallByRefTest {

    public static void main(String[] args) {
        CallByRef r1 = new CallByRef();
        r1.name = "Provashish";

        System.out.println("Name: " + r1.name);

        r1.change(r1);
        System.out.println("Name: " + r1.name);

    }
}

// In call by reference main data changed like r1 value Provashish & Tonmoy
