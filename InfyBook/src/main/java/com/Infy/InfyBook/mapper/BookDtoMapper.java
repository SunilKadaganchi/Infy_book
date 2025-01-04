package com.Infy.InfyBook.mapper;

import com.Infy.InfyBook.dto.BookRequestDTO;
import com.Infy.InfyBook.dto.BookResponseDTO;
import com.Infy.InfyBook.model.Book;

public class BookDtoMapper {

    public static Book convertRequestDtoToEntity(BookRequestDTO bookRequestDTO){
        Book book = new Book();
        book.setTitle(bookRequestDTO.getTitle());
        book.setAuthor(bookRequestDTO.getAuthor());
        book.setBookAvailableCount(bookRequestDTO.getBookAvailableCount());
        book.setDescription(bookRequestDTO.getDescription());
        book.setRating(bookRequestDTO.getRating());

        return book;
    }

    public static BookResponseDTO convertEntityToResponseDto(Book book ){
        BookResponseDTO bt = new BookResponseDTO();
        bt.setBookId(book.getId());
        bt.setTitle(book.getTitle());
        bt.setAuthor(book.getAuthor());
        bt.setRating(book.getRating());
        bt.setDescription(book.getDescription());
        bt.setBookAvailableCount(book.getBookAvailableCount());
        return bt;
    }
}
