package java_string;

public class String1 {

    public static void main(String[] args) {

        String firstName = "Provashish";
        String lastName = "Roy";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.startsWith("P"));
        System.out.println(fullName.endsWith("P"));

    }
}
