package com.xuanbinhhau.shopapp.service.implement;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import com.xuanbinhhau.shopapp.service.inteface.ICategory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class CategoryService implements ICategory {

    CategoryService categoryService;

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO getCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public List<CategoryDTO> getAllCategory() {
        return List.of();
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
