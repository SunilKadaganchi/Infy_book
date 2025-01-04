package com.Infy.InfyBook.dto;

import java.util.UUID;

public class BookResponseDTO {
    private UUID bookId;
    private String title;
    private String author;
    private String description;
    private int bookAvailableCount;
    private int rating;

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
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
