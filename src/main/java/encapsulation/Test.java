package encapsulation;

public class Test {

    private String name;
    private int id;

    void change() {
        System.out.println("No");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
