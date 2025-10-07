package tasks;

public class Driver {
    static void main(String[] args) {
        Car car = new Car();
        car.maxSpeed =2000;
        car.fuelInLitres=25;
        car.Drive();
        car.getFuel();
        car.addFuel(25);
    }

}
