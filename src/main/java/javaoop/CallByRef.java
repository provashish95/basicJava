package javaoop;

public class CallByRef {

    String name;

    void change(CallByRef r2) {
        r2.name = "Tonmoy";
    }
}
