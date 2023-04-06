package Flyweight1;
import java.util.HashMap;

public class VehicleFactory {
    
    private static HashMap<String,Vehicle> vehicleMap = new HashMap<>();

    public static Vehicle getBike(String company){
        Bike bike = (Bike)vehicleMap.get(company);

        if(bike == null){
            bike = new Bike(company);
            vehicleMap.put(company,bike);
            System.out.println("Bike color: "+bike);
        }
        return bike;
    }
}
