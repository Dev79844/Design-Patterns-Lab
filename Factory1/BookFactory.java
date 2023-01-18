package Factory1;

public class BookFactory {
    
    public Book getBook(String genre){
        if(genre == null) return null;

        if(genre.equalsIgnoreCase("adventure")){
            return new Adventure();
        }

        if(genre.equalsIgnoreCase("thriller")){
            return new Thriller();
        }

        if(genre.equalsIgnoreCase("mystery")){
            return new Mystery();
        }

        return null;
    }
}