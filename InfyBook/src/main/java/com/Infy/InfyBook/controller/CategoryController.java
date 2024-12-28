package com.Infy.InfyBook.controller;

import com.Infy.InfyBook.dto.CategoryRequestDTO;
import com.Infy.InfyBook.dto.CategoryResponseDTO;
import com.Infy.InfyBook.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
  //  @Qualifier(value = "FirstPriority") // using qualifier at field level
    private CategoryService categoryService;

    //using qualifier at constructor inject level
    public CategoryController(@Qualifier("FirstPriority") CategoryService categoryService){
        this.categoryService = categoryService;
    }
    /**
     *  - Category
     *      -> ADD
     *      -> UPDATE
     *      -> GET ALL CATEGORIES
     *      -> DELETE CATEGORY
     * */

    //Get Category By ID
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> getCategory(@PathVariable("id") UUID id){
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    //Get All categories
    @GetMapping()
    public ResponseEntity<List<CategoryResponseDTO>> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    // Add new Category
    @PostMapping("/add")
    public ResponseEntity<CategoryResponseDTO> addCategory(@RequestBody CategoryRequestDTO categoryRequestDTO){
        return new ResponseEntity<>(categoryService.addCategory(categoryRequestDTO.getCategoryName()), HttpStatus.CREATED);
    }

    // update the category
    @PostMapping("/update/{id}")
    public ResponseEntity<CategoryResponseDTO> updateCategory(@RequestBody CategoryRequestDTO categoryRequestDTO,@PathVariable UUID id){
        return  ResponseEntity.ok(categoryService.updateCategory(id,categoryRequestDTO.getCategoryName()));
    }

    // delete the Category By Category ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteCategory(@PathVariable UUID id){
        return ResponseEntity.ok(categoryService.deleteCategory(id));
    }


}

