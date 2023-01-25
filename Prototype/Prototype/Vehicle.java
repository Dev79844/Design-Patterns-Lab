package Prototype;
import java.util.ArrayList;
import java.util.*;

public class Vehicle implements Cloneable {
    private List<String> vehiclelist;

    public Vehicle(){
        this.vehiclelist = new ArrayList<String>();
    }

    public Vehicle(List<String> list){
        this.vehiclelist = list;
    }

    public void insertData(){
        this.vehiclelist.add("Mclaren P1");
        this.vehiclelist.add("Ferrari LaFerrari");
        this.vehiclelist.add("Lamborghini Galladro");
        this.vehiclelist.add("Rolls Royce Phantom");
    }

    public String modify(){
        String s = (String)this.vehiclelist.get(0);
        return s;
    }

    public List<String> getVehicleList(){
        return this.vehiclelist;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<String>();
        for(String s: this.vehiclelist){
            tempList.add(s);
        }

        return new Vehicle(tempList);
    }
}
