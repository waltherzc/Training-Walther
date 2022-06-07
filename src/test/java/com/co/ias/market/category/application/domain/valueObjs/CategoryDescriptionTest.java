package com.co.ias.market.category.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryDescriptionTest {
    @Test
    @DisplayName("null_category_description")
    void null_category_description(){
        String nullCategoryDescription = null;

        assertThrows(NullPointerException.class, ()->{
            new CategoryDescription(nullCategoryDescription);
        });
    }

    @Test
    @DisplayName("valid_category_description")
    void valid_category_description(){
        String validCategoryDescription = "Hola esto es una prueba";

        assertDoesNotThrow(()->{
            new CategoryDescription(validCategoryDescription);
        });
    }

    @Test
    @DisplayName("more_characters_category_description")
    void more_characters_category_description(){
        String moreCharactersCategoryDescription = "fasdfasdfasdfasdfasfdasdfasfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasd";

        assertThrows(IllegalArgumentException.class, ()->{
            new CategoryDescription(moreCharactersCategoryDescription);
        });
    }
}