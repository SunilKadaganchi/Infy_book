package com.Infy.InfyBook.model;

import jakarta.persistence.Entity;

import java.util.UUID;

@Entity
public class WishListBook extends BaseModel{
    private UUID employeeId;
    private UUID bookId;

    public WishListBook() {
    }

    public WishListBook(UUID employeeId, UUID bookId) {
        this.employeeId = employeeId;
        this.bookId = bookId;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }
}
