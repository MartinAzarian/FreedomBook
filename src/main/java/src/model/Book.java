package src.model;

import src.model.enums.Ganre;
import src.model.enums.Language;
import src.model.enums.Quality;

import java.util.Date;

public class Book {
    private double raiting;
    private double price;
    private int numberOfPage;
    private Language language;
    private Quality quality;
    private String userWhoIsNow;
    private String name;
    private Author author;
    private Ganre ganre;
    private Date publicationDate;
    private int id;

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public void setUserWhoIsNow(String userWhoIsNow) {
        this.userWhoIsNow = userWhoIsNow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setGanre(Ganre ganre) {
        this.ganre = ganre;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRaiting() {
        return raiting;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public Language getLanguage() {
        return language;
    }

    public Quality getQuality() {
        return quality;
    }

    public String getUserWhoIsNow() {
        return userWhoIsNow;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public int getId() {
        return id;
    }

    public Book(double raiting, double price, int numberOfPage, Language language, Quality quality, String userWhoIsNow, String name, Author author, Ganre ganre, Date publicationDate, int id) {
        this.raiting = raiting;
        this.price = price;
        this.numberOfPage = numberOfPage;
        this.language = language;
        this.quality = quality;
        this.userWhoIsNow = userWhoIsNow;
        this.name = name;
        this.author = author;
        this.ganre = ganre;
        this.publicationDate = publicationDate;
        this.id = id;
    }

    public Book() {
    }
}
