package inheritance;

public class Country extends Car {

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void displayInformation() {
        System.out.println("Car name: " + getName());
        System.out.println("Car Color: " + getColor());
        System.out.println("Car Size: " + getSize());
        System.out.println("Car Model: " + getModel());
        System.out.println("Car Country: " + getCountry());
        System.out.println("");
        System.out.println("");
    }

}
