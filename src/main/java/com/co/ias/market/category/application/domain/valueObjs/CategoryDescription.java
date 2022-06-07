package com.co.ias.market.category.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class CategoryDescription {
    private final String value;

    public CategoryDescription(String value) {
        Validate.notNull(value, "The CategoryDescription can not Be Null");
        Validate.isTrue(value.toString().length()<=40, "The CategoryName must to have less than 40 characters");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  value;
    }
}
