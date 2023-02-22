package Facade1;

public class bmw implements Bike {
    public String specs;
    
    @Override
    public void orderBike(String requirements){
        specs = "BMW G 310 RR: "+ requirements;
    }

    public String deliverBike(){
        return specs;
    }
}
