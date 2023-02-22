package Facade;

public class Pasta implements Food {
    public String preparedItems;

    @Override
    public void prepareFood(String itemsRequired){
        preparedItems = "Thin Curst pizza requires ingredients: "+itemsRequired;
    }

    public String deliverFood(){
        return preparedItems;
    }
}
