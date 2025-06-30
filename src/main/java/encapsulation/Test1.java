package encapsulation;

public class Test1 {

    public static void main(String[] args) {
        Test ob = new Test();

        ob.change();

        ob.setName("Provashish Roy");
        String name = ob.getName();
        System.out.println("Name is : " + name);
    }
}
