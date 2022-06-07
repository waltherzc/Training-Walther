package com.co.ias.market.category.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryNameTest {
    @Test
    @DisplayName("null_category_name")
    void null_category_name(){
        String nullCategoryName = null;

        assertThrows(NullPointerException.class, ()->{
            new CategoryName(nullCategoryName);
        });
    }

    @Test
    @DisplayName("valid_category_name")
    void valid_category_name(){
        String validCategoryName = "Mi nombre es prueba";

        assertDoesNotThrow(()->{
            new CategoryName(validCategoryName);
        });
    }

    @Test
    @DisplayName("more_characters_category_name")
    void more_characters_category_name(){
        String moreCharactersCategoryName = "Mi nombre es tiene más de 20 characters";

        assertThrows(IllegalArgumentException.class, ()->{
            new CategoryName(moreCharactersCategoryName);
        });
    }
}