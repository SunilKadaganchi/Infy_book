package com.Infy.InfyBook.model;

import jakarta.persistence.Entity;


@Entity
public class Book extends BaseModel{

    private String title;
    private String author;
    private String description;
    private int bookAvailableCount;
    private int rating;

    public Book() {
    }

    public Book(String title, String author, String description, int bookAvailableCount, int rating) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.bookAvailableCount = bookAvailableCount;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBookAvailableCount() {
        return bookAvailableCount;
    }

    public void setBookAvailableCount(int bookAvailableCount) {
        this.bookAvailableCount = bookAvailableCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
