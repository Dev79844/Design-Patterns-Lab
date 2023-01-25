package Builder1;

public class BikeBuilder {
    private String engine;
    private String company;
    private String model;
    private String exhaust;
    private String fuel;
    private boolean powerStart;

    public BikeBuilder setCompany(String company){
        this.company = company;
        return this;
    }
    public BikeBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public BikeBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }
    public BikeBuilder setExhaust(String exhaust){
        this.exhaust = exhaust;
        return this;
    }
    public BikeBuilder setFuel(String fuel){
        this.fuel = fuel;
        return this;
    }
    public BikeBuilder setPowerStart(boolean powerStart){
        this.powerStart = powerStart;
        return this;
    }

    public Bike getBike(){
        return new Bike(this.company, this.model, this.engine, this.exhaust, this.fuel, this.powerStart);
    }
}
