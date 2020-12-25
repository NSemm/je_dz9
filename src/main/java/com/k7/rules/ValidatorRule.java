package com.k7.rules;

public interface ValidatorRule <T>{
    public boolean validate (T value);
    public String errorMessage();
}
