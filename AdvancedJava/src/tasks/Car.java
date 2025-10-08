package tasks;

public class Car {
    String model ;
    int price;
    float fuelInLitres;
    int maxSpeed;
    String color;
    int seatsNumber;

Car(String color){
   this.color= color;
   this.fuelInLitres = 2;
   this.maxSpeed=250;
   this.seatsNumber = 4;
}
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
