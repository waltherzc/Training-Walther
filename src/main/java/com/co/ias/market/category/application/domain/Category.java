package com.co.ias.market.category.application.domain;

import com.co.ias.market.category.application.domain.valueObjs.CategoryDescription;
import com.co.ias.market.category.application.domain.valueObjs.CategoryId;
import com.co.ias.market.category.application.domain.valueObjs.CategoryName;

public class Category {
    private final CategoryId id;
    private final CategoryName name;
    private final CategoryDescription description;

    public Category(CategoryId id, CategoryName name, CategoryDescription description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public CategoryId getId() {
        return id;
    }

    public CategoryName getName() {
        return name;
    }

    public CategoryDescription getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name=" + name +
                ", description=" + description +
                '}';
    }
}
