package com.Infy.InfyBook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;


@Entity
public class Book extends BaseModel{

    private String title;
    private String author;
    private String description;
    private int bookAvailableCount;
    private int rating;
    @OneToOne
    private Category category;

    public Book() {
    }

    public Book(String title, String author, String description, int bookAvailableCount, int rating, Category category) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.bookAvailableCount = bookAvailableCount;
        this.rating = rating;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
