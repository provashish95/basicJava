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

/**
 * There are 4 type of Inheritance in OOP language 1. Single Inheritance -> One
 * class extends only one class 2. Multilevel Inheritance -> b extends a | c
 * extends b | a is a super class 3. Hierarchical Inheritance -> b extends a | c
 * extends a | d extends a 4. Multiple Inheritance -> Java not supported it
 */
