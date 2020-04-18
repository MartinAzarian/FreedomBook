package src.model;

public class Author {
    private String firstName;
    private String lastName;
    private String pseudonym;
    private int id;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public void setAge(int age) {
        if(age > 17 && age < 121) {
            this.age = age;
        }
        else {
            //add exeption
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Author(String firstName, String lastName, String pseudonym, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
        this.age = age;
    }

    public Author() {
    }
}
