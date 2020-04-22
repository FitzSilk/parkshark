package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category dtoToCategory(CategoryDto categoryDto){
        return new Category(categoryDto.getCategory());
    }

    public CategoryDto categoryToDto(Category category){
        return new CategoryDto(category.getCategory());
    }
}
