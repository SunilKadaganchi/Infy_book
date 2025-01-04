package com.Infy.InfyBook.dto;

public class BookRequestDTO {
    private String title;
    private String author;
    private String description;
    private int bookAvailableCount;
    private int rating;
    private String categoryName;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
