package com.java.interfaces;

public interface Animal {
    void eat();
    void sleep();

    default void show() {
        System.out.println("Default show");
    }
}
