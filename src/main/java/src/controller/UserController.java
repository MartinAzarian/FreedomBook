package src.controller;

import src.service.UserService;

public class UserController {
    private static UserController instance;
    private final UserService userService;
    private UserController(){
        userService = UserService.getInstance();
    }
    public static UserController getInstance(){
        if( instance == null ){
            instance = new UserController();
        }
        return instance;
    }
    public void createUser(){

    }
    public void readUser(){

    }
    public void updateUser(){

    }
    public void deleteUser(){

    }
}