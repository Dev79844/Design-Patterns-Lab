package Decorator1;

public class Library implements Book {
    @Override
    public void book(){
        System.out.println("Got a book from library");
    }
}
