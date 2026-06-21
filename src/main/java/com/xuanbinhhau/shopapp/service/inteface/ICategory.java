package com.xuanbinhhau.shopapp.service.inteface;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import com.xuanbinhhau.shopapp.model.Category;

import java.util.List;

public interface ICategory {
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO getCategory(CategoryDTO categoryDTO);

    List<CategoryDTO> getAllCategory();

    CategoryDTO updateCategory(Long id,CategoryDTO categoryDTO);

    void deleteCategory(Long id);
}
