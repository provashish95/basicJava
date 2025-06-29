package static_variable;

public class StaticVariableTest {

    public static void main(String[] args) {

        // StaticVariable ob = new StaticVariable();
        System.out.println("University Name: " + StaticVariable.universityName);

        StaticVariable student1 = new StaticVariable();
        student1.display();

        StaticVariable student2 = new StaticVariable();
        student2.display();
        
        StaticVariable student3 = new StaticVariable();
        student3.display();

    }
}
