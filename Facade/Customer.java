package Facade;

public class Customer {
    public static void main(String args[]){
        Ingredients ingredients = new Ingredients();
        //without facade
        System.out.println("------Without Facade-------");
        Food pizza = new Pizza();
        pizza.prepareFood(ingredients.getPizzaItem());
        System.out.println(pizza.deliverFood());

        Food pasta = new Pasta();
        pasta.prepareFood(ingredients.getPastaItem());
        System.out.println(pasta.deliverFood());

        //with Facade
        System.out.println("------With Facade-------");
        System.out.println(Waiter.deliverFood(FoodType.PASTA));
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));
    }
}
