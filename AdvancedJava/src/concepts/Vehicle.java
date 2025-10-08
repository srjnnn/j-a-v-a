package concepts;

public class Vehicle {
    int maxSpeed;
    int seats;
    String color;

    Vehicle(String color){
        this.color=color;
        this.maxSpeed = 200;
        this.seats=4;
    }
    Vehicle(){
        this(color = "black");
    }

    public void showProps(){
        System.out.println("Max speed : "+maxSpeed+" Seats : "+seats+" color : "+color);
    }
}
