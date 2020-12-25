package com.k7.rules;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MaxNumberValidatorRule implements ValidatorRule<Number> {
    private Number maxValue;


    @Override
    public boolean validate(Number value) {
        return (value.doubleValue() > maxValue.doubleValue());
    }

    @Override
    public String errorMessage() {
        return "Tne number greater than maximum";
    }
}
