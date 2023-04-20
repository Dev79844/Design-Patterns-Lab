package Decorator1;

public abstract class BookDecorator implements Book {
    protected Book decoratedBook;

    public BookDecorator(Book decoratedBook){
        this.decoratedBook = decoratedBook;
    }

    public void book(){
        decoratedBook.book();
    }
}
