package Prototype1;
import java.util.HashMap;

public class BikePrototype {
    
    private static HashMap<String, Bike> bikeMap = new HashMap<String, Bike>();

    public static Bike getBike(String bikeId){
        Bike bike = bikeMap.get(bikeId);
        System.out.println(bike.clone());
        return (Bike)bike.clone(); 
    }

    public static void loadBike(){
        RoyalEnfield re = new RoyalEnfield();
        re.setId("1");
        bikeMap.put(re.getId(), re);

        Triumph t = new Triumph();
        t.setId("2");
        bikeMap.put(t.getId(), t);

        Ducati d = new Ducati();
        d.setId("3");
        bikeMap.put(d.getId(), d);
    }
}
