package com.example;

/**
 * @author daicham
 */
public class DefaultHolder<T> implements Holder<T> {
    private T value;

    @Override
    public void set(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }
}
