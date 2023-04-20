package Decorator1;

public class DecoratorDemo{
    public static void main(String args[]){
        Book lib = new Library();

        Book addBooktoLib = new AddBookDecorator(new Library());
        addBooktoLib.book();

        lib.book();

    }
}