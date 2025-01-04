package com.Infy.InfyBook.serviceImpl;

import com.Infy.InfyBook.dto.BookRequestDTO;
import com.Infy.InfyBook.dto.BookResponseDTO;
import com.Infy.InfyBook.mapper.BookDtoMapper;
import com.Infy.InfyBook.model.Book;
import com.Infy.InfyBook.model.Category;
import com.Infy.InfyBook.repository.BookRepo;
import com.Infy.InfyBook.repository.CategoryRepo;
import com.Infy.InfyBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service(value = "PrimaryBookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public BookResponseDTO addBook(BookRequestDTO bookRequestDTO) {
        Optional<Category> category = categoryRepo.findByCategoryNameIgnoreCase(bookRequestDTO.getCategoryName());
        Category savedCategory = category.get();
        if(category.isEmpty()){
            savedCategory = new Category(bookRequestDTO.getCategoryName());
            savedCategory = categoryRepo.save(savedCategory);
        }

        Book saveBook = BookDtoMapper.convertRequestDtoToEntity(bookRequestDTO);
        saveBook.setCategory(savedCategory);

         bookRepo.save(saveBook);

         BookResponseDTO bookResponse = BookDtoMapper.convertEntityToResponseDto(saveBook);

         return bookResponse;
    }

    @Override
    public BookResponseDTO updateBook(BookRequestDTO bookRequestDTO, UUID id) {
        Optional<Book> savedBook = bookRepo.findById(id);
        Book updateBook = savedBook.get();
        if(savedBook.isEmpty()){
            // throw exception and handle it
        }
        else{
            updateBook.setTitle(bookRequestDTO.getTitle());
            updateBook.setAuthor(bookRequestDTO.getAuthor());
            updateBook.setDescription(bookRequestDTO.getDescription());
            updateBook.setBookAvailableCount(bookRequestDTO.getBookAvailableCount());
            //category cannot be updated
            updateBook.setRating(bookRequestDTO.getRating());
        }
        updateBook= bookRepo.save(updateBook);
        return BookDtoMapper.convertEntityToResponseDto(updateBook);
    }

    @Override
    public boolean deleteBook(UUID id) {
         bookRepo.deleteById(id);
         return true;
    }

    @Override
    public BookResponseDTO getBookById(UUID id) {
        Optional<Book> book = bookRepo.findById(id);
        //if book is not present then throw exception
        return BookDtoMapper.convertEntityToResponseDto(book.get());
    }
}
