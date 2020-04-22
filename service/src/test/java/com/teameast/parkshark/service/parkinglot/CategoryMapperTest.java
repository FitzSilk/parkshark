package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.Category;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {


    @Test
    void categoryToDto() {
        //GIVEN
        Category category = new Category("ourCategory");
        CategoryMapper categoryMapper = new CategoryMapper();
        //WHEN
        CategoryDto categoryDto = categoryMapper.categoryToDto(category);
        Assertions.assertThat(categoryDto).isNotNull();
        Assertions.assertThat(categoryDto.getCategory()).isEqualTo("ourCategory");
    }

    @Test
    void dtoTocategory() {
        //GIVEN
        CategoryDto categoryDto = new CategoryDto("ourCategoryDto");
        CategoryMapper categoryMapper = new CategoryMapper();
        //WHEN
        Category category = categoryMapper.dtoToCategory(categoryDto);
        Assertions.assertThat(category).isNotNull();
        Assertions.assertThat(category.getCategory()).isEqualTo("ourCategoryDto");
    }
}