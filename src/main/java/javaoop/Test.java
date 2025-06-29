package javaoop;

public class Test {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        teacher1.name = "Provashish";
        teacher1.gender = "Male";
        teacher1.phone = 2766552;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        Teacher teacher2 = new Teacher();

        teacher2.name = "Tonmoy";
        teacher2.gender = "Male";
        teacher2.phone = 2766552;

        teacher2.displayInformation();
    }
}
