package com.co.ias.market.category.application.domain.valueObjs;
import org.apache.commons.lang3.Validate;

public class CategoryId {
    private final int value;

    public CategoryId(int value) {
        Validate.notNull(value, "Product id can not be null");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
