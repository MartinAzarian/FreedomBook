package src.model;

import src.model.enums.Authority;

public class User {  private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String login;
    private Passworld passworld;
    private Authority authority;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {

        if(email.length()!=0) {
            for(int i = email.length(); i > 0; i--)
            {
                if(email.charAt(i)=='@') {
                    this.email = email;
                    break;
                }
            }
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassworld(Passworld passworld) {
        this.passworld = passworld;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public Passworld getPassworld() {
        return passworld;
    }

    public Authority getAuthority() {
        return authority;
    }

    public User(String firstName, String lastName, String email, int age, String login, Passworld passworld, Authority authority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.login = login;
        this.passworld = passworld;
        this.authority = authority;
    }

    public User() {
    }
}
