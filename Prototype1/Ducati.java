package Prototype1;

public class Ducati extends Bike {
    public Ducati(){
        type="Ducati";
    }

    @Override
    public void ride(){
        System.out.println("Ducati");
    }
}
