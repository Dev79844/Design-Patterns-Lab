package Builder1;

public class Shop {
    public static void main(String args[]){
        Bike bike = new BikeBuilder().setCompany("Royal Enfield").setModel("Classic 500").setEngine("1 Cylinder").setExhaust("Stock").setFuel("Petrol").setPowerStart(true).getBike();
        System.out.println(bike);
    }
}
