package Facade1;

public class triumph implements Bike {
    public String specs;
    
    @Override
    public void orderBike(String requirements){
        specs = "Triumph Tiger 900: "+ requirements;
    }

    public String deliverBike(){
        return specs;
    }
}
