package com.k7.rules;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MinNumberValidatorRule implements ValidatorRule <Number>{
    private Number minValue;


    @Override
    public boolean validate(Number value) {
        return (value.doubleValue()<minValue.doubleValue());
    }

    @Override
    public String errorMessage() {
        return "Tne number less than minimum";
    }
}
