package recursion;

public class RecursionDemoTest {

    public static void main(String[] args) {
        RecursionDemo ob = new RecursionDemo();
        int result = ob.fact(5);

        System.out.println("Factorial of 5: " + result);
        System.out.println("Factorial of 5: " + (ob.fact(4)));
    }
}
