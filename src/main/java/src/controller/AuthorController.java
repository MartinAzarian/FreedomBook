package src.controller;

import src.model.Author;
import src.service.AuthorService;

import java.util.Scanner;

public class AuthorController {
    private static AuthorController instance;
    private final AuthorService authorService;
    private AuthorController(){
        authorService = AuthorService.getInstance();
    }
    public static AuthorController getInstance(){
        if( instance == null ){
            instance = new AuthorController();
        }
        return instance;
    }
    public void createAuthor(){
        Scanner scanner = new Scanner(System.in);
        Author author = new Author();
        author.setFirstName(scanner.nextLine());
        author.setLastName(scanner.nextLine());
        if(scanner.nextShort() == 1) {
            author.setPseudonym(scanner.nextLine());
        }
        else {
            author.setPseudonym(author.getFirstName() + " " + author.getLastName());
        }
        author.setAge(scanner.nextInt());
        authorService.createAuthor(author);
    }
    public void readAuthor(){

    }
    public void updateAuthor(){

    }
    public void deleteAuthor(){

    }

}
