package com.k7;

import com.k7.rules.ValidatorRule;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {
    private List<ValidatorRule> rules;

    @Override
    public void validate(T inValue) throws ValidationException {
        for (ValidatorRule r : rules) {
            if (r.validate(inValue)) throw new ValidationException(r.errorMessage());
        }
        System.out.println("Validation successful");
    }
}

