package com.Infy.InfyBook.service;

import com.Infy.InfyBook.dto.BookRequestDTO;
import com.Infy.InfyBook.dto.BookResponseDTO;

import java.util.UUID;

public interface BookService {
    BookResponseDTO addBook(BookRequestDTO bookRequestDTO);
    BookResponseDTO updateBook(BookRequestDTO bookRequestDTO, UUID id);
    boolean deleteBook(UUID id);
    BookResponseDTO getBookById(UUID id);

}
