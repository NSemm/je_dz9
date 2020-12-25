package com.k7;

import com.k7.rules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        runValidateNumber(4.99);
        runValidatePhone("+180632383652");

    }

    public static void runValidateNumber(Number number) {
        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new MaxNumberValidatorRule(10));
        rules.add(new MinNumberValidatorRule(5));
        ObjectValidator<Number> validator = new RulesBasedObjectValidator(rules);
        try {
            validator.validate(number);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runValidatePhone(String number) {
        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator = new RulesBasedObjectValidator(rules);
        try {
            validator.validate(number);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
