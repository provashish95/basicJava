package overloading_constructor;

public class Teacher {

    String name, gender;
    int phone;

    Teacher() {
        System.out.println("No information");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Gneder: " + gender);
        System.out.println("Teacher Phone: " + phone);
    }
}
