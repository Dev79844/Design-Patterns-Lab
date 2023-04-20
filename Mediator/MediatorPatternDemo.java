package Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User percy = new User("Percy");
        User hazel = new User("Hazel");
  
        percy.sendMessage("Hi! Hazel!");
        hazel.sendMessage("Hello! Percy!");
    }
}
