package com.k7.rules;

import lombok.AllArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class RegExpValidatorRule implements ValidatorRule<String> {
    private Pattern pattern;

    @Override
    public boolean validate(String value) {
        Matcher matcher = pattern.matcher(value);
        return !matcher.matches();
    }

    @Override
    public String errorMessage() {
        return "Tne number is not valid";
    }
}
