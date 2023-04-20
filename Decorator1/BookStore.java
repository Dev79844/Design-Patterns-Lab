package Decorator1;

public class BookStore implements Book {
    @Override
    public void book(){
        System.out.println("Got book from a bookstore");
    }
}
