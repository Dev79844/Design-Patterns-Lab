package Facade1;

public class royalEnfield implements Bike {

    public String specs;
    
    @Override
    public void orderBike(String requirements){
        specs = "Royal Enfield Continental GT: "+ requirements;
    }

    public String deliverBike(){
        return specs;
    }
}
