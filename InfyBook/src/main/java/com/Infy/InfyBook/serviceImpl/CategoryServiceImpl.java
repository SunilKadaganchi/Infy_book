package com.Infy.InfyBook.serviceImpl;

import com.Infy.InfyBook.dto.CategoryResponseDTO;
import com.Infy.InfyBook.mapper.CategoryDtoMapper;
import com.Infy.InfyBook.model.Category;
import com.Infy.InfyBook.repository.CategoryRepo;
import com.Infy.InfyBook.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("FirstPriority")
// if we annotated with primary annotation , the interface will try to pick this first , as its main implementation.
@Primary
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public CategoryResponseDTO getCategoryById(UUID id) {
        // Handle the Exception if ID Not Found
        Category category =categoryRepo.findById(id).orElseThrow(
                ()-> new RuntimeException()
        );
        return CategoryDtoMapper.entityToResponseDtoMapper(category);
    }

    @Override
    public List<CategoryResponseDTO> getAllCategories() {
        List<Category> categoryList = categoryRepo.findAll();
        List<CategoryResponseDTO> categoryResponseDTOList = new ArrayList<>();
       for(Category item : categoryList){
           categoryResponseDTOList.add(CategoryDtoMapper.entityToResponseDtoMapper(item));
       }
        return categoryResponseDTOList;
    }

    @Override
    public CategoryResponseDTO addCategory(String categoryName) {

        Category savedcategory = new Category();
        savedcategory.setCategoryName(categoryName);

        savedcategory = categoryRepo.save(savedcategory);
        return CategoryDtoMapper.entityToResponseDtoMapper(savedcategory);
    }

    @Override
    public CategoryResponseDTO updateCategory(UUID id,String newCategoryName) {
        // Handle the exception if category with given id is not Found
        Category category = categoryRepo.findById(id).orElseThrow(
                ()-> new RuntimeException());

        category.setCategoryName(newCategoryName);

        category = categoryRepo.save(category);
        return CategoryDtoMapper.entityToResponseDtoMapper(category);
    }

    @Override
    public boolean deleteCategory(UUID id) {
        Optional<Category> category = categoryRepo.findById(id);
        if(category.isPresent()){
            categoryRepo.delete(category.get());
        }
        return true;
    }
}
