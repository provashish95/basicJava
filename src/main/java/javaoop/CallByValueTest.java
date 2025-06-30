package javaoop;

public class CallByValueTest {

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;

        System.out.println(x);

        ob.change(x);
        System.out.println(x);
    }
}

//In call by value main data of not change like x's value remain 10.
