package tasks;

public class Car {
    String model ;
    int price;
    float fuelInLitres;
    int maxSpeed;
    int seatsNumber;


    public void Drive(){
        System.out.println("the car is being driven");
        fuelInLitres--;
    }
    public void addFuel(int litres){
        fuelInLitres +=litres;
        System.out.println("Fuel has been added new fuel level is : "+fuelInLitres);
    }

    public void getFuel(){
        System.out.println("The fuel in litres is : "+fuelInLitres);
    }

}
