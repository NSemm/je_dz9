package com.k7;

public interface ObjectValidator<T> {
    public void validate(T o) throws ValidationException;
}
