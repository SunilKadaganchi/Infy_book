package com.Infy.InfyBook.service;

import com.Infy.InfyBook.dto.CategoryResponseDTO;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.UUID;


public interface CategoryService {

    public CategoryResponseDTO getCategoryById(UUID id);

    public List<CategoryResponseDTO> getAllCategories();

    public CategoryResponseDTO addCategory(String categoryName);

    public CategoryResponseDTO updateCategory(UUID id,String categoryName);

    public boolean deleteCategory(UUID id);
}
