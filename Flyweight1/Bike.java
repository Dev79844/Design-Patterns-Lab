package Flyweight1;

public class Bike implements Vehicle {
    private String color;
    private String company;
    private int capacity;

    public Bike(String company){
        this.company = company;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    @Override
    public void getVehicle(){
        System.out.println("Bike getVehicle() [Color:" + color+" Company:" + company+" Capacity: " + capacity+ "]");
    }
}
