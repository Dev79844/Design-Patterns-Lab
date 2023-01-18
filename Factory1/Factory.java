package Factory1;

public class Factory {
    public static void main(String args[]){
        BookFactory book = new BookFactory();

        Book adv = book.getBook("adventure");
        adv.genre();

        Book thr = book.getBook("thriller");
        thr.genre();

        Book mys = book.getBook("mystery");
        mys.genre();
    }
}
