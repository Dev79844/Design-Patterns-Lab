package Facade1;

public class Dealership {
    public static String getBike(BikeType bikeType){
        Specs spec = new Specs();

        switch (bikeType) {
            case RE:
                Bike re = new royalEnfield();
                re.orderBike(spec.getRE());
                return re.deliverBike();

            case TRIUMPH:
                Bike tri = new triumph();
                tri.orderBike(spec.getTriumph());
                return tri.deliverBike();
            
            case BMW:
                Bike bmw = new bmw();
                bmw.orderBike(spec.getBMW());
                return bmw.deliverBike();
        }
        return null;
    }
}
