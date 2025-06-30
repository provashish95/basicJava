package inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal();
        Human h = new Human();
        Coder c = new Coder();

        System.out.println(a instanceof Animal);
        System.out.println(h instanceof Animal);
        System.out.println(c instanceof Human);
        System.out.println(c instanceof Animal);
        System.out.println(h instanceof Coder);
    }
}
