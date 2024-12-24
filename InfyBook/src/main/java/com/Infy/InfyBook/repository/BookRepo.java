package com.Infy.InfyBook.repository;

import com.Infy.InfyBook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface BookRepo extends JpaRepository<Book, UUID> {
}
