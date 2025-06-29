package overloading_constructor;

public class overloadingTest {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Provashsish", "Male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Tonmoy", "Male", 9090);
        teacher3.displayInformation();
    }
}
