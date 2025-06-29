package javaoop;

public class Car {

    String name, color;
    int number;

    //Constructor of Car class
    Car(String n, String c, int num) {
        name = n;
        color = c;
        number = num;
    }

    void diplayCar() {
        System.out.println("Car name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Number: " + number);
    }
}
