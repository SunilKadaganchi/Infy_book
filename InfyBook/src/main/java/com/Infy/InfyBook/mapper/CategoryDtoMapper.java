package com.Infy.InfyBook.mapper;

import com.Infy.InfyBook.dto.CategoryRequestDTO;
import com.Infy.InfyBook.dto.CategoryResponseDTO;
import com.Infy.InfyBook.model.Category;

public class CategoryDtoMapper {

    public static Category requestDtoToEntityMapper(CategoryRequestDTO categoryRequestDTO){
        Category category = new Category();
        category.setCategoryName(categoryRequestDTO.getCategoryName());
        return category;
    }

    public static CategoryResponseDTO entityToResponseDtoMapper(Category category){
        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
        categoryResponseDTO.setId(category.getId());
        categoryResponseDTO.setName(category.getCategoryName());
        return categoryResponseDTO;
    }
}
