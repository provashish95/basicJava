package inheritance;

public class Test {

    public static void main(String[] args) {
        Person ob = new Person();

        ob.name = "Tonmoy";
        ob.age = 29;
        ob.address = "Tangail";
        ob.displayInfo2();

        ob.name = "Provashish Roy";
        ob.age = 28;
        ob.address = "Ghior";
        ob.displayInfo2();

        ob.name = "Surja Kanta Roy";
        ob.age = 60;
        ob.address = "Bir borotia";
        ob.displayInfo2();
    }
}
