package com.Infy.InfyBook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.UUID;

@Entity
public class EmployeeBookStatus extends BaseModel{

    private UUID employeeId;
    private UUID bookId;
    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;

    public EmployeeBookStatus() {
    }

    public EmployeeBookStatus(UUID employeeId, UUID bookId, BookStatus bookStatus) {
        this.employeeId = employeeId;
        this.bookId = bookId;
        this.bookStatus = bookStatus;
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

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
