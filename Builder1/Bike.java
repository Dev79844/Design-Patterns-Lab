package Builder1;

public class Bike {
    
    private String engine;
    private String company;
    private String model;
    private String exhaust;
    private String fuel;
    private boolean powerStart;

    public Bike(String company, String model, String engine, String exhaust, String fuel, boolean powerStart){
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.exhaust = exhaust;
        this.fuel = fuel;
        this.powerStart = powerStart;
    }

    public String toString(){
        return "Bike[Company:"+company+",Model:"+model+",Engine:"+engine+",Exhaust:"+exhaust+",Fuel:"+fuel+", Power Start:"+powerStart+"]";
    }
}
