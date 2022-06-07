package com.co.ias.market.category.application.domain.valueObjs;

import com.co.ias.market.products.application.domain.valueObjs.ProductPrice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryIdTest {
    @Test
    @DisplayName("CategoryId Can Be Null")
    void null_category_id(){
        // AAA - arrange act assert

        Integer nullCategoryId=null;

        assertThrows(NullPointerException.class, () -> {
            new CategoryId(nullCategoryId);
        });
    }

    @Test
    @DisplayName("CategoryId is Be not Null")
    void category_id(){
        // AAA - arrange act assert

        Integer CategoryId= 2546;

        assertDoesNotThrow(()->{
                new CategoryId(CategoryId);
        });
    }



}