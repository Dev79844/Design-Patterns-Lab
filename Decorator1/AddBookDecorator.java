package Decorator1;

public class AddBookDecorator extends BookDecorator {
    public AddBookDecorator(Book decoratedBook){
        super(decoratedBook);
    }

    public void addBook(Book decoratedBook){
        System.out.println("Added the book");
    }

    @Override
    public void book(){
        decoratedBook.book();
        addBook(decoratedBook);
    }
}
