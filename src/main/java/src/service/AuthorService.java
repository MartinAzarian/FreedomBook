package src.service;

import src.dataBase.MariadbConstants;
import src.model.Author;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorService {
    private static AuthorService instance;
    private AuthorService(){
    }
    public static AuthorService getInstance(){
        if ( instance == null ) {
            instance = new AuthorService();
        }
        return instance;
    }
    public void createAuthor(Author author) {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(MariadbConstants.DB_URL, MariadbConstants.USER, MariadbConstants.PASS);

            if (conn != null) {

                if (conn != null) {
                    String query = "INSERT INTO authors( firstname, lastname, pseudonym, age) VALUES(?,?,?,?)";

                    PreparedStatement preparedStatement = conn.prepareStatement(query);
                    preparedStatement.setString(1, author.getFirstName());
                    preparedStatement.setString(2, author.getLastName());
                    preparedStatement.setString(3, author.getPseudonym());
                    preparedStatement.setInt   (4, author.getAge());

                    preparedStatement.execute();
                }
            }

        } catch (SQLException ex) {
            System.err.println("Conection error");// ADD EXEPTION
            ex.printStackTrace();
        } finally {

            if (conn != null) {

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
