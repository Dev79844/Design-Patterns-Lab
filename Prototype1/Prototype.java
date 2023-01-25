package Prototype1;

public class Prototype {
    public static void main(String args[]){
        BikePrototype.loadBike();

        Bike bike1 = (Bike) BikePrototype.getBike("1");
        System.out.println(bike1.getType());

        Bike bike2 = (Bike) BikePrototype.getBike("2");
        System.out.println(bike2.getType());

        Bike bike3 = (Bike) BikePrototype.getBike("3");
        System.out.println(bike3.getType());
    }
}
