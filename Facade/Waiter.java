package Facade;

public class Waiter {
    public static String deliverFood(FoodType foodType){

        Ingredients ingredients = new Ingredients();

        switch (foodType) {
            case PIZZA:
                Food pizza = new Pizza();
                pizza.prepareFood(ingredients.getPizzaItem());
                return pizza.deliverFood();
            
            case PASTA:
                Food pasta = new Pasta();
                pasta.prepareFood(ingredients.getPastaItem());
                return pasta.deliverFood();
        }
        return null;
    }
}
