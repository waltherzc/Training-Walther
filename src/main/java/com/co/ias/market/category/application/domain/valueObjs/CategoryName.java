package com.co.ias.market.category.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class CategoryName {
    private final String value;

    public CategoryName(String value) {
        Validate.notNull(value, "The CategoryName can be not Null");
        Validate.isTrue(value.toString().length()<=20, "The CategoryName must to have less than 20 characters");
    this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value ;
    }
}
