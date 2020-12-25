package com.k7.rules;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartsWithValidatorRule implements ValidatorRule<String> {
    private String start;

    @Override
    public boolean validate(String value) {
        return (value.indexOf(start) != 0);
    }

    @Override
    public String errorMessage() {
        return "Tne start of number is not +38";
    }
}
