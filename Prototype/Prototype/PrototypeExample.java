package Prototype;

public class PrototypeExample{
    public static void main(String args[]) throws CloneNotSupportedException{
        Vehicle a = new Vehicle();
        a.insertData();

        System.out.println("A"+a.getVehicleList());

        Vehicle b = (Vehicle) a.clone();
        System.out.println("B"+b.getVehicleList());
    }
}
