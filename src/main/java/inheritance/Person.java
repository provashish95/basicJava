package inheritance;

public class Person extends Teacher {

    //name & age variable store in Teacher class
    String address;

    void displayInfo2() {
        displayInformation();
        System.out.println("Address: " + address);
    }
}
