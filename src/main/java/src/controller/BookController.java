package src.controller;

import src.service.BookService;

public class BookController {
    private static BookController instance;
    private final BookService bookService;
    private BookController(){
        bookService = BookService.getInstance();
    }
    public static BookController getInstance(){
        if( instance == null ){
            instance = new BookController();
        }
        return instance;
    }
    public void createBook(){

    }
    public void readBook(){

    }
    public void updateBook(){

    }
    public void deleteBook(){

    }
}