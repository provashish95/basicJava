package overloading_constructor;

public class MethodOverloading {

    void add(int a, int b) {
        System.out.println("1st add: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("2nd add: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("3rd add: " + (a + b + c));
    }

    void add() {
        System.out.println("nothing to add");
    }

    public static void main(String[] args) {
        MethodOverloading res1 = new MethodOverloading();
        res1.add(10.5, 20);
        res1.add(30, 20, 40);
        res1.add();
    }
}
