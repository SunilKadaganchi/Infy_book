package com.Infy.InfyBook.controller;

import com.Infy.InfyBook.dto.BookRequestDTO;
import com.Infy.InfyBook.dto.BookResponseDTO;
import com.Infy.InfyBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/book")
public class BookController {

    /**
     *  - Add Book
     *  - Add List of Books in Bulk ( try with File input)
     *
     *  - Update Book Details
     *
     *  - Get/View Book by BookId
     *  - Get Book by Book title
     *  - Get List<Book> by Book Author
     *  - Get List<Book> by Category
     *
     *  - Delete Book BookId
     *  - Delete the List of Books
     * */

    @Autowired
    @Qualifier(value = "PrimaryBookService")
    private BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<BookResponseDTO> addBook(@RequestBody BookRequestDTO bookRequestDTO){
        return ResponseEntity.ok(bookService.addBook(bookRequestDTO));
    }

    @PostMapping("/bulkAdd")
    public ResponseEntity<?> addBooksInBulk(){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BookResponseDTO> updateBook(@RequestBody BookRequestDTO bookRequestDTO, @PathVariable UUID id){
        return ResponseEntity.ok(bookService.updateBook(bookRequestDTO,id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable UUID id){
        return ResponseEntity.ok(bookService.deleteBook(id));
    }

    @DeleteMapping("/deleteBatch")
    public ResponseEntity<?> deleteById(@RequestBody Map<String, Object> bookList){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }


    // write the below get queries using request params and try to optimise it.
    @GetMapping()
    public ResponseEntity<List<BookRequestDTO>> getAll(){
        return null;
    }

//    @GetMapping()
//    public ResponseEntity<List<BookDTO>> getAllByAuthor(String authorName){
//        return null;
//    }
//
//    @GetMapping()
//    public ResponseEntity<List<BookDTO>> getAllByCategory(String categoryName){
//        return null;
//    }
//
//    @GetMapping()
//    public ResponseEntity<?> getByTitle(@RequestParam String title){
//        return null;
//    }


}
