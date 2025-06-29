package javaoop;

public class Test1 {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.setInformation("Arunima", "Female", 1212);
        teacher2.setInformation("Tonmoy Roy", "Male", 1010);

        teacher1.displayInformation();
        teacher2.displayInformation();

    }
}
