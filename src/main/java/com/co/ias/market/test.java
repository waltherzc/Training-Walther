package com.co.ias.market;

import com.co.ias.market.category.application.domain.Category;
import com.co.ias.market.category.application.domain.valueObjs.CategoryDescription;
import com.co.ias.market.category.application.domain.valueObjs.CategoryId;
import com.co.ias.market.category.application.domain.valueObjs.CategoryName;
import com.co.ias.market.products.application.domain.*;
import com.co.ias.market.products.application.domain.valueObjs.ProductDescription;
import com.co.ias.market.products.application.domain.valueObjs.ProductId;
import com.co.ias.market.products.application.domain.valueObjs.ProductName;
import com.co.ias.market.products.application.domain.valueObjs.ProductPrice;

public class test {
    public static void main(String[] args) {
        try {
            Product product = new Product(
                    new ProductId(1L),
                    new ProductName("Headphones"),
                    new ProductPrice(1000),
                    new ProductDescription("Description") );
            System.out.println(product.toString());

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Category category = new Category(new CategoryId(25),
                    new CategoryName("Accesorios"),
                    new CategoryDescription("Estos accesorios son los más vendidos"));
            System.out.println(category.toString());

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
