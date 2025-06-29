package javaoop;

public class TestCar {

    public static void main(String[] args) {
        
       // Car car1 = new Car(); // Create object of Car class
       
        Car car1 = new Car("BMW", "RED", 3030); //Create constructor of Car 

        /**
         * Fist way to value initialize
         * car1.name = "BMW";
         * car1.color = "Red";
         * car1.number = 2020;
         * 
         * Second way to value initialize by call method
         * car1.setCarInfo("BMW", "RED", 1010);
         */
        

        car1.diplayCar();

    }
}
