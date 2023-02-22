package Facade;

public class Pizza implements Food {
    public String preparedItems;

    @Override
    public void prepareFood(String itemsRequired){
        preparedItems = "Tomato pasta requires ingredients: "+itemsRequired;
    }

    public String deliverFood(){
        return preparedItems;
    }
}
