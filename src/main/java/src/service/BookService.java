package src.service;

public class BookService {
    private static BookService instance;
    private BookService(){
    }
    public static BookService getInstance(){
        if ( instance == null ) {
            instance = new BookService();
        }
        return instance;
    }
}
