package inheritance;

public class BMW {

    public static void main(String[] args) {
        Country bmw = new Country();

        bmw.setName("BMW");
        bmw.setColor("Black");
        bmw.setSize("M");
        bmw.setModel(2020);
        bmw.setCountry("America");
        bmw.displayInformation();

        bmw.setName("TOYOTA");
        bmw.setColor("WHITE");
        bmw.setSize("S");
        bmw.setModel(2121);
        bmw.setCountry("JAPAN");
        bmw.displayInformation();
    }
}
