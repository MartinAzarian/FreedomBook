package src.service;

public class UserService {
    private static UserService instance;
    private UserService(){
    }
    public static UserService getInstance(){
        if ( instance == null ) {
            instance = new UserService();
        }
        return instance;
    }
}
