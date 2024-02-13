package com.springboot.blog.service;

import com.springboot.blog.entity.Category;
import com.springboot.blog.payload.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO getCategory(Long categoryId);

    List<CategoryDTO> getAllCategory();

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);

    void deleteCategory(Long categoryId);
}
