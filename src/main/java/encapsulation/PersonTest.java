package encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Tonmoy");
        String name = person1.getName();
        System.out.println("Name: " + name);

        person1.setAge(28);
        int age = person1.getAge();
        System.out.println("Age: " + age);
    }
}
