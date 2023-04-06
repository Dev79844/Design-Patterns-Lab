package Flyweight1;

public class FlyweightDemo {
    private static final String companies[] = {"Royal Enfield", "Triumph", "Bajaj", "TVS", "Kawasaki", "Ducati"};
    private static final String color[] = { "Red", "Green", "Blue", "White", "Black" };
    private static final int capacity[] = {500,350,650,1250};

    public static void main(String args[]){
        for(int i=0; i<20;i++){
            Bike bike = (Bike)VehicleFactory.getBike(getRandomCompany());
            bike.setColor(getRandomColor());
            bike.setCapacity(getCapacity());
            bike.getVehicle();
        }
    }

    private static String getRandomCompany(){
        return companies[(int)(Math.random()*companies.length)];
    }

    private static String getRandomColor(){
        return color[(int)(Math.random()*color.length)];
    }

    private static int getCapacity(){
        return capacity[(int)(Math.random()*capacity.length)];
    }
}
